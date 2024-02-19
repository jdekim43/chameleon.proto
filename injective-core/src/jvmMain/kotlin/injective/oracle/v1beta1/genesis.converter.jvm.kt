// Transform from injective/oracle/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	bandRelayers = obj.getBandRelayersList().map { it },
  	bandPriceStates = obj.getBandPriceStatesList().map { BandPriceStateJvmConverter.convert(it) },
  	priceFeedPriceStates = obj.getPriceFeedPriceStatesList().map {
      PriceFeedStateJvmConverter.convert(it) },
  	coinbasePriceStates = obj.getCoinbasePriceStatesList().map {
      CoinbasePriceStateJvmConverter.convert(it) },
  	bandIbcPriceStates = obj.getBandIbcPriceStatesList().map { BandPriceStateJvmConverter.convert(it)
      },
  	bandIbcOracleRequests = obj.getBandIbcOracleRequestsList().map {
      BandOracleRequestJvmConverter.convert(it) },
  	bandIbcParams = BandIBCParamsJvmConverter.convert(obj.getBandIbcParams()),
  	bandIbcLatestClientId = obj.getBandIbcLatestClientId().asKotlinType,
  	calldataRecords = obj.getCalldataRecordsList().map { CalldataRecordJvmConverter.convert(it) },
  	bandIbcLatestRequestId = obj.getBandIbcLatestRequestId().asKotlinType,
  	chainlinkPriceStates = obj.getChainlinkPriceStatesList().map {
      ChainlinkPriceStateJvmConverter.convert(it) },
  	historicalPriceRecords = obj.getHistoricalPriceRecordsList().map {
      PriceRecordsJvmConverter.convert(it) },
  	providerStates = obj.getProviderStatesList().map { ProviderStateJvmConverter.convert(it) },
  	pythPriceStates = obj.getPythPriceStatesList().map { PythPriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllBandRelayers(obj.bandRelayers.map { it })
    builder.addAllBandPriceStates(obj.bandPriceStates.map { BandPriceStateJvmConverter.convert(it)
        })
    builder.addAllPriceFeedPriceStates(obj.priceFeedPriceStates.map {
        PriceFeedStateJvmConverter.convert(it) })
    builder.addAllCoinbasePriceStates(obj.coinbasePriceStates.map {
        CoinbasePriceStateJvmConverter.convert(it) })
    builder.addAllBandIbcPriceStates(obj.bandIbcPriceStates.map {
        BandPriceStateJvmConverter.convert(it) })
    builder.addAllBandIbcOracleRequests(obj.bandIbcOracleRequests.map {
        BandOracleRequestJvmConverter.convert(it) })
    builder.setBandIbcParams(BandIBCParamsJvmConverter.convert(obj.bandIbcParams))
    builder.setBandIbcLatestClientId(obj.bandIbcLatestClientId.asJavaType)
    builder.addAllCalldataRecords(obj.calldataRecords.map { CalldataRecordJvmConverter.convert(it)
        })
    builder.setBandIbcLatestRequestId(obj.bandIbcLatestRequestId.asJavaType)
    builder.addAllChainlinkPriceStates(obj.chainlinkPriceStates.map {
        ChainlinkPriceStateJvmConverter.convert(it) })
    builder.addAllHistoricalPriceRecords(obj.historicalPriceRecords.map {
        PriceRecordsJvmConverter.convert(it) })
    builder.addAllProviderStates(obj.providerStates.map { ProviderStateJvmConverter.convert(it) })
    builder.addAllPythPriceStates(obj.pythPriceStates.map { PythPriceStateJvmConverter.convert(it)
        })
    return builder.build()
  }
}

public object CalldataRecordJvmConverter :
    ProtobufTypeMapper<CalldataRecord, Genesis.CalldataRecord> {
  public override val descriptor: Descriptors.Descriptor = Genesis.CalldataRecord.getDescriptor()

  public override val parser: Parser<Genesis.CalldataRecord> = Genesis.CalldataRecord.parser()

  public override fun convert(obj: Genesis.CalldataRecord): CalldataRecord = CalldataRecord(
  	clientId = obj.getClientId().asKotlinType,
  	calldata = obj.getCalldata().toByteArray(),
  )

  public override fun convert(obj: CalldataRecord): Genesis.CalldataRecord {
    val builder = Genesis.CalldataRecord.newBuilder()
    builder.setClientId(obj.clientId.asJavaType)
    builder.setCalldata(ByteString.copyFrom(obj.calldata))
    return builder.build()
  }
}

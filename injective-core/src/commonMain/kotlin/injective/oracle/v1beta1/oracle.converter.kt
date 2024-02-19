// Transform from injective/oracle/v1beta1/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OracleInfoConverter : ProtobufConverter<OracleInfo>

public fun OracleInfo.toAny(): Any = Any(OracleInfo.TYPE_URL, with(OracleInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OracleInfo>): OracleInfo {
  if (typeUrl != OracleInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ChainlinkPriceStateConverter : ProtobufConverter<ChainlinkPriceState>

public fun ChainlinkPriceState.toAny(): Any = Any(ChainlinkPriceState.TYPE_URL,
    with(ChainlinkPriceStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ChainlinkPriceState>): ChainlinkPriceState {
  if (typeUrl != ChainlinkPriceState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BandPriceStateConverter : ProtobufConverter<BandPriceState>

public fun BandPriceState.toAny(): Any = Any(BandPriceState.TYPE_URL, with(BandPriceStateConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BandPriceState>): BandPriceState {
  if (typeUrl != BandPriceState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceFeedStateConverter : ProtobufConverter<PriceFeedState>

public fun PriceFeedState.toAny(): Any = Any(PriceFeedState.TYPE_URL, with(PriceFeedStateConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceFeedState>): PriceFeedState {
  if (typeUrl != PriceFeedState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProviderInfoConverter : ProtobufConverter<ProviderInfo>

public fun ProviderInfo.toAny(): Any = Any(ProviderInfo.TYPE_URL, with(ProviderInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProviderInfo>): ProviderInfo {
  if (typeUrl != ProviderInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProviderStateConverter : ProtobufConverter<ProviderState>

public fun ProviderState.toAny(): Any = Any(ProviderState.TYPE_URL, with(ProviderStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProviderState>): ProviderState {
  if (typeUrl != ProviderState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProviderPriceStateConverter : ProtobufConverter<ProviderPriceState>

public fun ProviderPriceState.toAny(): Any = Any(ProviderPriceState.TYPE_URL,
    with(ProviderPriceStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProviderPriceState>): ProviderPriceState {
  if (typeUrl != ProviderPriceState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceFeedInfoConverter : ProtobufConverter<PriceFeedInfo>

public fun PriceFeedInfo.toAny(): Any = Any(PriceFeedInfo.TYPE_URL, with(PriceFeedInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceFeedInfo>): PriceFeedInfo {
  if (typeUrl != PriceFeedInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceFeedPriceConverter : ProtobufConverter<PriceFeedPrice>

public fun PriceFeedPrice.toAny(): Any = Any(PriceFeedPrice.TYPE_URL, with(PriceFeedPriceConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceFeedPrice>): PriceFeedPrice {
  if (typeUrl != PriceFeedPrice.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CoinbasePriceStateConverter : ProtobufConverter<CoinbasePriceState>

public fun CoinbasePriceState.toAny(): Any = Any(CoinbasePriceState.TYPE_URL,
    with(CoinbasePriceStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CoinbasePriceState>): CoinbasePriceState {
  if (typeUrl != CoinbasePriceState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceStateConverter : ProtobufConverter<PriceState>

public fun PriceState.toAny(): Any = Any(PriceState.TYPE_URL, with(PriceStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceState>): PriceState {
  if (typeUrl != PriceState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PythPriceStateConverter : ProtobufConverter<PythPriceState>

public fun PythPriceState.toAny(): Any = Any(PythPriceState.TYPE_URL, with(PythPriceStateConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PythPriceState>): PythPriceState {
  if (typeUrl != PythPriceState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BandOracleRequestConverter : ProtobufConverter<BandOracleRequest>

public fun BandOracleRequest.toAny(): Any = Any(BandOracleRequest.TYPE_URL,
    with(BandOracleRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BandOracleRequest>): BandOracleRequest {
  if (typeUrl != BandOracleRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BandIBCParamsConverter : ProtobufConverter<BandIBCParams>

public fun BandIBCParams.toAny(): Any = Any(BandIBCParams.TYPE_URL, with(BandIBCParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BandIBCParams>): BandIBCParams {
  if (typeUrl != BandIBCParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SymbolPriceTimestampConverter : ProtobufConverter<SymbolPriceTimestamp>

public fun SymbolPriceTimestamp.toAny(): Any = Any(SymbolPriceTimestamp.TYPE_URL,
    with(SymbolPriceTimestampConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SymbolPriceTimestamp>): SymbolPriceTimestamp {
  if (typeUrl != SymbolPriceTimestamp.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LastPriceTimestampsConverter : ProtobufConverter<LastPriceTimestamps>

public fun LastPriceTimestamps.toAny(): Any = Any(LastPriceTimestamps.TYPE_URL,
    with(LastPriceTimestampsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LastPriceTimestamps>): LastPriceTimestamps {
  if (typeUrl != LastPriceTimestamps.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceRecordsConverter : ProtobufConverter<PriceRecords>

public fun PriceRecords.toAny(): Any = Any(PriceRecords.TYPE_URL, with(PriceRecordsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceRecords>): PriceRecords {
  if (typeUrl != PriceRecords.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceRecordConverter : ProtobufConverter<PriceRecord>

public fun PriceRecord.toAny(): Any = Any(PriceRecord.TYPE_URL, with(PriceRecordConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceRecord>): PriceRecord {
  if (typeUrl != PriceRecord.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MetadataStatisticsConverter : ProtobufConverter<MetadataStatistics>

public fun MetadataStatistics.toAny(): Any = Any(MetadataStatistics.TYPE_URL,
    with(MetadataStatisticsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MetadataStatistics>): MetadataStatistics {
  if (typeUrl != MetadataStatistics.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceAttestationConverter : ProtobufConverter<PriceAttestation>

public fun PriceAttestation.toAny(): Any = Any(PriceAttestation.TYPE_URL,
    with(PriceAttestationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceAttestation>): PriceAttestation {
  if (typeUrl != PriceAttestation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

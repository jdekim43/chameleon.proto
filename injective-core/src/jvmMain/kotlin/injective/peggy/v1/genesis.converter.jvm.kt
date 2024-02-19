// Transform from injective/peggy/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

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
  	lastObservedNonce = obj.getLastObservedNonce().asKotlinType,
  	valsets = obj.getValsetsList().map { ValsetJvmConverter.convert(it) },
  	valsetConfirms = obj.getValsetConfirmsList().map { MsgValsetConfirmJvmConverter.convert(it) },
  	batches = obj.getBatchesList().map { OutgoingTxBatchJvmConverter.convert(it) },
  	batchConfirms = obj.getBatchConfirmsList().map { MsgConfirmBatchJvmConverter.convert(it) },
  	attestations = obj.getAttestationsList().map { AttestationJvmConverter.convert(it) },
  	orchestratorAddresses = obj.getOrchestratorAddressesList().map {
      MsgSetOrchestratorAddressesJvmConverter.convert(it) },
  	erc20ToDenoms = obj.getErc20ToDenomsList().map { ERC20ToDenomJvmConverter.convert(it) },
  	unbatchedTransfers = obj.getUnbatchedTransfersList().map {
      OutgoingTransferTxJvmConverter.convert(it) },
  	lastObservedEthereumHeight = obj.getLastObservedEthereumHeight().asKotlinType,
  	lastOutgoingBatchId = obj.getLastOutgoingBatchId().asKotlinType,
  	lastOutgoingPoolId = obj.getLastOutgoingPoolId().asKotlinType,
  	lastObservedValset = ValsetJvmConverter.convert(obj.getLastObservedValset()),
  	ethereumBlacklist = obj.getEthereumBlacklistList().map { it },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.setLastObservedNonce(obj.lastObservedNonce.asJavaType)
    builder.addAllValsets(obj.valsets.map { ValsetJvmConverter.convert(it) })
    builder.addAllValsetConfirms(obj.valsetConfirms.map { MsgValsetConfirmJvmConverter.convert(it)
        })
    builder.addAllBatches(obj.batches.map { OutgoingTxBatchJvmConverter.convert(it) })
    builder.addAllBatchConfirms(obj.batchConfirms.map { MsgConfirmBatchJvmConverter.convert(it) })
    builder.addAllAttestations(obj.attestations.map { AttestationJvmConverter.convert(it) })
    builder.addAllOrchestratorAddresses(obj.orchestratorAddresses.map {
        MsgSetOrchestratorAddressesJvmConverter.convert(it) })
    builder.addAllErc20ToDenoms(obj.erc20ToDenoms.map { ERC20ToDenomJvmConverter.convert(it) })
    builder.addAllUnbatchedTransfers(obj.unbatchedTransfers.map {
        OutgoingTransferTxJvmConverter.convert(it) })
    builder.setLastObservedEthereumHeight(obj.lastObservedEthereumHeight.asJavaType)
    builder.setLastOutgoingBatchId(obj.lastOutgoingBatchId.asJavaType)
    builder.setLastOutgoingPoolId(obj.lastOutgoingPoolId.asJavaType)
    builder.setLastObservedValset(ValsetJvmConverter.convert(obj.lastObservedValset))
    builder.addAllEthereumBlacklist(obj.ethereumBlacklist.map { it })
    return builder.build()
  }
}

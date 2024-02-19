// Transform from injective/peggy/v1/params.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, ParamsOuterClass.Params> {
  public override val descriptor: Descriptors.Descriptor = ParamsOuterClass.Params.getDescriptor()

  public override val parser: Parser<ParamsOuterClass.Params> = ParamsOuterClass.Params.parser()

  public override fun convert(obj: ParamsOuterClass.Params): Params = Params(
  	peggyId = obj.getPeggyId(),
  	contractSourceHash = obj.getContractSourceHash(),
  	bridgeEthereumAddress = obj.getBridgeEthereumAddress(),
  	bridgeChainId = obj.getBridgeChainId().asKotlinType,
  	signedValsetsWindow = obj.getSignedValsetsWindow().asKotlinType,
  	signedBatchesWindow = obj.getSignedBatchesWindow().asKotlinType,
  	signedClaimsWindow = obj.getSignedClaimsWindow().asKotlinType,
  	targetBatchTimeout = obj.getTargetBatchTimeout().asKotlinType,
  	averageBlockTime = obj.getAverageBlockTime().asKotlinType,
  	averageEthereumBlockTime = obj.getAverageEthereumBlockTime().asKotlinType,
  	slashFractionValset = obj.getSlashFractionValset().toByteArray(),
  	slashFractionBatch = obj.getSlashFractionBatch().toByteArray(),
  	slashFractionClaim = obj.getSlashFractionClaim().toByteArray(),
  	slashFractionConflictingClaim = obj.getSlashFractionConflictingClaim().toByteArray(),
  	unbondSlashingValsetsWindow = obj.getUnbondSlashingValsetsWindow().asKotlinType,
  	slashFractionBadEthSignature = obj.getSlashFractionBadEthSignature().toByteArray(),
  	cosmosCoinDenom = obj.getCosmosCoinDenom(),
  	cosmosCoinErc20Contract = obj.getCosmosCoinErc20Contract(),
  	claimSlashingEnabled = obj.getClaimSlashingEnabled(),
  	bridgeContractStartHeight = obj.getBridgeContractStartHeight().asKotlinType,
  	valsetReward = CoinJvmConverter.convert(obj.getValsetReward()),
  )

  public override fun convert(obj: Params): ParamsOuterClass.Params {
    val builder = ParamsOuterClass.Params.newBuilder()
    builder.setPeggyId(obj.peggyId)
    builder.setContractSourceHash(obj.contractSourceHash)
    builder.setBridgeEthereumAddress(obj.bridgeEthereumAddress)
    builder.setBridgeChainId(obj.bridgeChainId.asJavaType)
    builder.setSignedValsetsWindow(obj.signedValsetsWindow.asJavaType)
    builder.setSignedBatchesWindow(obj.signedBatchesWindow.asJavaType)
    builder.setSignedClaimsWindow(obj.signedClaimsWindow.asJavaType)
    builder.setTargetBatchTimeout(obj.targetBatchTimeout.asJavaType)
    builder.setAverageBlockTime(obj.averageBlockTime.asJavaType)
    builder.setAverageEthereumBlockTime(obj.averageEthereumBlockTime.asJavaType)
    builder.setSlashFractionValset(ByteString.copyFrom(obj.slashFractionValset))
    builder.setSlashFractionBatch(ByteString.copyFrom(obj.slashFractionBatch))
    builder.setSlashFractionClaim(ByteString.copyFrom(obj.slashFractionClaim))
    builder.setSlashFractionConflictingClaim(ByteString.copyFrom(obj.slashFractionConflictingClaim))
    builder.setUnbondSlashingValsetsWindow(obj.unbondSlashingValsetsWindow.asJavaType)
    builder.setSlashFractionBadEthSignature(ByteString.copyFrom(obj.slashFractionBadEthSignature))
    builder.setCosmosCoinDenom(obj.cosmosCoinDenom)
    builder.setCosmosCoinErc20Contract(obj.cosmosCoinErc20Contract)
    builder.setClaimSlashingEnabled(obj.claimSlashingEnabled)
    builder.setBridgeContractStartHeight(obj.bridgeContractStartHeight.asJavaType)
    builder.setValsetReward(CoinJvmConverter.convert(obj.valsetReward))
    return builder.build()
  }
}

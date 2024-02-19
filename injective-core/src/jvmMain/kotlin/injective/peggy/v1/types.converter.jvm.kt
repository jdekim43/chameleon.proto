// Transform from injective/peggy/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object BridgeValidatorJvmConverter :
    ProtobufTypeMapper<BridgeValidator, Types.BridgeValidator> {
  public override val descriptor: Descriptors.Descriptor = Types.BridgeValidator.getDescriptor()

  public override val parser: Parser<Types.BridgeValidator> = Types.BridgeValidator.parser()

  public override fun convert(obj: Types.BridgeValidator): BridgeValidator = BridgeValidator(
  	power = obj.getPower().asKotlinType,
  	ethereumAddress = obj.getEthereumAddress(),
  )

  public override fun convert(obj: BridgeValidator): Types.BridgeValidator {
    val builder = Types.BridgeValidator.newBuilder()
    builder.setPower(obj.power.asJavaType)
    builder.setEthereumAddress(obj.ethereumAddress)
    return builder.build()
  }
}

public object ValsetJvmConverter : ProtobufTypeMapper<Valset, Types.Valset> {
  public override val descriptor: Descriptors.Descriptor = Types.Valset.getDescriptor()

  public override val parser: Parser<Types.Valset> = Types.Valset.parser()

  public override fun convert(obj: Types.Valset): Valset = Valset(
  	nonce = obj.getNonce().asKotlinType,
  	members = obj.getMembersList().map { BridgeValidatorJvmConverter.convert(it) },
  	height = obj.getHeight().asKotlinType,
  	rewardAmount = obj.getRewardAmount(),
  	rewardToken = obj.getRewardToken(),
  )

  public override fun convert(obj: Valset): Types.Valset {
    val builder = Types.Valset.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    builder.addAllMembers(obj.members.map { BridgeValidatorJvmConverter.convert(it) })
    builder.setHeight(obj.height.asJavaType)
    builder.setRewardAmount(obj.rewardAmount)
    builder.setRewardToken(obj.rewardToken)
    return builder.build()
  }
}

public object LastObservedEthereumBlockHeightJvmConverter :
    ProtobufTypeMapper<LastObservedEthereumBlockHeight, Types.LastObservedEthereumBlockHeight> {
  public override val descriptor: Descriptors.Descriptor =
      Types.LastObservedEthereumBlockHeight.getDescriptor()

  public override val parser: Parser<Types.LastObservedEthereumBlockHeight> =
      Types.LastObservedEthereumBlockHeight.parser()

  public override fun convert(obj: Types.LastObservedEthereumBlockHeight):
      LastObservedEthereumBlockHeight = LastObservedEthereumBlockHeight(
  	cosmosBlockHeight = obj.getCosmosBlockHeight().asKotlinType,
  	ethereumBlockHeight = obj.getEthereumBlockHeight().asKotlinType,
  )

  public override fun convert(obj: LastObservedEthereumBlockHeight):
      Types.LastObservedEthereumBlockHeight {
    val builder = Types.LastObservedEthereumBlockHeight.newBuilder()
    builder.setCosmosBlockHeight(obj.cosmosBlockHeight.asJavaType)
    builder.setEthereumBlockHeight(obj.ethereumBlockHeight.asJavaType)
    return builder.build()
  }
}

public object LastClaimEventJvmConverter : ProtobufTypeMapper<LastClaimEvent, Types.LastClaimEvent>
    {
  public override val descriptor: Descriptors.Descriptor = Types.LastClaimEvent.getDescriptor()

  public override val parser: Parser<Types.LastClaimEvent> = Types.LastClaimEvent.parser()

  public override fun convert(obj: Types.LastClaimEvent): LastClaimEvent = LastClaimEvent(
  	ethereumEventNonce = obj.getEthereumEventNonce().asKotlinType,
  	ethereumEventHeight = obj.getEthereumEventHeight().asKotlinType,
  )

  public override fun convert(obj: LastClaimEvent): Types.LastClaimEvent {
    val builder = Types.LastClaimEvent.newBuilder()
    builder.setEthereumEventNonce(obj.ethereumEventNonce.asJavaType)
    builder.setEthereumEventHeight(obj.ethereumEventHeight.asJavaType)
    return builder.build()
  }
}

public object ERC20ToDenomJvmConverter : ProtobufTypeMapper<ERC20ToDenom, Types.ERC20ToDenom> {
  public override val descriptor: Descriptors.Descriptor = Types.ERC20ToDenom.getDescriptor()

  public override val parser: Parser<Types.ERC20ToDenom> = Types.ERC20ToDenom.parser()

  public override fun convert(obj: Types.ERC20ToDenom): ERC20ToDenom = ERC20ToDenom(
  	erc20 = obj.getErc20(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: ERC20ToDenom): Types.ERC20ToDenom {
    val builder = Types.ERC20ToDenom.newBuilder()
    builder.setErc20(obj.erc20)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

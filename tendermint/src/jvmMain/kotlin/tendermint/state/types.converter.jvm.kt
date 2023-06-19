// Transform from tendermint/state/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.state

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.abci.ResponseBeginBlockJvmConverter
import tendermint.abci.ResponseDeliverTxJvmConverter
import tendermint.abci.ResponseEndBlockJvmConverter
import tendermint.types.BlockIDJvmConverter
import tendermint.types.ConsensusParamsJvmConverter
import tendermint.types.ValidatorSetJvmConverter
import tendermint.version.ConsensusJvmConverter

public object ABCIResponsesJvmConverter : ProtobufTypeMapper<ABCIResponses, Types.ABCIResponses> {
  public override val descriptor: Descriptors.Descriptor = Types.ABCIResponses.getDescriptor()

  public override val parser: Parser<Types.ABCIResponses> = Types.ABCIResponses.parser()

  public override fun convert(obj: Types.ABCIResponses): ABCIResponses = ABCIResponses(
  	deliverTxs = obj.getDeliverTxsList().map { ResponseDeliverTxJvmConverter.convert(it) },
  	endBlock = ResponseEndBlockJvmConverter.convert(obj.getEndBlock()),
  	beginBlock = ResponseBeginBlockJvmConverter.convert(obj.getBeginBlock()),
  )

  public override fun convert(obj: ABCIResponses): Types.ABCIResponses {
    val builder = Types.ABCIResponses.newBuilder()
    builder.addAllDeliverTxs(obj.deliverTxs.map { ResponseDeliverTxJvmConverter.convert(it) })
    builder.setEndBlock(ResponseEndBlockJvmConverter.convert(obj.endBlock))
    builder.setBeginBlock(ResponseBeginBlockJvmConverter.convert(obj.beginBlock))
    return builder.build()
  }
}

public object ValidatorsInfoJvmConverter : ProtobufTypeMapper<ValidatorsInfo, Types.ValidatorsInfo>
    {
  public override val descriptor: Descriptors.Descriptor = Types.ValidatorsInfo.getDescriptor()

  public override val parser: Parser<Types.ValidatorsInfo> = Types.ValidatorsInfo.parser()

  public override fun convert(obj: Types.ValidatorsInfo): ValidatorsInfo = ValidatorsInfo(
  	validatorSet = ValidatorSetJvmConverter.convert(obj.getValidatorSet()),
  	lastHeightChanged = obj.getLastHeightChanged(),
  )

  public override fun convert(obj: ValidatorsInfo): Types.ValidatorsInfo {
    val builder = Types.ValidatorsInfo.newBuilder()
    builder.setValidatorSet(ValidatorSetJvmConverter.convert(obj.validatorSet))
    builder.setLastHeightChanged(obj.lastHeightChanged)
    return builder.build()
  }
}

public object ConsensusParamsInfoJvmConverter :
    ProtobufTypeMapper<ConsensusParamsInfo, Types.ConsensusParamsInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.ConsensusParamsInfo.getDescriptor()

  public override val parser: Parser<Types.ConsensusParamsInfo> = Types.ConsensusParamsInfo.parser()

  public override fun convert(obj: Types.ConsensusParamsInfo): ConsensusParamsInfo =
      ConsensusParamsInfo(
  	consensusParams = ConsensusParamsJvmConverter.convert(obj.getConsensusParams()),
  	lastHeightChanged = obj.getLastHeightChanged(),
  )

  public override fun convert(obj: ConsensusParamsInfo): Types.ConsensusParamsInfo {
    val builder = Types.ConsensusParamsInfo.newBuilder()
    builder.setConsensusParams(ConsensusParamsJvmConverter.convert(obj.consensusParams))
    builder.setLastHeightChanged(obj.lastHeightChanged)
    return builder.build()
  }
}

public object ABCIResponsesInfoJvmConverter :
    ProtobufTypeMapper<ABCIResponsesInfo, Types.ABCIResponsesInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.ABCIResponsesInfo.getDescriptor()

  public override val parser: Parser<Types.ABCIResponsesInfo> = Types.ABCIResponsesInfo.parser()

  public override fun convert(obj: Types.ABCIResponsesInfo): ABCIResponsesInfo = ABCIResponsesInfo(
  	abciResponses = ABCIResponsesJvmConverter.convert(obj.getAbciResponses()),
  	height = obj.getHeight(),
  )

  public override fun convert(obj: ABCIResponsesInfo): Types.ABCIResponsesInfo {
    val builder = Types.ABCIResponsesInfo.newBuilder()
    builder.setAbciResponses(ABCIResponsesJvmConverter.convert(obj.abciResponses))
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object VersionJvmConverter : ProtobufTypeMapper<Version, Types.Version> {
  public override val descriptor: Descriptors.Descriptor = Types.Version.getDescriptor()

  public override val parser: Parser<Types.Version> = Types.Version.parser()

  public override fun convert(obj: Types.Version): Version = Version(
  	consensus = ConsensusJvmConverter.convert(obj.getConsensus()),
  	software = obj.getSoftware(),
  )

  public override fun convert(obj: Version): Types.Version {
    val builder = Types.Version.newBuilder()
    builder.setConsensus(ConsensusJvmConverter.convert(obj.consensus))
    builder.setSoftware(obj.software)
    return builder.build()
  }
}

public object StateJvmConverter : ProtobufTypeMapper<State, Types.State> {
  public override val descriptor: Descriptors.Descriptor = Types.State.getDescriptor()

  public override val parser: Parser<Types.State> = Types.State.parser()

  public override fun convert(obj: Types.State): State = State(
  	version = VersionJvmConverter.convert(obj.getVersion()),
  	chainId = obj.getChainId(),
  	initialHeight = obj.getInitialHeight(),
  	lastBlockHeight = obj.getLastBlockHeight(),
  	lastBlockId = BlockIDJvmConverter.convert(obj.getLastBlockId()),
  	lastBlockTime = TimestampJvmConverter.convert(obj.getLastBlockTime()),
  	nextValidators = ValidatorSetJvmConverter.convert(obj.getNextValidators()),
  	validators = ValidatorSetJvmConverter.convert(obj.getValidators()),
  	lastValidators = ValidatorSetJvmConverter.convert(obj.getLastValidators()),
  	lastHeightValidatorsChanged = obj.getLastHeightValidatorsChanged(),
  	consensusParams = ConsensusParamsJvmConverter.convert(obj.getConsensusParams()),
  	lastHeightConsensusParamsChanged = obj.getLastHeightConsensusParamsChanged(),
  	lastResultsHash = obj.getLastResultsHash().toByteArray(),
  	appHash = obj.getAppHash().toByteArray(),
  )

  public override fun convert(obj: State): Types.State {
    val builder = Types.State.newBuilder()
    builder.setVersion(VersionJvmConverter.convert(obj.version))
    builder.setChainId(obj.chainId)
    builder.setInitialHeight(obj.initialHeight)
    builder.setLastBlockHeight(obj.lastBlockHeight)
    builder.setLastBlockId(BlockIDJvmConverter.convert(obj.lastBlockId))
    builder.setLastBlockTime(TimestampJvmConverter.convert(obj.lastBlockTime))
    builder.setNextValidators(ValidatorSetJvmConverter.convert(obj.nextValidators))
    builder.setValidators(ValidatorSetJvmConverter.convert(obj.validators))
    builder.setLastValidators(ValidatorSetJvmConverter.convert(obj.lastValidators))
    builder.setLastHeightValidatorsChanged(obj.lastHeightValidatorsChanged)
    builder.setConsensusParams(ConsensusParamsJvmConverter.convert(obj.consensusParams))
    builder.setLastHeightConsensusParamsChanged(obj.lastHeightConsensusParamsChanged)
    builder.setLastResultsHash(ByteString.copyFrom(obj.lastResultsHash))
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    return builder.build()
  }
}

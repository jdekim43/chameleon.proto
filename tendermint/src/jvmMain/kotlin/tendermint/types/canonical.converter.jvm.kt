// Transform from tendermint/types/canonical.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object CanonicalBlockIDJvmConverter :
    ProtobufTypeMapper<CanonicalBlockID, Canonical.CanonicalBlockID> {
  public override val descriptor: Descriptors.Descriptor =
      Canonical.CanonicalBlockID.getDescriptor()

  public override val parser: Parser<Canonical.CanonicalBlockID> =
      Canonical.CanonicalBlockID.parser()

  public override fun convert(obj: Canonical.CanonicalBlockID): CanonicalBlockID = CanonicalBlockID(
  	hash = obj.getHash().toByteArray(),
  	partSetHeader = CanonicalPartSetHeaderJvmConverter.convert(obj.getPartSetHeader()),
  )

  public override fun convert(obj: CanonicalBlockID): Canonical.CanonicalBlockID {
    val builder = Canonical.CanonicalBlockID.newBuilder()
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setPartSetHeader(CanonicalPartSetHeaderJvmConverter.convert(obj.partSetHeader))
    return builder.build()
  }
}

public object CanonicalPartSetHeaderJvmConverter :
    ProtobufTypeMapper<CanonicalPartSetHeader, Canonical.CanonicalPartSetHeader> {
  public override val descriptor: Descriptors.Descriptor =
      Canonical.CanonicalPartSetHeader.getDescriptor()

  public override val parser: Parser<Canonical.CanonicalPartSetHeader> =
      Canonical.CanonicalPartSetHeader.parser()

  public override fun convert(obj: Canonical.CanonicalPartSetHeader): CanonicalPartSetHeader =
      CanonicalPartSetHeader(
  	total = obj.getTotal().asKotlinType,
  	hash = obj.getHash().toByteArray(),
  )

  public override fun convert(obj: CanonicalPartSetHeader): Canonical.CanonicalPartSetHeader {
    val builder = Canonical.CanonicalPartSetHeader.newBuilder()
    builder.setTotal(obj.total.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    return builder.build()
  }
}

public object CanonicalProposalJvmConverter :
    ProtobufTypeMapper<CanonicalProposal, Canonical.CanonicalProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Canonical.CanonicalProposal.getDescriptor()

  public override val parser: Parser<Canonical.CanonicalProposal> =
      Canonical.CanonicalProposal.parser()

  public override fun convert(obj: Canonical.CanonicalProposal): CanonicalProposal =
      CanonicalProposal(
  	type = SignedMsgType.forNumber(obj.getType().number),
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	polRound = obj.getPolRound(),
  	blockId = CanonicalBlockIDJvmConverter.convert(obj.getBlockId()),
  	timestamp = TimestampJvmConverter.convert(obj.getTimestamp()),
  	chainId = obj.getChainId(),
  )

  public override fun convert(obj: CanonicalProposal): Canonical.CanonicalProposal {
    val builder = Canonical.CanonicalProposal.newBuilder()
    builder.setType(Types.SignedMsgType.forNumber(obj.type.number))
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setPolRound(obj.polRound)
    builder.setBlockId(CanonicalBlockIDJvmConverter.convert(obj.blockId))
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    builder.setChainId(obj.chainId)
    return builder.build()
  }
}

public object CanonicalVoteJvmConverter : ProtobufTypeMapper<CanonicalVote, Canonical.CanonicalVote>
    {
  public override val descriptor: Descriptors.Descriptor = Canonical.CanonicalVote.getDescriptor()

  public override val parser: Parser<Canonical.CanonicalVote> = Canonical.CanonicalVote.parser()

  public override fun convert(obj: Canonical.CanonicalVote): CanonicalVote = CanonicalVote(
  	type = SignedMsgType.forNumber(obj.getType().number),
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	blockId = CanonicalBlockIDJvmConverter.convert(obj.getBlockId()),
  	timestamp = TimestampJvmConverter.convert(obj.getTimestamp()),
  	chainId = obj.getChainId(),
  )

  public override fun convert(obj: CanonicalVote): Canonical.CanonicalVote {
    val builder = Canonical.CanonicalVote.newBuilder()
    builder.setType(Types.SignedMsgType.forNumber(obj.type.number))
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setBlockId(CanonicalBlockIDJvmConverter.convert(obj.blockId))
    builder.setTimestamp(TimestampJvmConverter.convert(obj.timestamp))
    builder.setChainId(obj.chainId)
    return builder.build()
  }
}

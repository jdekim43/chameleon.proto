// Transform from tendermint/consensus/wal.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.types.EventDataRoundStateJvmConverter

public object MsgInfoJvmConverter : ProtobufTypeMapper<MsgInfo, Wal.MsgInfo> {
  public override val descriptor: Descriptors.Descriptor = Wal.MsgInfo.getDescriptor()

  public override val parser: Parser<Wal.MsgInfo> = Wal.MsgInfo.parser()

  public override fun convert(obj: Wal.MsgInfo): MsgInfo = MsgInfo(
  	msg = MessageJvmConverter.convert(obj.getMsg()),
  	peerId = obj.getPeerId(),
  )

  public override fun convert(obj: MsgInfo): Wal.MsgInfo {
    val builder = Wal.MsgInfo.newBuilder()
    builder.setMsg(MessageJvmConverter.convert(obj.msg))
    builder.setPeerId(obj.peerId)
    return builder.build()
  }
}

public object TimeoutInfoJvmConverter : ProtobufTypeMapper<TimeoutInfo, Wal.TimeoutInfo> {
  public override val descriptor: Descriptors.Descriptor = Wal.TimeoutInfo.getDescriptor()

  public override val parser: Parser<Wal.TimeoutInfo> = Wal.TimeoutInfo.parser()

  public override fun convert(obj: Wal.TimeoutInfo): TimeoutInfo = TimeoutInfo(
  	duration = DurationJvmConverter.convert(obj.getDuration()),
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	step = obj.getStep().asKotlinType,
  )

  public override fun convert(obj: TimeoutInfo): Wal.TimeoutInfo {
    val builder = Wal.TimeoutInfo.newBuilder()
    builder.setDuration(DurationJvmConverter.convert(obj.duration))
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setStep(obj.step.asJavaType)
    return builder.build()
  }
}

public object EndHeightJvmConverter : ProtobufTypeMapper<EndHeight, Wal.EndHeight> {
  public override val descriptor: Descriptors.Descriptor = Wal.EndHeight.getDescriptor()

  public override val parser: Parser<Wal.EndHeight> = Wal.EndHeight.parser()

  public override fun convert(obj: Wal.EndHeight): EndHeight = EndHeight(
  	height = obj.getHeight(),
  )

  public override fun convert(obj: EndHeight): Wal.EndHeight {
    val builder = Wal.EndHeight.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object WALMessageJvmConverter : ProtobufTypeMapper<WALMessage, Wal.WALMessage> {
  public override val descriptor: Descriptors.Descriptor = Wal.WALMessage.getDescriptor()

  public override val parser: Parser<Wal.WALMessage> = Wal.WALMessage.parser()

  public override fun convert(obj: Wal.WALMessage): WALMessage = WALMessage(
  	sum = mapOf(
  1 to {
      WALMessage.SumOneOf.EventDataRoundState(EventDataRoundStateJvmConverter.convert(obj.getEventDataRoundState()))
      },
  2 to { WALMessage.SumOneOf.MsgInfo(MsgInfoJvmConverter.convert(obj.getMsgInfo())) },
  3 to { WALMessage.SumOneOf.TimeoutInfo(TimeoutInfoJvmConverter.convert(obj.getTimeoutInfo())) },
  4 to { WALMessage.SumOneOf.EndHeight(EndHeightJvmConverter.convert(obj.getEndHeight())) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: WALMessage): Wal.WALMessage {
    val builder = Wal.WALMessage.newBuilder()
    when (obj.sum) {
      is WALMessage.SumOneOf.EventDataRoundState ->
          builder.setEventDataRoundState(EventDataRoundStateJvmConverter.convert(obj.sum.value))
      is WALMessage.SumOneOf.MsgInfo ->
          builder.setMsgInfo(MsgInfoJvmConverter.convert(obj.sum.value))
      is WALMessage.SumOneOf.TimeoutInfo ->
          builder.setTimeoutInfo(TimeoutInfoJvmConverter.convert(obj.sum.value))
      is WALMessage.SumOneOf.EndHeight ->
          builder.setEndHeight(EndHeightJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}

public object TimedWALMessageJvmConverter : ProtobufTypeMapper<TimedWALMessage, Wal.TimedWALMessage>
    {
  public override val descriptor: Descriptors.Descriptor = Wal.TimedWALMessage.getDescriptor()

  public override val parser: Parser<Wal.TimedWALMessage> = Wal.TimedWALMessage.parser()

  public override fun convert(obj: Wal.TimedWALMessage): TimedWALMessage = TimedWALMessage(
  	time = TimestampJvmConverter.convert(obj.getTime()),
  	msg = WALMessageJvmConverter.convert(obj.getMsg()),
  )

  public override fun convert(obj: TimedWALMessage): Wal.TimedWALMessage {
    val builder = Wal.TimedWALMessage.newBuilder()
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setMsg(WALMessageJvmConverter.convert(obj.msg))
    return builder.build()
  }
}

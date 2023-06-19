// Transform from tendermint/types/events.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EventDataRoundStateJvmConverter :
    ProtobufTypeMapper<EventDataRoundState, Events.EventDataRoundState> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventDataRoundState.getDescriptor()

  public override val parser: Parser<Events.EventDataRoundState> =
      Events.EventDataRoundState.parser()

  public override fun convert(obj: Events.EventDataRoundState): EventDataRoundState =
      EventDataRoundState(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	step = obj.getStep(),
  )

  public override fun convert(obj: EventDataRoundState): Events.EventDataRoundState {
    val builder = Events.EventDataRoundState.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setStep(obj.step)
    return builder.build()
  }
}

// Transform from injective/ocr/v1beta1/ocr.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

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

public expect object FeedConfigConverter : ProtobufConverter<FeedConfig>

public fun FeedConfig.toAny(): Any = Any(FeedConfig.TYPE_URL, with(FeedConfigConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedConfig>): FeedConfig {
  if (typeUrl != FeedConfig.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeedConfigInfoConverter : ProtobufConverter<FeedConfigInfo>

public fun FeedConfigInfo.toAny(): Any = Any(FeedConfigInfo.TYPE_URL, with(FeedConfigInfoConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedConfigInfo>): FeedConfigInfo {
  if (typeUrl != FeedConfigInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModuleParamsConverter : ProtobufConverter<ModuleParams>

public fun ModuleParams.toAny(): Any = Any(ModuleParams.TYPE_URL, with(ModuleParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleParams>): ModuleParams {
  if (typeUrl != ModuleParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractConfigConverter : ProtobufConverter<ContractConfig>

public fun ContractConfig.toAny(): Any = Any(ContractConfig.TYPE_URL, with(ContractConfigConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractConfig>): ContractConfig {
  if (typeUrl != ContractConfig.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetConfigProposalConverter : ProtobufConverter<SetConfigProposal>

public fun SetConfigProposal.toAny(): Any = Any(SetConfigProposal.TYPE_URL,
    with(SetConfigProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetConfigProposal>): SetConfigProposal {
  if (typeUrl != SetConfigProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeedPropertiesConverter : ProtobufConverter<FeedProperties>

public fun FeedProperties.toAny(): Any = Any(FeedProperties.TYPE_URL, with(FeedPropertiesConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedProperties>): FeedProperties {
  if (typeUrl != FeedProperties.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetBatchConfigProposalConverter : ProtobufConverter<SetBatchConfigProposal>

public fun SetBatchConfigProposal.toAny(): Any = Any(SetBatchConfigProposal.TYPE_URL,
    with(SetBatchConfigProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetBatchConfigProposal>): SetBatchConfigProposal {
  if (typeUrl != SetBatchConfigProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OracleObservationsCountsConverter : ProtobufConverter<OracleObservationsCounts>

public fun OracleObservationsCounts.toAny(): Any = Any(OracleObservationsCounts.TYPE_URL,
    with(OracleObservationsCountsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OracleObservationsCounts>):
    OracleObservationsCounts {
  if (typeUrl != OracleObservationsCounts.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GasReimbursementsConverter : ProtobufConverter<GasReimbursements>

public fun GasReimbursements.toAny(): Any = Any(GasReimbursements.TYPE_URL,
    with(GasReimbursementsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GasReimbursements>): GasReimbursements {
  if (typeUrl != GasReimbursements.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PayeeConverter : ProtobufConverter<Payee>

public fun Payee.toAny(): Any = Any(Payee.TYPE_URL, with(PayeeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Payee>): Payee {
  if (typeUrl != Payee.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TransmissionConverter : ProtobufConverter<Transmission>

public fun Transmission.toAny(): Any = Any(Transmission.TYPE_URL, with(TransmissionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Transmission>): Transmission {
  if (typeUrl != Transmission.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EpochAndRoundConverter : ProtobufConverter<EpochAndRound>

public fun EpochAndRound.toAny(): Any = Any(EpochAndRound.TYPE_URL, with(EpochAndRoundConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EpochAndRound>): EpochAndRound {
  if (typeUrl != EpochAndRound.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ReportConverter : ProtobufConverter<Report>

public fun Report.toAny(): Any = Any(Report.TYPE_URL, with(ReportConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Report>): Report {
  if (typeUrl != Report.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ReportToSignConverter : ProtobufConverter<ReportToSign>

public fun ReportToSign.toAny(): Any = Any(ReportToSign.TYPE_URL, with(ReportToSignConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ReportToSign>): ReportToSign {
  if (typeUrl != ReportToSign.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventOraclePaidConverter : ProtobufConverter<EventOraclePaid>

public fun EventOraclePaid.toAny(): Any = Any(EventOraclePaid.TYPE_URL,
    with(EventOraclePaidConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventOraclePaid>): EventOraclePaid {
  if (typeUrl != EventOraclePaid.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAnswerUpdatedConverter : ProtobufConverter<EventAnswerUpdated>

public fun EventAnswerUpdated.toAny(): Any = Any(EventAnswerUpdated.TYPE_URL,
    with(EventAnswerUpdatedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAnswerUpdated>): EventAnswerUpdated {
  if (typeUrl != EventAnswerUpdated.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventNewRoundConverter : ProtobufConverter<EventNewRound>

public fun EventNewRound.toAny(): Any = Any(EventNewRound.TYPE_URL, with(EventNewRoundConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventNewRound>): EventNewRound {
  if (typeUrl != EventNewRound.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventTransmittedConverter : ProtobufConverter<EventTransmitted>

public fun EventTransmitted.toAny(): Any = Any(EventTransmitted.TYPE_URL,
    with(EventTransmittedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventTransmitted>): EventTransmitted {
  if (typeUrl != EventTransmitted.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventNewTransmissionConverter : ProtobufConverter<EventNewTransmission>

public fun EventNewTransmission.toAny(): Any = Any(EventNewTransmission.TYPE_URL,
    with(EventNewTransmissionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventNewTransmission>): EventNewTransmission {
  if (typeUrl != EventNewTransmission.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventConfigSetConverter : ProtobufConverter<EventConfigSet>

public fun EventConfigSet.toAny(): Any = Any(EventConfigSet.TYPE_URL, with(EventConfigSetConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventConfigSet>): EventConfigSet {
  if (typeUrl != EventConfigSet.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

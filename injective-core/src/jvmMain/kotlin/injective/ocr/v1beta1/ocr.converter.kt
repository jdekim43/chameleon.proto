// Transform from injective/ocr/v1beta1/ocr.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object FeedConfigConverter : ProtobufConverter<FeedConfig> by FeedConfigJvmConverter

public actual object FeedConfigInfoConverter : ProtobufConverter<FeedConfigInfo> by
    FeedConfigInfoJvmConverter

public actual object ModuleParamsConverter : ProtobufConverter<ModuleParams> by
    ModuleParamsJvmConverter

public actual object ContractConfigConverter : ProtobufConverter<ContractConfig> by
    ContractConfigJvmConverter

public actual object SetConfigProposalConverter : ProtobufConverter<SetConfigProposal> by
    SetConfigProposalJvmConverter

public actual object FeedPropertiesConverter : ProtobufConverter<FeedProperties> by
    FeedPropertiesJvmConverter

public actual object SetBatchConfigProposalConverter : ProtobufConverter<SetBatchConfigProposal> by
    SetBatchConfigProposalJvmConverter

public actual object OracleObservationsCountsConverter : ProtobufConverter<OracleObservationsCounts>
    by OracleObservationsCountsJvmConverter

public actual object GasReimbursementsConverter : ProtobufConverter<GasReimbursements> by
    GasReimbursementsJvmConverter

public actual object PayeeConverter : ProtobufConverter<Payee> by PayeeJvmConverter

public actual object TransmissionConverter : ProtobufConverter<Transmission> by
    TransmissionJvmConverter

public actual object EpochAndRoundConverter : ProtobufConverter<EpochAndRound> by
    EpochAndRoundJvmConverter

public actual object ReportConverter : ProtobufConverter<Report> by ReportJvmConverter

public actual object ReportToSignConverter : ProtobufConverter<ReportToSign> by
    ReportToSignJvmConverter

public actual object EventOraclePaidConverter : ProtobufConverter<EventOraclePaid> by
    EventOraclePaidJvmConverter

public actual object EventAnswerUpdatedConverter : ProtobufConverter<EventAnswerUpdated> by
    EventAnswerUpdatedJvmConverter

public actual object EventNewRoundConverter : ProtobufConverter<EventNewRound> by
    EventNewRoundJvmConverter

public actual object EventTransmittedConverter : ProtobufConverter<EventTransmitted> by
    EventTransmittedJvmConverter

public actual object EventNewTransmissionConverter : ProtobufConverter<EventNewTransmission> by
    EventNewTransmissionJvmConverter

public actual object EventConfigSetConverter : ProtobufConverter<EventConfigSet> by
    EventConfigSetJvmConverter

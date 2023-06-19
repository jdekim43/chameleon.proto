// Transform from tendermint/privval/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.privval

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object RemoteSignerErrorConverter : ProtobufConverter<RemoteSignerError> by
    RemoteSignerErrorJvmConverter

public actual object PubKeyRequestConverter : ProtobufConverter<PubKeyRequest> by
    PubKeyRequestJvmConverter

public actual object PubKeyResponseConverter : ProtobufConverter<PubKeyResponse> by
    PubKeyResponseJvmConverter

public actual object SignVoteRequestConverter : ProtobufConverter<SignVoteRequest> by
    SignVoteRequestJvmConverter

public actual object SignedVoteResponseConverter : ProtobufConverter<SignedVoteResponse> by
    SignedVoteResponseJvmConverter

public actual object SignProposalRequestConverter : ProtobufConverter<SignProposalRequest> by
    SignProposalRequestJvmConverter

public actual object SignedProposalResponseConverter : ProtobufConverter<SignedProposalResponse> by
    SignedProposalResponseJvmConverter

public actual object PingRequestConverter : ProtobufConverter<PingRequest> by
    PingRequestJvmConverter

public actual object PingResponseConverter : ProtobufConverter<PingResponse> by
    PingResponseJvmConverter

public actual object MessageConverter : ProtobufConverter<Message> by MessageJvmConverter

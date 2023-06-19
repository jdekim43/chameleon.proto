// Transform from tendermint/privval/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.privval

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object RemoteSignerErrorConverter : ProtobufConverter<RemoteSignerError>

public fun RemoteSignerError.toAny(): Any = Any(RemoteSignerError.TYPE_URL,
    with(RemoteSignerErrorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RemoteSignerError>): RemoteSignerError {
  if (typeUrl != RemoteSignerError.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PubKeyRequestConverter : ProtobufConverter<PubKeyRequest>

public fun PubKeyRequest.toAny(): Any = Any(PubKeyRequest.TYPE_URL, with(PubKeyRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PubKeyRequest>): PubKeyRequest {
  if (typeUrl != PubKeyRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PubKeyResponseConverter : ProtobufConverter<PubKeyResponse>

public fun PubKeyResponse.toAny(): Any = Any(PubKeyResponse.TYPE_URL, with(PubKeyResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PubKeyResponse>): PubKeyResponse {
  if (typeUrl != PubKeyResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignVoteRequestConverter : ProtobufConverter<SignVoteRequest>

public fun SignVoteRequest.toAny(): Any = Any(SignVoteRequest.TYPE_URL,
    with(SignVoteRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignVoteRequest>): SignVoteRequest {
  if (typeUrl != SignVoteRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignedVoteResponseConverter : ProtobufConverter<SignedVoteResponse>

public fun SignedVoteResponse.toAny(): Any = Any(SignedVoteResponse.TYPE_URL,
    with(SignedVoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignedVoteResponse>): SignedVoteResponse {
  if (typeUrl != SignedVoteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignProposalRequestConverter : ProtobufConverter<SignProposalRequest>

public fun SignProposalRequest.toAny(): Any = Any(SignProposalRequest.TYPE_URL,
    with(SignProposalRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignProposalRequest>): SignProposalRequest {
  if (typeUrl != SignProposalRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignedProposalResponseConverter : ProtobufConverter<SignedProposalResponse>

public fun SignedProposalResponse.toAny(): Any = Any(SignedProposalResponse.TYPE_URL,
    with(SignedProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignedProposalResponse>): SignedProposalResponse {
  if (typeUrl != SignedProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PingRequestConverter : ProtobufConverter<PingRequest>

public fun PingRequest.toAny(): Any = Any(PingRequest.TYPE_URL, with(PingRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PingRequest>): PingRequest {
  if (typeUrl != PingRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PingResponseConverter : ProtobufConverter<PingResponse>

public fun PingResponse.toAny(): Any = Any(PingResponse.TYPE_URL, with(PingResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PingResponse>): PingResponse {
  if (typeUrl != PingResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MessageConverter : ProtobufConverter<Message>

public fun Message.toAny(): Any = Any(Message.TYPE_URL, with(MessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Message>): Message {
  if (typeUrl != Message.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from tendermint/privval/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.privval

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.crypto.PublicKeyJvmConverter
import tendermint.types.ProposalJvmConverter
import tendermint.types.VoteJvmConverter

public object RemoteSignerErrorJvmConverter :
    ProtobufTypeMapper<RemoteSignerError, Types.RemoteSignerError> {
  public override val descriptor: Descriptors.Descriptor = Types.RemoteSignerError.getDescriptor()

  public override val parser: Parser<Types.RemoteSignerError> = Types.RemoteSignerError.parser()

  public override fun convert(obj: Types.RemoteSignerError): RemoteSignerError = RemoteSignerError(
  	code = obj.getCode(),
  	description = obj.getDescription(),
  )

  public override fun convert(obj: RemoteSignerError): Types.RemoteSignerError {
    val builder = Types.RemoteSignerError.newBuilder()
    builder.setCode(obj.code)
    builder.setDescription(obj.description)
    return builder.build()
  }
}

public object PubKeyRequestJvmConverter : ProtobufTypeMapper<PubKeyRequest, Types.PubKeyRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.PubKeyRequest.getDescriptor()

  public override val parser: Parser<Types.PubKeyRequest> = Types.PubKeyRequest.parser()

  public override fun convert(obj: Types.PubKeyRequest): PubKeyRequest = PubKeyRequest(
  	chainId = obj.getChainId(),
  )

  public override fun convert(obj: PubKeyRequest): Types.PubKeyRequest {
    val builder = Types.PubKeyRequest.newBuilder()
    builder.setChainId(obj.chainId)
    return builder.build()
  }
}

public object PubKeyResponseJvmConverter : ProtobufTypeMapper<PubKeyResponse, Types.PubKeyResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Types.PubKeyResponse.getDescriptor()

  public override val parser: Parser<Types.PubKeyResponse> = Types.PubKeyResponse.parser()

  public override fun convert(obj: Types.PubKeyResponse): PubKeyResponse = PubKeyResponse(
  	pubKey = PublicKeyJvmConverter.convert(obj.getPubKey()),
  	error = RemoteSignerErrorJvmConverter.convert(obj.getError()),
  )

  public override fun convert(obj: PubKeyResponse): Types.PubKeyResponse {
    val builder = Types.PubKeyResponse.newBuilder()
    builder.setPubKey(PublicKeyJvmConverter.convert(obj.pubKey))
    builder.setError(RemoteSignerErrorJvmConverter.convert(obj.error))
    return builder.build()
  }
}

public object SignVoteRequestJvmConverter :
    ProtobufTypeMapper<SignVoteRequest, Types.SignVoteRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.SignVoteRequest.getDescriptor()

  public override val parser: Parser<Types.SignVoteRequest> = Types.SignVoteRequest.parser()

  public override fun convert(obj: Types.SignVoteRequest): SignVoteRequest = SignVoteRequest(
  	vote = VoteJvmConverter.convert(obj.getVote()),
  	chainId = obj.getChainId(),
  )

  public override fun convert(obj: SignVoteRequest): Types.SignVoteRequest {
    val builder = Types.SignVoteRequest.newBuilder()
    builder.setVote(VoteJvmConverter.convert(obj.vote))
    builder.setChainId(obj.chainId)
    return builder.build()
  }
}

public object SignedVoteResponseJvmConverter :
    ProtobufTypeMapper<SignedVoteResponse, Types.SignedVoteResponse> {
  public override val descriptor: Descriptors.Descriptor = Types.SignedVoteResponse.getDescriptor()

  public override val parser: Parser<Types.SignedVoteResponse> = Types.SignedVoteResponse.parser()

  public override fun convert(obj: Types.SignedVoteResponse): SignedVoteResponse =
      SignedVoteResponse(
  	vote = VoteJvmConverter.convert(obj.getVote()),
  	error = RemoteSignerErrorJvmConverter.convert(obj.getError()),
  )

  public override fun convert(obj: SignedVoteResponse): Types.SignedVoteResponse {
    val builder = Types.SignedVoteResponse.newBuilder()
    builder.setVote(VoteJvmConverter.convert(obj.vote))
    builder.setError(RemoteSignerErrorJvmConverter.convert(obj.error))
    return builder.build()
  }
}

public object SignProposalRequestJvmConverter :
    ProtobufTypeMapper<SignProposalRequest, Types.SignProposalRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.SignProposalRequest.getDescriptor()

  public override val parser: Parser<Types.SignProposalRequest> = Types.SignProposalRequest.parser()

  public override fun convert(obj: Types.SignProposalRequest): SignProposalRequest =
      SignProposalRequest(
  	proposal = ProposalJvmConverter.convert(obj.getProposal()),
  	chainId = obj.getChainId(),
  )

  public override fun convert(obj: SignProposalRequest): Types.SignProposalRequest {
    val builder = Types.SignProposalRequest.newBuilder()
    builder.setProposal(ProposalJvmConverter.convert(obj.proposal))
    builder.setChainId(obj.chainId)
    return builder.build()
  }
}

public object SignedProposalResponseJvmConverter :
    ProtobufTypeMapper<SignedProposalResponse, Types.SignedProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Types.SignedProposalResponse.getDescriptor()

  public override val parser: Parser<Types.SignedProposalResponse> =
      Types.SignedProposalResponse.parser()

  public override fun convert(obj: Types.SignedProposalResponse): SignedProposalResponse =
      SignedProposalResponse(
  	proposal = ProposalJvmConverter.convert(obj.getProposal()),
  	error = RemoteSignerErrorJvmConverter.convert(obj.getError()),
  )

  public override fun convert(obj: SignedProposalResponse): Types.SignedProposalResponse {
    val builder = Types.SignedProposalResponse.newBuilder()
    builder.setProposal(ProposalJvmConverter.convert(obj.proposal))
    builder.setError(RemoteSignerErrorJvmConverter.convert(obj.error))
    return builder.build()
  }
}

public object PingRequestJvmConverter : ProtobufTypeMapper<PingRequest, Types.PingRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.PingRequest.getDescriptor()

  public override val parser: Parser<Types.PingRequest> = Types.PingRequest.parser()

  public override fun convert(obj: Types.PingRequest): PingRequest = PingRequest(
  )

  public override fun convert(obj: PingRequest): Types.PingRequest {
    val builder = Types.PingRequest.newBuilder()
    return builder.build()
  }
}

public object PingResponseJvmConverter : ProtobufTypeMapper<PingResponse, Types.PingResponse> {
  public override val descriptor: Descriptors.Descriptor = Types.PingResponse.getDescriptor()

  public override val parser: Parser<Types.PingResponse> = Types.PingResponse.parser()

  public override fun convert(obj: Types.PingResponse): PingResponse = PingResponse(
  )

  public override fun convert(obj: PingResponse): Types.PingResponse {
    val builder = Types.PingResponse.newBuilder()
    return builder.build()
  }
}

public object MessageJvmConverter : ProtobufTypeMapper<Message, Types.Message> {
  public override val descriptor: Descriptors.Descriptor = Types.Message.getDescriptor()

  public override val parser: Parser<Types.Message> = Types.Message.parser()

  public override fun convert(obj: Types.Message): Message = Message(
  	sum = mapOf(
  1 to { Message.SumOneOf.PubKeyRequest(PubKeyRequestJvmConverter.convert(obj.getPubKeyRequest()))
      },
  2 to {
      Message.SumOneOf.PubKeyResponse(PubKeyResponseJvmConverter.convert(obj.getPubKeyResponse()))
      },
  3 to {
      Message.SumOneOf.SignVoteRequest(SignVoteRequestJvmConverter.convert(obj.getSignVoteRequest()))
      },
  4 to {
      Message.SumOneOf.SignedVoteResponse(SignedVoteResponseJvmConverter.convert(obj.getSignedVoteResponse()))
      },
  5 to {
      Message.SumOneOf.SignProposalRequest(SignProposalRequestJvmConverter.convert(obj.getSignProposalRequest()))
      },
  6 to {
      Message.SumOneOf.SignedProposalResponse(SignedProposalResponseJvmConverter.convert(obj.getSignedProposalResponse()))
      },
  7 to { Message.SumOneOf.PingRequest(PingRequestJvmConverter.convert(obj.getPingRequest())) },
  8 to { Message.SumOneOf.PingResponse(PingResponseJvmConverter.convert(obj.getPingResponse())) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Message): Types.Message {
    val builder = Types.Message.newBuilder()
    when (obj.sum) {
      is Message.SumOneOf.PubKeyRequest ->
          builder.setPubKeyRequest(PubKeyRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.PubKeyResponse ->
          builder.setPubKeyResponse(PubKeyResponseJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.SignVoteRequest ->
          builder.setSignVoteRequest(SignVoteRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.SignedVoteResponse ->
          builder.setSignedVoteResponse(SignedVoteResponseJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.SignProposalRequest ->
          builder.setSignProposalRequest(SignProposalRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.SignedProposalResponse ->
          builder.setSignedProposalResponse(SignedProposalResponseJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.PingRequest ->
          builder.setPingRequest(PingRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.PingResponse ->
          builder.setPingResponse(PingResponseJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}

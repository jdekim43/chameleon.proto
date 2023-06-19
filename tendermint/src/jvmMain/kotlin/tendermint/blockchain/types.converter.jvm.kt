// Transform from tendermint/blockchain/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.blockchain

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.types.BlockJvmConverter

public object BlockRequestJvmConverter : ProtobufTypeMapper<BlockRequest, Types.BlockRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockRequest.getDescriptor()

  public override val parser: Parser<Types.BlockRequest> = Types.BlockRequest.parser()

  public override fun convert(obj: Types.BlockRequest): BlockRequest = BlockRequest(
  	height = obj.getHeight(),
  )

  public override fun convert(obj: BlockRequest): Types.BlockRequest {
    val builder = Types.BlockRequest.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object NoBlockResponseJvmConverter :
    ProtobufTypeMapper<NoBlockResponse, Types.NoBlockResponse> {
  public override val descriptor: Descriptors.Descriptor = Types.NoBlockResponse.getDescriptor()

  public override val parser: Parser<Types.NoBlockResponse> = Types.NoBlockResponse.parser()

  public override fun convert(obj: Types.NoBlockResponse): NoBlockResponse = NoBlockResponse(
  	height = obj.getHeight(),
  )

  public override fun convert(obj: NoBlockResponse): Types.NoBlockResponse {
    val builder = Types.NoBlockResponse.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object BlockResponseJvmConverter : ProtobufTypeMapper<BlockResponse, Types.BlockResponse> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockResponse.getDescriptor()

  public override val parser: Parser<Types.BlockResponse> = Types.BlockResponse.parser()

  public override fun convert(obj: Types.BlockResponse): BlockResponse = BlockResponse(
  	block = BlockJvmConverter.convert(obj.getBlock()),
  )

  public override fun convert(obj: BlockResponse): Types.BlockResponse {
    val builder = Types.BlockResponse.newBuilder()
    builder.setBlock(BlockJvmConverter.convert(obj.block))
    return builder.build()
  }
}

public object StatusRequestJvmConverter : ProtobufTypeMapper<StatusRequest, Types.StatusRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.StatusRequest.getDescriptor()

  public override val parser: Parser<Types.StatusRequest> = Types.StatusRequest.parser()

  public override fun convert(obj: Types.StatusRequest): StatusRequest = StatusRequest(
  )

  public override fun convert(obj: StatusRequest): Types.StatusRequest {
    val builder = Types.StatusRequest.newBuilder()
    return builder.build()
  }
}

public object StatusResponseJvmConverter : ProtobufTypeMapper<StatusResponse, Types.StatusResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Types.StatusResponse.getDescriptor()

  public override val parser: Parser<Types.StatusResponse> = Types.StatusResponse.parser()

  public override fun convert(obj: Types.StatusResponse): StatusResponse = StatusResponse(
  	height = obj.getHeight(),
  	base = obj.getBase(),
  )

  public override fun convert(obj: StatusResponse): Types.StatusResponse {
    val builder = Types.StatusResponse.newBuilder()
    builder.setHeight(obj.height)
    builder.setBase(obj.base)
    return builder.build()
  }
}

public object MessageJvmConverter : ProtobufTypeMapper<Message, Types.Message> {
  public override val descriptor: Descriptors.Descriptor = Types.Message.getDescriptor()

  public override val parser: Parser<Types.Message> = Types.Message.parser()

  public override fun convert(obj: Types.Message): Message = Message(
  	sum = mapOf(
  1 to { Message.SumOneOf.BlockRequest(BlockRequestJvmConverter.convert(obj.getBlockRequest())) },
  2 to {
      Message.SumOneOf.NoBlockResponse(NoBlockResponseJvmConverter.convert(obj.getNoBlockResponse()))
      },
  3 to { Message.SumOneOf.BlockResponse(BlockResponseJvmConverter.convert(obj.getBlockResponse()))
      },
  4 to { Message.SumOneOf.StatusRequest(StatusRequestJvmConverter.convert(obj.getStatusRequest()))
      },
  5 to {
      Message.SumOneOf.StatusResponse(StatusResponseJvmConverter.convert(obj.getStatusResponse()))
      },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Message): Types.Message {
    val builder = Types.Message.newBuilder()
    when (obj.sum) {
      is Message.SumOneOf.BlockRequest ->
          builder.setBlockRequest(BlockRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.NoBlockResponse ->
          builder.setNoBlockResponse(NoBlockResponseJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.BlockResponse ->
          builder.setBlockResponse(BlockResponseJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.StatusRequest ->
          builder.setStatusRequest(StatusRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.StatusResponse ->
          builder.setStatusResponse(StatusResponseJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}

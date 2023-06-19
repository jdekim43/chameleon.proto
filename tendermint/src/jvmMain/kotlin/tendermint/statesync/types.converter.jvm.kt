// Transform from tendermint/statesync/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.statesync

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MessageJvmConverter : ProtobufTypeMapper<Message, Types.Message> {
  public override val descriptor: Descriptors.Descriptor = Types.Message.getDescriptor()

  public override val parser: Parser<Types.Message> = Types.Message.parser()

  public override fun convert(obj: Types.Message): Message = Message(
  	sum = mapOf(
  1 to {
      Message.SumOneOf.SnapshotsRequest(SnapshotsRequestJvmConverter.convert(obj.getSnapshotsRequest()))
      },
  2 to {
      Message.SumOneOf.SnapshotsResponse(SnapshotsResponseJvmConverter.convert(obj.getSnapshotsResponse()))
      },
  3 to { Message.SumOneOf.ChunkRequest(ChunkRequestJvmConverter.convert(obj.getChunkRequest())) },
  4 to { Message.SumOneOf.ChunkResponse(ChunkResponseJvmConverter.convert(obj.getChunkResponse()))
      },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Message): Types.Message {
    val builder = Types.Message.newBuilder()
    when (obj.sum) {
      is Message.SumOneOf.SnapshotsRequest ->
          builder.setSnapshotsRequest(SnapshotsRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.SnapshotsResponse ->
          builder.setSnapshotsResponse(SnapshotsResponseJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.ChunkRequest ->
          builder.setChunkRequest(ChunkRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.ChunkResponse ->
          builder.setChunkResponse(ChunkResponseJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}

public object SnapshotsRequestJvmConverter :
    ProtobufTypeMapper<SnapshotsRequest, Types.SnapshotsRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.SnapshotsRequest.getDescriptor()

  public override val parser: Parser<Types.SnapshotsRequest> = Types.SnapshotsRequest.parser()

  public override fun convert(obj: Types.SnapshotsRequest): SnapshotsRequest = SnapshotsRequest(
  )

  public override fun convert(obj: SnapshotsRequest): Types.SnapshotsRequest {
    val builder = Types.SnapshotsRequest.newBuilder()
    return builder.build()
  }
}

public object SnapshotsResponseJvmConverter :
    ProtobufTypeMapper<SnapshotsResponse, Types.SnapshotsResponse> {
  public override val descriptor: Descriptors.Descriptor = Types.SnapshotsResponse.getDescriptor()

  public override val parser: Parser<Types.SnapshotsResponse> = Types.SnapshotsResponse.parser()

  public override fun convert(obj: Types.SnapshotsResponse): SnapshotsResponse = SnapshotsResponse(
  	height = obj.getHeight().asKotlinType,
  	format = obj.getFormat().asKotlinType,
  	chunks = obj.getChunks().asKotlinType,
  	hash = obj.getHash().toByteArray(),
  	metadata = obj.getMetadata().toByteArray(),
  )

  public override fun convert(obj: SnapshotsResponse): Types.SnapshotsResponse {
    val builder = Types.SnapshotsResponse.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunks(obj.chunks.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setMetadata(ByteString.copyFrom(obj.metadata))
    return builder.build()
  }
}

public object ChunkRequestJvmConverter : ProtobufTypeMapper<ChunkRequest, Types.ChunkRequest> {
  public override val descriptor: Descriptors.Descriptor = Types.ChunkRequest.getDescriptor()

  public override val parser: Parser<Types.ChunkRequest> = Types.ChunkRequest.parser()

  public override fun convert(obj: Types.ChunkRequest): ChunkRequest = ChunkRequest(
  	height = obj.getHeight().asKotlinType,
  	format = obj.getFormat().asKotlinType,
  	index = obj.getIndex().asKotlinType,
  )

  public override fun convert(obj: ChunkRequest): Types.ChunkRequest {
    val builder = Types.ChunkRequest.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setIndex(obj.index.asJavaType)
    return builder.build()
  }
}

public object ChunkResponseJvmConverter : ProtobufTypeMapper<ChunkResponse, Types.ChunkResponse> {
  public override val descriptor: Descriptors.Descriptor = Types.ChunkResponse.getDescriptor()

  public override val parser: Parser<Types.ChunkResponse> = Types.ChunkResponse.parser()

  public override fun convert(obj: Types.ChunkResponse): ChunkResponse = ChunkResponse(
  	height = obj.getHeight().asKotlinType,
  	format = obj.getFormat().asKotlinType,
  	index = obj.getIndex().asKotlinType,
  	chunk = obj.getChunk().toByteArray(),
  	missing = obj.getMissing(),
  )

  public override fun convert(obj: ChunkResponse): Types.ChunkResponse {
    val builder = Types.ChunkResponse.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setIndex(obj.index.asJavaType)
    builder.setChunk(ByteString.copyFrom(obj.chunk))
    builder.setMissing(obj.missing)
    return builder.build()
  }
}

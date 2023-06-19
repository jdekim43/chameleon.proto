// Transform from tendermint/rpc/grpc/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.abci.ResponseCheckTxJvmConverter
import tendermint.abci.ResponseDeliverTxJvmConverter

public object RequestPingJvmConverter : ProtobufTypeMapper<RequestPing, Types.RequestPing> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestPing.getDescriptor()

  public override val parser: Parser<Types.RequestPing> = Types.RequestPing.parser()

  public override fun convert(obj: Types.RequestPing): RequestPing = RequestPing(
  )

  public override fun convert(obj: RequestPing): Types.RequestPing {
    val builder = Types.RequestPing.newBuilder()
    return builder.build()
  }
}

public object RequestBroadcastTxJvmConverter :
    ProtobufTypeMapper<RequestBroadcastTx, Types.RequestBroadcastTx> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestBroadcastTx.getDescriptor()

  public override val parser: Parser<Types.RequestBroadcastTx> = Types.RequestBroadcastTx.parser()

  public override fun convert(obj: Types.RequestBroadcastTx): RequestBroadcastTx =
      RequestBroadcastTx(
  	tx = obj.getTx().toByteArray(),
  )

  public override fun convert(obj: RequestBroadcastTx): Types.RequestBroadcastTx {
    val builder = Types.RequestBroadcastTx.newBuilder()
    builder.setTx(ByteString.copyFrom(obj.tx))
    return builder.build()
  }
}

public object ResponsePingJvmConverter : ProtobufTypeMapper<ResponsePing, Types.ResponsePing> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponsePing.getDescriptor()

  public override val parser: Parser<Types.ResponsePing> = Types.ResponsePing.parser()

  public override fun convert(obj: Types.ResponsePing): ResponsePing = ResponsePing(
  )

  public override fun convert(obj: ResponsePing): Types.ResponsePing {
    val builder = Types.ResponsePing.newBuilder()
    return builder.build()
  }
}

public object ResponseBroadcastTxJvmConverter :
    ProtobufTypeMapper<ResponseBroadcastTx, Types.ResponseBroadcastTx> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseBroadcastTx.getDescriptor()

  public override val parser: Parser<Types.ResponseBroadcastTx> = Types.ResponseBroadcastTx.parser()

  public override fun convert(obj: Types.ResponseBroadcastTx): ResponseBroadcastTx =
      ResponseBroadcastTx(
  	checkTx = ResponseCheckTxJvmConverter.convert(obj.getCheckTx()),
  	deliverTx = ResponseDeliverTxJvmConverter.convert(obj.getDeliverTx()),
  )

  public override fun convert(obj: ResponseBroadcastTx): Types.ResponseBroadcastTx {
    val builder = Types.ResponseBroadcastTx.newBuilder()
    builder.setCheckTx(ResponseCheckTxJvmConverter.convert(obj.checkTx))
    builder.setDeliverTx(ResponseDeliverTxJvmConverter.convert(obj.deliverTx))
    return builder.build()
  }
}

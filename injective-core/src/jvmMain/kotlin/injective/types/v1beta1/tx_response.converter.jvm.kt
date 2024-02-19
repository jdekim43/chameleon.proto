// Transform from injective/types/v1beta1/tx_response.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object TxResponseGenericMessageJvmConverter :
    ProtobufTypeMapper<TxResponseGenericMessage, TxResponse.TxResponseGenericMessage> {
  public override val descriptor: Descriptors.Descriptor =
      TxResponse.TxResponseGenericMessage.getDescriptor()

  public override val parser: Parser<TxResponse.TxResponseGenericMessage> =
      TxResponse.TxResponseGenericMessage.parser()

  public override fun convert(obj: TxResponse.TxResponseGenericMessage): TxResponseGenericMessage =
      TxResponseGenericMessage(
  	`header` = obj.getHeader(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: TxResponseGenericMessage): TxResponse.TxResponseGenericMessage {
    val builder = TxResponse.TxResponseGenericMessage.newBuilder()
    builder.setHeader(obj.`header`)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object TxResponseDataJvmConverter :
    ProtobufTypeMapper<TxResponseData, TxResponse.TxResponseData> {
  public override val descriptor: Descriptors.Descriptor = TxResponse.TxResponseData.getDescriptor()

  public override val parser: Parser<TxResponse.TxResponseData> = TxResponse.TxResponseData.parser()

  public override fun convert(obj: TxResponse.TxResponseData): TxResponseData = TxResponseData(
  	messages = obj.getMessagesList().map { TxResponseGenericMessageJvmConverter.convert(it) },
  )

  public override fun convert(obj: TxResponseData): TxResponse.TxResponseData {
    val builder = TxResponse.TxResponseData.newBuilder()
    builder.addAllMessages(obj.messages.map { TxResponseGenericMessageJvmConverter.convert(it) })
    return builder.build()
  }
}

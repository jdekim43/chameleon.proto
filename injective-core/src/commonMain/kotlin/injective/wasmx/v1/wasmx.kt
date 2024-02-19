// Transform from injective/wasmx/v1/wasmx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val isExecutionEnabled: Boolean,
  @ProtobufIndex(index = 2)
  public val maxBeginBlockTotalGas: ULong,
  @ProtobufIndex(index = 3)
  public val maxContractGasLimit: ULong,
  @ProtobufIndex(index = 4)
  public val minGasPrice: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.Params"
  }

  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RegisteredContract.KotlinxSerializer::class)
@SerialName(value = RegisteredContract.TYPE_URL)
public data class RegisteredContract(
  @ProtobufIndex(index = 1)
  public val gasLimit: ULong,
  @ProtobufIndex(index = 2)
  public val gasPrice: ULong,
  @ProtobufIndex(index = 3)
  public val isExecutable: Boolean,
  @ProtobufIndex(index = 4)
  public val codeId: ULong,
  @ProtobufIndex(index = 5)
  public val adminAddress: String,
  @ProtobufIndex(index = 6)
  public val granterAddress: String,
  @ProtobufIndex(index = 7)
  public val fundMode: FundingMode,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.RegisteredContract"
  }

  public object KotlinxSerializer : KSerializer<RegisteredContract> {
    private val delegator: KSerializer<RegisteredContract> = RegisteredContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RegisteredContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RegisteredContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RegisteredContract {
      if (decoder is ProtobufMapperDecoder) {
        return RegisteredContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

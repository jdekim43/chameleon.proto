// Transform from injective/types/v1beta1/account.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import cosmos.auth.v1beta1.BaseAccount
import kotlin.ByteArray
import kotlin.String
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

@Serializable(with = EthAccount.KotlinxSerializer::class)
@SerialName(value = EthAccount.TYPE_URL)
public data class EthAccount(
  @ProtobufIndex(index = 1)
  public val baseAccount: BaseAccount,
  @ProtobufIndex(index = 2)
  public val codeHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.types.v1beta1.EthAccount"
  }

  public object KotlinxSerializer : KSerializer<EthAccount> {
    private val delegator: KSerializer<EthAccount> = EthAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EthAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EthAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EthAccount {
      if (decoder is ProtobufMapperDecoder) {
        return EthAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

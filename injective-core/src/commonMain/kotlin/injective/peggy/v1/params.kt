// Transform from injective/peggy/v1/params.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
import kotlin.ByteArray
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
  public val peggyId: String,
  @ProtobufIndex(index = 2)
  public val contractSourceHash: String,
  @ProtobufIndex(index = 3)
  public val bridgeEthereumAddress: String,
  @ProtobufIndex(index = 4)
  public val bridgeChainId: ULong,
  @ProtobufIndex(index = 5)
  public val signedValsetsWindow: ULong,
  @ProtobufIndex(index = 6)
  public val signedBatchesWindow: ULong,
  @ProtobufIndex(index = 7)
  public val signedClaimsWindow: ULong,
  @ProtobufIndex(index = 8)
  public val targetBatchTimeout: ULong,
  @ProtobufIndex(index = 9)
  public val averageBlockTime: ULong,
  @ProtobufIndex(index = 10)
  public val averageEthereumBlockTime: ULong,
  @ProtobufIndex(index = 11)
  public val slashFractionValset: ByteArray,
  @ProtobufIndex(index = 12)
  public val slashFractionBatch: ByteArray,
  @ProtobufIndex(index = 13)
  public val slashFractionClaim: ByteArray,
  @ProtobufIndex(index = 14)
  public val slashFractionConflictingClaim: ByteArray,
  @ProtobufIndex(index = 15)
  public val unbondSlashingValsetsWindow: ULong,
  @ProtobufIndex(index = 16)
  public val slashFractionBadEthSignature: ByteArray,
  @ProtobufIndex(index = 17)
  public val cosmosCoinDenom: String,
  @ProtobufIndex(index = 18)
  public val cosmosCoinErc20Contract: String,
  @ProtobufIndex(index = 19)
  public val claimSlashingEnabled: Boolean,
  @ProtobufIndex(index = 20)
  public val bridgeContractStartHeight: ULong,
  @ProtobufIndex(index = 21)
  public val valsetReward: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.Params"
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

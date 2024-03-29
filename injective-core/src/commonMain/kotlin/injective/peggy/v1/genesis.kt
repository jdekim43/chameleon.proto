// Transform from injective/peggy/v1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
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

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val lastObservedNonce: ULong,
  @ProtobufIndex(index = 3)
  public val valsets: List<Valset>,
  @ProtobufIndex(index = 4)
  public val valsetConfirms: List<MsgValsetConfirm>,
  @ProtobufIndex(index = 5)
  public val batches: List<OutgoingTxBatch>,
  @ProtobufIndex(index = 6)
  public val batchConfirms: List<MsgConfirmBatch>,
  @ProtobufIndex(index = 7)
  public val attestations: List<Attestation>,
  @ProtobufIndex(index = 8)
  public val orchestratorAddresses: List<MsgSetOrchestratorAddresses>,
  @ProtobufIndex(index = 9)
  public val erc20ToDenoms: List<ERC20ToDenom>,
  @ProtobufIndex(index = 10)
  public val unbatchedTransfers: List<OutgoingTransferTx>,
  @ProtobufIndex(index = 11)
  public val lastObservedEthereumHeight: ULong,
  @ProtobufIndex(index = 12)
  public val lastOutgoingBatchId: ULong,
  @ProtobufIndex(index = 13)
  public val lastOutgoingPoolId: ULong,
  @ProtobufIndex(index = 14)
  public val lastObservedValset: Valset,
  @ProtobufIndex(index = 15)
  public val ethereumBlacklist: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.GenesisState"
  }

  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

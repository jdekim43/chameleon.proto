// Transform from injective/oracle/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.ByteArray
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
  public val bandRelayers: List<String>,
  @ProtobufIndex(index = 3)
  public val bandPriceStates: List<BandPriceState>,
  @ProtobufIndex(index = 4)
  public val priceFeedPriceStates: List<PriceFeedState>,
  @ProtobufIndex(index = 5)
  public val coinbasePriceStates: List<CoinbasePriceState>,
  @ProtobufIndex(index = 6)
  public val bandIbcPriceStates: List<BandPriceState>,
  @ProtobufIndex(index = 7)
  public val bandIbcOracleRequests: List<BandOracleRequest>,
  @ProtobufIndex(index = 8)
  public val bandIbcParams: BandIBCParams,
  @ProtobufIndex(index = 9)
  public val bandIbcLatestClientId: ULong,
  @ProtobufIndex(index = 10)
  public val calldataRecords: List<CalldataRecord>,
  @ProtobufIndex(index = 11)
  public val bandIbcLatestRequestId: ULong,
  @ProtobufIndex(index = 12)
  public val chainlinkPriceStates: List<ChainlinkPriceState>,
  @ProtobufIndex(index = 13)
  public val historicalPriceRecords: List<PriceRecords>,
  @ProtobufIndex(index = 14)
  public val providerStates: List<ProviderState>,
  @ProtobufIndex(index = 15)
  public val pythPriceStates: List<PythPriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.GenesisState"
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

@Serializable(with = CalldataRecord.KotlinxSerializer::class)
@SerialName(value = CalldataRecord.TYPE_URL)
public data class CalldataRecord(
  @ProtobufIndex(index = 1)
  public val clientId: ULong,
  @ProtobufIndex(index = 2)
  public val calldata: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.CalldataRecord"
  }

  public object KotlinxSerializer : KSerializer<CalldataRecord> {
    private val delegator: KSerializer<CalldataRecord> = CalldataRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CalldataRecord): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CalldataRecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CalldataRecord {
      if (decoder is ProtobufMapperDecoder) {
        return CalldataRecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

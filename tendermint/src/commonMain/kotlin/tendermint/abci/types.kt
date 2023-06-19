// Transform from tendermint/abci/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import google.protobuf.Timestamp
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmInline
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
import tendermint.crypto.ProofOps
import tendermint.crypto.PublicKey
import tendermint.types.EvidenceParams
import tendermint.types.Header
import tendermint.types.ValidatorParams
import tendermint.types.VersionParams

@Serializable
@SerialName(value = "/tendermint.abci.CheckTxType")
public enum class CheckTxType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  NEW(0),
  @ProtobufIndex(index = 1)
  RECHECK(1),
  ;

  public companion object {
    public fun forNumber(number: Int): CheckTxType = CheckTxType.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/tendermint.abci.EvidenceType")
public enum class EvidenceType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UNKNOWN(0),
  @ProtobufIndex(index = 1)
  DUPLICATE_VOTE(1),
  @ProtobufIndex(index = 2)
  LIGHT_CLIENT_ATTACK(2),
  ;

  public companion object {
    public fun forNumber(number: Int): EvidenceType = EvidenceType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Request.KotlinxSerializer::class)
@SerialName(value = Request.TYPE_URL)
public data class Request(
  public val `value`: ValueOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.Request"
  }

  @Serializable
  public sealed interface ValueOneOf {
    @JvmInline
    public value class Echo(
      @ProtobufIndex(index = 1)
      public val `value`: RequestEcho,
    ) : ValueOneOf

    @JvmInline
    public value class Flush(
      @ProtobufIndex(index = 2)
      public val `value`: RequestFlush,
    ) : ValueOneOf

    @JvmInline
    public value class Info(
      @ProtobufIndex(index = 3)
      public val `value`: RequestInfo,
    ) : ValueOneOf

    @JvmInline
    public value class SetOption(
      @ProtobufIndex(index = 4)
      public val `value`: RequestSetOption,
    ) : ValueOneOf

    @JvmInline
    public value class InitChain(
      @ProtobufIndex(index = 5)
      public val `value`: RequestInitChain,
    ) : ValueOneOf

    @JvmInline
    public value class Query(
      @ProtobufIndex(index = 6)
      public val `value`: RequestQuery,
    ) : ValueOneOf

    @JvmInline
    public value class BeginBlock(
      @ProtobufIndex(index = 7)
      public val `value`: RequestBeginBlock,
    ) : ValueOneOf

    @JvmInline
    public value class CheckTx(
      @ProtobufIndex(index = 8)
      public val `value`: RequestCheckTx,
    ) : ValueOneOf

    @JvmInline
    public value class DeliverTx(
      @ProtobufIndex(index = 9)
      public val `value`: RequestDeliverTx,
    ) : ValueOneOf

    @JvmInline
    public value class EndBlock(
      @ProtobufIndex(index = 10)
      public val `value`: RequestEndBlock,
    ) : ValueOneOf

    @JvmInline
    public value class Commit(
      @ProtobufIndex(index = 11)
      public val `value`: RequestCommit,
    ) : ValueOneOf

    @JvmInline
    public value class ListSnapshots(
      @ProtobufIndex(index = 12)
      public val `value`: RequestListSnapshots,
    ) : ValueOneOf

    @JvmInline
    public value class OfferSnapshot(
      @ProtobufIndex(index = 13)
      public val `value`: RequestOfferSnapshot,
    ) : ValueOneOf

    @JvmInline
    public value class LoadSnapshotChunk(
      @ProtobufIndex(index = 14)
      public val `value`: RequestLoadSnapshotChunk,
    ) : ValueOneOf

    @JvmInline
    public value class ApplySnapshotChunk(
      @ProtobufIndex(index = 15)
      public val `value`: RequestApplySnapshotChunk,
    ) : ValueOneOf
  }

  public object KotlinxSerializer : KSerializer<Request> {
    private val delegator: KSerializer<Request> = Request.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Request): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Request {
      if (decoder is ProtobufMapperDecoder) {
        return RequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestEcho.KotlinxSerializer::class)
@SerialName(value = RequestEcho.TYPE_URL)
public data class RequestEcho(
  @ProtobufIndex(index = 1)
  public val message: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestEcho"
  }

  public object KotlinxSerializer : KSerializer<RequestEcho> {
    private val delegator: KSerializer<RequestEcho> = RequestEcho.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestEcho): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestEchoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestEcho {
      if (decoder is ProtobufMapperDecoder) {
        return RequestEchoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestFlush.KotlinxSerializer::class)
@SerialName(value = RequestFlush.TYPE_URL)
public class RequestFlush() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestFlush"
  }

  public object KotlinxSerializer : KSerializer<RequestFlush> {
    private val delegator: KSerializer<RequestFlush> = RequestFlush.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestFlush): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestFlushConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestFlush {
      if (decoder is ProtobufMapperDecoder) {
        return RequestFlushConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestInfo.KotlinxSerializer::class)
@SerialName(value = RequestInfo.TYPE_URL)
public data class RequestInfo(
  @ProtobufIndex(index = 1)
  public val version: String,
  @ProtobufIndex(index = 2)
  public val blockVersion: ULong,
  @ProtobufIndex(index = 3)
  public val p2PVersion: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestInfo"
  }

  public object KotlinxSerializer : KSerializer<RequestInfo> {
    private val delegator: KSerializer<RequestInfo> = RequestInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestInfo {
      if (decoder is ProtobufMapperDecoder) {
        return RequestInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestSetOption.KotlinxSerializer::class)
@SerialName(value = RequestSetOption.TYPE_URL)
public data class RequestSetOption(
  @ProtobufIndex(index = 1)
  public val key: String,
  @ProtobufIndex(index = 2)
  public val `value`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestSetOption"
  }

  public object KotlinxSerializer : KSerializer<RequestSetOption> {
    private val delegator: KSerializer<RequestSetOption> = RequestSetOption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestSetOption): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestSetOptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestSetOption {
      if (decoder is ProtobufMapperDecoder) {
        return RequestSetOptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestInitChain.KotlinxSerializer::class)
@SerialName(value = RequestInitChain.TYPE_URL)
public data class RequestInitChain(
  @ProtobufIndex(index = 1)
  public val time: Timestamp,
  @ProtobufIndex(index = 2)
  public val chainId: String,
  @ProtobufIndex(index = 3)
  public val consensusParams: ConsensusParams,
  @ProtobufIndex(index = 4)
  public val validators: List<ValidatorUpdate>,
  @ProtobufIndex(index = 5)
  public val appStateBytes: ByteArray,
  @ProtobufIndex(index = 6)
  public val initialHeight: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestInitChain"
  }

  public object KotlinxSerializer : KSerializer<RequestInitChain> {
    private val delegator: KSerializer<RequestInitChain> = RequestInitChain.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestInitChain): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestInitChainConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestInitChain {
      if (decoder is ProtobufMapperDecoder) {
        return RequestInitChainConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestQuery.KotlinxSerializer::class)
@SerialName(value = RequestQuery.TYPE_URL)
public data class RequestQuery(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 2)
  public val path: String,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val prove: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestQuery"
  }

  public object KotlinxSerializer : KSerializer<RequestQuery> {
    private val delegator: KSerializer<RequestQuery> = RequestQuery.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestQuery): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestQueryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestQuery {
      if (decoder is ProtobufMapperDecoder) {
        return RequestQueryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestBeginBlock.KotlinxSerializer::class)
@SerialName(value = RequestBeginBlock.TYPE_URL)
public data class RequestBeginBlock(
  @ProtobufIndex(index = 1)
  public val hash: ByteArray,
  @ProtobufIndex(index = 2)
  public val `header`: Header,
  @ProtobufIndex(index = 3)
  public val lastCommitInfo: LastCommitInfo,
  @ProtobufIndex(index = 4)
  public val byzantineValidators: List<Evidence>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestBeginBlock"
  }

  public object KotlinxSerializer : KSerializer<RequestBeginBlock> {
    private val delegator: KSerializer<RequestBeginBlock> = RequestBeginBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestBeginBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestBeginBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestBeginBlock {
      if (decoder is ProtobufMapperDecoder) {
        return RequestBeginBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestCheckTx.KotlinxSerializer::class)
@SerialName(value = RequestCheckTx.TYPE_URL)
public data class RequestCheckTx(
  @ProtobufIndex(index = 1)
  public val tx: ByteArray,
  @ProtobufIndex(index = 2)
  public val type: CheckTxType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestCheckTx"
  }

  public object KotlinxSerializer : KSerializer<RequestCheckTx> {
    private val delegator: KSerializer<RequestCheckTx> = RequestCheckTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestCheckTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestCheckTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestCheckTx {
      if (decoder is ProtobufMapperDecoder) {
        return RequestCheckTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestDeliverTx.KotlinxSerializer::class)
@SerialName(value = RequestDeliverTx.TYPE_URL)
public data class RequestDeliverTx(
  @ProtobufIndex(index = 1)
  public val tx: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestDeliverTx"
  }

  public object KotlinxSerializer : KSerializer<RequestDeliverTx> {
    private val delegator: KSerializer<RequestDeliverTx> = RequestDeliverTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestDeliverTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestDeliverTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestDeliverTx {
      if (decoder is ProtobufMapperDecoder) {
        return RequestDeliverTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestEndBlock.KotlinxSerializer::class)
@SerialName(value = RequestEndBlock.TYPE_URL)
public data class RequestEndBlock(
  @ProtobufIndex(index = 1)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestEndBlock"
  }

  public object KotlinxSerializer : KSerializer<RequestEndBlock> {
    private val delegator: KSerializer<RequestEndBlock> = RequestEndBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestEndBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestEndBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestEndBlock {
      if (decoder is ProtobufMapperDecoder) {
        return RequestEndBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestCommit.KotlinxSerializer::class)
@SerialName(value = RequestCommit.TYPE_URL)
public class RequestCommit() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestCommit"
  }

  public object KotlinxSerializer : KSerializer<RequestCommit> {
    private val delegator: KSerializer<RequestCommit> = RequestCommit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestCommit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestCommitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestCommit {
      if (decoder is ProtobufMapperDecoder) {
        return RequestCommitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestListSnapshots.KotlinxSerializer::class)
@SerialName(value = RequestListSnapshots.TYPE_URL)
public class RequestListSnapshots() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestListSnapshots"
  }

  public object KotlinxSerializer : KSerializer<RequestListSnapshots> {
    private val delegator: KSerializer<RequestListSnapshots> = RequestListSnapshots.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestListSnapshots): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestListSnapshotsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestListSnapshots {
      if (decoder is ProtobufMapperDecoder) {
        return RequestListSnapshotsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestOfferSnapshot.KotlinxSerializer::class)
@SerialName(value = RequestOfferSnapshot.TYPE_URL)
public data class RequestOfferSnapshot(
  @ProtobufIndex(index = 1)
  public val snapshot: Snapshot,
  @ProtobufIndex(index = 2)
  public val appHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestOfferSnapshot"
  }

  public object KotlinxSerializer : KSerializer<RequestOfferSnapshot> {
    private val delegator: KSerializer<RequestOfferSnapshot> = RequestOfferSnapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestOfferSnapshot): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestOfferSnapshotConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestOfferSnapshot {
      if (decoder is ProtobufMapperDecoder) {
        return RequestOfferSnapshotConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestLoadSnapshotChunk.KotlinxSerializer::class)
@SerialName(value = RequestLoadSnapshotChunk.TYPE_URL)
public data class RequestLoadSnapshotChunk(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val chunk: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestLoadSnapshotChunk"
  }

  public object KotlinxSerializer : KSerializer<RequestLoadSnapshotChunk> {
    private val delegator: KSerializer<RequestLoadSnapshotChunk> =
        RequestLoadSnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestLoadSnapshotChunk): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestLoadSnapshotChunkConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestLoadSnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return RequestLoadSnapshotChunkConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestApplySnapshotChunk.KotlinxSerializer::class)
@SerialName(value = RequestApplySnapshotChunk.TYPE_URL)
public data class RequestApplySnapshotChunk(
  @ProtobufIndex(index = 1)
  public val index: UInt,
  @ProtobufIndex(index = 2)
  public val chunk: ByteArray,
  @ProtobufIndex(index = 3)
  public val sender: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.RequestApplySnapshotChunk"
  }

  public object KotlinxSerializer : KSerializer<RequestApplySnapshotChunk> {
    private val delegator: KSerializer<RequestApplySnapshotChunk> =
        RequestApplySnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestApplySnapshotChunk): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestApplySnapshotChunkConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestApplySnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return RequestApplySnapshotChunkConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Response.KotlinxSerializer::class)
@SerialName(value = Response.TYPE_URL)
public data class Response(
  public val `value`: ValueOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.Response"
  }

  @Serializable
  public sealed interface ValueOneOf {
    @JvmInline
    public value class Exception(
      @ProtobufIndex(index = 1)
      public val `value`: ResponseException,
    ) : ValueOneOf

    @JvmInline
    public value class Echo(
      @ProtobufIndex(index = 2)
      public val `value`: ResponseEcho,
    ) : ValueOneOf

    @JvmInline
    public value class Flush(
      @ProtobufIndex(index = 3)
      public val `value`: ResponseFlush,
    ) : ValueOneOf

    @JvmInline
    public value class Info(
      @ProtobufIndex(index = 4)
      public val `value`: ResponseInfo,
    ) : ValueOneOf

    @JvmInline
    public value class SetOption(
      @ProtobufIndex(index = 5)
      public val `value`: ResponseSetOption,
    ) : ValueOneOf

    @JvmInline
    public value class InitChain(
      @ProtobufIndex(index = 6)
      public val `value`: ResponseInitChain,
    ) : ValueOneOf

    @JvmInline
    public value class Query(
      @ProtobufIndex(index = 7)
      public val `value`: ResponseQuery,
    ) : ValueOneOf

    @JvmInline
    public value class BeginBlock(
      @ProtobufIndex(index = 8)
      public val `value`: ResponseBeginBlock,
    ) : ValueOneOf

    @JvmInline
    public value class CheckTx(
      @ProtobufIndex(index = 9)
      public val `value`: ResponseCheckTx,
    ) : ValueOneOf

    @JvmInline
    public value class DeliverTx(
      @ProtobufIndex(index = 10)
      public val `value`: ResponseDeliverTx,
    ) : ValueOneOf

    @JvmInline
    public value class EndBlock(
      @ProtobufIndex(index = 11)
      public val `value`: ResponseEndBlock,
    ) : ValueOneOf

    @JvmInline
    public value class Commit(
      @ProtobufIndex(index = 12)
      public val `value`: ResponseCommit,
    ) : ValueOneOf

    @JvmInline
    public value class ListSnapshots(
      @ProtobufIndex(index = 13)
      public val `value`: ResponseListSnapshots,
    ) : ValueOneOf

    @JvmInline
    public value class OfferSnapshot(
      @ProtobufIndex(index = 14)
      public val `value`: ResponseOfferSnapshot,
    ) : ValueOneOf

    @JvmInline
    public value class LoadSnapshotChunk(
      @ProtobufIndex(index = 15)
      public val `value`: ResponseLoadSnapshotChunk,
    ) : ValueOneOf

    @JvmInline
    public value class ApplySnapshotChunk(
      @ProtobufIndex(index = 16)
      public val `value`: ResponseApplySnapshotChunk,
    ) : ValueOneOf
  }

  public object KotlinxSerializer : KSerializer<Response> {
    private val delegator: KSerializer<Response> = Response.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Response): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Response {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseException.KotlinxSerializer::class)
@SerialName(value = ResponseException.TYPE_URL)
public data class ResponseException(
  @ProtobufIndex(index = 1)
  public val error: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseException"
  }

  public object KotlinxSerializer : KSerializer<ResponseException> {
    private val delegator: KSerializer<ResponseException> = ResponseException.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseException): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseExceptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseException {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseExceptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseEcho.KotlinxSerializer::class)
@SerialName(value = ResponseEcho.TYPE_URL)
public data class ResponseEcho(
  @ProtobufIndex(index = 1)
  public val message: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseEcho"
  }

  public object KotlinxSerializer : KSerializer<ResponseEcho> {
    private val delegator: KSerializer<ResponseEcho> = ResponseEcho.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseEcho): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseEchoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseEcho {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseEchoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseFlush.KotlinxSerializer::class)
@SerialName(value = ResponseFlush.TYPE_URL)
public class ResponseFlush() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseFlush"
  }

  public object KotlinxSerializer : KSerializer<ResponseFlush> {
    private val delegator: KSerializer<ResponseFlush> = ResponseFlush.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseFlush): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseFlushConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseFlush {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseFlushConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseInfo.KotlinxSerializer::class)
@SerialName(value = ResponseInfo.TYPE_URL)
public data class ResponseInfo(
  @ProtobufIndex(index = 1)
  public val `data`: String,
  @ProtobufIndex(index = 2)
  public val version: String,
  @ProtobufIndex(index = 3)
  public val appVersion: ULong,
  @ProtobufIndex(index = 4)
  public val lastBlockHeight: Long,
  @ProtobufIndex(index = 5)
  public val lastBlockAppHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseInfo"
  }

  public object KotlinxSerializer : KSerializer<ResponseInfo> {
    private val delegator: KSerializer<ResponseInfo> = ResponseInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseSetOption.KotlinxSerializer::class)
@SerialName(value = ResponseSetOption.TYPE_URL)
public data class ResponseSetOption(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseSetOption"
  }

  public object KotlinxSerializer : KSerializer<ResponseSetOption> {
    private val delegator: KSerializer<ResponseSetOption> = ResponseSetOption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseSetOption): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseSetOptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseSetOption {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseSetOptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseInitChain.KotlinxSerializer::class)
@SerialName(value = ResponseInitChain.TYPE_URL)
public data class ResponseInitChain(
  @ProtobufIndex(index = 1)
  public val consensusParams: ConsensusParams,
  @ProtobufIndex(index = 2)
  public val validators: List<ValidatorUpdate>,
  @ProtobufIndex(index = 3)
  public val appHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseInitChain"
  }

  public object KotlinxSerializer : KSerializer<ResponseInitChain> {
    private val delegator: KSerializer<ResponseInitChain> = ResponseInitChain.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseInitChain): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseInitChainConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseInitChain {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseInitChainConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseQuery.KotlinxSerializer::class)
@SerialName(value = ResponseQuery.TYPE_URL)
public data class ResponseQuery(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val index: Long,
  @ProtobufIndex(index = 6)
  public val key: ByteArray,
  @ProtobufIndex(index = 7)
  public val `value`: ByteArray,
  @ProtobufIndex(index = 8)
  public val proofOps: ProofOps,
  @ProtobufIndex(index = 9)
  public val height: Long,
  @ProtobufIndex(index = 10)
  public val codespace: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseQuery"
  }

  public object KotlinxSerializer : KSerializer<ResponseQuery> {
    private val delegator: KSerializer<ResponseQuery> = ResponseQuery.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseQuery): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseQueryConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseQuery {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseQueryConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseBeginBlock.KotlinxSerializer::class)
@SerialName(value = ResponseBeginBlock.TYPE_URL)
public data class ResponseBeginBlock(
  @ProtobufIndex(index = 1)
  public val events: List<Event>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseBeginBlock"
  }

  public object KotlinxSerializer : KSerializer<ResponseBeginBlock> {
    private val delegator: KSerializer<ResponseBeginBlock> = ResponseBeginBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseBeginBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseBeginBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseBeginBlock {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseBeginBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseCheckTx.KotlinxSerializer::class)
@SerialName(value = ResponseCheckTx.TYPE_URL)
public data class ResponseCheckTx(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val gasWanted: Long,
  @ProtobufIndex(index = 6)
  public val gasUsed: Long,
  @ProtobufIndex(index = 7)
  public val events: List<Event>,
  @ProtobufIndex(index = 8)
  public val codespace: String,
  @ProtobufIndex(index = 9)
  public val sender: String,
  @ProtobufIndex(index = 10)
  public val priority: Long,
  @ProtobufIndex(index = 11)
  public val mempoolError: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseCheckTx"
  }

  public object KotlinxSerializer : KSerializer<ResponseCheckTx> {
    private val delegator: KSerializer<ResponseCheckTx> = ResponseCheckTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseCheckTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseCheckTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseCheckTx {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseCheckTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseDeliverTx.KotlinxSerializer::class)
@SerialName(value = ResponseDeliverTx.TYPE_URL)
public data class ResponseDeliverTx(
  @ProtobufIndex(index = 1)
  public val code: UInt,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val log: String,
  @ProtobufIndex(index = 4)
  public val info: String,
  @ProtobufIndex(index = 5)
  public val gasWanted: Long,
  @ProtobufIndex(index = 6)
  public val gasUsed: Long,
  @ProtobufIndex(index = 7)
  public val events: List<Event>,
  @ProtobufIndex(index = 8)
  public val codespace: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseDeliverTx"
  }

  public object KotlinxSerializer : KSerializer<ResponseDeliverTx> {
    private val delegator: KSerializer<ResponseDeliverTx> = ResponseDeliverTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseDeliverTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseDeliverTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseDeliverTx {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseDeliverTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseEndBlock.KotlinxSerializer::class)
@SerialName(value = ResponseEndBlock.TYPE_URL)
public data class ResponseEndBlock(
  @ProtobufIndex(index = 1)
  public val validatorUpdates: List<ValidatorUpdate>,
  @ProtobufIndex(index = 2)
  public val consensusParamUpdates: ConsensusParams,
  @ProtobufIndex(index = 3)
  public val events: List<Event>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseEndBlock"
  }

  public object KotlinxSerializer : KSerializer<ResponseEndBlock> {
    private val delegator: KSerializer<ResponseEndBlock> = ResponseEndBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseEndBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseEndBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseEndBlock {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseEndBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseCommit.KotlinxSerializer::class)
@SerialName(value = ResponseCommit.TYPE_URL)
public data class ResponseCommit(
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 3)
  public val retainHeight: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseCommit"
  }

  public object KotlinxSerializer : KSerializer<ResponseCommit> {
    private val delegator: KSerializer<ResponseCommit> = ResponseCommit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseCommit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseCommitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseCommit {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseCommitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseListSnapshots.KotlinxSerializer::class)
@SerialName(value = ResponseListSnapshots.TYPE_URL)
public data class ResponseListSnapshots(
  @ProtobufIndex(index = 1)
  public val snapshots: List<Snapshot>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseListSnapshots"
  }

  public object KotlinxSerializer : KSerializer<ResponseListSnapshots> {
    private val delegator: KSerializer<ResponseListSnapshots> = ResponseListSnapshots.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseListSnapshots): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseListSnapshotsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseListSnapshots {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseListSnapshotsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseOfferSnapshot.KotlinxSerializer::class)
@SerialName(value = ResponseOfferSnapshot.TYPE_URL)
public data class ResponseOfferSnapshot(
  @ProtobufIndex(index = 1)
  public val result: Result,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseOfferSnapshot"
  }

  @Serializable
  @SerialName(value = "/tendermint.abci.ResponseOfferSnapshot.Result")
  public enum class Result(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    UNKNOWN(0),
    @ProtobufIndex(index = 1)
    ACCEPT(1),
    @ProtobufIndex(index = 2)
    ABORT(2),
    @ProtobufIndex(index = 3)
    REJECT(3),
    @ProtobufIndex(index = 4)
    REJECT_FORMAT(4),
    @ProtobufIndex(index = 5)
    REJECT_SENDER(5),
    ;

    public companion object {
      public fun forNumber(number: Int): Result = Result.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<ResponseOfferSnapshot> {
    private val delegator: KSerializer<ResponseOfferSnapshot> = ResponseOfferSnapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseOfferSnapshot): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseOfferSnapshotConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseOfferSnapshot {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseOfferSnapshotConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseLoadSnapshotChunk.KotlinxSerializer::class)
@SerialName(value = ResponseLoadSnapshotChunk.TYPE_URL)
public data class ResponseLoadSnapshotChunk(
  @ProtobufIndex(index = 1)
  public val chunk: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseLoadSnapshotChunk"
  }

  public object KotlinxSerializer : KSerializer<ResponseLoadSnapshotChunk> {
    private val delegator: KSerializer<ResponseLoadSnapshotChunk> =
        ResponseLoadSnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseLoadSnapshotChunk): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseLoadSnapshotChunkConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseLoadSnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseLoadSnapshotChunkConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseApplySnapshotChunk.KotlinxSerializer::class)
@SerialName(value = ResponseApplySnapshotChunk.TYPE_URL)
public data class ResponseApplySnapshotChunk(
  @ProtobufIndex(index = 1)
  public val result: Result,
  @ProtobufIndex(index = 2)
  public val refetchChunks: List<UInt>,
  @ProtobufIndex(index = 3)
  public val rejectSenders: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ResponseApplySnapshotChunk"
  }

  @Serializable
  @SerialName(value = "/tendermint.abci.ResponseApplySnapshotChunk.Result")
  public enum class Result(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    UNKNOWN(0),
    @ProtobufIndex(index = 1)
    ACCEPT(1),
    @ProtobufIndex(index = 2)
    ABORT(2),
    @ProtobufIndex(index = 3)
    RETRY(3),
    @ProtobufIndex(index = 4)
    RETRY_SNAPSHOT(4),
    @ProtobufIndex(index = 5)
    REJECT_SNAPSHOT(5),
    ;

    public companion object {
      public fun forNumber(number: Int): Result = Result.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<ResponseApplySnapshotChunk> {
    private val delegator: KSerializer<ResponseApplySnapshotChunk> =
        ResponseApplySnapshotChunk.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseApplySnapshotChunk): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseApplySnapshotChunkConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseApplySnapshotChunk {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseApplySnapshotChunkConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ConsensusParams.KotlinxSerializer::class)
@SerialName(value = ConsensusParams.TYPE_URL)
public data class ConsensusParams(
  @ProtobufIndex(index = 1)
  public val block: BlockParams,
  @ProtobufIndex(index = 2)
  public val evidence: EvidenceParams,
  @ProtobufIndex(index = 3)
  public val validator: ValidatorParams,
  @ProtobufIndex(index = 4)
  public val version: VersionParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ConsensusParams"
  }

  public object KotlinxSerializer : KSerializer<ConsensusParams> {
    private val delegator: KSerializer<ConsensusParams> = ConsensusParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConsensusParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ConsensusParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConsensusParams {
      if (decoder is ProtobufMapperDecoder) {
        return ConsensusParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockParams.KotlinxSerializer::class)
@SerialName(value = BlockParams.TYPE_URL)
public data class BlockParams(
  @ProtobufIndex(index = 1)
  public val maxBytes: Long,
  @ProtobufIndex(index = 2)
  public val maxGas: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.BlockParams"
  }

  public object KotlinxSerializer : KSerializer<BlockParams> {
    private val delegator: KSerializer<BlockParams> = BlockParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockParams {
      if (decoder is ProtobufMapperDecoder) {
        return BlockParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LastCommitInfo.KotlinxSerializer::class)
@SerialName(value = LastCommitInfo.TYPE_URL)
public data class LastCommitInfo(
  @ProtobufIndex(index = 1)
  public val round: Int,
  @ProtobufIndex(index = 2)
  public val votes: List<VoteInfo>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.LastCommitInfo"
  }

  public object KotlinxSerializer : KSerializer<LastCommitInfo> {
    private val delegator: KSerializer<LastCommitInfo> = LastCommitInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LastCommitInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LastCommitInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LastCommitInfo {
      if (decoder is ProtobufMapperDecoder) {
        return LastCommitInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Event.KotlinxSerializer::class)
@SerialName(value = Event.TYPE_URL)
public data class Event(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val attributes: List<EventAttribute>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.Event"
  }

  public object KotlinxSerializer : KSerializer<Event> {
    private val delegator: KSerializer<Event> = Event.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Event): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Event {
      if (decoder is ProtobufMapperDecoder) {
        return EventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAttribute.KotlinxSerializer::class)
@SerialName(value = EventAttribute.TYPE_URL)
public data class EventAttribute(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val `value`: ByteArray,
  @ProtobufIndex(index = 3)
  public val index: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.EventAttribute"
  }

  public object KotlinxSerializer : KSerializer<EventAttribute> {
    private val delegator: KSerializer<EventAttribute> = EventAttribute.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAttribute): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAttributeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAttribute {
      if (decoder is ProtobufMapperDecoder) {
        return EventAttributeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxResult.KotlinxSerializer::class)
@SerialName(value = TxResult.TYPE_URL)
public data class TxResult(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val index: UInt,
  @ProtobufIndex(index = 3)
  public val tx: ByteArray,
  @ProtobufIndex(index = 4)
  public val result: ResponseDeliverTx,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.TxResult"
  }

  public object KotlinxSerializer : KSerializer<TxResult> {
    private val delegator: KSerializer<TxResult> = TxResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxResult): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxResultConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxResult {
      if (decoder is ProtobufMapperDecoder) {
        return TxResultConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Validator.KotlinxSerializer::class)
@SerialName(value = Validator.TYPE_URL)
public data class Validator(
  @ProtobufIndex(index = 1)
  public val address: ByteArray,
  @ProtobufIndex(index = 3)
  public val power: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.Validator"
  }

  public object KotlinxSerializer : KSerializer<Validator> {
    private val delegator: KSerializer<Validator> = Validator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Validator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Validator {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorUpdate.KotlinxSerializer::class)
@SerialName(value = ValidatorUpdate.TYPE_URL)
public data class ValidatorUpdate(
  @ProtobufIndex(index = 1)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 2)
  public val power: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.ValidatorUpdate"
  }

  public object KotlinxSerializer : KSerializer<ValidatorUpdate> {
    private val delegator: KSerializer<ValidatorUpdate> = ValidatorUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VoteInfo.KotlinxSerializer::class)
@SerialName(value = VoteInfo.TYPE_URL)
public data class VoteInfo(
  @ProtobufIndex(index = 1)
  public val validator: Validator,
  @ProtobufIndex(index = 2)
  public val signedLastBlock: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.VoteInfo"
  }

  public object KotlinxSerializer : KSerializer<VoteInfo> {
    private val delegator: KSerializer<VoteInfo> = VoteInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VoteInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoteInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VoteInfo {
      if (decoder is ProtobufMapperDecoder) {
        return VoteInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Evidence.KotlinxSerializer::class)
@SerialName(value = Evidence.TYPE_URL)
public data class Evidence(
  @ProtobufIndex(index = 1)
  public val type: EvidenceType,
  @ProtobufIndex(index = 2)
  public val validator: Validator,
  @ProtobufIndex(index = 3)
  public val height: Long,
  @ProtobufIndex(index = 4)
  public val time: Timestamp,
  @ProtobufIndex(index = 5)
  public val totalVotingPower: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.Evidence"
  }

  public object KotlinxSerializer : KSerializer<Evidence> {
    private val delegator: KSerializer<Evidence> = Evidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Evidence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Evidence {
      if (decoder is ProtobufMapperDecoder) {
        return EvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Snapshot.KotlinxSerializer::class)
@SerialName(value = Snapshot.TYPE_URL)
public data class Snapshot(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val chunks: UInt,
  @ProtobufIndex(index = 4)
  public val hash: ByteArray,
  @ProtobufIndex(index = 5)
  public val metadata: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.abci.Snapshot"
  }

  public object KotlinxSerializer : KSerializer<Snapshot> {
    private val delegator: KSerializer<Snapshot> = Snapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Snapshot): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Snapshot {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

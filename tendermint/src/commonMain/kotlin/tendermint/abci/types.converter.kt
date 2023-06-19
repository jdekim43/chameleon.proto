// Transform from tendermint/abci/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object RequestConverter : ProtobufConverter<Request>

public fun Request.toAny(): Any = Any(Request.TYPE_URL, with(RequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Request>): Request {
  if (typeUrl != Request.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestEchoConverter : ProtobufConverter<RequestEcho>

public fun RequestEcho.toAny(): Any = Any(RequestEcho.TYPE_URL, with(RequestEchoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestEcho>): RequestEcho {
  if (typeUrl != RequestEcho.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestFlushConverter : ProtobufConverter<RequestFlush>

public fun RequestFlush.toAny(): Any = Any(RequestFlush.TYPE_URL, with(RequestFlushConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestFlush>): RequestFlush {
  if (typeUrl != RequestFlush.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestInfoConverter : ProtobufConverter<RequestInfo>

public fun RequestInfo.toAny(): Any = Any(RequestInfo.TYPE_URL, with(RequestInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestInfo>): RequestInfo {
  if (typeUrl != RequestInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestSetOptionConverter : ProtobufConverter<RequestSetOption>

public fun RequestSetOption.toAny(): Any = Any(RequestSetOption.TYPE_URL,
    with(RequestSetOptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestSetOption>): RequestSetOption {
  if (typeUrl != RequestSetOption.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestInitChainConverter : ProtobufConverter<RequestInitChain>

public fun RequestInitChain.toAny(): Any = Any(RequestInitChain.TYPE_URL,
    with(RequestInitChainConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestInitChain>): RequestInitChain {
  if (typeUrl != RequestInitChain.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestQueryConverter : ProtobufConverter<RequestQuery>

public fun RequestQuery.toAny(): Any = Any(RequestQuery.TYPE_URL, with(RequestQueryConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestQuery>): RequestQuery {
  if (typeUrl != RequestQuery.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestBeginBlockConverter : ProtobufConverter<RequestBeginBlock>

public fun RequestBeginBlock.toAny(): Any = Any(RequestBeginBlock.TYPE_URL,
    with(RequestBeginBlockConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestBeginBlock>): RequestBeginBlock {
  if (typeUrl != RequestBeginBlock.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestCheckTxConverter : ProtobufConverter<RequestCheckTx>

public fun RequestCheckTx.toAny(): Any = Any(RequestCheckTx.TYPE_URL, with(RequestCheckTxConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestCheckTx>): RequestCheckTx {
  if (typeUrl != RequestCheckTx.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestDeliverTxConverter : ProtobufConverter<RequestDeliverTx>

public fun RequestDeliverTx.toAny(): Any = Any(RequestDeliverTx.TYPE_URL,
    with(RequestDeliverTxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestDeliverTx>): RequestDeliverTx {
  if (typeUrl != RequestDeliverTx.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestEndBlockConverter : ProtobufConverter<RequestEndBlock>

public fun RequestEndBlock.toAny(): Any = Any(RequestEndBlock.TYPE_URL,
    with(RequestEndBlockConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestEndBlock>): RequestEndBlock {
  if (typeUrl != RequestEndBlock.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestCommitConverter : ProtobufConverter<RequestCommit>

public fun RequestCommit.toAny(): Any = Any(RequestCommit.TYPE_URL, with(RequestCommitConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestCommit>): RequestCommit {
  if (typeUrl != RequestCommit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestListSnapshotsConverter : ProtobufConverter<RequestListSnapshots>

public fun RequestListSnapshots.toAny(): Any = Any(RequestListSnapshots.TYPE_URL,
    with(RequestListSnapshotsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestListSnapshots>): RequestListSnapshots {
  if (typeUrl != RequestListSnapshots.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestOfferSnapshotConverter : ProtobufConverter<RequestOfferSnapshot>

public fun RequestOfferSnapshot.toAny(): Any = Any(RequestOfferSnapshot.TYPE_URL,
    with(RequestOfferSnapshotConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestOfferSnapshot>): RequestOfferSnapshot {
  if (typeUrl != RequestOfferSnapshot.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestLoadSnapshotChunkConverter : ProtobufConverter<RequestLoadSnapshotChunk>

public fun RequestLoadSnapshotChunk.toAny(): Any = Any(RequestLoadSnapshotChunk.TYPE_URL,
    with(RequestLoadSnapshotChunkConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestLoadSnapshotChunk>):
    RequestLoadSnapshotChunk {
  if (typeUrl != RequestLoadSnapshotChunk.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestApplySnapshotChunkConverter :
    ProtobufConverter<RequestApplySnapshotChunk>

public fun RequestApplySnapshotChunk.toAny(): Any = Any(RequestApplySnapshotChunk.TYPE_URL,
    with(RequestApplySnapshotChunkConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestApplySnapshotChunk>):
    RequestApplySnapshotChunk {
  if (typeUrl != RequestApplySnapshotChunk.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseConverter : ProtobufConverter<Response>

public fun Response.toAny(): Any = Any(Response.TYPE_URL, with(ResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Response>): Response {
  if (typeUrl != Response.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseExceptionConverter : ProtobufConverter<ResponseException>

public fun ResponseException.toAny(): Any = Any(ResponseException.TYPE_URL,
    with(ResponseExceptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseException>): ResponseException {
  if (typeUrl != ResponseException.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseEchoConverter : ProtobufConverter<ResponseEcho>

public fun ResponseEcho.toAny(): Any = Any(ResponseEcho.TYPE_URL, with(ResponseEchoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseEcho>): ResponseEcho {
  if (typeUrl != ResponseEcho.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseFlushConverter : ProtobufConverter<ResponseFlush>

public fun ResponseFlush.toAny(): Any = Any(ResponseFlush.TYPE_URL, with(ResponseFlushConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseFlush>): ResponseFlush {
  if (typeUrl != ResponseFlush.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseInfoConverter : ProtobufConverter<ResponseInfo>

public fun ResponseInfo.toAny(): Any = Any(ResponseInfo.TYPE_URL, with(ResponseInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseInfo>): ResponseInfo {
  if (typeUrl != ResponseInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseSetOptionConverter : ProtobufConverter<ResponseSetOption>

public fun ResponseSetOption.toAny(): Any = Any(ResponseSetOption.TYPE_URL,
    with(ResponseSetOptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseSetOption>): ResponseSetOption {
  if (typeUrl != ResponseSetOption.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseInitChainConverter : ProtobufConverter<ResponseInitChain>

public fun ResponseInitChain.toAny(): Any = Any(ResponseInitChain.TYPE_URL,
    with(ResponseInitChainConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseInitChain>): ResponseInitChain {
  if (typeUrl != ResponseInitChain.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseQueryConverter : ProtobufConverter<ResponseQuery>

public fun ResponseQuery.toAny(): Any = Any(ResponseQuery.TYPE_URL, with(ResponseQueryConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseQuery>): ResponseQuery {
  if (typeUrl != ResponseQuery.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseBeginBlockConverter : ProtobufConverter<ResponseBeginBlock>

public fun ResponseBeginBlock.toAny(): Any = Any(ResponseBeginBlock.TYPE_URL,
    with(ResponseBeginBlockConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseBeginBlock>): ResponseBeginBlock {
  if (typeUrl != ResponseBeginBlock.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseCheckTxConverter : ProtobufConverter<ResponseCheckTx>

public fun ResponseCheckTx.toAny(): Any = Any(ResponseCheckTx.TYPE_URL,
    with(ResponseCheckTxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseCheckTx>): ResponseCheckTx {
  if (typeUrl != ResponseCheckTx.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseDeliverTxConverter : ProtobufConverter<ResponseDeliverTx>

public fun ResponseDeliverTx.toAny(): Any = Any(ResponseDeliverTx.TYPE_URL,
    with(ResponseDeliverTxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseDeliverTx>): ResponseDeliverTx {
  if (typeUrl != ResponseDeliverTx.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseEndBlockConverter : ProtobufConverter<ResponseEndBlock>

public fun ResponseEndBlock.toAny(): Any = Any(ResponseEndBlock.TYPE_URL,
    with(ResponseEndBlockConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseEndBlock>): ResponseEndBlock {
  if (typeUrl != ResponseEndBlock.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseCommitConverter : ProtobufConverter<ResponseCommit>

public fun ResponseCommit.toAny(): Any = Any(ResponseCommit.TYPE_URL, with(ResponseCommitConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseCommit>): ResponseCommit {
  if (typeUrl != ResponseCommit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseListSnapshotsConverter : ProtobufConverter<ResponseListSnapshots>

public fun ResponseListSnapshots.toAny(): Any = Any(ResponseListSnapshots.TYPE_URL,
    with(ResponseListSnapshotsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseListSnapshots>): ResponseListSnapshots {
  if (typeUrl != ResponseListSnapshots.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseOfferSnapshotConverter : ProtobufConverter<ResponseOfferSnapshot>

public fun ResponseOfferSnapshot.toAny(): Any = Any(ResponseOfferSnapshot.TYPE_URL,
    with(ResponseOfferSnapshotConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseOfferSnapshot>): ResponseOfferSnapshot {
  if (typeUrl != ResponseOfferSnapshot.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseLoadSnapshotChunkConverter :
    ProtobufConverter<ResponseLoadSnapshotChunk>

public fun ResponseLoadSnapshotChunk.toAny(): Any = Any(ResponseLoadSnapshotChunk.TYPE_URL,
    with(ResponseLoadSnapshotChunkConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseLoadSnapshotChunk>):
    ResponseLoadSnapshotChunk {
  if (typeUrl != ResponseLoadSnapshotChunk.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseApplySnapshotChunkConverter :
    ProtobufConverter<ResponseApplySnapshotChunk>

public fun ResponseApplySnapshotChunk.toAny(): Any = Any(ResponseApplySnapshotChunk.TYPE_URL,
    with(ResponseApplySnapshotChunkConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseApplySnapshotChunk>):
    ResponseApplySnapshotChunk {
  if (typeUrl != ResponseApplySnapshotChunk.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ConsensusParamsConverter : ProtobufConverter<ConsensusParams>

public fun ConsensusParams.toAny(): Any = Any(ConsensusParams.TYPE_URL,
    with(ConsensusParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConsensusParams>): ConsensusParams {
  if (typeUrl != ConsensusParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockParamsConverter : ProtobufConverter<BlockParams>

public fun BlockParams.toAny(): Any = Any(BlockParams.TYPE_URL, with(BlockParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockParams>): BlockParams {
  if (typeUrl != BlockParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LastCommitInfoConverter : ProtobufConverter<LastCommitInfo>

public fun LastCommitInfo.toAny(): Any = Any(LastCommitInfo.TYPE_URL, with(LastCommitInfoConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LastCommitInfo>): LastCommitInfo {
  if (typeUrl != LastCommitInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventConverter : ProtobufConverter<Event>

public fun Event.toAny(): Any = Any(Event.TYPE_URL, with(EventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Event>): Event {
  if (typeUrl != Event.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAttributeConverter : ProtobufConverter<EventAttribute>

public fun EventAttribute.toAny(): Any = Any(EventAttribute.TYPE_URL, with(EventAttributeConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAttribute>): EventAttribute {
  if (typeUrl != EventAttribute.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxResultConverter : ProtobufConverter<TxResult>

public fun TxResult.toAny(): Any = Any(TxResult.TYPE_URL, with(TxResultConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxResult>): TxResult {
  if (typeUrl != TxResult.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorConverter : ProtobufConverter<Validator>

public fun Validator.toAny(): Any = Any(Validator.TYPE_URL, with(ValidatorConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Validator>): Validator {
  if (typeUrl != Validator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorUpdateConverter : ProtobufConverter<ValidatorUpdate>

public fun ValidatorUpdate.toAny(): Any = Any(ValidatorUpdate.TYPE_URL,
    with(ValidatorUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorUpdate>): ValidatorUpdate {
  if (typeUrl != ValidatorUpdate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteInfoConverter : ProtobufConverter<VoteInfo>

public fun VoteInfo.toAny(): Any = Any(VoteInfo.TYPE_URL, with(VoteInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VoteInfo>): VoteInfo {
  if (typeUrl != VoteInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EvidenceConverter : ProtobufConverter<Evidence>

public fun Evidence.toAny(): Any = Any(Evidence.TYPE_URL, with(EvidenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Evidence>): Evidence {
  if (typeUrl != Evidence.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotConverter : ProtobufConverter<Snapshot>

public fun Snapshot.toAny(): Any = Any(Snapshot.TYPE_URL, with(SnapshotConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Snapshot>): Snapshot {
  if (typeUrl != Snapshot.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

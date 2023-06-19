// Transform from tendermint/abci/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.abci

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.crypto.ProofOpsJvmConverter
import tendermint.crypto.PublicKeyJvmConverter
import tendermint.types.EvidenceParamsJvmConverter
import tendermint.types.HeaderJvmConverter
import tendermint.types.ValidatorParamsJvmConverter
import tendermint.types.VersionParamsJvmConverter

public object RequestJvmConverter : ProtobufTypeMapper<Request, Types.Request> {
  public override val descriptor: Descriptors.Descriptor = Types.Request.getDescriptor()

  public override val parser: Parser<Types.Request> = Types.Request.parser()

  public override fun convert(obj: Types.Request): Request = Request(
  	`value` = mapOf(
  1 to { Request.ValueOneOf.Echo(RequestEchoJvmConverter.convert(obj.getEcho())) },
  2 to { Request.ValueOneOf.Flush(RequestFlushJvmConverter.convert(obj.getFlush())) },
  3 to { Request.ValueOneOf.Info(RequestInfoJvmConverter.convert(obj.getInfo())) },
  4 to { Request.ValueOneOf.SetOption(RequestSetOptionJvmConverter.convert(obj.getSetOption())) },
  5 to { Request.ValueOneOf.InitChain(RequestInitChainJvmConverter.convert(obj.getInitChain())) },
  6 to { Request.ValueOneOf.Query(RequestQueryJvmConverter.convert(obj.getQuery())) },
  7 to { Request.ValueOneOf.BeginBlock(RequestBeginBlockJvmConverter.convert(obj.getBeginBlock()))
      },
  8 to { Request.ValueOneOf.CheckTx(RequestCheckTxJvmConverter.convert(obj.getCheckTx())) },
  9 to { Request.ValueOneOf.DeliverTx(RequestDeliverTxJvmConverter.convert(obj.getDeliverTx())) },
  10 to { Request.ValueOneOf.EndBlock(RequestEndBlockJvmConverter.convert(obj.getEndBlock())) },
  11 to { Request.ValueOneOf.Commit(RequestCommitJvmConverter.convert(obj.getCommit())) },
  12 to {
      Request.ValueOneOf.ListSnapshots(RequestListSnapshotsJvmConverter.convert(obj.getListSnapshots()))
      },
  13 to {
      Request.ValueOneOf.OfferSnapshot(RequestOfferSnapshotJvmConverter.convert(obj.getOfferSnapshot()))
      },
  14 to {
      Request.ValueOneOf.LoadSnapshotChunk(RequestLoadSnapshotChunkJvmConverter.convert(obj.getLoadSnapshotChunk()))
      },
  15 to {
      Request.ValueOneOf.ApplySnapshotChunk(RequestApplySnapshotChunkJvmConverter.convert(obj.getApplySnapshotChunk()))
      },
  ).getValue(obj.valueCase.number)(),
  )

  public override fun convert(obj: Request): Types.Request {
    val builder = Types.Request.newBuilder()
    when (obj.`value`) {
      is Request.ValueOneOf.Echo ->
          builder.setEcho(RequestEchoJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.Flush ->
          builder.setFlush(RequestFlushJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.Info ->
          builder.setInfo(RequestInfoJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.SetOption ->
          builder.setSetOption(RequestSetOptionJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.InitChain ->
          builder.setInitChain(RequestInitChainJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.Query ->
          builder.setQuery(RequestQueryJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.BeginBlock ->
          builder.setBeginBlock(RequestBeginBlockJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.CheckTx ->
          builder.setCheckTx(RequestCheckTxJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.DeliverTx ->
          builder.setDeliverTx(RequestDeliverTxJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.EndBlock ->
          builder.setEndBlock(RequestEndBlockJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.Commit ->
          builder.setCommit(RequestCommitJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.ListSnapshots ->
          builder.setListSnapshots(RequestListSnapshotsJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.OfferSnapshot ->
          builder.setOfferSnapshot(RequestOfferSnapshotJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.LoadSnapshotChunk ->
          builder.setLoadSnapshotChunk(RequestLoadSnapshotChunkJvmConverter.convert(obj.`value`.value))
      is Request.ValueOneOf.ApplySnapshotChunk ->
          builder.setApplySnapshotChunk(RequestApplySnapshotChunkJvmConverter.convert(obj.`value`.value))
    }
    return builder.build()
  }
}

public object RequestEchoJvmConverter : ProtobufTypeMapper<RequestEcho, Types.RequestEcho> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestEcho.getDescriptor()

  public override val parser: Parser<Types.RequestEcho> = Types.RequestEcho.parser()

  public override fun convert(obj: Types.RequestEcho): RequestEcho = RequestEcho(
  	message = obj.getMessage(),
  )

  public override fun convert(obj: RequestEcho): Types.RequestEcho {
    val builder = Types.RequestEcho.newBuilder()
    builder.setMessage(obj.message)
    return builder.build()
  }
}

public object RequestFlushJvmConverter : ProtobufTypeMapper<RequestFlush, Types.RequestFlush> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestFlush.getDescriptor()

  public override val parser: Parser<Types.RequestFlush> = Types.RequestFlush.parser()

  public override fun convert(obj: Types.RequestFlush): RequestFlush = RequestFlush(
  )

  public override fun convert(obj: RequestFlush): Types.RequestFlush {
    val builder = Types.RequestFlush.newBuilder()
    return builder.build()
  }
}

public object RequestInfoJvmConverter : ProtobufTypeMapper<RequestInfo, Types.RequestInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestInfo.getDescriptor()

  public override val parser: Parser<Types.RequestInfo> = Types.RequestInfo.parser()

  public override fun convert(obj: Types.RequestInfo): RequestInfo = RequestInfo(
  	version = obj.getVersion(),
  	blockVersion = obj.getBlockVersion().asKotlinType,
  	p2PVersion = obj.getP2PVersion().asKotlinType,
  )

  public override fun convert(obj: RequestInfo): Types.RequestInfo {
    val builder = Types.RequestInfo.newBuilder()
    builder.setVersion(obj.version)
    builder.setBlockVersion(obj.blockVersion.asJavaType)
    builder.setP2PVersion(obj.p2PVersion.asJavaType)
    return builder.build()
  }
}

public object RequestSetOptionJvmConverter :
    ProtobufTypeMapper<RequestSetOption, Types.RequestSetOption> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestSetOption.getDescriptor()

  public override val parser: Parser<Types.RequestSetOption> = Types.RequestSetOption.parser()

  public override fun convert(obj: Types.RequestSetOption): RequestSetOption = RequestSetOption(
  	key = obj.getKey(),
  	`value` = obj.getValue(),
  )

  public override fun convert(obj: RequestSetOption): Types.RequestSetOption {
    val builder = Types.RequestSetOption.newBuilder()
    builder.setKey(obj.key)
    builder.setValue(obj.`value`)
    return builder.build()
  }
}

public object RequestInitChainJvmConverter :
    ProtobufTypeMapper<RequestInitChain, Types.RequestInitChain> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestInitChain.getDescriptor()

  public override val parser: Parser<Types.RequestInitChain> = Types.RequestInitChain.parser()

  public override fun convert(obj: Types.RequestInitChain): RequestInitChain = RequestInitChain(
  	time = TimestampJvmConverter.convert(obj.getTime()),
  	chainId = obj.getChainId(),
  	consensusParams = ConsensusParamsJvmConverter.convert(obj.getConsensusParams()),
  	validators = obj.getValidatorsList().map { ValidatorUpdateJvmConverter.convert(it) },
  	appStateBytes = obj.getAppStateBytes().toByteArray(),
  	initialHeight = obj.getInitialHeight(),
  )

  public override fun convert(obj: RequestInitChain): Types.RequestInitChain {
    val builder = Types.RequestInitChain.newBuilder()
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setChainId(obj.chainId)
    builder.setConsensusParams(ConsensusParamsJvmConverter.convert(obj.consensusParams))
    builder.addAllValidators(obj.validators.map { ValidatorUpdateJvmConverter.convert(it) })
    builder.setAppStateBytes(ByteString.copyFrom(obj.appStateBytes))
    builder.setInitialHeight(obj.initialHeight)
    return builder.build()
  }
}

public object RequestQueryJvmConverter : ProtobufTypeMapper<RequestQuery, Types.RequestQuery> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestQuery.getDescriptor()

  public override val parser: Parser<Types.RequestQuery> = Types.RequestQuery.parser()

  public override fun convert(obj: Types.RequestQuery): RequestQuery = RequestQuery(
  	`data` = obj.getData().toByteArray(),
  	path = obj.getPath(),
  	height = obj.getHeight(),
  	prove = obj.getProve(),
  )

  public override fun convert(obj: RequestQuery): Types.RequestQuery {
    val builder = Types.RequestQuery.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setPath(obj.path)
    builder.setHeight(obj.height)
    builder.setProve(obj.prove)
    return builder.build()
  }
}

public object RequestBeginBlockJvmConverter :
    ProtobufTypeMapper<RequestBeginBlock, Types.RequestBeginBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestBeginBlock.getDescriptor()

  public override val parser: Parser<Types.RequestBeginBlock> = Types.RequestBeginBlock.parser()

  public override fun convert(obj: Types.RequestBeginBlock): RequestBeginBlock = RequestBeginBlock(
  	hash = obj.getHash().toByteArray(),
  	`header` = HeaderJvmConverter.convert(obj.getHeader()),
  	lastCommitInfo = LastCommitInfoJvmConverter.convert(obj.getLastCommitInfo()),
  	byzantineValidators = obj.getByzantineValidatorsList().map { EvidenceJvmConverter.convert(it) },
  )

  public override fun convert(obj: RequestBeginBlock): Types.RequestBeginBlock {
    val builder = Types.RequestBeginBlock.newBuilder()
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setHeader(HeaderJvmConverter.convert(obj.`header`))
    builder.setLastCommitInfo(LastCommitInfoJvmConverter.convert(obj.lastCommitInfo))
    builder.addAllByzantineValidators(obj.byzantineValidators.map { EvidenceJvmConverter.convert(it)
        })
    return builder.build()
  }
}

public object RequestCheckTxJvmConverter : ProtobufTypeMapper<RequestCheckTx, Types.RequestCheckTx>
    {
  public override val descriptor: Descriptors.Descriptor = Types.RequestCheckTx.getDescriptor()

  public override val parser: Parser<Types.RequestCheckTx> = Types.RequestCheckTx.parser()

  public override fun convert(obj: Types.RequestCheckTx): RequestCheckTx = RequestCheckTx(
  	tx = obj.getTx().toByteArray(),
  	type = CheckTxType.forNumber(obj.getType().number),
  )

  public override fun convert(obj: RequestCheckTx): Types.RequestCheckTx {
    val builder = Types.RequestCheckTx.newBuilder()
    builder.setTx(ByteString.copyFrom(obj.tx))
    builder.setType(Types.CheckTxType.forNumber(obj.type.number))
    return builder.build()
  }
}

public object RequestDeliverTxJvmConverter :
    ProtobufTypeMapper<RequestDeliverTx, Types.RequestDeliverTx> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestDeliverTx.getDescriptor()

  public override val parser: Parser<Types.RequestDeliverTx> = Types.RequestDeliverTx.parser()

  public override fun convert(obj: Types.RequestDeliverTx): RequestDeliverTx = RequestDeliverTx(
  	tx = obj.getTx().toByteArray(),
  )

  public override fun convert(obj: RequestDeliverTx): Types.RequestDeliverTx {
    val builder = Types.RequestDeliverTx.newBuilder()
    builder.setTx(ByteString.copyFrom(obj.tx))
    return builder.build()
  }
}

public object RequestEndBlockJvmConverter :
    ProtobufTypeMapper<RequestEndBlock, Types.RequestEndBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestEndBlock.getDescriptor()

  public override val parser: Parser<Types.RequestEndBlock> = Types.RequestEndBlock.parser()

  public override fun convert(obj: Types.RequestEndBlock): RequestEndBlock = RequestEndBlock(
  	height = obj.getHeight(),
  )

  public override fun convert(obj: RequestEndBlock): Types.RequestEndBlock {
    val builder = Types.RequestEndBlock.newBuilder()
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object RequestCommitJvmConverter : ProtobufTypeMapper<RequestCommit, Types.RequestCommit> {
  public override val descriptor: Descriptors.Descriptor = Types.RequestCommit.getDescriptor()

  public override val parser: Parser<Types.RequestCommit> = Types.RequestCommit.parser()

  public override fun convert(obj: Types.RequestCommit): RequestCommit = RequestCommit(
  )

  public override fun convert(obj: RequestCommit): Types.RequestCommit {
    val builder = Types.RequestCommit.newBuilder()
    return builder.build()
  }
}

public object RequestListSnapshotsJvmConverter :
    ProtobufTypeMapper<RequestListSnapshots, Types.RequestListSnapshots> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestListSnapshots.getDescriptor()

  public override val parser: Parser<Types.RequestListSnapshots> =
      Types.RequestListSnapshots.parser()

  public override fun convert(obj: Types.RequestListSnapshots): RequestListSnapshots =
      RequestListSnapshots(
  )

  public override fun convert(obj: RequestListSnapshots): Types.RequestListSnapshots {
    val builder = Types.RequestListSnapshots.newBuilder()
    return builder.build()
  }
}

public object RequestOfferSnapshotJvmConverter :
    ProtobufTypeMapper<RequestOfferSnapshot, Types.RequestOfferSnapshot> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestOfferSnapshot.getDescriptor()

  public override val parser: Parser<Types.RequestOfferSnapshot> =
      Types.RequestOfferSnapshot.parser()

  public override fun convert(obj: Types.RequestOfferSnapshot): RequestOfferSnapshot =
      RequestOfferSnapshot(
  	snapshot = SnapshotJvmConverter.convert(obj.getSnapshot()),
  	appHash = obj.getAppHash().toByteArray(),
  )

  public override fun convert(obj: RequestOfferSnapshot): Types.RequestOfferSnapshot {
    val builder = Types.RequestOfferSnapshot.newBuilder()
    builder.setSnapshot(SnapshotJvmConverter.convert(obj.snapshot))
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    return builder.build()
  }
}

public object RequestLoadSnapshotChunkJvmConverter :
    ProtobufTypeMapper<RequestLoadSnapshotChunk, Types.RequestLoadSnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestLoadSnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.RequestLoadSnapshotChunk> =
      Types.RequestLoadSnapshotChunk.parser()

  public override fun convert(obj: Types.RequestLoadSnapshotChunk): RequestLoadSnapshotChunk =
      RequestLoadSnapshotChunk(
  	height = obj.getHeight().asKotlinType,
  	format = obj.getFormat().asKotlinType,
  	chunk = obj.getChunk().asKotlinType,
  )

  public override fun convert(obj: RequestLoadSnapshotChunk): Types.RequestLoadSnapshotChunk {
    val builder = Types.RequestLoadSnapshotChunk.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunk(obj.chunk.asJavaType)
    return builder.build()
  }
}

public object RequestApplySnapshotChunkJvmConverter :
    ProtobufTypeMapper<RequestApplySnapshotChunk, Types.RequestApplySnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.RequestApplySnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.RequestApplySnapshotChunk> =
      Types.RequestApplySnapshotChunk.parser()

  public override fun convert(obj: Types.RequestApplySnapshotChunk): RequestApplySnapshotChunk =
      RequestApplySnapshotChunk(
  	index = obj.getIndex().asKotlinType,
  	chunk = obj.getChunk().toByteArray(),
  	sender = obj.getSender(),
  )

  public override fun convert(obj: RequestApplySnapshotChunk): Types.RequestApplySnapshotChunk {
    val builder = Types.RequestApplySnapshotChunk.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    builder.setChunk(ByteString.copyFrom(obj.chunk))
    builder.setSender(obj.sender)
    return builder.build()
  }
}

public object ResponseJvmConverter : ProtobufTypeMapper<Response, Types.Response> {
  public override val descriptor: Descriptors.Descriptor = Types.Response.getDescriptor()

  public override val parser: Parser<Types.Response> = Types.Response.parser()

  public override fun convert(obj: Types.Response): Response = Response(
  	`value` = mapOf(
  1 to { Response.ValueOneOf.Exception(ResponseExceptionJvmConverter.convert(obj.getException())) },
  2 to { Response.ValueOneOf.Echo(ResponseEchoJvmConverter.convert(obj.getEcho())) },
  3 to { Response.ValueOneOf.Flush(ResponseFlushJvmConverter.convert(obj.getFlush())) },
  4 to { Response.ValueOneOf.Info(ResponseInfoJvmConverter.convert(obj.getInfo())) },
  5 to { Response.ValueOneOf.SetOption(ResponseSetOptionJvmConverter.convert(obj.getSetOption())) },
  6 to { Response.ValueOneOf.InitChain(ResponseInitChainJvmConverter.convert(obj.getInitChain())) },
  7 to { Response.ValueOneOf.Query(ResponseQueryJvmConverter.convert(obj.getQuery())) },
  8 to { Response.ValueOneOf.BeginBlock(ResponseBeginBlockJvmConverter.convert(obj.getBeginBlock()))
      },
  9 to { Response.ValueOneOf.CheckTx(ResponseCheckTxJvmConverter.convert(obj.getCheckTx())) },
  10 to { Response.ValueOneOf.DeliverTx(ResponseDeliverTxJvmConverter.convert(obj.getDeliverTx()))
      },
  11 to { Response.ValueOneOf.EndBlock(ResponseEndBlockJvmConverter.convert(obj.getEndBlock())) },
  12 to { Response.ValueOneOf.Commit(ResponseCommitJvmConverter.convert(obj.getCommit())) },
  13 to {
      Response.ValueOneOf.ListSnapshots(ResponseListSnapshotsJvmConverter.convert(obj.getListSnapshots()))
      },
  14 to {
      Response.ValueOneOf.OfferSnapshot(ResponseOfferSnapshotJvmConverter.convert(obj.getOfferSnapshot()))
      },
  15 to {
      Response.ValueOneOf.LoadSnapshotChunk(ResponseLoadSnapshotChunkJvmConverter.convert(obj.getLoadSnapshotChunk()))
      },
  16 to {
      Response.ValueOneOf.ApplySnapshotChunk(ResponseApplySnapshotChunkJvmConverter.convert(obj.getApplySnapshotChunk()))
      },
  ).getValue(obj.valueCase.number)(),
  )

  public override fun convert(obj: Response): Types.Response {
    val builder = Types.Response.newBuilder()
    when (obj.`value`) {
      is Response.ValueOneOf.Exception ->
          builder.setException(ResponseExceptionJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.Echo ->
          builder.setEcho(ResponseEchoJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.Flush ->
          builder.setFlush(ResponseFlushJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.Info ->
          builder.setInfo(ResponseInfoJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.SetOption ->
          builder.setSetOption(ResponseSetOptionJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.InitChain ->
          builder.setInitChain(ResponseInitChainJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.Query ->
          builder.setQuery(ResponseQueryJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.BeginBlock ->
          builder.setBeginBlock(ResponseBeginBlockJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.CheckTx ->
          builder.setCheckTx(ResponseCheckTxJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.DeliverTx ->
          builder.setDeliverTx(ResponseDeliverTxJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.EndBlock ->
          builder.setEndBlock(ResponseEndBlockJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.Commit ->
          builder.setCommit(ResponseCommitJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.ListSnapshots ->
          builder.setListSnapshots(ResponseListSnapshotsJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.OfferSnapshot ->
          builder.setOfferSnapshot(ResponseOfferSnapshotJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.LoadSnapshotChunk ->
          builder.setLoadSnapshotChunk(ResponseLoadSnapshotChunkJvmConverter.convert(obj.`value`.value))
      is Response.ValueOneOf.ApplySnapshotChunk ->
          builder.setApplySnapshotChunk(ResponseApplySnapshotChunkJvmConverter.convert(obj.`value`.value))
    }
    return builder.build()
  }
}

public object ResponseExceptionJvmConverter :
    ProtobufTypeMapper<ResponseException, Types.ResponseException> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseException.getDescriptor()

  public override val parser: Parser<Types.ResponseException> = Types.ResponseException.parser()

  public override fun convert(obj: Types.ResponseException): ResponseException = ResponseException(
  	error = obj.getError(),
  )

  public override fun convert(obj: ResponseException): Types.ResponseException {
    val builder = Types.ResponseException.newBuilder()
    builder.setError(obj.error)
    return builder.build()
  }
}

public object ResponseEchoJvmConverter : ProtobufTypeMapper<ResponseEcho, Types.ResponseEcho> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseEcho.getDescriptor()

  public override val parser: Parser<Types.ResponseEcho> = Types.ResponseEcho.parser()

  public override fun convert(obj: Types.ResponseEcho): ResponseEcho = ResponseEcho(
  	message = obj.getMessage(),
  )

  public override fun convert(obj: ResponseEcho): Types.ResponseEcho {
    val builder = Types.ResponseEcho.newBuilder()
    builder.setMessage(obj.message)
    return builder.build()
  }
}

public object ResponseFlushJvmConverter : ProtobufTypeMapper<ResponseFlush, Types.ResponseFlush> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseFlush.getDescriptor()

  public override val parser: Parser<Types.ResponseFlush> = Types.ResponseFlush.parser()

  public override fun convert(obj: Types.ResponseFlush): ResponseFlush = ResponseFlush(
  )

  public override fun convert(obj: ResponseFlush): Types.ResponseFlush {
    val builder = Types.ResponseFlush.newBuilder()
    return builder.build()
  }
}

public object ResponseInfoJvmConverter : ProtobufTypeMapper<ResponseInfo, Types.ResponseInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseInfo.getDescriptor()

  public override val parser: Parser<Types.ResponseInfo> = Types.ResponseInfo.parser()

  public override fun convert(obj: Types.ResponseInfo): ResponseInfo = ResponseInfo(
  	`data` = obj.getData(),
  	version = obj.getVersion(),
  	appVersion = obj.getAppVersion().asKotlinType,
  	lastBlockHeight = obj.getLastBlockHeight(),
  	lastBlockAppHash = obj.getLastBlockAppHash().toByteArray(),
  )

  public override fun convert(obj: ResponseInfo): Types.ResponseInfo {
    val builder = Types.ResponseInfo.newBuilder()
    builder.setData(obj.`data`)
    builder.setVersion(obj.version)
    builder.setAppVersion(obj.appVersion.asJavaType)
    builder.setLastBlockHeight(obj.lastBlockHeight)
    builder.setLastBlockAppHash(ByteString.copyFrom(obj.lastBlockAppHash))
    return builder.build()
  }
}

public object ResponseSetOptionJvmConverter :
    ProtobufTypeMapper<ResponseSetOption, Types.ResponseSetOption> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseSetOption.getDescriptor()

  public override val parser: Parser<Types.ResponseSetOption> = Types.ResponseSetOption.parser()

  public override fun convert(obj: Types.ResponseSetOption): ResponseSetOption = ResponseSetOption(
  	code = obj.getCode().asKotlinType,
  	log = obj.getLog(),
  	info = obj.getInfo(),
  )

  public override fun convert(obj: ResponseSetOption): Types.ResponseSetOption {
    val builder = Types.ResponseSetOption.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    return builder.build()
  }
}

public object ResponseInitChainJvmConverter :
    ProtobufTypeMapper<ResponseInitChain, Types.ResponseInitChain> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseInitChain.getDescriptor()

  public override val parser: Parser<Types.ResponseInitChain> = Types.ResponseInitChain.parser()

  public override fun convert(obj: Types.ResponseInitChain): ResponseInitChain = ResponseInitChain(
  	consensusParams = ConsensusParamsJvmConverter.convert(obj.getConsensusParams()),
  	validators = obj.getValidatorsList().map { ValidatorUpdateJvmConverter.convert(it) },
  	appHash = obj.getAppHash().toByteArray(),
  )

  public override fun convert(obj: ResponseInitChain): Types.ResponseInitChain {
    val builder = Types.ResponseInitChain.newBuilder()
    builder.setConsensusParams(ConsensusParamsJvmConverter.convert(obj.consensusParams))
    builder.addAllValidators(obj.validators.map { ValidatorUpdateJvmConverter.convert(it) })
    builder.setAppHash(ByteString.copyFrom(obj.appHash))
    return builder.build()
  }
}

public object ResponseQueryJvmConverter : ProtobufTypeMapper<ResponseQuery, Types.ResponseQuery> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseQuery.getDescriptor()

  public override val parser: Parser<Types.ResponseQuery> = Types.ResponseQuery.parser()

  public override fun convert(obj: Types.ResponseQuery): ResponseQuery = ResponseQuery(
  	code = obj.getCode().asKotlinType,
  	log = obj.getLog(),
  	info = obj.getInfo(),
  	index = obj.getIndex(),
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  	proofOps = ProofOpsJvmConverter.convert(obj.getProofOps()),
  	height = obj.getHeight(),
  	codespace = obj.getCodespace(),
  )

  public override fun convert(obj: ResponseQuery): Types.ResponseQuery {
    val builder = Types.ResponseQuery.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setIndex(obj.index)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setProofOps(ProofOpsJvmConverter.convert(obj.proofOps))
    builder.setHeight(obj.height)
    builder.setCodespace(obj.codespace)
    return builder.build()
  }
}

public object ResponseBeginBlockJvmConverter :
    ProtobufTypeMapper<ResponseBeginBlock, Types.ResponseBeginBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseBeginBlock.getDescriptor()

  public override val parser: Parser<Types.ResponseBeginBlock> = Types.ResponseBeginBlock.parser()

  public override fun convert(obj: Types.ResponseBeginBlock): ResponseBeginBlock =
      ResponseBeginBlock(
  	events = obj.getEventsList().map { EventJvmConverter.convert(it) },
  )

  public override fun convert(obj: ResponseBeginBlock): Types.ResponseBeginBlock {
    val builder = Types.ResponseBeginBlock.newBuilder()
    builder.addAllEvents(obj.events.map { EventJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ResponseCheckTxJvmConverter :
    ProtobufTypeMapper<ResponseCheckTx, Types.ResponseCheckTx> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseCheckTx.getDescriptor()

  public override val parser: Parser<Types.ResponseCheckTx> = Types.ResponseCheckTx.parser()

  public override fun convert(obj: Types.ResponseCheckTx): ResponseCheckTx = ResponseCheckTx(
  	code = obj.getCode().asKotlinType,
  	`data` = obj.getData().toByteArray(),
  	log = obj.getLog(),
  	info = obj.getInfo(),
  	gasWanted = obj.getGasWanted(),
  	gasUsed = obj.getGasUsed(),
  	events = obj.getEventsList().map { EventJvmConverter.convert(it) },
  	codespace = obj.getCodespace(),
  	sender = obj.getSender(),
  	priority = obj.getPriority(),
  	mempoolError = obj.getMempoolError(),
  )

  public override fun convert(obj: ResponseCheckTx): Types.ResponseCheckTx {
    val builder = Types.ResponseCheckTx.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setGasWanted(obj.gasWanted)
    builder.setGasUsed(obj.gasUsed)
    builder.addAllEvents(obj.events.map { EventJvmConverter.convert(it) })
    builder.setCodespace(obj.codespace)
    builder.setSender(obj.sender)
    builder.setPriority(obj.priority)
    builder.setMempoolError(obj.mempoolError)
    return builder.build()
  }
}

public object ResponseDeliverTxJvmConverter :
    ProtobufTypeMapper<ResponseDeliverTx, Types.ResponseDeliverTx> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseDeliverTx.getDescriptor()

  public override val parser: Parser<Types.ResponseDeliverTx> = Types.ResponseDeliverTx.parser()

  public override fun convert(obj: Types.ResponseDeliverTx): ResponseDeliverTx = ResponseDeliverTx(
  	code = obj.getCode().asKotlinType,
  	`data` = obj.getData().toByteArray(),
  	log = obj.getLog(),
  	info = obj.getInfo(),
  	gasWanted = obj.getGasWanted(),
  	gasUsed = obj.getGasUsed(),
  	events = obj.getEventsList().map { EventJvmConverter.convert(it) },
  	codespace = obj.getCodespace(),
  )

  public override fun convert(obj: ResponseDeliverTx): Types.ResponseDeliverTx {
    val builder = Types.ResponseDeliverTx.newBuilder()
    builder.setCode(obj.code.asJavaType)
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setLog(obj.log)
    builder.setInfo(obj.info)
    builder.setGasWanted(obj.gasWanted)
    builder.setGasUsed(obj.gasUsed)
    builder.addAllEvents(obj.events.map { EventJvmConverter.convert(it) })
    builder.setCodespace(obj.codespace)
    return builder.build()
  }
}

public object ResponseEndBlockJvmConverter :
    ProtobufTypeMapper<ResponseEndBlock, Types.ResponseEndBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseEndBlock.getDescriptor()

  public override val parser: Parser<Types.ResponseEndBlock> = Types.ResponseEndBlock.parser()

  public override fun convert(obj: Types.ResponseEndBlock): ResponseEndBlock = ResponseEndBlock(
  	validatorUpdates = obj.getValidatorUpdatesList().map { ValidatorUpdateJvmConverter.convert(it) },
  	consensusParamUpdates = ConsensusParamsJvmConverter.convert(obj.getConsensusParamUpdates()),
  	events = obj.getEventsList().map { EventJvmConverter.convert(it) },
  )

  public override fun convert(obj: ResponseEndBlock): Types.ResponseEndBlock {
    val builder = Types.ResponseEndBlock.newBuilder()
    builder.addAllValidatorUpdates(obj.validatorUpdates.map {
        ValidatorUpdateJvmConverter.convert(it) })
    builder.setConsensusParamUpdates(ConsensusParamsJvmConverter.convert(obj.consensusParamUpdates))
    builder.addAllEvents(obj.events.map { EventJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ResponseCommitJvmConverter : ProtobufTypeMapper<ResponseCommit, Types.ResponseCommit>
    {
  public override val descriptor: Descriptors.Descriptor = Types.ResponseCommit.getDescriptor()

  public override val parser: Parser<Types.ResponseCommit> = Types.ResponseCommit.parser()

  public override fun convert(obj: Types.ResponseCommit): ResponseCommit = ResponseCommit(
  	`data` = obj.getData().toByteArray(),
  	retainHeight = obj.getRetainHeight(),
  )

  public override fun convert(obj: ResponseCommit): Types.ResponseCommit {
    val builder = Types.ResponseCommit.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setRetainHeight(obj.retainHeight)
    return builder.build()
  }
}

public object ResponseListSnapshotsJvmConverter :
    ProtobufTypeMapper<ResponseListSnapshots, Types.ResponseListSnapshots> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseListSnapshots.getDescriptor()

  public override val parser: Parser<Types.ResponseListSnapshots> =
      Types.ResponseListSnapshots.parser()

  public override fun convert(obj: Types.ResponseListSnapshots): ResponseListSnapshots =
      ResponseListSnapshots(
  	snapshots = obj.getSnapshotsList().map { SnapshotJvmConverter.convert(it) },
  )

  public override fun convert(obj: ResponseListSnapshots): Types.ResponseListSnapshots {
    val builder = Types.ResponseListSnapshots.newBuilder()
    builder.addAllSnapshots(obj.snapshots.map { SnapshotJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ResponseOfferSnapshotJvmConverter :
    ProtobufTypeMapper<ResponseOfferSnapshot, Types.ResponseOfferSnapshot> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseOfferSnapshot.getDescriptor()

  public override val parser: Parser<Types.ResponseOfferSnapshot> =
      Types.ResponseOfferSnapshot.parser()

  public override fun convert(obj: Types.ResponseOfferSnapshot): ResponseOfferSnapshot =
      ResponseOfferSnapshot(
  	result = ResponseOfferSnapshot.Result.forNumber(obj.getResult().number),
  )

  public override fun convert(obj: ResponseOfferSnapshot): Types.ResponseOfferSnapshot {
    val builder = Types.ResponseOfferSnapshot.newBuilder()
    builder.setResult(Types.ResponseOfferSnapshot.Result.forNumber(obj.result.number))
    return builder.build()
  }
}

public object ResponseLoadSnapshotChunkJvmConverter :
    ProtobufTypeMapper<ResponseLoadSnapshotChunk, Types.ResponseLoadSnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseLoadSnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.ResponseLoadSnapshotChunk> =
      Types.ResponseLoadSnapshotChunk.parser()

  public override fun convert(obj: Types.ResponseLoadSnapshotChunk): ResponseLoadSnapshotChunk =
      ResponseLoadSnapshotChunk(
  	chunk = obj.getChunk().toByteArray(),
  )

  public override fun convert(obj: ResponseLoadSnapshotChunk): Types.ResponseLoadSnapshotChunk {
    val builder = Types.ResponseLoadSnapshotChunk.newBuilder()
    builder.setChunk(ByteString.copyFrom(obj.chunk))
    return builder.build()
  }
}

public object ResponseApplySnapshotChunkJvmConverter :
    ProtobufTypeMapper<ResponseApplySnapshotChunk, Types.ResponseApplySnapshotChunk> {
  public override val descriptor: Descriptors.Descriptor =
      Types.ResponseApplySnapshotChunk.getDescriptor()

  public override val parser: Parser<Types.ResponseApplySnapshotChunk> =
      Types.ResponseApplySnapshotChunk.parser()

  public override fun convert(obj: Types.ResponseApplySnapshotChunk): ResponseApplySnapshotChunk =
      ResponseApplySnapshotChunk(
  	result = ResponseApplySnapshotChunk.Result.forNumber(obj.getResult().number),
  	refetchChunks = obj.getRefetchChunksList().map { it.asKotlinType },
  	rejectSenders = obj.getRejectSendersList().map { it },
  )

  public override fun convert(obj: ResponseApplySnapshotChunk): Types.ResponseApplySnapshotChunk {
    val builder = Types.ResponseApplySnapshotChunk.newBuilder()
    builder.setResult(Types.ResponseApplySnapshotChunk.Result.forNumber(obj.result.number))
    builder.addAllRefetchChunks(obj.refetchChunks.map { it.asJavaType })
    builder.addAllRejectSenders(obj.rejectSenders.map { it })
    return builder.build()
  }
}

public object ConsensusParamsJvmConverter :
    ProtobufTypeMapper<ConsensusParams, Types.ConsensusParams> {
  public override val descriptor: Descriptors.Descriptor = Types.ConsensusParams.getDescriptor()

  public override val parser: Parser<Types.ConsensusParams> = Types.ConsensusParams.parser()

  public override fun convert(obj: Types.ConsensusParams): ConsensusParams = ConsensusParams(
  	block = BlockParamsJvmConverter.convert(obj.getBlock()),
  	evidence = EvidenceParamsJvmConverter.convert(obj.getEvidence()),
  	validator = ValidatorParamsJvmConverter.convert(obj.getValidator()),
  	version = VersionParamsJvmConverter.convert(obj.getVersion()),
  )

  public override fun convert(obj: ConsensusParams): Types.ConsensusParams {
    val builder = Types.ConsensusParams.newBuilder()
    builder.setBlock(BlockParamsJvmConverter.convert(obj.block))
    builder.setEvidence(EvidenceParamsJvmConverter.convert(obj.evidence))
    builder.setValidator(ValidatorParamsJvmConverter.convert(obj.validator))
    builder.setVersion(VersionParamsJvmConverter.convert(obj.version))
    return builder.build()
  }
}

public object BlockParamsJvmConverter : ProtobufTypeMapper<BlockParams, Types.BlockParams> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockParams.getDescriptor()

  public override val parser: Parser<Types.BlockParams> = Types.BlockParams.parser()

  public override fun convert(obj: Types.BlockParams): BlockParams = BlockParams(
  	maxBytes = obj.getMaxBytes(),
  	maxGas = obj.getMaxGas(),
  )

  public override fun convert(obj: BlockParams): Types.BlockParams {
    val builder = Types.BlockParams.newBuilder()
    builder.setMaxBytes(obj.maxBytes)
    builder.setMaxGas(obj.maxGas)
    return builder.build()
  }
}

public object LastCommitInfoJvmConverter : ProtobufTypeMapper<LastCommitInfo, Types.LastCommitInfo>
    {
  public override val descriptor: Descriptors.Descriptor = Types.LastCommitInfo.getDescriptor()

  public override val parser: Parser<Types.LastCommitInfo> = Types.LastCommitInfo.parser()

  public override fun convert(obj: Types.LastCommitInfo): LastCommitInfo = LastCommitInfo(
  	round = obj.getRound(),
  	votes = obj.getVotesList().map { VoteInfoJvmConverter.convert(it) },
  )

  public override fun convert(obj: LastCommitInfo): Types.LastCommitInfo {
    val builder = Types.LastCommitInfo.newBuilder()
    builder.setRound(obj.round)
    builder.addAllVotes(obj.votes.map { VoteInfoJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventJvmConverter : ProtobufTypeMapper<Event, Types.Event> {
  public override val descriptor: Descriptors.Descriptor = Types.Event.getDescriptor()

  public override val parser: Parser<Types.Event> = Types.Event.parser()

  public override fun convert(obj: Types.Event): Event = Event(
  	type = obj.getType(),
  	attributes = obj.getAttributesList().map { EventAttributeJvmConverter.convert(it) },
  )

  public override fun convert(obj: Event): Types.Event {
    val builder = Types.Event.newBuilder()
    builder.setType(obj.type)
    builder.addAllAttributes(obj.attributes.map { EventAttributeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventAttributeJvmConverter : ProtobufTypeMapper<EventAttribute, Types.EventAttribute>
    {
  public override val descriptor: Descriptors.Descriptor = Types.EventAttribute.getDescriptor()

  public override val parser: Parser<Types.EventAttribute> = Types.EventAttribute.parser()

  public override fun convert(obj: Types.EventAttribute): EventAttribute = EventAttribute(
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  	index = obj.getIndex(),
  )

  public override fun convert(obj: EventAttribute): Types.EventAttribute {
    val builder = Types.EventAttribute.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setIndex(obj.index)
    return builder.build()
  }
}

public object TxResultJvmConverter : ProtobufTypeMapper<TxResult, Types.TxResult> {
  public override val descriptor: Descriptors.Descriptor = Types.TxResult.getDescriptor()

  public override val parser: Parser<Types.TxResult> = Types.TxResult.parser()

  public override fun convert(obj: Types.TxResult): TxResult = TxResult(
  	height = obj.getHeight(),
  	index = obj.getIndex().asKotlinType,
  	tx = obj.getTx().toByteArray(),
  	result = ResponseDeliverTxJvmConverter.convert(obj.getResult()),
  )

  public override fun convert(obj: TxResult): Types.TxResult {
    val builder = Types.TxResult.newBuilder()
    builder.setHeight(obj.height)
    builder.setIndex(obj.index.asJavaType)
    builder.setTx(ByteString.copyFrom(obj.tx))
    builder.setResult(ResponseDeliverTxJvmConverter.convert(obj.result))
    return builder.build()
  }
}

public object ValidatorJvmConverter : ProtobufTypeMapper<Validator, Types.Validator> {
  public override val descriptor: Descriptors.Descriptor = Types.Validator.getDescriptor()

  public override val parser: Parser<Types.Validator> = Types.Validator.parser()

  public override fun convert(obj: Types.Validator): Validator = Validator(
  	address = obj.getAddress().toByteArray(),
  	power = obj.getPower(),
  )

  public override fun convert(obj: Validator): Types.Validator {
    val builder = Types.Validator.newBuilder()
    builder.setAddress(ByteString.copyFrom(obj.address))
    builder.setPower(obj.power)
    return builder.build()
  }
}

public object ValidatorUpdateJvmConverter :
    ProtobufTypeMapper<ValidatorUpdate, Types.ValidatorUpdate> {
  public override val descriptor: Descriptors.Descriptor = Types.ValidatorUpdate.getDescriptor()

  public override val parser: Parser<Types.ValidatorUpdate> = Types.ValidatorUpdate.parser()

  public override fun convert(obj: Types.ValidatorUpdate): ValidatorUpdate = ValidatorUpdate(
  	pubKey = PublicKeyJvmConverter.convert(obj.getPubKey()),
  	power = obj.getPower(),
  )

  public override fun convert(obj: ValidatorUpdate): Types.ValidatorUpdate {
    val builder = Types.ValidatorUpdate.newBuilder()
    builder.setPubKey(PublicKeyJvmConverter.convert(obj.pubKey))
    builder.setPower(obj.power)
    return builder.build()
  }
}

public object VoteInfoJvmConverter : ProtobufTypeMapper<VoteInfo, Types.VoteInfo> {
  public override val descriptor: Descriptors.Descriptor = Types.VoteInfo.getDescriptor()

  public override val parser: Parser<Types.VoteInfo> = Types.VoteInfo.parser()

  public override fun convert(obj: Types.VoteInfo): VoteInfo = VoteInfo(
  	validator = ValidatorJvmConverter.convert(obj.getValidator()),
  	signedLastBlock = obj.getSignedLastBlock(),
  )

  public override fun convert(obj: VoteInfo): Types.VoteInfo {
    val builder = Types.VoteInfo.newBuilder()
    builder.setValidator(ValidatorJvmConverter.convert(obj.validator))
    builder.setSignedLastBlock(obj.signedLastBlock)
    return builder.build()
  }
}

public object EvidenceJvmConverter : ProtobufTypeMapper<Evidence, Types.Evidence> {
  public override val descriptor: Descriptors.Descriptor = Types.Evidence.getDescriptor()

  public override val parser: Parser<Types.Evidence> = Types.Evidence.parser()

  public override fun convert(obj: Types.Evidence): Evidence = Evidence(
  	type = EvidenceType.forNumber(obj.getType().number),
  	validator = ValidatorJvmConverter.convert(obj.getValidator()),
  	height = obj.getHeight(),
  	time = TimestampJvmConverter.convert(obj.getTime()),
  	totalVotingPower = obj.getTotalVotingPower(),
  )

  public override fun convert(obj: Evidence): Types.Evidence {
    val builder = Types.Evidence.newBuilder()
    builder.setType(Types.EvidenceType.forNumber(obj.type.number))
    builder.setValidator(ValidatorJvmConverter.convert(obj.validator))
    builder.setHeight(obj.height)
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setTotalVotingPower(obj.totalVotingPower)
    return builder.build()
  }
}

public object SnapshotJvmConverter : ProtobufTypeMapper<Snapshot, Types.Snapshot> {
  public override val descriptor: Descriptors.Descriptor = Types.Snapshot.getDescriptor()

  public override val parser: Parser<Types.Snapshot> = Types.Snapshot.parser()

  public override fun convert(obj: Types.Snapshot): Snapshot = Snapshot(
  	height = obj.getHeight().asKotlinType,
  	format = obj.getFormat().asKotlinType,
  	chunks = obj.getChunks().asKotlinType,
  	hash = obj.getHash().toByteArray(),
  	metadata = obj.getMetadata().toByteArray(),
  )

  public override fun convert(obj: Snapshot): Types.Snapshot {
    val builder = Types.Snapshot.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunks(obj.chunks.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setMetadata(ByteString.copyFrom(obj.metadata))
    return builder.build()
  }
}

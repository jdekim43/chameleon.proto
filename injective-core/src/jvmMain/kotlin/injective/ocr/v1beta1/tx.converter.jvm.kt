// Transform from injective/ocr/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgCreateFeedJvmConverter : ProtobufTypeMapper<MsgCreateFeed, Tx.MsgCreateFeed> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateFeed.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateFeed> = Tx.MsgCreateFeed.parser()

  public override fun convert(obj: Tx.MsgCreateFeed): MsgCreateFeed = MsgCreateFeed(
  	sender = obj.getSender(),
  	config = FeedConfigJvmConverter.convert(obj.getConfig()),
  )

  public override fun convert(obj: MsgCreateFeed): Tx.MsgCreateFeed {
    val builder = Tx.MsgCreateFeed.newBuilder()
    builder.setSender(obj.sender)
    builder.setConfig(FeedConfigJvmConverter.convert(obj.config))
    return builder.build()
  }
}

public object MsgCreateFeedResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateFeedResponse, Tx.MsgCreateFeedResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateFeedResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateFeedResponse> = Tx.MsgCreateFeedResponse.parser()

  public override fun convert(obj: Tx.MsgCreateFeedResponse): MsgCreateFeedResponse =
      MsgCreateFeedResponse(
  )

  public override fun convert(obj: MsgCreateFeedResponse): Tx.MsgCreateFeedResponse {
    val builder = Tx.MsgCreateFeedResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateFeedJvmConverter : ProtobufTypeMapper<MsgUpdateFeed, Tx.MsgUpdateFeed> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateFeed.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateFeed> = Tx.MsgUpdateFeed.parser()

  public override fun convert(obj: Tx.MsgUpdateFeed): MsgUpdateFeed = MsgUpdateFeed(
  	sender = obj.getSender(),
  	feedId = obj.getFeedId(),
  	signers = obj.getSignersList().map { it },
  	transmitters = obj.getTransmittersList().map { it },
  	linkPerObservation = obj.getLinkPerObservation(),
  	linkPerTransmission = obj.getLinkPerTransmission(),
  	linkDenom = obj.getLinkDenom(),
  	feedAdmin = obj.getFeedAdmin(),
  	billingAdmin = obj.getBillingAdmin(),
  )

  public override fun convert(obj: MsgUpdateFeed): Tx.MsgUpdateFeed {
    val builder = Tx.MsgUpdateFeed.newBuilder()
    builder.setSender(obj.sender)
    builder.setFeedId(obj.feedId)
    builder.addAllSigners(obj.signers.map { it })
    builder.addAllTransmitters(obj.transmitters.map { it })
    builder.setLinkPerObservation(obj.linkPerObservation)
    builder.setLinkPerTransmission(obj.linkPerTransmission)
    builder.setLinkDenom(obj.linkDenom)
    builder.setFeedAdmin(obj.feedAdmin)
    builder.setBillingAdmin(obj.billingAdmin)
    return builder.build()
  }
}

public object MsgUpdateFeedResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateFeedResponse, Tx.MsgUpdateFeedResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateFeedResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateFeedResponse> = Tx.MsgUpdateFeedResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateFeedResponse): MsgUpdateFeedResponse =
      MsgUpdateFeedResponse(
  )

  public override fun convert(obj: MsgUpdateFeedResponse): Tx.MsgUpdateFeedResponse {
    val builder = Tx.MsgUpdateFeedResponse.newBuilder()
    return builder.build()
  }
}

public object MsgTransmitJvmConverter : ProtobufTypeMapper<MsgTransmit, Tx.MsgTransmit> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgTransmit.getDescriptor()

  public override val parser: Parser<Tx.MsgTransmit> = Tx.MsgTransmit.parser()

  public override fun convert(obj: Tx.MsgTransmit): MsgTransmit = MsgTransmit(
  	transmitter = obj.getTransmitter(),
  	configDigest = obj.getConfigDigest().toByteArray(),
  	feedId = obj.getFeedId(),
  	epoch = obj.getEpoch().asKotlinType,
  	round = obj.getRound().asKotlinType,
  	extraHash = obj.getExtraHash().toByteArray(),
  	report = ReportJvmConverter.convert(obj.getReport()),
  	signatures = obj.getSignaturesList().map { it.toByteArray() },
  )

  public override fun convert(obj: MsgTransmit): Tx.MsgTransmit {
    val builder = Tx.MsgTransmit.newBuilder()
    builder.setTransmitter(obj.transmitter)
    builder.setConfigDigest(ByteString.copyFrom(obj.configDigest))
    builder.setFeedId(obj.feedId)
    builder.setEpoch(obj.epoch.asJavaType)
    builder.setRound(obj.round.asJavaType)
    builder.setExtraHash(ByteString.copyFrom(obj.extraHash))
    builder.setReport(ReportJvmConverter.convert(obj.report))
    builder.addAllSignatures(obj.signatures.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object MsgTransmitResponseJvmConverter :
    ProtobufTypeMapper<MsgTransmitResponse, Tx.MsgTransmitResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgTransmitResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgTransmitResponse> = Tx.MsgTransmitResponse.parser()

  public override fun convert(obj: Tx.MsgTransmitResponse): MsgTransmitResponse =
      MsgTransmitResponse(
  )

  public override fun convert(obj: MsgTransmitResponse): Tx.MsgTransmitResponse {
    val builder = Tx.MsgTransmitResponse.newBuilder()
    return builder.build()
  }
}

public object MsgFundFeedRewardPoolJvmConverter :
    ProtobufTypeMapper<MsgFundFeedRewardPool, Tx.MsgFundFeedRewardPool> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgFundFeedRewardPool.getDescriptor()

  public override val parser: Parser<Tx.MsgFundFeedRewardPool> = Tx.MsgFundFeedRewardPool.parser()

  public override fun convert(obj: Tx.MsgFundFeedRewardPool): MsgFundFeedRewardPool =
      MsgFundFeedRewardPool(
  	sender = obj.getSender(),
  	feedId = obj.getFeedId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgFundFeedRewardPool): Tx.MsgFundFeedRewardPool {
    val builder = Tx.MsgFundFeedRewardPool.newBuilder()
    builder.setSender(obj.sender)
    builder.setFeedId(obj.feedId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgFundFeedRewardPoolResponseJvmConverter :
    ProtobufTypeMapper<MsgFundFeedRewardPoolResponse, Tx.MsgFundFeedRewardPoolResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgFundFeedRewardPoolResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgFundFeedRewardPoolResponse> =
      Tx.MsgFundFeedRewardPoolResponse.parser()

  public override fun convert(obj: Tx.MsgFundFeedRewardPoolResponse): MsgFundFeedRewardPoolResponse
      = MsgFundFeedRewardPoolResponse(
  )

  public override fun convert(obj: MsgFundFeedRewardPoolResponse):
      Tx.MsgFundFeedRewardPoolResponse {
    val builder = Tx.MsgFundFeedRewardPoolResponse.newBuilder()
    return builder.build()
  }
}

public object MsgWithdrawFeedRewardPoolJvmConverter :
    ProtobufTypeMapper<MsgWithdrawFeedRewardPool, Tx.MsgWithdrawFeedRewardPool> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawFeedRewardPool.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawFeedRewardPool> =
      Tx.MsgWithdrawFeedRewardPool.parser()

  public override fun convert(obj: Tx.MsgWithdrawFeedRewardPool): MsgWithdrawFeedRewardPool =
      MsgWithdrawFeedRewardPool(
  	sender = obj.getSender(),
  	feedId = obj.getFeedId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgWithdrawFeedRewardPool): Tx.MsgWithdrawFeedRewardPool {
    val builder = Tx.MsgWithdrawFeedRewardPool.newBuilder()
    builder.setSender(obj.sender)
    builder.setFeedId(obj.feedId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgWithdrawFeedRewardPoolResponseJvmConverter :
    ProtobufTypeMapper<MsgWithdrawFeedRewardPoolResponse, Tx.MsgWithdrawFeedRewardPoolResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgWithdrawFeedRewardPoolResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawFeedRewardPoolResponse> =
      Tx.MsgWithdrawFeedRewardPoolResponse.parser()

  public override fun convert(obj: Tx.MsgWithdrawFeedRewardPoolResponse):
      MsgWithdrawFeedRewardPoolResponse = MsgWithdrawFeedRewardPoolResponse(
  )

  public override fun convert(obj: MsgWithdrawFeedRewardPoolResponse):
      Tx.MsgWithdrawFeedRewardPoolResponse {
    val builder = Tx.MsgWithdrawFeedRewardPoolResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSetPayeesJvmConverter : ProtobufTypeMapper<MsgSetPayees, Tx.MsgSetPayees> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSetPayees.getDescriptor()

  public override val parser: Parser<Tx.MsgSetPayees> = Tx.MsgSetPayees.parser()

  public override fun convert(obj: Tx.MsgSetPayees): MsgSetPayees = MsgSetPayees(
  	sender = obj.getSender(),
  	feedId = obj.getFeedId(),
  	transmitters = obj.getTransmittersList().map { it },
  	payees = obj.getPayeesList().map { it },
  )

  public override fun convert(obj: MsgSetPayees): Tx.MsgSetPayees {
    val builder = Tx.MsgSetPayees.newBuilder()
    builder.setSender(obj.sender)
    builder.setFeedId(obj.feedId)
    builder.addAllTransmitters(obj.transmitters.map { it })
    builder.addAllPayees(obj.payees.map { it })
    return builder.build()
  }
}

public object MsgSetPayeesResponseJvmConverter :
    ProtobufTypeMapper<MsgSetPayeesResponse, Tx.MsgSetPayeesResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSetPayeesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSetPayeesResponse> = Tx.MsgSetPayeesResponse.parser()

  public override fun convert(obj: Tx.MsgSetPayeesResponse): MsgSetPayeesResponse =
      MsgSetPayeesResponse(
  )

  public override fun convert(obj: MsgSetPayeesResponse): Tx.MsgSetPayeesResponse {
    val builder = Tx.MsgSetPayeesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgTransferPayeeshipJvmConverter :
    ProtobufTypeMapper<MsgTransferPayeeship, Tx.MsgTransferPayeeship> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgTransferPayeeship.getDescriptor()

  public override val parser: Parser<Tx.MsgTransferPayeeship> = Tx.MsgTransferPayeeship.parser()

  public override fun convert(obj: Tx.MsgTransferPayeeship): MsgTransferPayeeship =
      MsgTransferPayeeship(
  	sender = obj.getSender(),
  	transmitter = obj.getTransmitter(),
  	feedId = obj.getFeedId(),
  	proposed = obj.getProposed(),
  )

  public override fun convert(obj: MsgTransferPayeeship): Tx.MsgTransferPayeeship {
    val builder = Tx.MsgTransferPayeeship.newBuilder()
    builder.setSender(obj.sender)
    builder.setTransmitter(obj.transmitter)
    builder.setFeedId(obj.feedId)
    builder.setProposed(obj.proposed)
    return builder.build()
  }
}

public object MsgTransferPayeeshipResponseJvmConverter :
    ProtobufTypeMapper<MsgTransferPayeeshipResponse, Tx.MsgTransferPayeeshipResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgTransferPayeeshipResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgTransferPayeeshipResponse> =
      Tx.MsgTransferPayeeshipResponse.parser()

  public override fun convert(obj: Tx.MsgTransferPayeeshipResponse): MsgTransferPayeeshipResponse =
      MsgTransferPayeeshipResponse(
  )

  public override fun convert(obj: MsgTransferPayeeshipResponse): Tx.MsgTransferPayeeshipResponse {
    val builder = Tx.MsgTransferPayeeshipResponse.newBuilder()
    return builder.build()
  }
}

public object MsgAcceptPayeeshipJvmConverter :
    ProtobufTypeMapper<MsgAcceptPayeeship, Tx.MsgAcceptPayeeship> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgAcceptPayeeship.getDescriptor()

  public override val parser: Parser<Tx.MsgAcceptPayeeship> = Tx.MsgAcceptPayeeship.parser()

  public override fun convert(obj: Tx.MsgAcceptPayeeship): MsgAcceptPayeeship = MsgAcceptPayeeship(
  	payee = obj.getPayee(),
  	transmitter = obj.getTransmitter(),
  	feedId = obj.getFeedId(),
  )

  public override fun convert(obj: MsgAcceptPayeeship): Tx.MsgAcceptPayeeship {
    val builder = Tx.MsgAcceptPayeeship.newBuilder()
    builder.setPayee(obj.payee)
    builder.setTransmitter(obj.transmitter)
    builder.setFeedId(obj.feedId)
    return builder.build()
  }
}

public object MsgAcceptPayeeshipResponseJvmConverter :
    ProtobufTypeMapper<MsgAcceptPayeeshipResponse, Tx.MsgAcceptPayeeshipResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAcceptPayeeshipResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgAcceptPayeeshipResponse> =
      Tx.MsgAcceptPayeeshipResponse.parser()

  public override fun convert(obj: Tx.MsgAcceptPayeeshipResponse): MsgAcceptPayeeshipResponse =
      MsgAcceptPayeeshipResponse(
  )

  public override fun convert(obj: MsgAcceptPayeeshipResponse): Tx.MsgAcceptPayeeshipResponse {
    val builder = Tx.MsgAcceptPayeeshipResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

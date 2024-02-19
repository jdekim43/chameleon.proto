// Transform from injective/ocr/v1beta1/query.proto
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

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryFeedConfigRequestJvmConverter :
    ProtobufTypeMapper<QueryFeedConfigRequest, QueryOuterClass.QueryFeedConfigRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeedConfigRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeedConfigRequest> =
      QueryOuterClass.QueryFeedConfigRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeedConfigRequest): QueryFeedConfigRequest =
      QueryFeedConfigRequest(
  	feedId = obj.getFeedId(),
  )

  public override fun convert(obj: QueryFeedConfigRequest): QueryOuterClass.QueryFeedConfigRequest {
    val builder = QueryOuterClass.QueryFeedConfigRequest.newBuilder()
    builder.setFeedId(obj.feedId)
    return builder.build()
  }
}

public object QueryFeedConfigResponseJvmConverter :
    ProtobufTypeMapper<QueryFeedConfigResponse, QueryOuterClass.QueryFeedConfigResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeedConfigResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeedConfigResponse> =
      QueryOuterClass.QueryFeedConfigResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeedConfigResponse): QueryFeedConfigResponse
      = QueryFeedConfigResponse(
  	feedConfigInfo = FeedConfigInfoJvmConverter.convert(obj.getFeedConfigInfo()),
  	feedConfig = FeedConfigJvmConverter.convert(obj.getFeedConfig()),
  )

  public override fun convert(obj: QueryFeedConfigResponse):
      QueryOuterClass.QueryFeedConfigResponse {
    val builder = QueryOuterClass.QueryFeedConfigResponse.newBuilder()
    builder.setFeedConfigInfo(FeedConfigInfoJvmConverter.convert(obj.feedConfigInfo))
    builder.setFeedConfig(FeedConfigJvmConverter.convert(obj.feedConfig))
    return builder.build()
  }
}

public object QueryFeedConfigInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryFeedConfigInfoRequest, QueryOuterClass.QueryFeedConfigInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeedConfigInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeedConfigInfoRequest> =
      QueryOuterClass.QueryFeedConfigInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeedConfigInfoRequest):
      QueryFeedConfigInfoRequest = QueryFeedConfigInfoRequest(
  	feedId = obj.getFeedId(),
  )

  public override fun convert(obj: QueryFeedConfigInfoRequest):
      QueryOuterClass.QueryFeedConfigInfoRequest {
    val builder = QueryOuterClass.QueryFeedConfigInfoRequest.newBuilder()
    builder.setFeedId(obj.feedId)
    return builder.build()
  }
}

public object QueryFeedConfigInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryFeedConfigInfoResponse, QueryOuterClass.QueryFeedConfigInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeedConfigInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeedConfigInfoResponse> =
      QueryOuterClass.QueryFeedConfigInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeedConfigInfoResponse):
      QueryFeedConfigInfoResponse = QueryFeedConfigInfoResponse(
  	feedConfigInfo = FeedConfigInfoJvmConverter.convert(obj.getFeedConfigInfo()),
  	epochAndRound = EpochAndRoundJvmConverter.convert(obj.getEpochAndRound()),
  )

  public override fun convert(obj: QueryFeedConfigInfoResponse):
      QueryOuterClass.QueryFeedConfigInfoResponse {
    val builder = QueryOuterClass.QueryFeedConfigInfoResponse.newBuilder()
    builder.setFeedConfigInfo(FeedConfigInfoJvmConverter.convert(obj.feedConfigInfo))
    builder.setEpochAndRound(EpochAndRoundJvmConverter.convert(obj.epochAndRound))
    return builder.build()
  }
}

public object QueryLatestRoundRequestJvmConverter :
    ProtobufTypeMapper<QueryLatestRoundRequest, QueryOuterClass.QueryLatestRoundRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLatestRoundRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLatestRoundRequest> =
      QueryOuterClass.QueryLatestRoundRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryLatestRoundRequest): QueryLatestRoundRequest
      = QueryLatestRoundRequest(
  	feedId = obj.getFeedId(),
  )

  public override fun convert(obj: QueryLatestRoundRequest):
      QueryOuterClass.QueryLatestRoundRequest {
    val builder = QueryOuterClass.QueryLatestRoundRequest.newBuilder()
    builder.setFeedId(obj.feedId)
    return builder.build()
  }
}

public object QueryLatestRoundResponseJvmConverter :
    ProtobufTypeMapper<QueryLatestRoundResponse, QueryOuterClass.QueryLatestRoundResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLatestRoundResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLatestRoundResponse> =
      QueryOuterClass.QueryLatestRoundResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryLatestRoundResponse):
      QueryLatestRoundResponse = QueryLatestRoundResponse(
  	latestRoundId = obj.getLatestRoundId().asKotlinType,
  	`data` = TransmissionJvmConverter.convert(obj.getData()),
  )

  public override fun convert(obj: QueryLatestRoundResponse):
      QueryOuterClass.QueryLatestRoundResponse {
    val builder = QueryOuterClass.QueryLatestRoundResponse.newBuilder()
    builder.setLatestRoundId(obj.latestRoundId.asJavaType)
    builder.setData(TransmissionJvmConverter.convert(obj.`data`))
    return builder.build()
  }
}

public object QueryLatestTransmissionDetailsRequestJvmConverter :
    ProtobufTypeMapper<QueryLatestTransmissionDetailsRequest, QueryOuterClass.QueryLatestTransmissionDetailsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLatestTransmissionDetailsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLatestTransmissionDetailsRequest> =
      QueryOuterClass.QueryLatestTransmissionDetailsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryLatestTransmissionDetailsRequest):
      QueryLatestTransmissionDetailsRequest = QueryLatestTransmissionDetailsRequest(
  	feedId = obj.getFeedId(),
  )

  public override fun convert(obj: QueryLatestTransmissionDetailsRequest):
      QueryOuterClass.QueryLatestTransmissionDetailsRequest {
    val builder = QueryOuterClass.QueryLatestTransmissionDetailsRequest.newBuilder()
    builder.setFeedId(obj.feedId)
    return builder.build()
  }
}

public object QueryLatestTransmissionDetailsResponseJvmConverter :
    ProtobufTypeMapper<QueryLatestTransmissionDetailsResponse, QueryOuterClass.QueryLatestTransmissionDetailsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLatestTransmissionDetailsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLatestTransmissionDetailsResponse> =
      QueryOuterClass.QueryLatestTransmissionDetailsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryLatestTransmissionDetailsResponse):
      QueryLatestTransmissionDetailsResponse = QueryLatestTransmissionDetailsResponse(
  	configDigest = obj.getConfigDigest().toByteArray(),
  	epochAndRound = EpochAndRoundJvmConverter.convert(obj.getEpochAndRound()),
  	`data` = TransmissionJvmConverter.convert(obj.getData()),
  )

  public override fun convert(obj: QueryLatestTransmissionDetailsResponse):
      QueryOuterClass.QueryLatestTransmissionDetailsResponse {
    val builder = QueryOuterClass.QueryLatestTransmissionDetailsResponse.newBuilder()
    builder.setConfigDigest(ByteString.copyFrom(obj.configDigest))
    builder.setEpochAndRound(EpochAndRoundJvmConverter.convert(obj.epochAndRound))
    builder.setData(TransmissionJvmConverter.convert(obj.`data`))
    return builder.build()
  }
}

public object QueryOwedAmountRequestJvmConverter :
    ProtobufTypeMapper<QueryOwedAmountRequest, QueryOuterClass.QueryOwedAmountRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOwedAmountRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOwedAmountRequest> =
      QueryOuterClass.QueryOwedAmountRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOwedAmountRequest): QueryOwedAmountRequest =
      QueryOwedAmountRequest(
  	transmitter = obj.getTransmitter(),
  )

  public override fun convert(obj: QueryOwedAmountRequest): QueryOuterClass.QueryOwedAmountRequest {
    val builder = QueryOuterClass.QueryOwedAmountRequest.newBuilder()
    builder.setTransmitter(obj.transmitter)
    return builder.build()
  }
}

public object QueryOwedAmountResponseJvmConverter :
    ProtobufTypeMapper<QueryOwedAmountResponse, QueryOuterClass.QueryOwedAmountResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOwedAmountResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOwedAmountResponse> =
      QueryOuterClass.QueryOwedAmountResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOwedAmountResponse): QueryOwedAmountResponse
      = QueryOwedAmountResponse(
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: QueryOwedAmountResponse):
      QueryOuterClass.QueryOwedAmountResponse {
    val builder = QueryOuterClass.QueryOwedAmountResponse.newBuilder()
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object QueryModuleStateRequestJvmConverter :
    ProtobufTypeMapper<QueryModuleStateRequest, QueryOuterClass.QueryModuleStateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateRequest> =
      QueryOuterClass.QueryModuleStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateRequest): QueryModuleStateRequest
      = QueryModuleStateRequest(
  )

  public override fun convert(obj: QueryModuleStateRequest):
      QueryOuterClass.QueryModuleStateRequest {
    val builder = QueryOuterClass.QueryModuleStateRequest.newBuilder()
    return builder.build()
  }
}

public object QueryModuleStateResponseJvmConverter :
    ProtobufTypeMapper<QueryModuleStateResponse, QueryOuterClass.QueryModuleStateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateResponse> =
      QueryOuterClass.QueryModuleStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateResponse):
      QueryModuleStateResponse = QueryModuleStateResponse(
  	state = GenesisStateJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QueryModuleStateResponse):
      QueryOuterClass.QueryModuleStateResponse {
    val builder = QueryOuterClass.QueryModuleStateResponse.newBuilder()
    builder.setState(GenesisStateJvmConverter.convert(obj.state))
    return builder.build()
  }
}

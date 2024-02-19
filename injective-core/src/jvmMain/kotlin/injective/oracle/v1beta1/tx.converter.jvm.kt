// Transform from injective/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgRelayProviderPricesJvmConverter :
    ProtobufTypeMapper<MsgRelayProviderPrices, Tx.MsgRelayProviderPrices> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRelayProviderPrices.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayProviderPrices> = Tx.MsgRelayProviderPrices.parser()

  public override fun convert(obj: Tx.MsgRelayProviderPrices): MsgRelayProviderPrices =
      MsgRelayProviderPrices(
  	sender = obj.getSender(),
  	provider = obj.getProvider(),
  	symbols = obj.getSymbolsList().map { it },
  	prices = obj.getPricesList().map { it },
  )

  public override fun convert(obj: MsgRelayProviderPrices): Tx.MsgRelayProviderPrices {
    val builder = Tx.MsgRelayProviderPrices.newBuilder()
    builder.setSender(obj.sender)
    builder.setProvider(obj.provider)
    builder.addAllSymbols(obj.symbols.map { it })
    builder.addAllPrices(obj.prices.map { it })
    return builder.build()
  }
}

public object MsgRelayProviderPricesResponseJvmConverter :
    ProtobufTypeMapper<MsgRelayProviderPricesResponse, Tx.MsgRelayProviderPricesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRelayProviderPricesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayProviderPricesResponse> =
      Tx.MsgRelayProviderPricesResponse.parser()

  public override fun convert(obj: Tx.MsgRelayProviderPricesResponse):
      MsgRelayProviderPricesResponse = MsgRelayProviderPricesResponse(
  )

  public override fun convert(obj: MsgRelayProviderPricesResponse):
      Tx.MsgRelayProviderPricesResponse {
    val builder = Tx.MsgRelayProviderPricesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRelayPriceFeedPriceJvmConverter :
    ProtobufTypeMapper<MsgRelayPriceFeedPrice, Tx.MsgRelayPriceFeedPrice> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRelayPriceFeedPrice.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayPriceFeedPrice> = Tx.MsgRelayPriceFeedPrice.parser()

  public override fun convert(obj: Tx.MsgRelayPriceFeedPrice): MsgRelayPriceFeedPrice =
      MsgRelayPriceFeedPrice(
  	sender = obj.getSender(),
  	base = obj.getBaseList().map { it },
  	quote = obj.getQuoteList().map { it },
  	price = obj.getPriceList().map { it },
  )

  public override fun convert(obj: MsgRelayPriceFeedPrice): Tx.MsgRelayPriceFeedPrice {
    val builder = Tx.MsgRelayPriceFeedPrice.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllBase(obj.base.map { it })
    builder.addAllQuote(obj.quote.map { it })
    builder.addAllPrice(obj.price.map { it })
    return builder.build()
  }
}

public object MsgRelayPriceFeedPriceResponseJvmConverter :
    ProtobufTypeMapper<MsgRelayPriceFeedPriceResponse, Tx.MsgRelayPriceFeedPriceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRelayPriceFeedPriceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayPriceFeedPriceResponse> =
      Tx.MsgRelayPriceFeedPriceResponse.parser()

  public override fun convert(obj: Tx.MsgRelayPriceFeedPriceResponse):
      MsgRelayPriceFeedPriceResponse = MsgRelayPriceFeedPriceResponse(
  )

  public override fun convert(obj: MsgRelayPriceFeedPriceResponse):
      Tx.MsgRelayPriceFeedPriceResponse {
    val builder = Tx.MsgRelayPriceFeedPriceResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRelayBandRatesJvmConverter :
    ProtobufTypeMapper<MsgRelayBandRates, Tx.MsgRelayBandRates> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRelayBandRates.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayBandRates> = Tx.MsgRelayBandRates.parser()

  public override fun convert(obj: Tx.MsgRelayBandRates): MsgRelayBandRates = MsgRelayBandRates(
  	relayer = obj.getRelayer(),
  	symbols = obj.getSymbolsList().map { it },
  	rates = obj.getRatesList().map { it.asKotlinType },
  	resolveTimes = obj.getResolveTimesList().map { it.asKotlinType },
  	requestIDs = obj.getRequestIDsList().map { it.asKotlinType },
  )

  public override fun convert(obj: MsgRelayBandRates): Tx.MsgRelayBandRates {
    val builder = Tx.MsgRelayBandRates.newBuilder()
    builder.setRelayer(obj.relayer)
    builder.addAllSymbols(obj.symbols.map { it })
    builder.addAllRates(obj.rates.map { it.asJavaType })
    builder.addAllResolveTimes(obj.resolveTimes.map { it.asJavaType })
    builder.addAllRequestIDs(obj.requestIDs.map { it.asJavaType })
    return builder.build()
  }
}

public object MsgRelayBandRatesResponseJvmConverter :
    ProtobufTypeMapper<MsgRelayBandRatesResponse, Tx.MsgRelayBandRatesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRelayBandRatesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayBandRatesResponse> =
      Tx.MsgRelayBandRatesResponse.parser()

  public override fun convert(obj: Tx.MsgRelayBandRatesResponse): MsgRelayBandRatesResponse =
      MsgRelayBandRatesResponse(
  )

  public override fun convert(obj: MsgRelayBandRatesResponse): Tx.MsgRelayBandRatesResponse {
    val builder = Tx.MsgRelayBandRatesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRelayCoinbaseMessagesJvmConverter :
    ProtobufTypeMapper<MsgRelayCoinbaseMessages, Tx.MsgRelayCoinbaseMessages> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRelayCoinbaseMessages.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayCoinbaseMessages> =
      Tx.MsgRelayCoinbaseMessages.parser()

  public override fun convert(obj: Tx.MsgRelayCoinbaseMessages): MsgRelayCoinbaseMessages =
      MsgRelayCoinbaseMessages(
  	sender = obj.getSender(),
  	messages = obj.getMessagesList().map { it.toByteArray() },
  	signatures = obj.getSignaturesList().map { it.toByteArray() },
  )

  public override fun convert(obj: MsgRelayCoinbaseMessages): Tx.MsgRelayCoinbaseMessages {
    val builder = Tx.MsgRelayCoinbaseMessages.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllMessages(obj.messages.map { ByteString.copyFrom(it) })
    builder.addAllSignatures(obj.signatures.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object MsgRelayCoinbaseMessagesResponseJvmConverter :
    ProtobufTypeMapper<MsgRelayCoinbaseMessagesResponse, Tx.MsgRelayCoinbaseMessagesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRelayCoinbaseMessagesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayCoinbaseMessagesResponse> =
      Tx.MsgRelayCoinbaseMessagesResponse.parser()

  public override fun convert(obj: Tx.MsgRelayCoinbaseMessagesResponse):
      MsgRelayCoinbaseMessagesResponse = MsgRelayCoinbaseMessagesResponse(
  )

  public override fun convert(obj: MsgRelayCoinbaseMessagesResponse):
      Tx.MsgRelayCoinbaseMessagesResponse {
    val builder = Tx.MsgRelayCoinbaseMessagesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRequestBandIBCRatesJvmConverter :
    ProtobufTypeMapper<MsgRequestBandIBCRates, Tx.MsgRequestBandIBCRates> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRequestBandIBCRates.getDescriptor()

  public override val parser: Parser<Tx.MsgRequestBandIBCRates> = Tx.MsgRequestBandIBCRates.parser()

  public override fun convert(obj: Tx.MsgRequestBandIBCRates): MsgRequestBandIBCRates =
      MsgRequestBandIBCRates(
  	sender = obj.getSender(),
  	requestId = obj.getRequestId().asKotlinType,
  )

  public override fun convert(obj: MsgRequestBandIBCRates): Tx.MsgRequestBandIBCRates {
    val builder = Tx.MsgRequestBandIBCRates.newBuilder()
    builder.setSender(obj.sender)
    builder.setRequestId(obj.requestId.asJavaType)
    return builder.build()
  }
}

public object MsgRequestBandIBCRatesResponseJvmConverter :
    ProtobufTypeMapper<MsgRequestBandIBCRatesResponse, Tx.MsgRequestBandIBCRatesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRequestBandIBCRatesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRequestBandIBCRatesResponse> =
      Tx.MsgRequestBandIBCRatesResponse.parser()

  public override fun convert(obj: Tx.MsgRequestBandIBCRatesResponse):
      MsgRequestBandIBCRatesResponse = MsgRequestBandIBCRatesResponse(
  )

  public override fun convert(obj: MsgRequestBandIBCRatesResponse):
      Tx.MsgRequestBandIBCRatesResponse {
    val builder = Tx.MsgRequestBandIBCRatesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRelayPythPricesJvmConverter :
    ProtobufTypeMapper<MsgRelayPythPrices, Tx.MsgRelayPythPrices> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRelayPythPrices.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayPythPrices> = Tx.MsgRelayPythPrices.parser()

  public override fun convert(obj: Tx.MsgRelayPythPrices): MsgRelayPythPrices = MsgRelayPythPrices(
  	sender = obj.getSender(),
  	priceAttestations = obj.getPriceAttestationsList().map { PriceAttestationJvmConverter.convert(it)
      },
  )

  public override fun convert(obj: MsgRelayPythPrices): Tx.MsgRelayPythPrices {
    val builder = Tx.MsgRelayPythPrices.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllPriceAttestations(obj.priceAttestations.map {
        PriceAttestationJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgRelayPythPricesResponseJvmConverter :
    ProtobufTypeMapper<MsgRelayPythPricesResponse, Tx.MsgRelayPythPricesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRelayPythPricesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRelayPythPricesResponse> =
      Tx.MsgRelayPythPricesResponse.parser()

  public override fun convert(obj: Tx.MsgRelayPythPricesResponse): MsgRelayPythPricesResponse =
      MsgRelayPythPricesResponse(
  )

  public override fun convert(obj: MsgRelayPythPricesResponse): Tx.MsgRelayPythPricesResponse {
    val builder = Tx.MsgRelayPythPricesResponse.newBuilder()
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

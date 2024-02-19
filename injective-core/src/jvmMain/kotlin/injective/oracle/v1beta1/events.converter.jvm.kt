// Transform from injective/oracle/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SetChainlinkPriceEventJvmConverter :
    ProtobufTypeMapper<SetChainlinkPriceEvent, Events.SetChainlinkPriceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.SetChainlinkPriceEvent.getDescriptor()

  public override val parser: Parser<Events.SetChainlinkPriceEvent> =
      Events.SetChainlinkPriceEvent.parser()

  public override fun convert(obj: Events.SetChainlinkPriceEvent): SetChainlinkPriceEvent =
      SetChainlinkPriceEvent(
  	feedId = obj.getFeedId(),
  	answer = obj.getAnswer(),
  	timestamp = obj.getTimestamp().asKotlinType,
  )

  public override fun convert(obj: SetChainlinkPriceEvent): Events.SetChainlinkPriceEvent {
    val builder = Events.SetChainlinkPriceEvent.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setAnswer(obj.answer)
    builder.setTimestamp(obj.timestamp.asJavaType)
    return builder.build()
  }
}

public object SetBandPriceEventJvmConverter :
    ProtobufTypeMapper<SetBandPriceEvent, Events.SetBandPriceEvent> {
  public override val descriptor: Descriptors.Descriptor = Events.SetBandPriceEvent.getDescriptor()

  public override val parser: Parser<Events.SetBandPriceEvent> = Events.SetBandPriceEvent.parser()

  public override fun convert(obj: Events.SetBandPriceEvent): SetBandPriceEvent = SetBandPriceEvent(
  	relayer = obj.getRelayer(),
  	symbol = obj.getSymbol(),
  	price = obj.getPrice(),
  	resolveTime = obj.getResolveTime().asKotlinType,
  	requestId = obj.getRequestId().asKotlinType,
  )

  public override fun convert(obj: SetBandPriceEvent): Events.SetBandPriceEvent {
    val builder = Events.SetBandPriceEvent.newBuilder()
    builder.setRelayer(obj.relayer)
    builder.setSymbol(obj.symbol)
    builder.setPrice(obj.price)
    builder.setResolveTime(obj.resolveTime.asJavaType)
    builder.setRequestId(obj.requestId.asJavaType)
    return builder.build()
  }
}

public object SetBandIBCPriceEventJvmConverter :
    ProtobufTypeMapper<SetBandIBCPriceEvent, Events.SetBandIBCPriceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.SetBandIBCPriceEvent.getDescriptor()

  public override val parser: Parser<Events.SetBandIBCPriceEvent> =
      Events.SetBandIBCPriceEvent.parser()

  public override fun convert(obj: Events.SetBandIBCPriceEvent): SetBandIBCPriceEvent =
      SetBandIBCPriceEvent(
  	relayer = obj.getRelayer(),
  	symbols = obj.getSymbolsList().map { it },
  	prices = obj.getPricesList().map { it },
  	resolveTime = obj.getResolveTime().asKotlinType,
  	requestId = obj.getRequestId().asKotlinType,
  	clientId = obj.getClientId(),
  )

  public override fun convert(obj: SetBandIBCPriceEvent): Events.SetBandIBCPriceEvent {
    val builder = Events.SetBandIBCPriceEvent.newBuilder()
    builder.setRelayer(obj.relayer)
    builder.addAllSymbols(obj.symbols.map { it })
    builder.addAllPrices(obj.prices.map { it })
    builder.setResolveTime(obj.resolveTime.asJavaType)
    builder.setRequestId(obj.requestId.asJavaType)
    builder.setClientId(obj.clientId)
    return builder.build()
  }
}

public object EventBandIBCAckSuccessJvmConverter :
    ProtobufTypeMapper<EventBandIBCAckSuccess, Events.EventBandIBCAckSuccess> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBandIBCAckSuccess.getDescriptor()

  public override val parser: Parser<Events.EventBandIBCAckSuccess> =
      Events.EventBandIBCAckSuccess.parser()

  public override fun convert(obj: Events.EventBandIBCAckSuccess): EventBandIBCAckSuccess =
      EventBandIBCAckSuccess(
  	ackResult = obj.getAckResult(),
  	clientId = obj.getClientId(),
  )

  public override fun convert(obj: EventBandIBCAckSuccess): Events.EventBandIBCAckSuccess {
    val builder = Events.EventBandIBCAckSuccess.newBuilder()
    builder.setAckResult(obj.ackResult)
    builder.setClientId(obj.clientId)
    return builder.build()
  }
}

public object EventBandIBCAckErrorJvmConverter :
    ProtobufTypeMapper<EventBandIBCAckError, Events.EventBandIBCAckError> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBandIBCAckError.getDescriptor()

  public override val parser: Parser<Events.EventBandIBCAckError> =
      Events.EventBandIBCAckError.parser()

  public override fun convert(obj: Events.EventBandIBCAckError): EventBandIBCAckError =
      EventBandIBCAckError(
  	ackError = obj.getAckError(),
  	clientId = obj.getClientId(),
  )

  public override fun convert(obj: EventBandIBCAckError): Events.EventBandIBCAckError {
    val builder = Events.EventBandIBCAckError.newBuilder()
    builder.setAckError(obj.ackError)
    builder.setClientId(obj.clientId)
    return builder.build()
  }
}

public object EventBandIBCResponseTimeoutJvmConverter :
    ProtobufTypeMapper<EventBandIBCResponseTimeout, Events.EventBandIBCResponseTimeout> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBandIBCResponseTimeout.getDescriptor()

  public override val parser: Parser<Events.EventBandIBCResponseTimeout> =
      Events.EventBandIBCResponseTimeout.parser()

  public override fun convert(obj: Events.EventBandIBCResponseTimeout): EventBandIBCResponseTimeout
      = EventBandIBCResponseTimeout(
  	clientId = obj.getClientId(),
  )

  public override fun convert(obj: EventBandIBCResponseTimeout):
      Events.EventBandIBCResponseTimeout {
    val builder = Events.EventBandIBCResponseTimeout.newBuilder()
    builder.setClientId(obj.clientId)
    return builder.build()
  }
}

public object SetPriceFeedPriceEventJvmConverter :
    ProtobufTypeMapper<SetPriceFeedPriceEvent, Events.SetPriceFeedPriceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.SetPriceFeedPriceEvent.getDescriptor()

  public override val parser: Parser<Events.SetPriceFeedPriceEvent> =
      Events.SetPriceFeedPriceEvent.parser()

  public override fun convert(obj: Events.SetPriceFeedPriceEvent): SetPriceFeedPriceEvent =
      SetPriceFeedPriceEvent(
  	relayer = obj.getRelayer(),
  	base = obj.getBase(),
  	quote = obj.getQuote(),
  	price = obj.getPrice(),
  )

  public override fun convert(obj: SetPriceFeedPriceEvent): Events.SetPriceFeedPriceEvent {
    val builder = Events.SetPriceFeedPriceEvent.newBuilder()
    builder.setRelayer(obj.relayer)
    builder.setBase(obj.base)
    builder.setQuote(obj.quote)
    builder.setPrice(obj.price)
    return builder.build()
  }
}

public object SetProviderPriceEventJvmConverter :
    ProtobufTypeMapper<SetProviderPriceEvent, Events.SetProviderPriceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.SetProviderPriceEvent.getDescriptor()

  public override val parser: Parser<Events.SetProviderPriceEvent> =
      Events.SetProviderPriceEvent.parser()

  public override fun convert(obj: Events.SetProviderPriceEvent): SetProviderPriceEvent =
      SetProviderPriceEvent(
  	provider = obj.getProvider(),
  	relayer = obj.getRelayer(),
  	symbol = obj.getSymbol(),
  	price = obj.getPrice(),
  )

  public override fun convert(obj: SetProviderPriceEvent): Events.SetProviderPriceEvent {
    val builder = Events.SetProviderPriceEvent.newBuilder()
    builder.setProvider(obj.provider)
    builder.setRelayer(obj.relayer)
    builder.setSymbol(obj.symbol)
    builder.setPrice(obj.price)
    return builder.build()
  }
}

public object SetCoinbasePriceEventJvmConverter :
    ProtobufTypeMapper<SetCoinbasePriceEvent, Events.SetCoinbasePriceEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Events.SetCoinbasePriceEvent.getDescriptor()

  public override val parser: Parser<Events.SetCoinbasePriceEvent> =
      Events.SetCoinbasePriceEvent.parser()

  public override fun convert(obj: Events.SetCoinbasePriceEvent): SetCoinbasePriceEvent =
      SetCoinbasePriceEvent(
  	symbol = obj.getSymbol(),
  	price = obj.getPrice(),
  	timestamp = obj.getTimestamp().asKotlinType,
  )

  public override fun convert(obj: SetCoinbasePriceEvent): Events.SetCoinbasePriceEvent {
    val builder = Events.SetCoinbasePriceEvent.newBuilder()
    builder.setSymbol(obj.symbol)
    builder.setPrice(obj.price)
    builder.setTimestamp(obj.timestamp.asJavaType)
    return builder.build()
  }
}

public object EventSetPythPricesJvmConverter :
    ProtobufTypeMapper<EventSetPythPrices, Events.EventSetPythPrices> {
  public override val descriptor: Descriptors.Descriptor = Events.EventSetPythPrices.getDescriptor()

  public override val parser: Parser<Events.EventSetPythPrices> = Events.EventSetPythPrices.parser()

  public override fun convert(obj: Events.EventSetPythPrices): EventSetPythPrices =
      EventSetPythPrices(
  	prices = obj.getPricesList().map { PythPriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventSetPythPrices): Events.EventSetPythPrices {
    val builder = Events.EventSetPythPrices.newBuilder()
    builder.addAllPrices(obj.prices.map { PythPriceStateJvmConverter.convert(it) })
    return builder.build()
  }
}

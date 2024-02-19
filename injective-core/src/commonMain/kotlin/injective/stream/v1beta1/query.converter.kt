// Transform from injective/stream/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object StreamRequestConverter : ProtobufConverter<StreamRequest>

public fun StreamRequest.toAny(): Any = Any(StreamRequest.TYPE_URL, with(StreamRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StreamRequest>): StreamRequest {
  if (typeUrl != StreamRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StreamResponseConverter : ProtobufConverter<StreamResponse>

public fun StreamResponse.toAny(): Any = Any(StreamResponse.TYPE_URL, with(StreamResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StreamResponse>): StreamResponse {
  if (typeUrl != StreamResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderbookUpdateConverter : ProtobufConverter<OrderbookUpdate>

public fun OrderbookUpdate.toAny(): Any = Any(OrderbookUpdate.TYPE_URL,
    with(OrderbookUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OrderbookUpdate>): OrderbookUpdate {
  if (typeUrl != OrderbookUpdate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderbookConverter : ProtobufConverter<Orderbook>

public fun Orderbook.toAny(): Any = Any(Orderbook.TYPE_URL, with(OrderbookConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Orderbook>): Orderbook {
  if (typeUrl != Orderbook.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BankBalanceConverter : ProtobufConverter<BankBalance>

public fun BankBalance.toAny(): Any = Any(BankBalance.TYPE_URL, with(BankBalanceConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BankBalance>): BankBalance {
  if (typeUrl != BankBalance.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountDepositsConverter : ProtobufConverter<SubaccountDeposits>

public fun SubaccountDeposits.toAny(): Any = Any(SubaccountDeposits.TYPE_URL,
    with(SubaccountDepositsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountDeposits>): SubaccountDeposits {
  if (typeUrl != SubaccountDeposits.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountDepositConverter : ProtobufConverter<SubaccountDeposit>

public fun SubaccountDeposit.toAny(): Any = Any(SubaccountDeposit.TYPE_URL,
    with(SubaccountDepositConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountDeposit>): SubaccountDeposit {
  if (typeUrl != SubaccountDeposit.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotOrderUpdateConverter : ProtobufConverter<SpotOrderUpdate>

public fun SpotOrderUpdate.toAny(): Any = Any(SpotOrderUpdate.TYPE_URL,
    with(SpotOrderUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotOrderUpdate>): SpotOrderUpdate {
  if (typeUrl != SpotOrderUpdate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotOrderConverter : ProtobufConverter<SpotOrder>

public fun SpotOrder.toAny(): Any = Any(SpotOrder.TYPE_URL, with(SpotOrderConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<SpotOrder>): SpotOrder {
  if (typeUrl != SpotOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeOrderUpdateConverter : ProtobufConverter<DerivativeOrderUpdate>

public fun DerivativeOrderUpdate.toAny(): Any = Any(DerivativeOrderUpdate.TYPE_URL,
    with(DerivativeOrderUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeOrderUpdate>): DerivativeOrderUpdate {
  if (typeUrl != DerivativeOrderUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeOrderConverter : ProtobufConverter<DerivativeOrder>

public fun DerivativeOrder.toAny(): Any = Any(DerivativeOrder.TYPE_URL,
    with(DerivativeOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeOrder>): DerivativeOrder {
  if (typeUrl != DerivativeOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PositionConverter : ProtobufConverter<Position>

public fun Position.toAny(): Any = Any(Position.TYPE_URL, with(PositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Position>): Position {
  if (typeUrl != Position.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OraclePriceConverter : ProtobufConverter<OraclePrice>

public fun OraclePrice.toAny(): Any = Any(OraclePrice.TYPE_URL, with(OraclePriceConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OraclePrice>): OraclePrice {
  if (typeUrl != OraclePrice.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotTradeConverter : ProtobufConverter<SpotTrade>

public fun SpotTrade.toAny(): Any = Any(SpotTrade.TYPE_URL, with(SpotTradeConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<SpotTrade>): SpotTrade {
  if (typeUrl != SpotTrade.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeTradeConverter : ProtobufConverter<DerivativeTrade>

public fun DerivativeTrade.toAny(): Any = Any(DerivativeTrade.TYPE_URL,
    with(DerivativeTradeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeTrade>): DerivativeTrade {
  if (typeUrl != DerivativeTrade.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradesFilterConverter : ProtobufConverter<TradesFilter>

public fun TradesFilter.toAny(): Any = Any(TradesFilter.TYPE_URL, with(TradesFilterConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradesFilter>): TradesFilter {
  if (typeUrl != TradesFilter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PositionsFilterConverter : ProtobufConverter<PositionsFilter>

public fun PositionsFilter.toAny(): Any = Any(PositionsFilter.TYPE_URL,
    with(PositionsFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PositionsFilter>): PositionsFilter {
  if (typeUrl != PositionsFilter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrdersFilterConverter : ProtobufConverter<OrdersFilter>

public fun OrdersFilter.toAny(): Any = Any(OrdersFilter.TYPE_URL, with(OrdersFilterConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OrdersFilter>): OrdersFilter {
  if (typeUrl != OrdersFilter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderbookFilterConverter : ProtobufConverter<OrderbookFilter>

public fun OrderbookFilter.toAny(): Any = Any(OrderbookFilter.TYPE_URL,
    with(OrderbookFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OrderbookFilter>): OrderbookFilter {
  if (typeUrl != OrderbookFilter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BankBalancesFilterConverter : ProtobufConverter<BankBalancesFilter>

public fun BankBalancesFilter.toAny(): Any = Any(BankBalancesFilter.TYPE_URL,
    with(BankBalancesFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BankBalancesFilter>): BankBalancesFilter {
  if (typeUrl != BankBalancesFilter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountDepositsFilterConverter : ProtobufConverter<SubaccountDepositsFilter>

public fun SubaccountDepositsFilter.toAny(): Any = Any(SubaccountDepositsFilter.TYPE_URL,
    with(SubaccountDepositsFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountDepositsFilter>):
    SubaccountDepositsFilter {
  if (typeUrl != SubaccountDepositsFilter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OraclePriceFilterConverter : ProtobufConverter<OraclePriceFilter>

public fun OraclePriceFilter.toAny(): Any = Any(OraclePriceFilter.TYPE_URL,
    with(OraclePriceFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OraclePriceFilter>): OraclePriceFilter {
  if (typeUrl != OraclePriceFilter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

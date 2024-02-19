// Transform from injective/stream/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object StreamRequestConverter : ProtobufConverter<StreamRequest> by
    StreamRequestJvmConverter

public actual object StreamResponseConverter : ProtobufConverter<StreamResponse> by
    StreamResponseJvmConverter

public actual object OrderbookUpdateConverter : ProtobufConverter<OrderbookUpdate> by
    OrderbookUpdateJvmConverter

public actual object OrderbookConverter : ProtobufConverter<Orderbook> by OrderbookJvmConverter

public actual object BankBalanceConverter : ProtobufConverter<BankBalance> by
    BankBalanceJvmConverter

public actual object SubaccountDepositsConverter : ProtobufConverter<SubaccountDeposits> by
    SubaccountDepositsJvmConverter

public actual object SubaccountDepositConverter : ProtobufConverter<SubaccountDeposit> by
    SubaccountDepositJvmConverter

public actual object SpotOrderUpdateConverter : ProtobufConverter<SpotOrderUpdate> by
    SpotOrderUpdateJvmConverter

public actual object SpotOrderConverter : ProtobufConverter<SpotOrder> by SpotOrderJvmConverter

public actual object DerivativeOrderUpdateConverter : ProtobufConverter<DerivativeOrderUpdate> by
    DerivativeOrderUpdateJvmConverter

public actual object DerivativeOrderConverter : ProtobufConverter<DerivativeOrder> by
    DerivativeOrderJvmConverter

public actual object PositionConverter : ProtobufConverter<Position> by PositionJvmConverter

public actual object OraclePriceConverter : ProtobufConverter<OraclePrice> by
    OraclePriceJvmConverter

public actual object SpotTradeConverter : ProtobufConverter<SpotTrade> by SpotTradeJvmConverter

public actual object DerivativeTradeConverter : ProtobufConverter<DerivativeTrade> by
    DerivativeTradeJvmConverter

public actual object TradesFilterConverter : ProtobufConverter<TradesFilter> by
    TradesFilterJvmConverter

public actual object PositionsFilterConverter : ProtobufConverter<PositionsFilter> by
    PositionsFilterJvmConverter

public actual object OrdersFilterConverter : ProtobufConverter<OrdersFilter> by
    OrdersFilterJvmConverter

public actual object OrderbookFilterConverter : ProtobufConverter<OrderbookFilter> by
    OrderbookFilterJvmConverter

public actual object BankBalancesFilterConverter : ProtobufConverter<BankBalancesFilter> by
    BankBalancesFilterJvmConverter

public actual object SubaccountDepositsFilterConverter : ProtobufConverter<SubaccountDepositsFilter>
    by SubaccountDepositsFilterJvmConverter

public actual object OraclePriceFilterConverter : ProtobufConverter<OraclePriceFilter> by
    OraclePriceFilterJvmConverter

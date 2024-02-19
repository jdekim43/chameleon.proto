// Transform from injective/exchange/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object CreateSpotLimitOrderAuthzConverter :
    ProtobufConverter<CreateSpotLimitOrderAuthz>

public fun CreateSpotLimitOrderAuthz.toAny(): Any = Any(CreateSpotLimitOrderAuthz.TYPE_URL,
    with(CreateSpotLimitOrderAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CreateSpotLimitOrderAuthz>):
    CreateSpotLimitOrderAuthz {
  if (typeUrl != CreateSpotLimitOrderAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CreateSpotMarketOrderAuthzConverter :
    ProtobufConverter<CreateSpotMarketOrderAuthz>

public fun CreateSpotMarketOrderAuthz.toAny(): Any = Any(CreateSpotMarketOrderAuthz.TYPE_URL,
    with(CreateSpotMarketOrderAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CreateSpotMarketOrderAuthz>):
    CreateSpotMarketOrderAuthz {
  if (typeUrl != CreateSpotMarketOrderAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchCreateSpotLimitOrdersAuthzConverter :
    ProtobufConverter<BatchCreateSpotLimitOrdersAuthz>

public fun BatchCreateSpotLimitOrdersAuthz.toAny(): Any =
    Any(BatchCreateSpotLimitOrdersAuthz.TYPE_URL, with(BatchCreateSpotLimitOrdersAuthzConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchCreateSpotLimitOrdersAuthz>):
    BatchCreateSpotLimitOrdersAuthz {
  if (typeUrl != BatchCreateSpotLimitOrdersAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CancelSpotOrderAuthzConverter : ProtobufConverter<CancelSpotOrderAuthz>

public fun CancelSpotOrderAuthz.toAny(): Any = Any(CancelSpotOrderAuthz.TYPE_URL,
    with(CancelSpotOrderAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CancelSpotOrderAuthz>): CancelSpotOrderAuthz {
  if (typeUrl != CancelSpotOrderAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchCancelSpotOrdersAuthzConverter :
    ProtobufConverter<BatchCancelSpotOrdersAuthz>

public fun BatchCancelSpotOrdersAuthz.toAny(): Any = Any(BatchCancelSpotOrdersAuthz.TYPE_URL,
    with(BatchCancelSpotOrdersAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchCancelSpotOrdersAuthz>):
    BatchCancelSpotOrdersAuthz {
  if (typeUrl != BatchCancelSpotOrdersAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CreateDerivativeLimitOrderAuthzConverter :
    ProtobufConverter<CreateDerivativeLimitOrderAuthz>

public fun CreateDerivativeLimitOrderAuthz.toAny(): Any =
    Any(CreateDerivativeLimitOrderAuthz.TYPE_URL, with(CreateDerivativeLimitOrderAuthzConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CreateDerivativeLimitOrderAuthz>):
    CreateDerivativeLimitOrderAuthz {
  if (typeUrl != CreateDerivativeLimitOrderAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CreateDerivativeMarketOrderAuthzConverter :
    ProtobufConverter<CreateDerivativeMarketOrderAuthz>

public fun CreateDerivativeMarketOrderAuthz.toAny(): Any =
    Any(CreateDerivativeMarketOrderAuthz.TYPE_URL, with(CreateDerivativeMarketOrderAuthzConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CreateDerivativeMarketOrderAuthz>):
    CreateDerivativeMarketOrderAuthz {
  if (typeUrl != CreateDerivativeMarketOrderAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchCreateDerivativeLimitOrdersAuthzConverter :
    ProtobufConverter<BatchCreateDerivativeLimitOrdersAuthz>

public fun BatchCreateDerivativeLimitOrdersAuthz.toAny(): Any =
    Any(BatchCreateDerivativeLimitOrdersAuthz.TYPE_URL,
    with(BatchCreateDerivativeLimitOrdersAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchCreateDerivativeLimitOrdersAuthz>):
    BatchCreateDerivativeLimitOrdersAuthz {
  if (typeUrl != BatchCreateDerivativeLimitOrdersAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CancelDerivativeOrderAuthzConverter :
    ProtobufConverter<CancelDerivativeOrderAuthz>

public fun CancelDerivativeOrderAuthz.toAny(): Any = Any(CancelDerivativeOrderAuthz.TYPE_URL,
    with(CancelDerivativeOrderAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CancelDerivativeOrderAuthz>):
    CancelDerivativeOrderAuthz {
  if (typeUrl != CancelDerivativeOrderAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchCancelDerivativeOrdersAuthzConverter :
    ProtobufConverter<BatchCancelDerivativeOrdersAuthz>

public fun BatchCancelDerivativeOrdersAuthz.toAny(): Any =
    Any(BatchCancelDerivativeOrdersAuthz.TYPE_URL, with(BatchCancelDerivativeOrdersAuthzConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchCancelDerivativeOrdersAuthz>):
    BatchCancelDerivativeOrdersAuthz {
  if (typeUrl != BatchCancelDerivativeOrdersAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchUpdateOrdersAuthzConverter : ProtobufConverter<BatchUpdateOrdersAuthz>

public fun BatchUpdateOrdersAuthz.toAny(): Any = Any(BatchUpdateOrdersAuthz.TYPE_URL,
    with(BatchUpdateOrdersAuthzConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchUpdateOrdersAuthz>): BatchUpdateOrdersAuthz {
  if (typeUrl != BatchUpdateOrdersAuthz.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

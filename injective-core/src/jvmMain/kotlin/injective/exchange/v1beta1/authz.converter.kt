// Transform from injective/exchange/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object CreateSpotLimitOrderAuthzConverter :
    ProtobufConverter<CreateSpotLimitOrderAuthz> by CreateSpotLimitOrderAuthzJvmConverter

public actual object CreateSpotMarketOrderAuthzConverter :
    ProtobufConverter<CreateSpotMarketOrderAuthz> by CreateSpotMarketOrderAuthzJvmConverter

public actual object BatchCreateSpotLimitOrdersAuthzConverter :
    ProtobufConverter<BatchCreateSpotLimitOrdersAuthz> by
    BatchCreateSpotLimitOrdersAuthzJvmConverter

public actual object CancelSpotOrderAuthzConverter : ProtobufConverter<CancelSpotOrderAuthz> by
    CancelSpotOrderAuthzJvmConverter

public actual object BatchCancelSpotOrdersAuthzConverter :
    ProtobufConverter<BatchCancelSpotOrdersAuthz> by BatchCancelSpotOrdersAuthzJvmConverter

public actual object CreateDerivativeLimitOrderAuthzConverter :
    ProtobufConverter<CreateDerivativeLimitOrderAuthz> by
    CreateDerivativeLimitOrderAuthzJvmConverter

public actual object CreateDerivativeMarketOrderAuthzConverter :
    ProtobufConverter<CreateDerivativeMarketOrderAuthz> by
    CreateDerivativeMarketOrderAuthzJvmConverter

public actual object BatchCreateDerivativeLimitOrdersAuthzConverter :
    ProtobufConverter<BatchCreateDerivativeLimitOrdersAuthz> by
    BatchCreateDerivativeLimitOrdersAuthzJvmConverter

public actual object CancelDerivativeOrderAuthzConverter :
    ProtobufConverter<CancelDerivativeOrderAuthz> by CancelDerivativeOrderAuthzJvmConverter

public actual object BatchCancelDerivativeOrdersAuthzConverter :
    ProtobufConverter<BatchCancelDerivativeOrdersAuthz> by
    BatchCancelDerivativeOrdersAuthzJvmConverter

public actual object BatchUpdateOrdersAuthzConverter : ProtobufConverter<BatchUpdateOrdersAuthz> by
    BatchUpdateOrdersAuthzJvmConverter

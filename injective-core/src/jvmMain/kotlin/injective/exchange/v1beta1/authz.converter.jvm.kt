// Transform from injective/exchange/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object CreateSpotLimitOrderAuthzJvmConverter :
    ProtobufTypeMapper<CreateSpotLimitOrderAuthz, Authz.CreateSpotLimitOrderAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.CreateSpotLimitOrderAuthz.getDescriptor()

  public override val parser: Parser<Authz.CreateSpotLimitOrderAuthz> =
      Authz.CreateSpotLimitOrderAuthz.parser()

  public override fun convert(obj: Authz.CreateSpotLimitOrderAuthz): CreateSpotLimitOrderAuthz =
      CreateSpotLimitOrderAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: CreateSpotLimitOrderAuthz): Authz.CreateSpotLimitOrderAuthz {
    val builder = Authz.CreateSpotLimitOrderAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object CreateSpotMarketOrderAuthzJvmConverter :
    ProtobufTypeMapper<CreateSpotMarketOrderAuthz, Authz.CreateSpotMarketOrderAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.CreateSpotMarketOrderAuthz.getDescriptor()

  public override val parser: Parser<Authz.CreateSpotMarketOrderAuthz> =
      Authz.CreateSpotMarketOrderAuthz.parser()

  public override fun convert(obj: Authz.CreateSpotMarketOrderAuthz): CreateSpotMarketOrderAuthz =
      CreateSpotMarketOrderAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: CreateSpotMarketOrderAuthz): Authz.CreateSpotMarketOrderAuthz {
    val builder = Authz.CreateSpotMarketOrderAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object BatchCreateSpotLimitOrdersAuthzJvmConverter :
    ProtobufTypeMapper<BatchCreateSpotLimitOrdersAuthz, Authz.BatchCreateSpotLimitOrdersAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.BatchCreateSpotLimitOrdersAuthz.getDescriptor()

  public override val parser: Parser<Authz.BatchCreateSpotLimitOrdersAuthz> =
      Authz.BatchCreateSpotLimitOrdersAuthz.parser()

  public override fun convert(obj: Authz.BatchCreateSpotLimitOrdersAuthz):
      BatchCreateSpotLimitOrdersAuthz = BatchCreateSpotLimitOrdersAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: BatchCreateSpotLimitOrdersAuthz):
      Authz.BatchCreateSpotLimitOrdersAuthz {
    val builder = Authz.BatchCreateSpotLimitOrdersAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object CancelSpotOrderAuthzJvmConverter :
    ProtobufTypeMapper<CancelSpotOrderAuthz, Authz.CancelSpotOrderAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.CancelSpotOrderAuthz.getDescriptor()

  public override val parser: Parser<Authz.CancelSpotOrderAuthz> =
      Authz.CancelSpotOrderAuthz.parser()

  public override fun convert(obj: Authz.CancelSpotOrderAuthz): CancelSpotOrderAuthz =
      CancelSpotOrderAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: CancelSpotOrderAuthz): Authz.CancelSpotOrderAuthz {
    val builder = Authz.CancelSpotOrderAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object BatchCancelSpotOrdersAuthzJvmConverter :
    ProtobufTypeMapper<BatchCancelSpotOrdersAuthz, Authz.BatchCancelSpotOrdersAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.BatchCancelSpotOrdersAuthz.getDescriptor()

  public override val parser: Parser<Authz.BatchCancelSpotOrdersAuthz> =
      Authz.BatchCancelSpotOrdersAuthz.parser()

  public override fun convert(obj: Authz.BatchCancelSpotOrdersAuthz): BatchCancelSpotOrdersAuthz =
      BatchCancelSpotOrdersAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: BatchCancelSpotOrdersAuthz): Authz.BatchCancelSpotOrdersAuthz {
    val builder = Authz.BatchCancelSpotOrdersAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object CreateDerivativeLimitOrderAuthzJvmConverter :
    ProtobufTypeMapper<CreateDerivativeLimitOrderAuthz, Authz.CreateDerivativeLimitOrderAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.CreateDerivativeLimitOrderAuthz.getDescriptor()

  public override val parser: Parser<Authz.CreateDerivativeLimitOrderAuthz> =
      Authz.CreateDerivativeLimitOrderAuthz.parser()

  public override fun convert(obj: Authz.CreateDerivativeLimitOrderAuthz):
      CreateDerivativeLimitOrderAuthz = CreateDerivativeLimitOrderAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: CreateDerivativeLimitOrderAuthz):
      Authz.CreateDerivativeLimitOrderAuthz {
    val builder = Authz.CreateDerivativeLimitOrderAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object CreateDerivativeMarketOrderAuthzJvmConverter :
    ProtobufTypeMapper<CreateDerivativeMarketOrderAuthz, Authz.CreateDerivativeMarketOrderAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.CreateDerivativeMarketOrderAuthz.getDescriptor()

  public override val parser: Parser<Authz.CreateDerivativeMarketOrderAuthz> =
      Authz.CreateDerivativeMarketOrderAuthz.parser()

  public override fun convert(obj: Authz.CreateDerivativeMarketOrderAuthz):
      CreateDerivativeMarketOrderAuthz = CreateDerivativeMarketOrderAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: CreateDerivativeMarketOrderAuthz):
      Authz.CreateDerivativeMarketOrderAuthz {
    val builder = Authz.CreateDerivativeMarketOrderAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object BatchCreateDerivativeLimitOrdersAuthzJvmConverter :
    ProtobufTypeMapper<BatchCreateDerivativeLimitOrdersAuthz, Authz.BatchCreateDerivativeLimitOrdersAuthz>
    {
  public override val descriptor: Descriptors.Descriptor =
      Authz.BatchCreateDerivativeLimitOrdersAuthz.getDescriptor()

  public override val parser: Parser<Authz.BatchCreateDerivativeLimitOrdersAuthz> =
      Authz.BatchCreateDerivativeLimitOrdersAuthz.parser()

  public override fun convert(obj: Authz.BatchCreateDerivativeLimitOrdersAuthz):
      BatchCreateDerivativeLimitOrdersAuthz = BatchCreateDerivativeLimitOrdersAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: BatchCreateDerivativeLimitOrdersAuthz):
      Authz.BatchCreateDerivativeLimitOrdersAuthz {
    val builder = Authz.BatchCreateDerivativeLimitOrdersAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object CancelDerivativeOrderAuthzJvmConverter :
    ProtobufTypeMapper<CancelDerivativeOrderAuthz, Authz.CancelDerivativeOrderAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.CancelDerivativeOrderAuthz.getDescriptor()

  public override val parser: Parser<Authz.CancelDerivativeOrderAuthz> =
      Authz.CancelDerivativeOrderAuthz.parser()

  public override fun convert(obj: Authz.CancelDerivativeOrderAuthz): CancelDerivativeOrderAuthz =
      CancelDerivativeOrderAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: CancelDerivativeOrderAuthz): Authz.CancelDerivativeOrderAuthz {
    val builder = Authz.CancelDerivativeOrderAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object BatchCancelDerivativeOrdersAuthzJvmConverter :
    ProtobufTypeMapper<BatchCancelDerivativeOrdersAuthz, Authz.BatchCancelDerivativeOrdersAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.BatchCancelDerivativeOrdersAuthz.getDescriptor()

  public override val parser: Parser<Authz.BatchCancelDerivativeOrdersAuthz> =
      Authz.BatchCancelDerivativeOrdersAuthz.parser()

  public override fun convert(obj: Authz.BatchCancelDerivativeOrdersAuthz):
      BatchCancelDerivativeOrdersAuthz = BatchCancelDerivativeOrdersAuthz(
  	subaccountId = obj.getSubaccountId(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: BatchCancelDerivativeOrdersAuthz):
      Authz.BatchCancelDerivativeOrdersAuthz {
    val builder = Authz.BatchCancelDerivativeOrdersAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object BatchUpdateOrdersAuthzJvmConverter :
    ProtobufTypeMapper<BatchUpdateOrdersAuthz, Authz.BatchUpdateOrdersAuthz> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.BatchUpdateOrdersAuthz.getDescriptor()

  public override val parser: Parser<Authz.BatchUpdateOrdersAuthz> =
      Authz.BatchUpdateOrdersAuthz.parser()

  public override fun convert(obj: Authz.BatchUpdateOrdersAuthz): BatchUpdateOrdersAuthz =
      BatchUpdateOrdersAuthz(
  	subaccountId = obj.getSubaccountId(),
  	spotMarkets = obj.getSpotMarketsList().map { it },
  	derivativeMarkets = obj.getDerivativeMarketsList().map { it },
  )

  public override fun convert(obj: BatchUpdateOrdersAuthz): Authz.BatchUpdateOrdersAuthz {
    val builder = Authz.BatchUpdateOrdersAuthz.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllSpotMarkets(obj.spotMarkets.map { it })
    builder.addAllDerivativeMarkets(obj.derivativeMarkets.map { it })
    return builder.build()
  }
}

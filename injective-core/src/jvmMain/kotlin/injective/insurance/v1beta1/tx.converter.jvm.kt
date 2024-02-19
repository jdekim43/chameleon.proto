// Transform from injective/insurance/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import injective.oracle.v1beta1.Oracle
import injective.oracle.v1beta1.OracleType
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgCreateInsuranceFundJvmConverter :
    ProtobufTypeMapper<MsgCreateInsuranceFund, Tx.MsgCreateInsuranceFund> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateInsuranceFund.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateInsuranceFund> = Tx.MsgCreateInsuranceFund.parser()

  public override fun convert(obj: Tx.MsgCreateInsuranceFund): MsgCreateInsuranceFund =
      MsgCreateInsuranceFund(
  	sender = obj.getSender(),
  	ticker = obj.getTicker(),
  	quoteDenom = obj.getQuoteDenom(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	expiry = obj.getExpiry(),
  	initialDeposit = CoinJvmConverter.convert(obj.getInitialDeposit()),
  )

  public override fun convert(obj: MsgCreateInsuranceFund): Tx.MsgCreateInsuranceFund {
    val builder = Tx.MsgCreateInsuranceFund.newBuilder()
    builder.setSender(obj.sender)
    builder.setTicker(obj.ticker)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setExpiry(obj.expiry)
    builder.setInitialDeposit(CoinJvmConverter.convert(obj.initialDeposit))
    return builder.build()
  }
}

public object MsgCreateInsuranceFundResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateInsuranceFundResponse, Tx.MsgCreateInsuranceFundResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateInsuranceFundResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateInsuranceFundResponse> =
      Tx.MsgCreateInsuranceFundResponse.parser()

  public override fun convert(obj: Tx.MsgCreateInsuranceFundResponse):
      MsgCreateInsuranceFundResponse = MsgCreateInsuranceFundResponse(
  )

  public override fun convert(obj: MsgCreateInsuranceFundResponse):
      Tx.MsgCreateInsuranceFundResponse {
    val builder = Tx.MsgCreateInsuranceFundResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUnderwriteJvmConverter : ProtobufTypeMapper<MsgUnderwrite, Tx.MsgUnderwrite> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnderwrite.getDescriptor()

  public override val parser: Parser<Tx.MsgUnderwrite> = Tx.MsgUnderwrite.parser()

  public override fun convert(obj: Tx.MsgUnderwrite): MsgUnderwrite = MsgUnderwrite(
  	sender = obj.getSender(),
  	marketId = obj.getMarketId(),
  	deposit = CoinJvmConverter.convert(obj.getDeposit()),
  )

  public override fun convert(obj: MsgUnderwrite): Tx.MsgUnderwrite {
    val builder = Tx.MsgUnderwrite.newBuilder()
    builder.setSender(obj.sender)
    builder.setMarketId(obj.marketId)
    builder.setDeposit(CoinJvmConverter.convert(obj.deposit))
    return builder.build()
  }
}

public object MsgUnderwriteResponseJvmConverter :
    ProtobufTypeMapper<MsgUnderwriteResponse, Tx.MsgUnderwriteResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnderwriteResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUnderwriteResponse> = Tx.MsgUnderwriteResponse.parser()

  public override fun convert(obj: Tx.MsgUnderwriteResponse): MsgUnderwriteResponse =
      MsgUnderwriteResponse(
  )

  public override fun convert(obj: MsgUnderwriteResponse): Tx.MsgUnderwriteResponse {
    val builder = Tx.MsgUnderwriteResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRequestRedemptionJvmConverter :
    ProtobufTypeMapper<MsgRequestRedemption, Tx.MsgRequestRedemption> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRequestRedemption.getDescriptor()

  public override val parser: Parser<Tx.MsgRequestRedemption> = Tx.MsgRequestRedemption.parser()

  public override fun convert(obj: Tx.MsgRequestRedemption): MsgRequestRedemption =
      MsgRequestRedemption(
  	sender = obj.getSender(),
  	marketId = obj.getMarketId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgRequestRedemption): Tx.MsgRequestRedemption {
    val builder = Tx.MsgRequestRedemption.newBuilder()
    builder.setSender(obj.sender)
    builder.setMarketId(obj.marketId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgRequestRedemptionResponseJvmConverter :
    ProtobufTypeMapper<MsgRequestRedemptionResponse, Tx.MsgRequestRedemptionResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRequestRedemptionResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRequestRedemptionResponse> =
      Tx.MsgRequestRedemptionResponse.parser()

  public override fun convert(obj: Tx.MsgRequestRedemptionResponse): MsgRequestRedemptionResponse =
      MsgRequestRedemptionResponse(
  )

  public override fun convert(obj: MsgRequestRedemptionResponse): Tx.MsgRequestRedemptionResponse {
    val builder = Tx.MsgRequestRedemptionResponse.newBuilder()
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

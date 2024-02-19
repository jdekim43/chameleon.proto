// Transform from injective/insurance/v1beta1/insurance.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import injective.oracle.v1beta1.Oracle
import injective.oracle.v1beta1.OracleType
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Insurance.Params> {
  public override val descriptor: Descriptors.Descriptor = Insurance.Params.getDescriptor()

  public override val parser: Parser<Insurance.Params> = Insurance.Params.parser()

  public override fun convert(obj: Insurance.Params): Params = Params(
  	defaultRedemptionNoticePeriodDuration =
      DurationJvmConverter.convert(obj.getDefaultRedemptionNoticePeriodDuration()),
  )

  public override fun convert(obj: Params): Insurance.Params {
    val builder = Insurance.Params.newBuilder()
    builder.setDefaultRedemptionNoticePeriodDuration(DurationJvmConverter.convert(obj.defaultRedemptionNoticePeriodDuration))
    return builder.build()
  }
}

public object InsuranceFundJvmConverter : ProtobufTypeMapper<InsuranceFund, Insurance.InsuranceFund>
    {
  public override val descriptor: Descriptors.Descriptor = Insurance.InsuranceFund.getDescriptor()

  public override val parser: Parser<Insurance.InsuranceFund> = Insurance.InsuranceFund.parser()

  public override fun convert(obj: Insurance.InsuranceFund): InsuranceFund = InsuranceFund(
  	depositDenom = obj.getDepositDenom(),
  	insurancePoolTokenDenom = obj.getInsurancePoolTokenDenom(),
  	redemptionNoticePeriodDuration =
      DurationJvmConverter.convert(obj.getRedemptionNoticePeriodDuration()),
  	balance = obj.getBalance(),
  	totalShare = obj.getTotalShare(),
  	marketId = obj.getMarketId(),
  	marketTicker = obj.getMarketTicker(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	expiry = obj.getExpiry(),
  )

  public override fun convert(obj: InsuranceFund): Insurance.InsuranceFund {
    val builder = Insurance.InsuranceFund.newBuilder()
    builder.setDepositDenom(obj.depositDenom)
    builder.setInsurancePoolTokenDenom(obj.insurancePoolTokenDenom)
    builder.setRedemptionNoticePeriodDuration(DurationJvmConverter.convert(obj.redemptionNoticePeriodDuration))
    builder.setBalance(obj.balance)
    builder.setTotalShare(obj.totalShare)
    builder.setMarketId(obj.marketId)
    builder.setMarketTicker(obj.marketTicker)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setExpiry(obj.expiry)
    return builder.build()
  }
}

public object RedemptionScheduleJvmConverter :
    ProtobufTypeMapper<RedemptionSchedule, Insurance.RedemptionSchedule> {
  public override val descriptor: Descriptors.Descriptor =
      Insurance.RedemptionSchedule.getDescriptor()

  public override val parser: Parser<Insurance.RedemptionSchedule> =
      Insurance.RedemptionSchedule.parser()

  public override fun convert(obj: Insurance.RedemptionSchedule): RedemptionSchedule =
      RedemptionSchedule(
  	id = obj.getId().asKotlinType,
  	marketId = obj.getMarketId(),
  	redeemer = obj.getRedeemer(),
  	claimableRedemptionTime = TimestampJvmConverter.convert(obj.getClaimableRedemptionTime()),
  	redemptionAmount = CoinJvmConverter.convert(obj.getRedemptionAmount()),
  )

  public override fun convert(obj: RedemptionSchedule): Insurance.RedemptionSchedule {
    val builder = Insurance.RedemptionSchedule.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setMarketId(obj.marketId)
    builder.setRedeemer(obj.redeemer)
    builder.setClaimableRedemptionTime(TimestampJvmConverter.convert(obj.claimableRedemptionTime))
    builder.setRedemptionAmount(CoinJvmConverter.convert(obj.redemptionAmount))
    return builder.build()
  }
}

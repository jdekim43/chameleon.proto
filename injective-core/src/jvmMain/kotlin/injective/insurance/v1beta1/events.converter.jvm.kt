// Transform from injective/insurance/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EventInsuranceFundUpdateJvmConverter :
    ProtobufTypeMapper<EventInsuranceFundUpdate, Events.EventInsuranceFundUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventInsuranceFundUpdate.getDescriptor()

  public override val parser: Parser<Events.EventInsuranceFundUpdate> =
      Events.EventInsuranceFundUpdate.parser()

  public override fun convert(obj: Events.EventInsuranceFundUpdate): EventInsuranceFundUpdate =
      EventInsuranceFundUpdate(
  	fund = InsuranceFundJvmConverter.convert(obj.getFund()),
  )

  public override fun convert(obj: EventInsuranceFundUpdate): Events.EventInsuranceFundUpdate {
    val builder = Events.EventInsuranceFundUpdate.newBuilder()
    builder.setFund(InsuranceFundJvmConverter.convert(obj.fund))
    return builder.build()
  }
}

public object EventRequestRedemptionJvmConverter :
    ProtobufTypeMapper<EventRequestRedemption, Events.EventRequestRedemption> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventRequestRedemption.getDescriptor()

  public override val parser: Parser<Events.EventRequestRedemption> =
      Events.EventRequestRedemption.parser()

  public override fun convert(obj: Events.EventRequestRedemption): EventRequestRedemption =
      EventRequestRedemption(
  	schedule = RedemptionScheduleJvmConverter.convert(obj.getSchedule()),
  )

  public override fun convert(obj: EventRequestRedemption): Events.EventRequestRedemption {
    val builder = Events.EventRequestRedemption.newBuilder()
    builder.setSchedule(RedemptionScheduleJvmConverter.convert(obj.schedule))
    return builder.build()
  }
}

public object EventWithdrawRedemptionJvmConverter :
    ProtobufTypeMapper<EventWithdrawRedemption, Events.EventWithdrawRedemption> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventWithdrawRedemption.getDescriptor()

  public override val parser: Parser<Events.EventWithdrawRedemption> =
      Events.EventWithdrawRedemption.parser()

  public override fun convert(obj: Events.EventWithdrawRedemption): EventWithdrawRedemption =
      EventWithdrawRedemption(
  	schedule = RedemptionScheduleJvmConverter.convert(obj.getSchedule()),
  	redeemCoin = CoinJvmConverter.convert(obj.getRedeemCoin()),
  )

  public override fun convert(obj: EventWithdrawRedemption): Events.EventWithdrawRedemption {
    val builder = Events.EventWithdrawRedemption.newBuilder()
    builder.setSchedule(RedemptionScheduleJvmConverter.convert(obj.schedule))
    builder.setRedeemCoin(CoinJvmConverter.convert(obj.redeemCoin))
    return builder.build()
  }
}

public object EventUnderwriteJvmConverter :
    ProtobufTypeMapper<EventUnderwrite, Events.EventUnderwrite> {
  public override val descriptor: Descriptors.Descriptor = Events.EventUnderwrite.getDescriptor()

  public override val parser: Parser<Events.EventUnderwrite> = Events.EventUnderwrite.parser()

  public override fun convert(obj: Events.EventUnderwrite): EventUnderwrite = EventUnderwrite(
  	underwriter = obj.getUnderwriter(),
  	marketId = obj.getMarketId(),
  	deposit = CoinJvmConverter.convert(obj.getDeposit()),
  	shares = CoinJvmConverter.convert(obj.getShares()),
  )

  public override fun convert(obj: EventUnderwrite): Events.EventUnderwrite {
    val builder = Events.EventUnderwrite.newBuilder()
    builder.setUnderwriter(obj.underwriter)
    builder.setMarketId(obj.marketId)
    builder.setDeposit(CoinJvmConverter.convert(obj.deposit))
    builder.setShares(CoinJvmConverter.convert(obj.shares))
    return builder.build()
  }
}

public object EventInsuranceWithdrawJvmConverter :
    ProtobufTypeMapper<EventInsuranceWithdraw, Events.EventInsuranceWithdraw> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventInsuranceWithdraw.getDescriptor()

  public override val parser: Parser<Events.EventInsuranceWithdraw> =
      Events.EventInsuranceWithdraw.parser()

  public override fun convert(obj: Events.EventInsuranceWithdraw): EventInsuranceWithdraw =
      EventInsuranceWithdraw(
  	marketId = obj.getMarketId(),
  	marketTicker = obj.getMarketTicker(),
  	withdrawal = CoinJvmConverter.convert(obj.getWithdrawal()),
  )

  public override fun convert(obj: EventInsuranceWithdraw): Events.EventInsuranceWithdraw {
    val builder = Events.EventInsuranceWithdraw.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setMarketTicker(obj.marketTicker)
    builder.setWithdrawal(CoinJvmConverter.convert(obj.withdrawal))
    return builder.build()
  }
}

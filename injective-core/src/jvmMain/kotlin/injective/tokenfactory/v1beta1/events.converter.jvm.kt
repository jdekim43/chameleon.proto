// Transform from injective/tokenfactory/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.bank.v1beta1.MetadataJvmConverter
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EventCreateTFDenomJvmConverter :
    ProtobufTypeMapper<EventCreateTFDenom, Events.EventCreateTFDenom> {
  public override val descriptor: Descriptors.Descriptor = Events.EventCreateTFDenom.getDescriptor()

  public override val parser: Parser<Events.EventCreateTFDenom> = Events.EventCreateTFDenom.parser()

  public override fun convert(obj: Events.EventCreateTFDenom): EventCreateTFDenom =
      EventCreateTFDenom(
  	account = obj.getAccount(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: EventCreateTFDenom): Events.EventCreateTFDenom {
    val builder = Events.EventCreateTFDenom.newBuilder()
    builder.setAccount(obj.account)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object EventMintTFDenomJvmConverter :
    ProtobufTypeMapper<EventMintTFDenom, Events.EventMintTFDenom> {
  public override val descriptor: Descriptors.Descriptor = Events.EventMintTFDenom.getDescriptor()

  public override val parser: Parser<Events.EventMintTFDenom> = Events.EventMintTFDenom.parser()

  public override fun convert(obj: Events.EventMintTFDenom): EventMintTFDenom = EventMintTFDenom(
  	recipientAddress = obj.getRecipientAddress(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: EventMintTFDenom): Events.EventMintTFDenom {
    val builder = Events.EventMintTFDenom.newBuilder()
    builder.setRecipientAddress(obj.recipientAddress)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object EventBurnDenomJvmConverter : ProtobufTypeMapper<EventBurnDenom, Events.EventBurnDenom>
    {
  public override val descriptor: Descriptors.Descriptor = Events.EventBurnDenom.getDescriptor()

  public override val parser: Parser<Events.EventBurnDenom> = Events.EventBurnDenom.parser()

  public override fun convert(obj: Events.EventBurnDenom): EventBurnDenom = EventBurnDenom(
  	burnerAddress = obj.getBurnerAddress(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: EventBurnDenom): Events.EventBurnDenom {
    val builder = Events.EventBurnDenom.newBuilder()
    builder.setBurnerAddress(obj.burnerAddress)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object EventChangeTFAdminJvmConverter :
    ProtobufTypeMapper<EventChangeTFAdmin, Events.EventChangeTFAdmin> {
  public override val descriptor: Descriptors.Descriptor = Events.EventChangeTFAdmin.getDescriptor()

  public override val parser: Parser<Events.EventChangeTFAdmin> = Events.EventChangeTFAdmin.parser()

  public override fun convert(obj: Events.EventChangeTFAdmin): EventChangeTFAdmin =
      EventChangeTFAdmin(
  	denom = obj.getDenom(),
  	newAdminAddress = obj.getNewAdminAddress(),
  )

  public override fun convert(obj: EventChangeTFAdmin): Events.EventChangeTFAdmin {
    val builder = Events.EventChangeTFAdmin.newBuilder()
    builder.setDenom(obj.denom)
    builder.setNewAdminAddress(obj.newAdminAddress)
    return builder.build()
  }
}

public object EventSetTFDenomMetadataJvmConverter :
    ProtobufTypeMapper<EventSetTFDenomMetadata, Events.EventSetTFDenomMetadata> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSetTFDenomMetadata.getDescriptor()

  public override val parser: Parser<Events.EventSetTFDenomMetadata> =
      Events.EventSetTFDenomMetadata.parser()

  public override fun convert(obj: Events.EventSetTFDenomMetadata): EventSetTFDenomMetadata =
      EventSetTFDenomMetadata(
  	denom = obj.getDenom(),
  	metadata = MetadataJvmConverter.convert(obj.getMetadata()),
  )

  public override fun convert(obj: EventSetTFDenomMetadata): Events.EventSetTFDenomMetadata {
    val builder = Events.EventSetTFDenomMetadata.newBuilder()
    builder.setDenom(obj.denom)
    builder.setMetadata(MetadataJvmConverter.convert(obj.metadata))
    return builder.build()
  }
}

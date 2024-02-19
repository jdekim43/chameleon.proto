// Transform from injective/tokenfactory/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventCreateTFDenomConverter : ProtobufConverter<EventCreateTFDenom>

public fun EventCreateTFDenom.toAny(): Any = Any(EventCreateTFDenom.TYPE_URL,
    with(EventCreateTFDenomConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCreateTFDenom>): EventCreateTFDenom {
  if (typeUrl != EventCreateTFDenom.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventMintTFDenomConverter : ProtobufConverter<EventMintTFDenom>

public fun EventMintTFDenom.toAny(): Any = Any(EventMintTFDenom.TYPE_URL,
    with(EventMintTFDenomConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventMintTFDenom>): EventMintTFDenom {
  if (typeUrl != EventMintTFDenom.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBurnDenomConverter : ProtobufConverter<EventBurnDenom>

public fun EventBurnDenom.toAny(): Any = Any(EventBurnDenom.TYPE_URL, with(EventBurnDenomConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBurnDenom>): EventBurnDenom {
  if (typeUrl != EventBurnDenom.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventChangeTFAdminConverter : ProtobufConverter<EventChangeTFAdmin>

public fun EventChangeTFAdmin.toAny(): Any = Any(EventChangeTFAdmin.TYPE_URL,
    with(EventChangeTFAdminConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventChangeTFAdmin>): EventChangeTFAdmin {
  if (typeUrl != EventChangeTFAdmin.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSetTFDenomMetadataConverter : ProtobufConverter<EventSetTFDenomMetadata>

public fun EventSetTFDenomMetadata.toAny(): Any = Any(EventSetTFDenomMetadata.TYPE_URL,
    with(EventSetTFDenomMetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSetTFDenomMetadata>):
    EventSetTFDenomMetadata {
  if (typeUrl != EventSetTFDenomMetadata.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from injective/peggy/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BridgeValidatorConverter : ProtobufConverter<BridgeValidator>

public fun BridgeValidator.toAny(): Any = Any(BridgeValidator.TYPE_URL,
    with(BridgeValidatorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BridgeValidator>): BridgeValidator {
  if (typeUrl != BridgeValidator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValsetConverter : ProtobufConverter<Valset>

public fun Valset.toAny(): Any = Any(Valset.TYPE_URL, with(ValsetConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Valset>): Valset {
  if (typeUrl != Valset.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LastObservedEthereumBlockHeightConverter :
    ProtobufConverter<LastObservedEthereumBlockHeight>

public fun LastObservedEthereumBlockHeight.toAny(): Any =
    Any(LastObservedEthereumBlockHeight.TYPE_URL, with(LastObservedEthereumBlockHeightConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LastObservedEthereumBlockHeight>):
    LastObservedEthereumBlockHeight {
  if (typeUrl != LastObservedEthereumBlockHeight.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LastClaimEventConverter : ProtobufConverter<LastClaimEvent>

public fun LastClaimEvent.toAny(): Any = Any(LastClaimEvent.TYPE_URL, with(LastClaimEventConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LastClaimEvent>): LastClaimEvent {
  if (typeUrl != LastClaimEvent.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ERC20ToDenomConverter : ProtobufConverter<ERC20ToDenom>

public fun ERC20ToDenom.toAny(): Any = Any(ERC20ToDenom.TYPE_URL, with(ERC20ToDenomConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ERC20ToDenom>): ERC20ToDenom {
  if (typeUrl != ERC20ToDenom.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

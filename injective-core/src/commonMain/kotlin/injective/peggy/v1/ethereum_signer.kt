// Transform from injective/peggy/v1/ethereum_signer.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.Int
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax

@Serializable
@SerialName(value = "/injective.peggy.v1.SignType")
public enum class SignType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  SIGN_TYPE_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  SIGN_TYPE_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE(1),
  @ProtobufIndex(index = 2)
  SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDRAW_BATCH(2),
  ;

  public companion object {
    public fun forNumber(number: Int): SignType = SignType.values()
    	.first { it.number == number }
  }
}

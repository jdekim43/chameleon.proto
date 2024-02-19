// Transform from injective/peggy/v1/attestation.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object AttestationJvmConverter :
    ProtobufTypeMapper<Attestation, AttestationOuterClass.Attestation> {
  public override val descriptor: Descriptors.Descriptor =
      AttestationOuterClass.Attestation.getDescriptor()

  public override val parser: Parser<AttestationOuterClass.Attestation> =
      AttestationOuterClass.Attestation.parser()

  public override fun convert(obj: AttestationOuterClass.Attestation): Attestation = Attestation(
  	observed = obj.getObserved(),
  	votes = obj.getVotesList().map { it },
  	height = obj.getHeight().asKotlinType,
  	claim = AnyJvmConverter.convert(obj.getClaim()),
  )

  public override fun convert(obj: Attestation): AttestationOuterClass.Attestation {
    val builder = AttestationOuterClass.Attestation.newBuilder()
    builder.setObserved(obj.observed)
    builder.addAllVotes(obj.votes.map { it })
    builder.setHeight(obj.height.asJavaType)
    builder.setClaim(AnyJvmConverter.convert(obj.claim))
    return builder.build()
  }
}

public object ERC20TokenJvmConverter :
    ProtobufTypeMapper<ERC20Token, AttestationOuterClass.ERC20Token> {
  public override val descriptor: Descriptors.Descriptor =
      AttestationOuterClass.ERC20Token.getDescriptor()

  public override val parser: Parser<AttestationOuterClass.ERC20Token> =
      AttestationOuterClass.ERC20Token.parser()

  public override fun convert(obj: AttestationOuterClass.ERC20Token): ERC20Token = ERC20Token(
  	contract = obj.getContract(),
  	amount = obj.getAmount(),
  )

  public override fun convert(obj: ERC20Token): AttestationOuterClass.ERC20Token {
    val builder = AttestationOuterClass.ERC20Token.newBuilder()
    builder.setContract(obj.contract)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}

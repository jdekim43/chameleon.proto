// Transform from injective/tokenfactory/v1beta1/params.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ParamsJvmConverter : ProtobufTypeMapper<Params, ParamsOuterClass.Params> {
  public override val descriptor: Descriptors.Descriptor = ParamsOuterClass.Params.getDescriptor()

  public override val parser: Parser<ParamsOuterClass.Params> = ParamsOuterClass.Params.parser()

  public override fun convert(obj: ParamsOuterClass.Params): Params = Params(
  	denomCreationFee = obj.getDenomCreationFeeList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: Params): ParamsOuterClass.Params {
    val builder = ParamsOuterClass.Params.newBuilder()
    builder.addAllDenomCreationFee(obj.denomCreationFee.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

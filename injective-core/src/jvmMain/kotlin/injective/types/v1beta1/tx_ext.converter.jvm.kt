// Transform from injective/types/v1beta1/tx_ext.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ExtensionOptionsWeb3TxJvmConverter :
    ProtobufTypeMapper<ExtensionOptionsWeb3Tx, TxExt.ExtensionOptionsWeb3Tx> {
  public override val descriptor: Descriptors.Descriptor =
      TxExt.ExtensionOptionsWeb3Tx.getDescriptor()

  public override val parser: Parser<TxExt.ExtensionOptionsWeb3Tx> =
      TxExt.ExtensionOptionsWeb3Tx.parser()

  public override fun convert(obj: TxExt.ExtensionOptionsWeb3Tx): ExtensionOptionsWeb3Tx =
      ExtensionOptionsWeb3Tx(
  	typedDataChainID = obj.getTypedDataChainID().asKotlinType,
  	feePayer = obj.getFeePayer(),
  	feePayerSig = obj.getFeePayerSig().toByteArray(),
  )

  public override fun convert(obj: ExtensionOptionsWeb3Tx): TxExt.ExtensionOptionsWeb3Tx {
    val builder = TxExt.ExtensionOptionsWeb3Tx.newBuilder()
    builder.setTypedDataChainID(obj.typedDataChainID.asJavaType)
    builder.setFeePayer(obj.feePayer)
    builder.setFeePayerSig(ByteString.copyFrom(obj.feePayerSig))
    return builder.build()
  }
}

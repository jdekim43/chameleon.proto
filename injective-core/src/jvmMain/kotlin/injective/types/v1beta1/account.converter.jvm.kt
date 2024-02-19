// Transform from injective/types/v1beta1/account.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.auth.v1beta1.BaseAccountJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object EthAccountJvmConverter : ProtobufTypeMapper<EthAccount, Account.EthAccount> {
  public override val descriptor: Descriptors.Descriptor = Account.EthAccount.getDescriptor()

  public override val parser: Parser<Account.EthAccount> = Account.EthAccount.parser()

  public override fun convert(obj: Account.EthAccount): EthAccount = EthAccount(
  	baseAccount = BaseAccountJvmConverter.convert(obj.getBaseAccount()),
  	codeHash = obj.getCodeHash().toByteArray(),
  )

  public override fun convert(obj: EthAccount): Account.EthAccount {
    val builder = Account.EthAccount.newBuilder()
    builder.setBaseAccount(BaseAccountJvmConverter.convert(obj.baseAccount))
    builder.setCodeHash(ByteString.copyFrom(obj.codeHash))
    return builder.build()
  }
}

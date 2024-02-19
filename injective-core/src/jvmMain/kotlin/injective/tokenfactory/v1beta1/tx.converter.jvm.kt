// Transform from injective/tokenfactory/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.bank.v1beta1.MetadataJvmConverter
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgCreateDenomJvmConverter : ProtobufTypeMapper<MsgCreateDenom, Tx.MsgCreateDenom> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateDenom.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDenom> = Tx.MsgCreateDenom.parser()

  public override fun convert(obj: Tx.MsgCreateDenom): MsgCreateDenom = MsgCreateDenom(
  	sender = obj.getSender(),
  	subdenom = obj.getSubdenom(),
  	name = obj.getName(),
  	symbol = obj.getSymbol(),
  )

  public override fun convert(obj: MsgCreateDenom): Tx.MsgCreateDenom {
    val builder = Tx.MsgCreateDenom.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubdenom(obj.subdenom)
    builder.setName(obj.name)
    builder.setSymbol(obj.symbol)
    return builder.build()
  }
}

public object MsgCreateDenomResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateDenomResponse, Tx.MsgCreateDenomResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateDenomResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDenomResponse> = Tx.MsgCreateDenomResponse.parser()

  public override fun convert(obj: Tx.MsgCreateDenomResponse): MsgCreateDenomResponse =
      MsgCreateDenomResponse(
  	newTokenDenom = obj.getNewTokenDenom(),
  )

  public override fun convert(obj: MsgCreateDenomResponse): Tx.MsgCreateDenomResponse {
    val builder = Tx.MsgCreateDenomResponse.newBuilder()
    builder.setNewTokenDenom(obj.newTokenDenom)
    return builder.build()
  }
}

public object MsgMintJvmConverter : ProtobufTypeMapper<MsgMint, Tx.MsgMint> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMint.getDescriptor()

  public override val parser: Parser<Tx.MsgMint> = Tx.MsgMint.parser()

  public override fun convert(obj: Tx.MsgMint): MsgMint = MsgMint(
  	sender = obj.getSender(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgMint): Tx.MsgMint {
    val builder = Tx.MsgMint.newBuilder()
    builder.setSender(obj.sender)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgMintResponseJvmConverter : ProtobufTypeMapper<MsgMintResponse, Tx.MsgMintResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMintResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgMintResponse> = Tx.MsgMintResponse.parser()

  public override fun convert(obj: Tx.MsgMintResponse): MsgMintResponse = MsgMintResponse(
  )

  public override fun convert(obj: MsgMintResponse): Tx.MsgMintResponse {
    val builder = Tx.MsgMintResponse.newBuilder()
    return builder.build()
  }
}

public object MsgBurnJvmConverter : ProtobufTypeMapper<MsgBurn, Tx.MsgBurn> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBurn.getDescriptor()

  public override val parser: Parser<Tx.MsgBurn> = Tx.MsgBurn.parser()

  public override fun convert(obj: Tx.MsgBurn): MsgBurn = MsgBurn(
  	sender = obj.getSender(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgBurn): Tx.MsgBurn {
    val builder = Tx.MsgBurn.newBuilder()
    builder.setSender(obj.sender)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgBurnResponseJvmConverter : ProtobufTypeMapper<MsgBurnResponse, Tx.MsgBurnResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBurnResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBurnResponse> = Tx.MsgBurnResponse.parser()

  public override fun convert(obj: Tx.MsgBurnResponse): MsgBurnResponse = MsgBurnResponse(
  )

  public override fun convert(obj: MsgBurnResponse): Tx.MsgBurnResponse {
    val builder = Tx.MsgBurnResponse.newBuilder()
    return builder.build()
  }
}

public object MsgChangeAdminJvmConverter : ProtobufTypeMapper<MsgChangeAdmin, Tx.MsgChangeAdmin> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgChangeAdmin.getDescriptor()

  public override val parser: Parser<Tx.MsgChangeAdmin> = Tx.MsgChangeAdmin.parser()

  public override fun convert(obj: Tx.MsgChangeAdmin): MsgChangeAdmin = MsgChangeAdmin(
  	sender = obj.getSender(),
  	denom = obj.getDenom(),
  	newAdmin = obj.getNewAdmin(),
  )

  public override fun convert(obj: MsgChangeAdmin): Tx.MsgChangeAdmin {
    val builder = Tx.MsgChangeAdmin.newBuilder()
    builder.setSender(obj.sender)
    builder.setDenom(obj.denom)
    builder.setNewAdmin(obj.newAdmin)
    return builder.build()
  }
}

public object MsgChangeAdminResponseJvmConverter :
    ProtobufTypeMapper<MsgChangeAdminResponse, Tx.MsgChangeAdminResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgChangeAdminResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgChangeAdminResponse> = Tx.MsgChangeAdminResponse.parser()

  public override fun convert(obj: Tx.MsgChangeAdminResponse): MsgChangeAdminResponse =
      MsgChangeAdminResponse(
  )

  public override fun convert(obj: MsgChangeAdminResponse): Tx.MsgChangeAdminResponse {
    val builder = Tx.MsgChangeAdminResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSetDenomMetadataJvmConverter :
    ProtobufTypeMapper<MsgSetDenomMetadata, Tx.MsgSetDenomMetadata> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSetDenomMetadata.getDescriptor()

  public override val parser: Parser<Tx.MsgSetDenomMetadata> = Tx.MsgSetDenomMetadata.parser()

  public override fun convert(obj: Tx.MsgSetDenomMetadata): MsgSetDenomMetadata =
      MsgSetDenomMetadata(
  	sender = obj.getSender(),
  	metadata = MetadataJvmConverter.convert(obj.getMetadata()),
  )

  public override fun convert(obj: MsgSetDenomMetadata): Tx.MsgSetDenomMetadata {
    val builder = Tx.MsgSetDenomMetadata.newBuilder()
    builder.setSender(obj.sender)
    builder.setMetadata(MetadataJvmConverter.convert(obj.metadata))
    return builder.build()
  }
}

public object MsgSetDenomMetadataResponseJvmConverter :
    ProtobufTypeMapper<MsgSetDenomMetadataResponse, Tx.MsgSetDenomMetadataResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSetDenomMetadataResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSetDenomMetadataResponse> =
      Tx.MsgSetDenomMetadataResponse.parser()

  public override fun convert(obj: Tx.MsgSetDenomMetadataResponse): MsgSetDenomMetadataResponse =
      MsgSetDenomMetadataResponse(
  )

  public override fun convert(obj: MsgSetDenomMetadataResponse): Tx.MsgSetDenomMetadataResponse {
    val builder = Tx.MsgSetDenomMetadataResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

// Transform from injective/tokenfactory/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateDenomConverter : ProtobufConverter<MsgCreateDenom> by
    MsgCreateDenomJvmConverter

public actual object MsgCreateDenomResponseConverter : ProtobufConverter<MsgCreateDenomResponse> by
    MsgCreateDenomResponseJvmConverter

public actual object MsgMintConverter : ProtobufConverter<MsgMint> by MsgMintJvmConverter

public actual object MsgMintResponseConverter : ProtobufConverter<MsgMintResponse> by
    MsgMintResponseJvmConverter

public actual object MsgBurnConverter : ProtobufConverter<MsgBurn> by MsgBurnJvmConverter

public actual object MsgBurnResponseConverter : ProtobufConverter<MsgBurnResponse> by
    MsgBurnResponseJvmConverter

public actual object MsgChangeAdminConverter : ProtobufConverter<MsgChangeAdmin> by
    MsgChangeAdminJvmConverter

public actual object MsgChangeAdminResponseConverter : ProtobufConverter<MsgChangeAdminResponse> by
    MsgChangeAdminResponseJvmConverter

public actual object MsgSetDenomMetadataConverter : ProtobufConverter<MsgSetDenomMetadata> by
    MsgSetDenomMetadataJvmConverter

public actual object MsgSetDenomMetadataResponseConverter :
    ProtobufConverter<MsgSetDenomMetadataResponse> by MsgSetDenomMetadataResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

// Transform from tendermint/store/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.store

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BlockStoreStateJvmConverter :
    ProtobufTypeMapper<BlockStoreState, Types.BlockStoreState> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockStoreState.getDescriptor()

  public override val parser: Parser<Types.BlockStoreState> = Types.BlockStoreState.parser()

  public override fun convert(obj: Types.BlockStoreState): BlockStoreState = BlockStoreState(
  	base = obj.getBase(),
  	height = obj.getHeight(),
  )

  public override fun convert(obj: BlockStoreState): Types.BlockStoreState {
    val builder = Types.BlockStoreState.newBuilder()
    builder.setBase(obj.base)
    builder.setHeight(obj.height)
    return builder.build()
  }
}

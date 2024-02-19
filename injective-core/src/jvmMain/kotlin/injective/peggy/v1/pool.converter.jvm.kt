// Transform from injective/peggy/v1/pool.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object IDSetJvmConverter : ProtobufTypeMapper<IDSet, Pool.IDSet> {
  public override val descriptor: Descriptors.Descriptor = Pool.IDSet.getDescriptor()

  public override val parser: Parser<Pool.IDSet> = Pool.IDSet.parser()

  public override fun convert(obj: Pool.IDSet): IDSet = IDSet(
  	ids = obj.getIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: IDSet): Pool.IDSet {
    val builder = Pool.IDSet.newBuilder()
    builder.addAllIds(obj.ids.map { it.asJavaType })
    return builder.build()
  }
}

public object BatchFeesJvmConverter : ProtobufTypeMapper<BatchFees, Pool.BatchFees> {
  public override val descriptor: Descriptors.Descriptor = Pool.BatchFees.getDescriptor()

  public override val parser: Parser<Pool.BatchFees> = Pool.BatchFees.parser()

  public override fun convert(obj: Pool.BatchFees): BatchFees = BatchFees(
  	token = obj.getToken(),
  	totalFees = obj.getTotalFees(),
  )

  public override fun convert(obj: BatchFees): Pool.BatchFees {
    val builder = Pool.BatchFees.newBuilder()
    builder.setToken(obj.token)
    builder.setTotalFees(obj.totalFees)
    return builder.build()
  }
}

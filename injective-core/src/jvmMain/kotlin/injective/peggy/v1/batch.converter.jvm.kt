// Transform from injective/peggy/v1/batch.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object OutgoingTxBatchJvmConverter :
    ProtobufTypeMapper<OutgoingTxBatch, Batch.OutgoingTxBatch> {
  public override val descriptor: Descriptors.Descriptor = Batch.OutgoingTxBatch.getDescriptor()

  public override val parser: Parser<Batch.OutgoingTxBatch> = Batch.OutgoingTxBatch.parser()

  public override fun convert(obj: Batch.OutgoingTxBatch): OutgoingTxBatch = OutgoingTxBatch(
  	batchNonce = obj.getBatchNonce().asKotlinType,
  	batchTimeout = obj.getBatchTimeout().asKotlinType,
  	transactions = obj.getTransactionsList().map { OutgoingTransferTxJvmConverter.convert(it) },
  	tokenContract = obj.getTokenContract(),
  	block = obj.getBlock().asKotlinType,
  )

  public override fun convert(obj: OutgoingTxBatch): Batch.OutgoingTxBatch {
    val builder = Batch.OutgoingTxBatch.newBuilder()
    builder.setBatchNonce(obj.batchNonce.asJavaType)
    builder.setBatchTimeout(obj.batchTimeout.asJavaType)
    builder.addAllTransactions(obj.transactions.map { OutgoingTransferTxJvmConverter.convert(it) })
    builder.setTokenContract(obj.tokenContract)
    builder.setBlock(obj.block.asJavaType)
    return builder.build()
  }
}

public object OutgoingTransferTxJvmConverter :
    ProtobufTypeMapper<OutgoingTransferTx, Batch.OutgoingTransferTx> {
  public override val descriptor: Descriptors.Descriptor = Batch.OutgoingTransferTx.getDescriptor()

  public override val parser: Parser<Batch.OutgoingTransferTx> = Batch.OutgoingTransferTx.parser()

  public override fun convert(obj: Batch.OutgoingTransferTx): OutgoingTransferTx =
      OutgoingTransferTx(
  	id = obj.getId().asKotlinType,
  	sender = obj.getSender(),
  	destAddress = obj.getDestAddress(),
  	erc20Token = ERC20TokenJvmConverter.convert(obj.getErc20Token()),
  	erc20Fee = ERC20TokenJvmConverter.convert(obj.getErc20Fee()),
  )

  public override fun convert(obj: OutgoingTransferTx): Batch.OutgoingTransferTx {
    val builder = Batch.OutgoingTransferTx.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.setSender(obj.sender)
    builder.setDestAddress(obj.destAddress)
    builder.setErc20Token(ERC20TokenJvmConverter.convert(obj.erc20Token))
    builder.setErc20Fee(ERC20TokenJvmConverter.convert(obj.erc20Fee))
    return builder.build()
  }
}

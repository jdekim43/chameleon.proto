// Transform from cosmwasm/wasm/v1/proposal_legacy.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object StoreCodeProposalJvmConverter :
    ProtobufTypeMapper<StoreCodeProposal, ProposalLegacy.StoreCodeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.StoreCodeProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.StoreCodeProposal> =
      ProposalLegacy.StoreCodeProposal.parser()

  public override fun convert(obj: ProposalLegacy.StoreCodeProposal): StoreCodeProposal =
      StoreCodeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	wasmByteCode = obj.getWasmByteCode().toByteArray(),
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  	unpinCode = obj.getUnpinCode(),
  	source = obj.getSource(),
  	builder = obj.getBuilder(),
  	codeHash = obj.getCodeHash().toByteArray(),
  )

  public override fun convert(obj: StoreCodeProposal): ProposalLegacy.StoreCodeProposal {
    val builder = ProposalLegacy.StoreCodeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setWasmByteCode(ByteString.copyFrom(obj.wasmByteCode))
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    builder.setUnpinCode(obj.unpinCode)
    builder.setSource(obj.source)
    builder.setBuilder(obj.builder)
    builder.setCodeHash(ByteString.copyFrom(obj.codeHash))
    return builder.build()
  }
}

public object InstantiateContractProposalJvmConverter :
    ProtobufTypeMapper<InstantiateContractProposal, ProposalLegacy.InstantiateContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.InstantiateContractProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.InstantiateContractProposal> =
      ProposalLegacy.InstantiateContractProposal.parser()

  public override fun convert(obj: ProposalLegacy.InstantiateContractProposal):
      InstantiateContractProposal = InstantiateContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	admin = obj.getAdmin(),
  	codeId = obj.getCodeId().asKotlinType,
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: InstantiateContractProposal):
      ProposalLegacy.InstantiateContractProposal {
    val builder = ProposalLegacy.InstantiateContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setAdmin(obj.admin)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object InstantiateContract2ProposalJvmConverter :
    ProtobufTypeMapper<InstantiateContract2Proposal, ProposalLegacy.InstantiateContract2Proposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.InstantiateContract2Proposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.InstantiateContract2Proposal> =
      ProposalLegacy.InstantiateContract2Proposal.parser()

  public override fun convert(obj: ProposalLegacy.InstantiateContract2Proposal):
      InstantiateContract2Proposal = InstantiateContract2Proposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	admin = obj.getAdmin(),
  	codeId = obj.getCodeId().asKotlinType,
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  	salt = obj.getSalt().toByteArray(),
  	fixMsg = obj.getFixMsg(),
  )

  public override fun convert(obj: InstantiateContract2Proposal):
      ProposalLegacy.InstantiateContract2Proposal {
    val builder = ProposalLegacy.InstantiateContract2Proposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setAdmin(obj.admin)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    builder.setSalt(ByteString.copyFrom(obj.salt))
    builder.setFixMsg(obj.fixMsg)
    return builder.build()
  }
}

public object MigrateContractProposalJvmConverter :
    ProtobufTypeMapper<MigrateContractProposal, ProposalLegacy.MigrateContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.MigrateContractProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.MigrateContractProposal> =
      ProposalLegacy.MigrateContractProposal.parser()

  public override fun convert(obj: ProposalLegacy.MigrateContractProposal): MigrateContractProposal
      = MigrateContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contract = obj.getContract(),
  	codeId = obj.getCodeId().asKotlinType,
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: MigrateContractProposal):
      ProposalLegacy.MigrateContractProposal {
    val builder = ProposalLegacy.MigrateContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContract(obj.contract)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object SudoContractProposalJvmConverter :
    ProtobufTypeMapper<SudoContractProposal, ProposalLegacy.SudoContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.SudoContractProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.SudoContractProposal> =
      ProposalLegacy.SudoContractProposal.parser()

  public override fun convert(obj: ProposalLegacy.SudoContractProposal): SudoContractProposal =
      SudoContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contract = obj.getContract(),
  	msg = obj.getMsg().toByteArray(),
  )

  public override fun convert(obj: SudoContractProposal): ProposalLegacy.SudoContractProposal {
    val builder = ProposalLegacy.SudoContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContract(obj.contract)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    return builder.build()
  }
}

public object ExecuteContractProposalJvmConverter :
    ProtobufTypeMapper<ExecuteContractProposal, ProposalLegacy.ExecuteContractProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.ExecuteContractProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.ExecuteContractProposal> =
      ProposalLegacy.ExecuteContractProposal.parser()

  public override fun convert(obj: ProposalLegacy.ExecuteContractProposal): ExecuteContractProposal
      = ExecuteContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	contract = obj.getContract(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ExecuteContractProposal):
      ProposalLegacy.ExecuteContractProposal {
    val builder = ProposalLegacy.ExecuteContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setContract(obj.contract)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object UpdateAdminProposalJvmConverter :
    ProtobufTypeMapper<UpdateAdminProposal, ProposalLegacy.UpdateAdminProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.UpdateAdminProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.UpdateAdminProposal> =
      ProposalLegacy.UpdateAdminProposal.parser()

  public override fun convert(obj: ProposalLegacy.UpdateAdminProposal): UpdateAdminProposal =
      UpdateAdminProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	newAdmin = obj.getNewAdmin(),
  	contract = obj.getContract(),
  )

  public override fun convert(obj: UpdateAdminProposal): ProposalLegacy.UpdateAdminProposal {
    val builder = ProposalLegacy.UpdateAdminProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setNewAdmin(obj.newAdmin)
    builder.setContract(obj.contract)
    return builder.build()
  }
}

public object ClearAdminProposalJvmConverter :
    ProtobufTypeMapper<ClearAdminProposal, ProposalLegacy.ClearAdminProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.ClearAdminProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.ClearAdminProposal> =
      ProposalLegacy.ClearAdminProposal.parser()

  public override fun convert(obj: ProposalLegacy.ClearAdminProposal): ClearAdminProposal =
      ClearAdminProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contract = obj.getContract(),
  )

  public override fun convert(obj: ClearAdminProposal): ProposalLegacy.ClearAdminProposal {
    val builder = ProposalLegacy.ClearAdminProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContract(obj.contract)
    return builder.build()
  }
}

public object PinCodesProposalJvmConverter :
    ProtobufTypeMapper<PinCodesProposal, ProposalLegacy.PinCodesProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.PinCodesProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.PinCodesProposal> =
      ProposalLegacy.PinCodesProposal.parser()

  public override fun convert(obj: ProposalLegacy.PinCodesProposal): PinCodesProposal =
      PinCodesProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: PinCodesProposal): ProposalLegacy.PinCodesProposal {
    val builder = ProposalLegacy.PinCodesProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    return builder.build()
  }
}

public object UnpinCodesProposalJvmConverter :
    ProtobufTypeMapper<UnpinCodesProposal, ProposalLegacy.UnpinCodesProposal> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.UnpinCodesProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.UnpinCodesProposal> =
      ProposalLegacy.UnpinCodesProposal.parser()

  public override fun convert(obj: ProposalLegacy.UnpinCodesProposal): UnpinCodesProposal =
      UnpinCodesProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	codeIds = obj.getCodeIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: UnpinCodesProposal): ProposalLegacy.UnpinCodesProposal {
    val builder = ProposalLegacy.UnpinCodesProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllCodeIds(obj.codeIds.map { it.asJavaType })
    return builder.build()
  }
}

public object AccessConfigUpdateJvmConverter :
    ProtobufTypeMapper<AccessConfigUpdate, ProposalLegacy.AccessConfigUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.AccessConfigUpdate.getDescriptor()

  public override val parser: Parser<ProposalLegacy.AccessConfigUpdate> =
      ProposalLegacy.AccessConfigUpdate.parser()

  public override fun convert(obj: ProposalLegacy.AccessConfigUpdate): AccessConfigUpdate =
      AccessConfigUpdate(
  	codeId = obj.getCodeId().asKotlinType,
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  )

  public override fun convert(obj: AccessConfigUpdate): ProposalLegacy.AccessConfigUpdate {
    val builder = ProposalLegacy.AccessConfigUpdate.newBuilder()
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    return builder.build()
  }
}

public object UpdateInstantiateConfigProposalJvmConverter :
    ProtobufTypeMapper<UpdateInstantiateConfigProposal, ProposalLegacy.UpdateInstantiateConfigProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.UpdateInstantiateConfigProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.UpdateInstantiateConfigProposal> =
      ProposalLegacy.UpdateInstantiateConfigProposal.parser()

  public override fun convert(obj: ProposalLegacy.UpdateInstantiateConfigProposal):
      UpdateInstantiateConfigProposal = UpdateInstantiateConfigProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	accessConfigUpdates = obj.getAccessConfigUpdatesList().map {
      AccessConfigUpdateJvmConverter.convert(it) },
  )

  public override fun convert(obj: UpdateInstantiateConfigProposal):
      ProposalLegacy.UpdateInstantiateConfigProposal {
    val builder = ProposalLegacy.UpdateInstantiateConfigProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllAccessConfigUpdates(obj.accessConfigUpdates.map {
        AccessConfigUpdateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object StoreAndInstantiateContractProposalJvmConverter :
    ProtobufTypeMapper<StoreAndInstantiateContractProposal, ProposalLegacy.StoreAndInstantiateContractProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      ProposalLegacy.StoreAndInstantiateContractProposal.getDescriptor()

  public override val parser: Parser<ProposalLegacy.StoreAndInstantiateContractProposal> =
      ProposalLegacy.StoreAndInstantiateContractProposal.parser()

  public override fun convert(obj: ProposalLegacy.StoreAndInstantiateContractProposal):
      StoreAndInstantiateContractProposal = StoreAndInstantiateContractProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	runAs = obj.getRunAs(),
  	wasmByteCode = obj.getWasmByteCode().toByteArray(),
  	instantiatePermission = AccessConfigJvmConverter.convert(obj.getInstantiatePermission()),
  	unpinCode = obj.getUnpinCode(),
  	admin = obj.getAdmin(),
  	label = obj.getLabel(),
  	msg = obj.getMsg().toByteArray(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  	source = obj.getSource(),
  	builder = obj.getBuilder(),
  	codeHash = obj.getCodeHash().toByteArray(),
  )

  public override fun convert(obj: StoreAndInstantiateContractProposal):
      ProposalLegacy.StoreAndInstantiateContractProposal {
    val builder = ProposalLegacy.StoreAndInstantiateContractProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRunAs(obj.runAs)
    builder.setWasmByteCode(ByteString.copyFrom(obj.wasmByteCode))
    builder.setInstantiatePermission(AccessConfigJvmConverter.convert(obj.instantiatePermission))
    builder.setUnpinCode(obj.unpinCode)
    builder.setAdmin(obj.admin)
    builder.setLabel(obj.label)
    builder.setMsg(ByteString.copyFrom(obj.msg))
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    builder.setSource(obj.source)
    builder.setBuilder(obj.builder)
    builder.setCodeHash(ByteString.copyFrom(obj.codeHash))
    return builder.build()
  }
}

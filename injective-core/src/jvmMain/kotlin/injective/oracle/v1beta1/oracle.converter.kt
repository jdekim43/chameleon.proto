// Transform from injective/oracle/v1beta1/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object OracleInfoConverter : ProtobufConverter<OracleInfo> by OracleInfoJvmConverter

public actual object ChainlinkPriceStateConverter : ProtobufConverter<ChainlinkPriceState> by
    ChainlinkPriceStateJvmConverter

public actual object BandPriceStateConverter : ProtobufConverter<BandPriceState> by
    BandPriceStateJvmConverter

public actual object PriceFeedStateConverter : ProtobufConverter<PriceFeedState> by
    PriceFeedStateJvmConverter

public actual object ProviderInfoConverter : ProtobufConverter<ProviderInfo> by
    ProviderInfoJvmConverter

public actual object ProviderStateConverter : ProtobufConverter<ProviderState> by
    ProviderStateJvmConverter

public actual object ProviderPriceStateConverter : ProtobufConverter<ProviderPriceState> by
    ProviderPriceStateJvmConverter

public actual object PriceFeedInfoConverter : ProtobufConverter<PriceFeedInfo> by
    PriceFeedInfoJvmConverter

public actual object PriceFeedPriceConverter : ProtobufConverter<PriceFeedPrice> by
    PriceFeedPriceJvmConverter

public actual object CoinbasePriceStateConverter : ProtobufConverter<CoinbasePriceState> by
    CoinbasePriceStateJvmConverter

public actual object PriceStateConverter : ProtobufConverter<PriceState> by PriceStateJvmConverter

public actual object PythPriceStateConverter : ProtobufConverter<PythPriceState> by
    PythPriceStateJvmConverter

public actual object BandOracleRequestConverter : ProtobufConverter<BandOracleRequest> by
    BandOracleRequestJvmConverter

public actual object BandIBCParamsConverter : ProtobufConverter<BandIBCParams> by
    BandIBCParamsJvmConverter

public actual object SymbolPriceTimestampConverter : ProtobufConverter<SymbolPriceTimestamp> by
    SymbolPriceTimestampJvmConverter

public actual object LastPriceTimestampsConverter : ProtobufConverter<LastPriceTimestamps> by
    LastPriceTimestampsJvmConverter

public actual object PriceRecordsConverter : ProtobufConverter<PriceRecords> by
    PriceRecordsJvmConverter

public actual object PriceRecordConverter : ProtobufConverter<PriceRecord> by
    PriceRecordJvmConverter

public actual object MetadataStatisticsConverter : ProtobufConverter<MetadataStatistics> by
    MetadataStatisticsJvmConverter

public actual object PriceAttestationConverter : ProtobufConverter<PriceAttestation> by
    PriceAttestationJvmConverter

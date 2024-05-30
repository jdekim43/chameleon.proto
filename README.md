# chameleon.proto
This repository contains generated codes of protobuf files for [chameleon](https://github.com/jdekim43/chameleon) library.
These are generated using protoc compiler with [kotlin-protobuf](https://github.com/jdekim43/kotlin-protobuf) plugin.

## How to build
This repository **can not build** with `./gradlew build` command.
Because each modules have different dependent version.
So you should choose target module.

### Instruction
1. Checkout target module : `cd ${MODULE_DIR}/target && checkout ${VERSION}`
2. Checkout dependencies : `./gradlew :[module path]:checkoutDependencies`.
    * It will be checkout dependent modules automatically.
3. Clean project : `./gradlew clean cleanProto`
4. Compile protobuf files : `./gradlew :[module path]:generateProto`
5. Build : `./gradlew :[module path]:build`

#### Example : injective-core
```
cd ${PROJECT_DIR}/injective-core/target
git fetch --all --tags
git checkout v1.12.1
cd ${PROJECT_DIR}

./gradlew :chameleon-proto-injective-core:checkoutDependencies
./gradlew clean
./gradlew cleanProto
./gradlew :chameleon-proto-injective-core:generateProto
./gradlew :chameleon-proto-injective-core:build
```

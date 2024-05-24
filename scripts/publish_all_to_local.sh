#!/bin/sh

set -e

#todo: fetch latest version
./publish_to_local.sh terra-classic-core v2.3.0
./publish_to_local.sh terra-alliance v0.4.3
./publish_to_local.sh sei-chain v3.9.0
./publish_to_local.sh injective-core v1.12.1
./publish_to_local.sh initia v0.2.15

#!/bin/sh

set -e

#todo: fetch latest version
./publish_to_local.sh terra-classic-core v3.0.1
./publish_to_local.sh terra-core v2.11.1
./publish_to_local.sh sei-chain v5.5.2
./publish_to_local.sh injective-core v1.12.1 || ./publish_to_local.sh injective-core v1.12.1
./publish_to_local.sh initia v0.2.15

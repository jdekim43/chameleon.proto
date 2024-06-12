#!/bin/sh

set -e

#todo: fetch latest version
./publish.sh terra-classic-core v3.0.1
./publish.sh terra-core v2.11.1
./publish.sh sei-chain v5.5.2
./publish.sh injective-core v1.12.1 || ./publish.sh injective-core v1.12.1
./publish.sh initia v0.2.15

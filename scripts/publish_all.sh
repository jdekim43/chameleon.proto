#!/bin/sh

set -e

#todo: fetch latest version
./publish.sh terra-classic-core v2.3.0
./publish.sh terra-alliance v0.4.3
./publish.sh sei-chain v3.9.0
./publish.sh injective-core v1.12.1
./publish.sh initia v0.2.15

#todo: fix cosmos-sdk cleaning, initia uptime
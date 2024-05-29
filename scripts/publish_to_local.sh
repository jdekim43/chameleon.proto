#!/bin/sh

set -e

SCRIPT_DIR=$(dirname $(realpath "$0"))
BASE_DIR="$SCRIPT_DIR/../"

PROJECT="$1"
VERSION="$2"
TARGET_DIR="$3"

if [ -z "$PROJECT" ]
then
  read -p "Project ID : " PROJECT
fi

if [ -z "$VERSION" ]
then
  read -p "Version : " VERSION
fi

if [ -z "$TARGET_DIR" ]
then
  TARGET_DIR="target"
fi

cd "$BASE_DIR/$PROJECT/$TARGET_DIR"

git fetch --all --tags --force
git checkout $VERSION

cd "$BASE_DIR"

echo "Checkout $PROJECT"
./gradlew -q :chameleon-proto-$PROJECT:checkout

echo "Clean"
./gradlew -q clean

echo "Clean All"
./gradlew -q cleanProto

echo "GenerateProto $PROJECT"
./gradlew -q :chameleon-proto-$PROJECT:generateProto

echo "Publish $PROJECT"
./gradlew -q :chameleon-proto-$PROJECT:publishAllToMavenLocal
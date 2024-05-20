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

git fetch --all --tags
git checkout $VERSION

cd "$BASE_DIR"

./gradlew :chameleon-proto-$PROJECT:checkout
./gradlew :chameleon-proto-$PROJECT:publishToMavenLocal
#./gradlew :chamelon-proto-$PROJECT:publish
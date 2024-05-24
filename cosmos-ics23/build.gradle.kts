version = "${resolveVersion("cosmos-ics23", prefix="go/v")}-$buildNumber"

targetDependencies {
    checkoutTagPrefix.set("go/v")
}

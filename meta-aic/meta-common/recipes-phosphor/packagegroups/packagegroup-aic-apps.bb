SUMMARY = "OpenBMC for AIC - Applications"
PR = "r1"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-flash \
        ${PN}-system \
        ${PN}-fan \
        "

PROVIDES += "obmc-chassis-mgmt"
PROVIDES += "obmc-flash-mgmt"
PROVIDES += "obmc-system-mgmt"
PROVIDES += "obmc-fan-mgmt"

RPROVIDES:${PN}-chassis += "obmc-chassis-mgmt"
RPROVIDES:${PN}-flash += "obmc-flash-mgmt"
RPROVIDES:${PN}-system += "obmc-system-mgmt"
RPROVIDES:${PN}-system += "obmc-fan-mgmt"

SUMMARY:${PN}-chassis = "AIC Chassis"
RDEPENDS:${PN}-chassis = " \
        x86-power-control \
        "

SUMMARY:${PN}-flash = "AIC Flash"
RDEPENDS:${PN}-flash = " \
        phosphor-software-manager \
        "

SUMMARY:${PN}-system = "AIC System"
RDEPENDS:${PN}-system = " \
        dbus-sensors \
        phosphor-hostlogger \
        phosphor-sel-logger \
        ipmitool \
        phosphor-post-code-manager \
        phosphor-host-postd \
        phosphor-ipmi-ipmb \
        phosphor-hwmon \
        bmcweb \
        usb-network \
        ncsid \
        webui-vue \
        "

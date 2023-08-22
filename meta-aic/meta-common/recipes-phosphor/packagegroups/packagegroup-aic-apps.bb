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

PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-flash-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"
PROVIDES += "virtual/obmc-fan-mgmt"

RPROVIDES:${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES:${PN}-flash += "virtual-obmc-flash-mgmt"
RPROVIDES:${PN}-system += "virtual-obmc-system-mgmt"
RPROVIDES:${PN}-system += "virtual-obmc-fan-mgmt"

SUMMARY:${PN}-chassis = "AIC Chassis"
RDEPENDS:${PN}-chassis = " \
        x86-power-control \
        "

SUMMARY:${PN}-flash = "AIC Flash"
RDEPENDS:${PN}-flash = " \
        phosphor-software-manager \
        "

SUMMARY:${PN}-fan = "AIC Fan"
RDEPENDS:${PN}-flash = " \
        phosphor-pid-control \
        "

SUMMARY:${PN}-system = "AIC System"
RDEPENDS:${PN}-system = " \
        lmsensors \
        dbus-sensors \
        phosphor-hostlogger \
        phosphor-sel-logger \
        phosphor-post-code-manager \
        phosphor-host-postd \
        phosphor-led-manager \
        entity-manager \
        bmcweb \
        phosphor-snmp \
        ipmitool \
        i2c-tools \
        smbios-mdr \
        phosphor-ipmi-blobs \
        biosconfig-manager \
        webui-vue \
        peci-pcie \
        "

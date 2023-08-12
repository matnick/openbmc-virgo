SUMMARY = "OpenBMC for AIC - Applications"
PR = "r1"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-chassis \
        ${PN}-flash \
        ${PN}-system \
        "

PROVIDES += "virtual/obmc-chassis-mgmt"
PROVIDES += "virtual/obmc-flash-mgmt"
PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES:${PN}-chassis += "virtual-obmc-chassis-mgmt"
RPROVIDES:${PN}-flash += "virtual-obmc-flash-mgmt"
RPROVIDES:${PN}-system += "virtual-obmc-system-mgmt"

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
        lmsensors \
        dbus-sensors \
        phosphor-hostlogger \
        phosphor-post-code-manager \
        phosphor-host-postd \
        entity-manager \
        bmcweb \
        ipmitool \
        i2c-tools \
        smbios-mdr \
        phosphor-ipmi-blobs \
        biosconfig-manager \
        intel-ipmi-oem \
        webui-vue \
        peci-pcie \
        "

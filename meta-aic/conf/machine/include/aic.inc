MACHINE_FEATURES += "\
        obmc-bmc-state-mgmt \
        obmc-chassis-state-mgmt \
        obmc-host-ipmi \
        obmc-host-state-mgmt \
        obmc-phosphor-chassis-mgmt \
        obmc-phosphor-fan-mgmt \
        obmc-phosphor-flash-mgmt \
        obmc-system-mgmt \
        obmc-fru-ipmi \
        obmc-devtools \
        obmc-sensors \
        "

OBMC_IMAGE_EXTRA_INSTALL:append = " \
                                   phosphor-gpio-monitor-monitor \
                                   phosphor-ipmi-blobs \
                                   phosphor-ipmi-blobs-binarystore \
                                   util-linux \
                                   phosphor-hwmon \
                                   peci-pcie \
                                   phosphor-hostlogger \
                                   phosphor-sel-logger \
                                   phosphor-post-code-manager \
                                   phosphor-host-postd \
                                   phosphor-led-manager \
                                   phosphor-ipmi-blobs \
                                   phosphor-snmp \
                                   phosphor-dbus-monitor \
                                   entity-manager \
                                   bmcweb \
                                   ipmitool \
                                   iotools \
                                   openocd \
                                   i2c-tools \
                                   smbios-mdr \
                                   biosconfig-manager \
                                   webui-vue \
                                  "

VIRTUAL-RUNTIME_obmc-inventory-manager = "entity-manager"
PREFERRED_PROVIDER_virtual/obmc-inventory-data = "entity-manager"
VIRTUAL-RUNTIME_obmc-sensors-hwmon = "phosphor-hwmon"

VIRTUAL-RUNTIME_obmc-host-state-manager ?= "x86-power-control"
VIRTUAL-RUNTIME_obmc-chassis-state-manager ?= "x86-power-control"

PREFERRED_PROVIDER_virtual/obmc-chassis-mgmt = "packagegroup-aic-apps"
PREFERRED_PROVIDER_virtual/obmc-flash-mgmt = "packagegroup-aic-apps"
PREFERRED_PROVIDER_virtual/obmc-host-ipmi-hw ?= "phosphor-ipmi-kcs"
PREFERRED_PROVIDER_virtual/obmc-system-mgmt = "packagegroup-aic-apps"
PREFERRED_PROVIDER_virtual/obmc-fan-mgmt = "packagegroup-aic-apps"

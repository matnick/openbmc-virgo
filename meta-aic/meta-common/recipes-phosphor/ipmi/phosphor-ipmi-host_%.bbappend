#PACKAGECONFIG:append = "dynamic-sensors"

FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

DEPENDS:append = "\
    virgo-yaml-config"

EXTRA_OEMESON = " \
                -Dsensor-yaml-gen=${STAGING_DIR_HOST}${datadir}/virgo-yaml-config/ipmi-sensors.yaml \
                -Dfru-yaml-gen=${STAGING_DIR_HOST}${datadir}/virgo-yaml-config/ipmi-fru-read.yaml \
               "
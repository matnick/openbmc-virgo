SUMMARY = "YAML configuration for AIC Virgo"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
PR = "r1"

inherit allarch

SRC_URI = " \
    file://virgo-ipmi-sensors.yaml \
    file://virgo-ipmi-fru.yaml \
    "

S = "${WORKDIR}"

do_install() {
    install -m 0644 -D ${MACHINE}-ipmi-sensors.yaml \
        ${D}${datadir}/${BPN}/ipmi-sensors.yaml
    install -m 0644 -D virgo-ipmi-fru.yaml \
        ${D}${datadir}/${BPN}/ipmi-fru-read.yaml
}

FILES:${PN}-dev = " \
                   ${datadir}/${BPN}/ipmi-sensors.yaml \
                   ${datadir}/${BPN}/ipmi-fru-read.yaml \
                  "

ALLOW_EMPTY:${PN} = "1"

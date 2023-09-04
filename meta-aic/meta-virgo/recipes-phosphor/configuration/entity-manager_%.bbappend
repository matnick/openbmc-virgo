FILESEXTRAPATHS:append := ":${THISDIR}/${PN}"
SRC_URI:append = " file://virgo-baseboard.json \
                 "

do_install:append() {
     rm -f ${D}${datadir}/entity-manager/configurations/*.json
     install -d ${D}${datadir}/entity-manager/configurations
     install -m 0444 ${WORKDIR}/virgo-baseboard.json ${D}${datadir}/entity-manager/configurations
}
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

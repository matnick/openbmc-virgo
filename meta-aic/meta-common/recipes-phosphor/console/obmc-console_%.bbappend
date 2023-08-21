FILESEXTRAPATHS:append := ":${THISDIR}/${PN}"
RDEPENDS:${PN} += "bash"

OBMC_CONSOLE_HOST_TTY = "ttyS0"
SRC_URI += " \
        file://obmc-console@.service \
"
inherit obmc-phosphor-systemd

SYSTEMD_SERVICE:${PN} += " \
        ${PN}@${OBMC_CONSOLE_HOST_TTY}.service \
"

do_install:append() {
        install -m 0644 ${WORKDIR}/${PN}@.service -D -t ${D}${systemd_system_unitdir}
}

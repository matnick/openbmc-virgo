FILESEXTRAPATHS:append := ":${THISDIR}/${PN}"
RDEPENDS:${PN} += "bash"

OBMC_CONSOLE_HOST_TTY = "ttyS0"
SRC_URI += " \
        file://obmc-console@.service \
        file://uart-remapping.sh \
"
inherit obmc-phosphor-systemd

SYSTEMD_SERVICE:${PN} += " \
        ${PN}@${OBMC_CONSOLE_HOST_TTY}.service \
"

do_install:append() {
        rm -rf ${D}${nonarch_base_libdir}/udev/rules.d/80-obmc-console-uart.rules
        install -m 0644 ${WORKDIR}/${PN}@.service -D -t ${D}${systemd_system_unitdir}
        install -m 0755 ${WORKDIR}/uart-remapping.sh -D -t ${D}${sbindir}
}

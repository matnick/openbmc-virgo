FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

KCS_DEVICE = "ipmi_kcs3"
SMM_DEVICE = "ipmi_kcs3"
SYSTEMD_SERVICE:${PN}:append = " ${PN}@${SMM_DEVICE}.service "

SRC_URI += "file://99-ipmi-kcs.rules"

do_install:append() {
    install -m 0644 ${WORKDIR}/99-ipmi-kcs.rules -D -t ${D}${nonarch_base_libdir}/udev/rules.d/
}

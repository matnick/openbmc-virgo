FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://systemd-networkd-only-wait-for-one.conf"

do_install:append:genesis3() {
        install -d ${D}${systemd_system_unitdir}/systemd-networkd-wait-online.service.d/
 }

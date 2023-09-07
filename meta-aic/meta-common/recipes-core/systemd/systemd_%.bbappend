FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://systemd-networkd-only-wait-for-one.conf"

do_install:append() {
        install -d ${D}${systemd_system_unitdir}/systemd-networkd-wait-online.service.d
}
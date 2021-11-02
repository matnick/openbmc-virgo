SUMMARY = "Phosphor BMC Memory ECC Logging"
DESCRIPTION = "Daemon to monitor and report the BMC memory ECC"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
PR = "r1"

inherit meson pkgconfig
inherit systemd

DEPENDS += "sdbusplus"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "sdeventplus"
DEPENDS += "phosphor-logging"

RDEPENDS:${PN} += "phosphor-sel-logger"

SRC_URI = "git://github.com/openbmc/phosphor-ecc.git"
SRCREV = "a56bb3cae1f176a0dc226e172f559185628d3318"

S = "${WORKDIR}/git"

SYSTEMD_SERVICE:${PN} = " ${PN}.service"

DEFAULT_RMCPP_IFACE = "eth0"

ALT_RMCPP_IFACE = "eth1"

SYSTEMD_SERVICE:${PN} += " \
        ${PN}@${DEFAULT_RMCPP_IFACE}.service \
        ${PN}@${DEFAULT_RMCPP_IFACE}.socket \
        "

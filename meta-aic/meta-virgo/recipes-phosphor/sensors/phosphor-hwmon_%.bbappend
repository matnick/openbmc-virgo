FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

DEPENDS += "boost"

GBS_NAMES = " \
        i2c@1e78a100/lm95241@2a \
        i2c@1e78a100/lm95241@2b \
        i2c@1e78a100/lm95241@19 \
        adc@1e6e9000 \
        "
GBS_ITEMSFMT = "ahb/apb/{0}.conf"

GBS_ITEMS += "${@compose_list(d, 'GBS_ITEMSFMT', 'GBS_NAMES')}"

ENVS = "obmc/hwmon/{0}"
SYSTEMD_ENVIRONMENT_FILE:${PN}:append = " ${@compose_list(d, 'ENVS', 'GBS_ITEMS')}"

# Fan sensors
FITEMS = "pwm-fan-controller@1e786000.conf"
FENVS = "obmc/hwmon/ahb/apb/{0}"
SYSTEMD_ENVIRONMENT_FILE:${PN}:append = " ${@compose_list(d, 'FENVS', 'FITEMS')}"


EXTRA_OEMESON:append = " -Dupdate-functional-on-fail=true -Dnegative-errno-on-fail=false"

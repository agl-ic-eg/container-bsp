
# Auto load pvrsrvkm
KERNEL_MODULE_AUTOLOAD_append = " pvrsrvkm"

module_do_install_append() {
    rm  ${D}${sysconfdir}/modprobe.d/blacklist.conf
}

FILES_${PN}_remove = " \
    ${sysconfdir}/modprobe.d/blacklist.conf \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux:"

SRC_URI_append = " file://lxc.cfg \
           "
KERNEL_CONFIG_FRAGMENTS_append = " \
             ${WORKDIR}/lxc.cfg \
"

SUMMARY = "Startup script and systemd unit file for the Weston Wayland compositor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "file://weston.ini \
           file://weston.service \
"

S = "${WORKDIR}"

do_install() {
        install -d ${D}${sysconfdir}/xdg/weston
        install -D -p -m0644 ${WORKDIR}/weston.ini ${D}${sysconfdir}/xdg/weston/weston.ini
        install -d ${D}/${systemd_unitdir}/system
        install -D -p -m0644 ${WORKDIR}/weston.service ${D}${systemd_unitdir}/system/weston.service
}

inherit update-rc.d features_check systemd

INITSCRIPT_NAME = "weston"
INITSCRIPT_PARAMS = "start 7 5 2 . stop 62 0 1 6 ."
SYSTEMD_SERVICE_${PN} = "weston.service"

# rdepends on weston which depends on virtual/egl
REQUIRED_DISTRO_FEATURES = "opengl"

RDEPENDS_${PN} = "weston"

FILES_${PN} += "${sysconfdir}/xdg/weston/weston.ini ${systemd_system_unitdir}/weston.service"

CONFFILES_${PN} += "${sysconfdir}/xdg/weston/weston.ini"

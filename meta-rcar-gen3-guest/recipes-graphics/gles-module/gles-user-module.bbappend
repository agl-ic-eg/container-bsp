do_populate_sysroot[depends] += "virtual/mesa:do_populate_sysroot"

PROVIDES = "virtual/libgles2"

RDEPENDS_${PN}_remove = " \
    kernel-module-gles \
"

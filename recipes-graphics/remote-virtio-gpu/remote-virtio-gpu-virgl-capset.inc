CAPSET="virgl-${MACHINE}.capset"

SRC_URI += " \
    file://${CAPSET} \
"

do_install_append() {
    install -d ${D}/etc
    install -m 0644 ${WORKDIR}/${CAPSET} ${D}/etc/virgl.capset
}

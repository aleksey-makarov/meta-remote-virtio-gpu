DESCRIPTION = "Virtio loopback kernel module"
SUMMARY = "Virtio loopback kernel module"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRCREV = "82b5e954feff655ae4269da6280c26bc0d4d4eb6"
SRC_URI = "git://github.com/aleksey-makarov/remote-virtio-gpu-driver.git;protocol=https;branch=work \
           file://Makefile \
"

inherit module

PN = "kernel-module-virtio-lo"
PR = "r0"

S = "${WORKDIR}/git"

do_configure:prepend () {
    cp ${WORKDIR}/Makefile ${S}
}

do_install:append () {
    install -d ${D}/${includedir}/linux
	install -m 644 ${WORKDIR}/git/virtio_lo.h ${D}/${includedir}/linux/
}

# PACKAGES = " \
#     ${PN} \
#     ${PN}-dev \
# "

# FILES:${PN} = " \
#     /lib/modules/${KERNEL_VERSION}/extra/virtio_lo.ko \
#     ${sysconfdir}/modules-load.d \
# "

# RPROVIDES:${PN} += "kernel-module-virtio-lo"

# # Autoload virtio lo driver
# KERNEL_MODULE_AUTOLOAD:append = " virtio_lo"

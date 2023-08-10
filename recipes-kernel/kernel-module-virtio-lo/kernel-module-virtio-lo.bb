DESCRIPTION = "Virtio loopback kernel module"
SUMMARY = "Virtio loopback kernel module"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

# SRC_URI = "git://git@floral.opensynergy.com/E0672/proj-e0672/remote-virtio-gpu.git;protocol=ssh file://Makefile"

SRCREV = "82b5e954feff655ae4269da6280c26bc0d4d4eb6"
SRC_URI = "git://github.com/aleksey-makarov/remote-virtio-gpu-driver.git;protocol=https;branch=work \
           file://Makefile \
"

inherit module

PN = "kernel-module-virtio-lo"
PR = "r0"

S = "${WORKDIR}/git"
# VIRTIOLO_DRV_DIR = "${S}"

# includedir = "/usr/local/include"
# SSTATE_DUPWHITELIST += "${STAGING_INCDIR}"

# # Build virtio kernel module without suffix
# KERNEL_MODULE_PACKAGE_SUFFIX = ""

# export KDIR = "${STAGING_KERNEL_DIR}"

do_configure:prepend () {
    cp ${WORKDIR}/Makefile ${S}
}
# 
# do_install () {
#     # Create destination directries
#     install -d ${D}/lib/modules/${KERNEL_VERSION}/extra/
#     install -d ${D}/${includedir}/linux
#     install -d ${STAGING_KERNEL_DIR}/include
# 
#     # This file installed in SDK by kernel-devsrc pkg.
#     install -m 644 ${VIRTIOLO_DRV_DIR}/Module.symvers ${STAGING_KERNEL_DIR}/include/virtio_lo.symvers
# 
#     # Install kernel module
#     install -m 644 ${VIRTIOLO_DRV_DIR}/virtio_lo.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/
# 
#     # Install shared header file
#     install -m 644 ${VIRTIOLO_DRV_DIR}/include/uapi/linux/virtio_lo.h ${D}/${includedir}/linux/
# }

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

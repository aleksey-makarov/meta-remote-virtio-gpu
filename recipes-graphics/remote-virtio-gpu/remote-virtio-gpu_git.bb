SUMMARY = "Remote virtio GPU application"
SECTION = "graphics"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "virglrenderer libinput kernel-module-virtio-lo"

SRCREV = "62ef3836fcb03144912f7c6af79f64ca29791974"
SRC_URI = "git://github.com/aleksey-makarov/remote-virtio-gpu.git;protocol=https;branch=for_merge_02"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

# require remote-virtio-gpu-virgl-capset.inc

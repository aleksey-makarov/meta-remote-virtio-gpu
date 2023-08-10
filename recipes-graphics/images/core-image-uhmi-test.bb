SUMMARY = "An image to test UHMI"

# IMAGE_FEATURES += "splash package-management ssh-server-dropbear hwcodecs weston"
IMAGE_FEATURES += "package-management ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image

# CORE_IMAGE_BASE_INSTALL += "gtk+3-demo"
# CORE_IMAGE_BASE_INSTALL += "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'weston-xwayland matchbox-terminal', '', d)}"

QB_MEM = "-m 4G"

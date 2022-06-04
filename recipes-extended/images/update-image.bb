DESCRIPTION = "Example image demonstrating how to build SWUpdate compound image"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit swupdate

SRC_URI = "\
    file://emmcsetup.lua \
    file://sw-description \
"

# images to build before building swupdate image
IMAGE_DEPENDS = "allwinner-tiny-update-image"

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "allwinner-tiny-update-image"

SWUPDATE_IMAGES_FSTYPES[allwinner-tiny-update-image] = ".ext4.gz"

# IMAGE_DEPENDS_rervision-dvk-h3 = "allwinner-tiny-update-image"

# SWUPDATE_IMAGES_rervision-dvk-h3 = "allwinner-tiny-update-image"

# SWUPDATE_IMAGES_FSTYPES_rervision-dvk-h3[allwinner-tiny-update-image] = ".ext4.gz"

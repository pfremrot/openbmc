KBRANCH = "aspeed-dev-v5.15"
LINUX_VERSION ?= "5.15.0"

#SRCREV = "${AUTOREV}"
SRCREV = "2ce987f70dd74a82fa952b2951d611af4161a5de"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require linux-aspeed.inc

DEPENDS += "lzop-native"
DEPENDS += "${@bb.utils.contains('MACHINE_FEATURES', 'ast-secure', 'aspeed-secure-config-native', '', d)}"

SRC_URI:append = " file://ipmi_ssif.cfg "
SRC_URI:append = " file://mtd_test.cfg "
SRC_URI:append = " file://crpyto_manager.cfg "
SRC_URI:append:cypress-s25hx = " file://jffs2_writebuffer.cfg "


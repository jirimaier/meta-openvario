# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

PR="r0"
RCONFLICTS:${PN}="xcsoar-testing"

SRC_URI = "git://github.com/jirimaier/XCSoar.git;protocol=https;branch=LX-Eos-Driver \
"

SRCREV = "702b8396a8cb465c57e8e657b65d3353b2cf75ab"

require xcsoar.inc

# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

PR="r0"
RCONFLICTS:${PN}="xcsoar-testing"

SRC_URI = "git://github.com/jirimaier/XCSoar.git;protocol=https;branch=LX-Eos-Driver \
"

SRCREV = "9630545bac211b10544fc7ad6877ccf27491c979"

require xcsoar.inc

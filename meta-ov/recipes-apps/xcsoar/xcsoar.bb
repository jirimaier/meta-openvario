# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

PR="r0"
RCONFLICTS:${PN}="xcsoar-testing"

SRC_URI = "git://github.com/jirimaier/XCSoar.git;protocol=https;branch=dev \
"

SRCREV = "b3a8d8b68bd454f48d2c805104942863d1fe652c"

require xcsoar.inc

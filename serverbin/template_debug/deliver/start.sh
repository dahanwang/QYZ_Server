#!/bin/sh
cd `dirname $0`

ulimit -c unlimited
WORKDIR=$PWD

$WORKDIR/daemon -f $WORKDIR/xdeliver.log -p $WORKDIR/xdeliver.pid -c $WORKDIR $WORKDIR/xdeliver xdeliver.conf debug
echo  deliver started

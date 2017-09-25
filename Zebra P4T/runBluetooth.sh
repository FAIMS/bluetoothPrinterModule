#!/bin/bash

set -euo pipefail

#screen

sudo rfcomm bind rfcomm0 AC:3F:A4:5E:68:2C
sudo ./miniterm.py /dev/rfcomm0
sudo rfcomm release all

#sudo rfcomm connect rfcomm0 AC:3F:A4:5E:68:2C
#sudo ./miniterm.py /dev/rfcomm0
#screen -dm -c .screenrc_multipletmux


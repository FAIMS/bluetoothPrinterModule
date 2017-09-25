#!/bin/bash

./makeElement.sh style_orientation_orientation "horizontal" input 1 false false false false false .
./makeElement.sh style_even_layout_weight "1" input 1 false false false false false .
./makeElement.sh style_large_layout_weight "3" input 1 false false false false false .
./makeElement.sh Login_Login_Users "Users" dropdown 1 false false false false false .
./makeElement.sh Login_Login_Log_in "Log in" button 1 false false false false false .
./makeElement.sh Login_Login_Signup_Guide_1 "" webview 1 false false false false false .
./makeElement.sh Login_Login_Sign_up "Sign up" button 1 false false false false false .
./makeElement.sh Control_Main_Create_New_Earth_Sample "Create New Earth Sample" button 1 false false false false false .
./makeElement.sh Control_Main_Scan_QR_Code "Scan QR Code" button 1 false false false false false .
./makeElement.sh Control_Main_Existing_Earth_Sample "Existing Earth Sample" list 1 false false false false false .
./makeElement.sh Control_Search_Search_Term "Search Term" input 2 false false false false false .
./makeElement.sh Control_Search_Search_Button "Search" button 2 false false false false false .
./makeElement.sh Control_Search_Entity_List "Entity List" list 1 false false false false false .
./makeElement.sh Earth_Sample_Earth_Sample_connectToBluetooth "connectToBluetooth" button 1 false false false false false .
./makeElement.sh Earth_Sample_Earth_Sample_Print_QR_Code "Print QR Code" button 1 false false false false false .
./makeElement.sh Earth_Sample_Earth_Sample_Print_Barcode "Print Barcode" button 1 false false false false false .
./makeElement.sh Earth_Sample_Earth_Sample_IGSN_Identifier "IGSN Identifier" input 1 false false true false false .
./makeElement.sh Earth_Sample_Earth_Sample_Material "Material" input 1 false false true false false .
./makeElement.sh Earth_Sample_Earth_Sample_Description "Description" input 1 false false true false false .
./makeElement.sh Earth_Sample_Earth_Sample_Latitude "Latitude" input 2 false false true false true .
./makeElement.sh Earth_Sample_Earth_Sample_Longitude "Longitude" input 2 false false true false true .
./makeElement.sh Earth_Sample_Earth_Sample_Northing "Northing" input 3 false false true false true .
./makeElement.sh Earth_Sample_Earth_Sample_Easting "Easting" input 3 false false true false true .
./makeElement.sh Earth_Sample_Earth_Sample_Accuracy "Accuracy" input 3 false false true false true .
./makeElement.sh Earth_Sample_Earth_Sample_Take_From_GPS_1 "Take From GPS" button 1 false false false false false .

dot -Tsvg datastruct.gv > wireframe.svg
#rm *.xml
#rm *.datastruct.gv
#rm *.wireframeElements.sh


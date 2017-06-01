#!/bin/bash

./makeElement.sh style_orientation_orientation "horizontal" input 1 false false false false false .
./makeElement.sh style_even_layout_weight "1" input 1 false false false false false .
./makeElement.sh style_large_layout_weight "3" input 1 false false false false false .
./makeElement.sh Login_Login_Users "Users" dropdown 1 false false false false false .
./makeElement.sh Login_Login_Log_in "Log in" button 1 false false false false false .
./makeElement.sh Login_Login_Sign_up "Sign up" button 1 false false false false false .
./makeElement.sh Control_Main_Create_New_Test_Record "Create New Test Record" button 1 false false false false false .
./makeElement.sh Control_Main_Scan_Test "Scan Test" button 1 false false false false false .
./makeElement.sh Control_Main_Existing_Tests "Existing Tests" list 1 false false false false false .
./makeElement.sh Control_Search_Search_Term "Search Term" input 2 false false false false false .
./makeElement.sh Control_Search_Search_Button "Search" button 2 false false false false false .
./makeElement.sh Control_Search_Entity_List "Entity List" list 1 false false false false false .
./makeElement.sh Test_Test_connectToBluetooth "connectToBluetooth" button 1 false false false false false .
./makeElement.sh Test_Test_calibrate "calibrate" button 1 false false false false false .
./makeElement.sh Test_Test_testPrint "testPrint" button 1 false false false false false .
./makeElement.sh Test_Test_author "Author" input 1 false false true false true .
./makeElement.sh Test_Test_timestamp "Created at" input 1 false false true false true .
./makeElement.sh Test_Test_testText "testText" input 1 false false true false false .
./makeElement.sh Test_Test_note "note" input 1 false false true false false .

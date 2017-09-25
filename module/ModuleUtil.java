package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Earth_Sample
     */
    public static View get_EarthSample(Solo solo) {
        String ref = "Earth_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/IDS
     */
    public static View get_Control_IDS(Solo solo) {
        String ref = "Control/IDS";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Main
     */
    public static View get_Control_Main(Solo solo) {
        String ref = "Control/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Search
     */
    public static View get_Control_Search(Solo solo) {
        String ref = "Control/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Earth_Sample/Earth_Sample
     */
    public static View get_EarthSample_EarthSample(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Login
     */
    public static View get_Login_Login(Solo solo) {
        String ref = "Login/Login";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Main/Create_New_Earth_Sample
     */
    public static View get_Control_Main_CreateNewEarthSample(Solo solo) {
        String ref = "Control/Main/Create_New_Earth_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Main/Scan_QR_Code
     */
    public static View get_Control_Main_ScanQRCode(Solo solo) {
        String ref = "Control/Main/Scan_QR_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Earth_Sample/Earth_Sample/Print_Barcode
     */
    public static View get_EarthSample_EarthSample_PrintBarcode(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Print_Barcode";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Earth_Sample/Earth_Sample/Print_QR_Code
     */
    public static View get_EarthSample_EarthSample_PrintQRCode(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Print_QR_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Earth_Sample/Earth_Sample/connectToBluetooth
     */
    public static View get_EarthSample_EarthSample_connectToBluetooth(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/connectToBluetooth";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Login/Log_in
     */
    public static View get_Login_Login_Login(Solo solo) {
        String ref = "Login/Login/Log_in";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Login/Sign_up
     */
    public static View get_Login_Login_Signup(Solo solo) {
        String ref = "Login/Login/Sign_up";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Login/Login/Users
     */
    public static View get_Login_Login_Users(Solo solo) {
        String ref = "Login/Login/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Entity_Types
     */
    public static EditText get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/Description
     */
    public static EditText get_EarthSample_EarthSample_Description(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/Easting
     */
    public static View get_EarthSample_EarthSample_Easting(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/IGSN_Identifier
     */
    public static EditText get_EarthSample_EarthSample_IGSNIdentifier(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/IGSN_Identifier";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/Latitude
     */
    public static View get_EarthSample_EarthSample_Latitude(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/Longitude
     */
    public static View get_EarthSample_EarthSample_Longitude(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/Material
     */
    public static EditText get_EarthSample_EarthSample_Material(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Material";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Earth_Sample/Earth_Sample/Northing
     */
    public static View get_EarthSample_EarthSample_Northing(Solo solo) {
        String ref = "Earth_Sample/Earth_Sample/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Main/Existing_Earth_Sample
     */
    public static View get_Control_Main_ExistingEarthSample(Solo solo) {
        String ref = "Control/Main/Existing_Earth_Sample";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }
}

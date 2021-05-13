package Utils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.testng.annotations.BeforeSuite;

import java.io.*;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdminGoogleSheet {

    public static List<String> dataList = new ArrayList<>();

    public static String APPLICATION_NAME = "Quickstart";
    public static JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    public static String TOKENS_DIRECTORY_PATH = "tokens";
    public static List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    public static String CREDENTIALS_FILE_PATH = "/credentials.json";

    public static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = AdminGoogleSheet.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    @BeforeSuite
    public void sheetData() throws IOException, GeneralSecurityException {
    //public static void main(String[] args) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        String spreadsheetId = "1o4L_wOTjxBQ9vbbryRYaf2YgIB0b0ojsgdpFOs3E5Ik";
        String range1 = "LH_Admin_Data!C2:C2";
        String range2 = "LH_Admin_Data!C3:C3";
        String range3 = "LH_Admin_Data!C4:C4";
        String range4 = "LH_Admin_Data!C5:C5";
        String range5 = "LH_Admin_Data!C6:C6";
        String range6 = "LH_Admin_Data!C7:C7";
        String range7 = "LH_Admin_Data!C8:C8";
        String range8 = "LH_Admin_Data!C9:C9";
        String range9 = "LH_Admin_Data!C10:C10";
        String range10 = "LH_Admin_Data!C11:11";
        String range11 = "LH_Admin_Data!C12:12";
        String range12 = "LH_Admin_Data!C13:13";
        String range13 = "LH_Admin_Data!C14:14";
        String range14 = "LH_Admin_Data!C15:15";
        String range15 = "LH_Admin_Data!C16:16";
        String range16 = "LH_Admin_Data!C17:17";
        String range17 = "LH_Admin_Data!C18:18";
        String range18 = "LH_Admin_Data!C19:19";
        String range19 = "LH_Admin_Data!C20:20";
        String range20 = "LH_Admin_Data!C21:21";
        String range21 = "LH_Admin_Data!C22:22";
        String range22 = "LH_Admin_Data!C23:23";
        String range23 = "LH_Admin_Data!C24:24";
        String range24 = "LH_Admin_Data!C25:25";
        String range25 = "LH_Admin_Data!C26:26";
        String range26 = "LH_Admin_Data!C27:27";
        String range27 = "LH_Admin_Data!C28:28";
        String range28 = "LH_Admin_Data!C29:29";
        String range29 = "LH_Admin_Data!C30:30";
        String range30 = "LH_Admin_Data!C31:31";
        String range31 = "LH_Admin_Data!C32:32";
        String range32 = "LH_Admin_Data!C33:33";
        String range33 = "LH_Admin_Data!C34:34";
        String range34 = "LH_Admin_Data!C35:35";
        String range35 = "LH_Admin_Data!C36:36";
        String range36 = "LH_Admin_Data!C37:37";
        String range37 = "LH_Admin_Data!C38:38";
        String range38 = "LH_Admin_Data!C39:39";
        String range39 = "LH_Admin_Data!C40:40";
        String range40 = "LH_Admin_Data!C41:41";
        String range41 = "LH_Admin_Data!C42:42";
        String range42 = "LH_Admin_Data!C43:43";
        String range43 = "LH_Admin_Data!C44:44";
        String range44 = "LH_Admin_Data!C45:45";
        String range45 = "LH_Admin_Data!C46:46";
        String range46 = "LH_Admin_Data!C47:47";
        String range47 = "LH_Admin_Data!C48:48";
        String range48 = "LH_Admin_Data!C49:49";

        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();

        ValueRange response1 = service.spreadsheets().values().get(spreadsheetId, range1).execute();
        ValueRange response2 = service.spreadsheets().values().get(spreadsheetId, range2).execute();
        ValueRange response3 = service.spreadsheets().values().get(spreadsheetId, range3).execute();
        ValueRange response4 = service.spreadsheets().values().get(spreadsheetId, range4).execute();
        ValueRange response5 = service.spreadsheets().values().get(spreadsheetId, range5).execute();
        ValueRange response6 = service.spreadsheets().values().get(spreadsheetId, range6).execute();
        ValueRange response7 = service.spreadsheets().values().get(spreadsheetId, range7).execute();
        ValueRange response8 = service.spreadsheets().values().get(spreadsheetId, range8).execute();
        ValueRange response9 = service.spreadsheets().values().get(spreadsheetId, range9).execute();
        ValueRange response10 = service.spreadsheets().values().get(spreadsheetId, range10).execute();
        ValueRange response11 = service.spreadsheets().values().get(spreadsheetId, range11).execute();
        ValueRange response12 = service.spreadsheets().values().get(spreadsheetId, range12).execute();
        ValueRange response13 = service.spreadsheets().values().get(spreadsheetId, range13).execute();
        ValueRange response14 = service.spreadsheets().values().get(spreadsheetId, range14).execute();
        ValueRange response15 = service.spreadsheets().values().get(spreadsheetId, range15).execute();
        ValueRange response16 = service.spreadsheets().values().get(spreadsheetId, range16).execute();
        ValueRange response17 = service.spreadsheets().values().get(spreadsheetId, range17).execute();
        ValueRange response18 = service.spreadsheets().values().get(spreadsheetId, range18).execute();
        ValueRange response19 = service.spreadsheets().values().get(spreadsheetId, range19).execute();
        ValueRange response20 = service.spreadsheets().values().get(spreadsheetId, range20).execute();
        ValueRange response21 = service.spreadsheets().values().get(spreadsheetId, range21).execute();
        ValueRange response22 = service.spreadsheets().values().get(spreadsheetId, range22).execute();
        ValueRange response23 = service.spreadsheets().values().get(spreadsheetId, range23).execute();
        ValueRange response24 = service.spreadsheets().values().get(spreadsheetId, range24).execute();
        ValueRange response25 = service.spreadsheets().values().get(spreadsheetId, range25).execute();
        ValueRange response26 = service.spreadsheets().values().get(spreadsheetId, range26).execute();
        ValueRange response27 = service.spreadsheets().values().get(spreadsheetId, range27).execute();
        ValueRange response28 = service.spreadsheets().values().get(spreadsheetId, range28).execute();
        ValueRange response29 = service.spreadsheets().values().get(spreadsheetId, range29).execute();
        ValueRange response30 = service.spreadsheets().values().get(spreadsheetId, range30).execute();
        ValueRange response31 = service.spreadsheets().values().get(spreadsheetId, range31).execute();
        ValueRange response32 = service.spreadsheets().values().get(spreadsheetId, range32).execute();
        ValueRange response33 = service.spreadsheets().values().get(spreadsheetId, range33).execute();
        ValueRange response34 = service.spreadsheets().values().get(spreadsheetId, range34).execute();
        ValueRange response35 = service.spreadsheets().values().get(spreadsheetId, range35).execute();
        ValueRange response36 = service.spreadsheets().values().get(spreadsheetId, range36).execute();
        ValueRange response37 = service.spreadsheets().values().get(spreadsheetId, range37).execute();
        ValueRange response38 = service.spreadsheets().values().get(spreadsheetId, range38).execute();
        ValueRange response39 = service.spreadsheets().values().get(spreadsheetId, range39).execute();
        ValueRange response40 = service.spreadsheets().values().get(spreadsheetId, range40).execute();
        ValueRange response41 = service.spreadsheets().values().get(spreadsheetId, range41).execute();
        ValueRange response42 = service.spreadsheets().values().get(spreadsheetId, range42).execute();
        ValueRange response43 = service.spreadsheets().values().get(spreadsheetId, range43).execute();
        ValueRange response44 = service.spreadsheets().values().get(spreadsheetId, range44).execute();
        ValueRange response45 = service.spreadsheets().values().get(spreadsheetId, range45).execute();
        ValueRange response46 = service.spreadsheets().values().get(spreadsheetId, range46).execute();
        ValueRange response47 = service.spreadsheets().values().get(spreadsheetId, range47).execute();
        ValueRange response48 = service.spreadsheets().values().get(spreadsheetId, range48).execute();

        List<List<Object>> values1 = response1.getValues();
        List<List<Object>> values2 = response2.getValues();
        List<List<Object>> values3 = response3.getValues();
        List<List<Object>> values4 = response4.getValues();
        List<List<Object>> values5 = response5.getValues();
        List<List<Object>> values6 = response6.getValues();
        List<List<Object>> values7 = response7.getValues();
        List<List<Object>> values8 = response8.getValues();
        List<List<Object>> values9 = response9.getValues();
        List<List<Object>> values10 = response10.getValues();
        List<List<Object>> values11 = response11.getValues();
        List<List<Object>> values12 = response12.getValues();
        List<List<Object>> values13 = response13.getValues();
        List<List<Object>> values14 = response14.getValues();
        List<List<Object>> values15 = response15.getValues();
        List<List<Object>> values16 = response16.getValues();
        List<List<Object>> values17 = response17.getValues();
        List<List<Object>> values18 = response18.getValues();
        List<List<Object>> values19 = response19.getValues();
        List<List<Object>> values20 = response20.getValues();
        List<List<Object>> values21 = response21.getValues();
        List<List<Object>> values22 = response22.getValues();
        List<List<Object>> values23 = response23.getValues();
        List<List<Object>> values24 = response24.getValues();
        List<List<Object>> values25 = response25.getValues();
        List<List<Object>> values26 = response26.getValues();
        List<List<Object>> values27 = response27.getValues();
        List<List<Object>> values28 = response28.getValues();
        List<List<Object>> values29 = response29.getValues();
        List<List<Object>> values30 = response30.getValues();
        List<List<Object>> values31 = response31.getValues();
        List<List<Object>> values32 = response32.getValues();
        List<List<Object>> values33 = response33.getValues();
        List<List<Object>> values34 = response34.getValues();
        List<List<Object>> values35 = response35.getValues();
        List<List<Object>> values36 = response36.getValues();
        List<List<Object>> values37 = response37.getValues();
        List<List<Object>> values38 = response38.getValues();
        List<List<Object>> values39 = response39.getValues();
        List<List<Object>> values40 = response40.getValues();
        List<List<Object>> values41 = response41.getValues();
        List<List<Object>> values42 = response42.getValues();
        List<List<Object>> values43 = response43.getValues();
        List<List<Object>> values44 = response44.getValues();
        List<List<Object>> values45 = response45.getValues();
        List<List<Object>> values46 = response46.getValues();
        List<List<Object>> values47 = response47.getValues();
        List<List<Object>> values48 = response48.getValues();

        for (List row : values1) {
            String data1 = String.valueOf(row.get(0));
            dataList.add(data1);
        }

        for (List row : values2) {
            String data2 = String.valueOf(row.get(0));
            dataList.add(data2);
        }

        for (List row : values3) {
            String data3 = String.valueOf(row.get(0));
            dataList.add(data3);
        }

        for (List row : values4) {
            String data4 = String.valueOf(row.get(0));
            dataList.add(data4);
        }

        for (List row : values5) {
            String data5 = String.valueOf(row.get(0));
            dataList.add(data5);
        }

        for (List row : values6) {
            String data6 = String.valueOf(row.get(0));
            dataList.add(data6);
        }

        for (List row : values7) {
            String data7 = String.valueOf(row.get(0));
            dataList.add(data7);
        }

        for (List row : values8) {
            String data8 = String.valueOf(row.get(0));
            dataList.add(data8);
        }

        for (List row : values9) {
            String data9 = String.valueOf(row.get(0));
            dataList.add(data9);
        }

        for (List row : values10) {
            String data10 = String.valueOf(row.get(0));
            dataList.add(data10);
        }

        for (List row : values11) {
            String data11 = String.valueOf(row.get(0));
            dataList.add(data11);
        }

        for (List row : values12) {
            String data12 = String.valueOf(row.get(0));
            dataList.add(data12);
        }

        for (List row : values13) {
            String data13 = String.valueOf(row.get(0));
            dataList.add(data13);
        }

        for (List row : values14) {
            String data14 = String.valueOf(row.get(0));
            dataList.add(data14);
        }

        for (List row : values15) {
            String data15 = String.valueOf(row.get(0));
            dataList.add(data15);
        }

        for (List row : values16) {
            String data16 = String.valueOf(row.get(0));
            dataList.add(data16);
        }

        for (List row : values17) {
            String data17 = String.valueOf(row.get(0));
            dataList.add(data17);
        }

        for (List row : values18) {
            String data18 = String.valueOf(row.get(0));
            dataList.add(data18);
        }

        for (List row : values19) {
            String data19 = String.valueOf(row.get(0));
            dataList.add(data19);
        }

        for (List row : values20) {
            String data20 = String.valueOf(row.get(0));
            dataList.add(data20);
        }

        for (List row : values21) {
            String data21 = String.valueOf(row.get(0));
            dataList.add(data21);
        }

        for (List row : values22) {
            String data22 = String.valueOf(row.get(0));
            dataList.add(data22);
        }

        for (List row : values23) {
            String data23 = String.valueOf(row.get(0));
            dataList.add(data23);
        }

        for (List row : values24) {
            String data24 = String.valueOf(row.get(0));
            dataList.add(data24);
        }

        for (List row : values25) {
            String data25 = String.valueOf(row.get(0));
            dataList.add(data25);
        }

        for (List row : values26) {
            String data26 = String.valueOf(row.get(0));
            dataList.add(data26);
        }

        for (List row : values27) {
            String data27 = String.valueOf(row.get(0));
            dataList.add(data27);
        }

        for (List row : values28) {
            String data28 = String.valueOf(row.get(0));
            dataList.add(data28);
        }

        for (List row : values29) {
            String data29 = String.valueOf(row.get(0));
            dataList.add(data29);
        }

        for (List row : values30) {
            String data30 = String.valueOf(row.get(0));
            dataList.add(data30);
        }

        for (List row : values31) {
            String data31 = String.valueOf(row.get(0));
            dataList.add(data31);
        }

        for (List row : values32) {
            String data32 = String.valueOf(row.get(0));
            dataList.add(data32);
        }

        for (List row : values33) {
            String data33 = String.valueOf(row.get(0));
            dataList.add(data33);
        }

        for (List row : values34) {
            String data34 = String.valueOf(row.get(0));
            dataList.add(data34);
        }

        for (List row : values35) {
            String data35 = String.valueOf(row.get(0));
            dataList.add(data35);
        }

        for (List row : values36) {
            String data36 = String.valueOf(row.get(0));
            dataList.add(data36);
        }

        for (List row : values37) {
            String data37 = String.valueOf(row.get(0));
            dataList.add(data37);
        }

        for (List row : values38) {
            String data38 = String.valueOf(row.get(0));
            dataList.add(data38);
        }

        for (List row : values39) {
            String data39 = String.valueOf(row.get(0));
            dataList.add(data39);
        }

        for (List row : values40) {
            String data40 = String.valueOf(row.get(0));
            dataList.add(data40);
        }

        for (List row : values41) {
            String data41 = String.valueOf(row.get(0));
            dataList.add(data41);
        }

        for (List row : values42) {
            String data42 = String.valueOf(row.get(0));
            dataList.add(data42);
        }

        for (List row : values43) {
            String data43 = String.valueOf(row.get(0));
            dataList.add(data43);
        }

        for (List row : values44) {
            String data44 = String.valueOf(row.get(0));
            dataList.add(data44);
        }

        for (List row : values45) {
            String data45 = String.valueOf(row.get(0));
            dataList.add(data45);
        }

        for (List row : values46) {
            String data46 = String.valueOf(row.get(0));
            dataList.add(data46);
        }

        for (List row : values47) {
            String data47 = String.valueOf(row.get(0));
            dataList.add(data47);
        }

        for (List row : values48) {
            String data48 = String.valueOf(row.get(0));
            dataList.add(data48);
        }

        System.out.println(dataList);
    }

}

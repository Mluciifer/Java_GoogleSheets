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
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;
import java.awt.Dimension;
import java.net.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Luciifer
 */
public class Principal {
     private static final String  APPLICATION_NAME="Google sheets APIS";
    private static final JacksonFactory JSON_FACTORY= JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH="token";
    private static final String USER_ENTERED= "USER_ENTERED";
    /* instacia global de los alcances requeridos por este proyecto*/

    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
    private static final String CREDENTIALS_FILE_PATH = "/client_secret_1037846472894-c2kepjpijevknfacbgia1letddi54vhu.apps.googleusercontent.com (4).json";
    /* crea un objeto de credencial autorizado 
    @param HTTP_TRANSPORT es el transporte HTTP de la red
    @return devuelve un objeto autorizado
    @throws lanza IOExceptions si el archivo credencial.json no se encuentra
     */  
  private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT)throws IOException {
      //carga el cliente secreto 
      InputStream in =Principal.class.getResourceAsStream( CREDENTIALS_FILE_PATH);
      if(in ==null){
          throw new FileNotFoundException("no encuentra credencial: " + CREDENTIALS_FILE_PATH);
      }
      GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
      
      //Construccion de flujo y solicitudes autirazadas de usuarios
      GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
              .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
              .setAccessType("offline")
              .build();
      LocalServerReceiver receiver =new LocalServerReceiver.Builder().setPort(8080).build();
      return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
        }  
        /*
            //imprime los datos de un rango elegido desde una hoja de calculo SHEETS en google docs
             // https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
             *el spreadsheetID es el codigo de la cuarta posicion del directorio URL
     */
  public static void main(String[] args)throws IOException, GeneralSecurityException {}
}

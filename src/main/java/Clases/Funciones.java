package Clases;


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
import java.awt.Dimension;
import java.net.*;
import java.lang.Object;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import static sun.misc.FloatingDecimal.parseFloat;
/**
/**
 *
 * @author Luciifer
 */
import com.google.api.gax.paging.Page;
//import com.google.auth.appengine.AppEngineCredentials;
import com.google.auth.oauth2.ComputeEngineCredentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.collect.Lists;
import com.sun.media.jfxmedia.logging.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import javax.swing.JOptionPane;

public class Funciones {
     private static final String  APPLICATION_NAME="Google sheets APIS";
    public static final JacksonFactory JSON_FACTORY= JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH="token";
    private static final String USER_ENTERED= "USER_ENTERED";
    /* instacia global de los alcances requeridos por este proyecto*/

    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
    private static final String CREDENTIALS_FILE_PATH = "/client_secret_1037846472894-kcde120tqvm4kdvhoqr658cc0ujvhgkk.apps.googleusercontent.com.json";
    /* crea un objeto de credencial autorizado 
    *@param HTTP_TRANSPORT es el transporte HTTP de la red
    *@return devuelve un objeto autorizado
    *@throws lanza IOExceptions si el archivo credencial.json no se encuentra
     */  
    static void authExplicit(String jsonPath) throws IOException {
  // You can specify a credential file by providing a path to GoogleCredentials.
  // Otherwise credentials are read from the GOOGLE_APPLICATION_CREDENTIALS environment variable.
        GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(jsonPath))
        .createScoped(Lists.newArrayList("https://www.googleapis.com/auth/cloud-platform"));
         Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();

        System.out.println("Buckets:");
        Page<Bucket> buckets = storage.list();
        for (Bucket bucket : buckets.iterateAll()) {
             System.out.println(bucket.toString());
            }
    }
 
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT)throws IOException,GeneralSecurityException {
      //carga el cliente secreto 
      InputStream in =Funciones.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
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
             *el spreadsheetID es el codigo de la cuarta posicion del directorio URL*/ 
     
  public Sheets conexion()throws IOException, GeneralSecurityException{
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
         
                Sheets servicio =new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
                return servicio;
            
            }
   //------------------------------------------------------------------------------------------------------------ 
             
         public PrintStream Valores(String hu)throws IOException, GeneralSecurityException {
             List<List<Object>> values;
             ValueRange result;
                  final String spreadsheetId="15Lzhev2_xhMx06feltoLLuG4Ykt0_1WrQFAkgDCDmlk";
                 final  String range="hoja 1!A1:E15";
                 result =conexion().spreadsheets().values()
                        .get(spreadsheetId, range)
                        .setMajorDimension("ROWS").setRange(hu)
                        .execute();
               values=result.getValues();

               PrintStream lo=new PrintStream("./pruebass.txt");             
                      for(List yu:values){
                          for(int i=0;i<yu.size();i++){
                            lo.println(yu.get(i)+" ");  
                          }
                      } 
                      return lo;
        }
  //------------------------------------------------------------------------------------------------------------        
              
         public String Rango(String ku)throws IOException,GeneralSecurityException{
            String range=ku;
            return range;
            
         }
   //------------------------------------------------------------------------------------------------------------        
              
         public String SpreadS(String ku)throws IOException,GeneralSecurityException{
            String range=ku;
            return range;
            
         }
  //------------------------------------------------------------------------------------------------------------              
           //final String spreadsheetId="15Lzhev2_xhMx06feltoLLuG4Ykt0_1WrQFAkgDCDmlk";
        
         Cadenas cd=new Cadenas();
          //  final String spreadsheetId="1VG6JKqUSHLQ5Do7s5eXga3EOb7RZGBctkP6X_9hPiow";
         //String cv=String.valueOf(Clases.Diseno.Link.getText());
           String spreadsheetId;
         public String Buscador(String hj)throws IOException,GeneralSecurityException{
                 final String spreadsheetId=Clases.Diseno.Link.getText();
             List<List<Object>> values;
             ValueRange result;
            
                 result =conexion().spreadsheets().values()
                        .get(spreadsheetId, Rango(hj)).setRange(Rango(hj)).setMajorDimension("COLUMNS")
                        .execute();
             
               values=result.getValues();
               String jj=String.valueOf(values);
                return jj;
     }
        
  //-------------------------------------------------------------------------------------------------------------      
      
       public void Escribir(String jk, String hu ,String bu,String nt,String tu)throws IOException,GeneralSecurityException{
          
          //escribe datos y valores en la tabla GoogleSheets
                     
          List<List<Object>> Valor = Arrays.asList(Arrays.asList(hu,bu,nt,tu));
        ValueRange body = new ValueRange().setValues(Valor);
        UpdateValuesResponse result=conexion().spreadsheets().values().update(spreadsheetId, Rango(jk), body)
                .setValueInputOption(USER_ENTERED)
                .execute();
        System.out.println("Celdas actualizadas"+ result.getUpdatedCells());    
     } 
             
                   
                 public List BuscadorMultiple(String hj,String hj2)throws IOException,GeneralSecurityException{
             //lee e imprime multiples rangos
            List<ValueRange> values;
          
           List<String> ranges=Arrays.asList(hj,hj2);
            BatchGetValuesResponse result = conexion().spreadsheets().values()
                    .batchGet(spreadsheetId)
                .setRanges(ranges) 
                .execute();
            // List<ValueRange> val = result.getValueRanges();
             values = result.getValueRanges();// .getValueRanges();
             String vl=result.getValueRanges().toString();
             String hh=String.valueOf(vl);
              return values;
     }
                
       }
              
        


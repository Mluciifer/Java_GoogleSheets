package Clases;


import Clases.Funciones;
import Clases.Diseno;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Docentes {
       ArrayList ls=new ArrayList();
      ArrayList ls1=new ArrayList();
      public static ArrayList ls2=new ArrayList();
   Object[] on=new Object[20];
        Funciones  fn =new Funciones();
        Cadenas cd=new Cadenas();
       
      public String[] Nombres={"A","J","S","AB","AK","AT","BC","BL","BU","CD","CM","CV","DE","DN","DW","EF","EO","EX","FG","FP"};  
       public String[] Nombres22={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};  
       public String[] Nombres1={"A","J","S","AB","AK","AT","BC","BL","BU","CD","CM","CV","DE","DN","DW","EF","EO","EX","FG","FP"};
    public String[] bloqueo={"C","L","U","AD","AM","AV","BE","BN","BW","CF","CO","CX","DG","DP","DY","EH","EQ","EZ","FI","FR"}; 
   public  String[] info={"C","L","U","AD","AM","AV","BE","BN","BW","CF","CO","CX","DG","DP","DY","EH","EQ","EZ","FI","FR"}; 
        String cr,cr2,cr3,cr4,vid1,vid2,vid3,vid4;  
     
        public String Spread(String sp){
            String fg=fn.spreadsheetId=sp;
            return fg;
     }
             
                              
        
        public ArrayList Datos(int b1,int b2,String a0,String a1,String a2){
             for(int hg=b1;hg<b2;hg++){ 
                 try {
                     String cp=String.valueOf(hg);
                     String rs=a1+cp;
                     String resp=a2+cp;
                     String rf=String.valueOf(a0+rs+":"+resp);
                     ls2.add(fn.Buscador(rf)+" "+"-->"+"("+rs+")"+"\n");
                     
                 } catch (IOException ex) {
                     Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (GeneralSecurityException ex) {
                     Logger.getLogger(Docentes.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             return ls2;
           
       }
       
        public ArrayList actualizaPR(String a0,String a1,String a2) throws IOException, ParseException{
            
            JSONParser parser=new JSONParser();
           try {
               Object obj=parser.parse(new FileReader("BASE.json"));
               JSONObject jsonObject=(JSONObject) obj;
               
               JSONArray arr=(JSONArray) jsonObject.get(a0);
              //  JOptionPane.showMessageDialog(null, "leido2"+arr);
               for(int i=0;i<20;i++){
                   JSONObject jsonObject1=(JSONObject) arr.get(i);
                  // JOptionPane.showMessageDialog(null, jsonObject1.get("6:00-7:30"));
                 //  ls.add(jsonObject1.get("6:00-7:30")+","+jsonObject1.get("SEDES"));
                   ls.add(jsonObject1.get(a1)+","+jsonObject1.get(a2));
                }

                 }catch (IOException ex) {
                    Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
                }
          return ls;
    }
        
        
    public ArrayList actualiza(String a1,String a3,String a4){
         
     try {     
         
                 for(int ds2=0;ds2<Nombres.length;ds2++){
                         vid1="TUTORIAS-INTRO!"+Nombres[ds2]+a1;
                       //  vid2="TUTORIAS-INTRO!"+bloqueo[ds2]+a2;
                         vid3="TUTORIAS-INTRO!"+info[ds2]+a3;
                         vid4="TUTORIAS-INTRO!"+Nombres1[ds2]+a4;
                         
                     cr=String.valueOf(fn.Buscador(vid1));
                     String anst=cr.substring(cr.indexOf("[")+2,cr.indexOf("]"));

                   //  cr2=String.valueOf(fn.Buscador(vid2));
                     cr3=String.valueOf(fn.Buscador(vid3));
                     cr4=String.valueOf(fn.Buscador(vid4));
                     String anst1=cr4.substring(cr4.indexOf("[")+2,cr4.indexOf("]"));
                    ls.add(anst+","+anst1+","+cr3/*+","+cr2*/);
                   
                        }
           
         
           //JOptionPane.showMessageDialog(null,"Datos cargados"+ ls.size());
                
            } catch (IOException ex) {
                Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (GeneralSecurityException ex) {
                Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           return ls;
    }
    String ca,ca2,ca3,va1,va2,va3;  
 public ArrayList actualizaHoja2(String a1,String a2,String a3){
               //  ls.clear();
     try {     
         
                 for(int ds=0;ds<Nombres.length;ds++){
                         va1="ING A1!"+Nombres[ds]+a1;
                         va2="ING A1!"+bloqueo[ds]+a2;
                         va3="ING A1!"+info[ds]+a3;
                     
                     ca=String.valueOf(fn.Buscador(va1));
                     String anstA=ca.substring(ca.indexOf("[")+2,ca.indexOf("]"));

                     ca2=String.valueOf(fn.Buscador(va2));
                     ca3=String.valueOf(fn.Buscador(va3));
                    ls1.add(anstA+","+ca3+","+ca2);
                   
                        }
           
         
           //JOptionPane.showMessageDialog(null,"Datos cargados"+ ls.size());
                
            } catch (IOException ex) {
                Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (GeneralSecurityException ex) {
                Logger.getLogger(Diseno.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           return ls1;
    }
}

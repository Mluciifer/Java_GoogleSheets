package Clases;





public class Cadenas {
     String spreadsheetId;
    String[] Nombres={"A","J","S","AB","AK","AT","BC","BL","BU","CD","CM","CV","DE","DN","DW","EF","EO","EX","FG","FP"};  
     String[] Bloqueo={"C","L","U","AD","AM","AV","BE","BN","BW","CF","CO","CX","DG","DP","DY","EH","EQ","EZ","FI","FR"}; 
    String[] Info={"C","L","U","AD","AM","AV","BE","BN","BW","CF","CO","CX","DG","DP","DY","EH","EQ","EZ","FI","FR"}; 
     String[] Nombres1={"A","J","S","AB","AK","AT","BC","BL","BU","CD","CM","CV","DE","DN","DW","EF","EO","EX","FG","FP"};  
     String[] Bloqueo1={"C","L","U","AD","AM","AV","BE","BN","BW","CF","CO","CX","DG","DP","DY","EH","EQ","EZ","FI","FR"}; 
    String[] Info1={"C","L","U","AD","AM","AV","BE","BN","BW","CF","CO","CX","DG","DP","DY","EH","EQ","EZ","FI","FR"}; 
 
    public String getspreadsheetId(){
                return spreadsheetId;
             }
    public String setspradsheetId(String hj){
                return spreadsheetId=hj;
    }
public String[] getInfo(){
                return Info;
    }

 public String[] getNombres1( ){
                return Nombres1;
    }
    public String[] getBloqueo1(){
                return Bloqueo1;
    }
public String[] getInfo1(){
                return Info1;
    }
    
   
           //String anst=po.substring(po.indexOf("[")+2,po.indexOf("]"));
 
    
     
}

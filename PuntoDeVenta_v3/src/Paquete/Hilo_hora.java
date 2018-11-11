package Paquete;

import java.util.*;

public class Hilo_hora implements Runnable{
    String horas, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    public String hora;
    
    Canal mCanal;
    public void setCanal(Canal c){
        this.mCanal=c;
    }
    
    public Hilo_hora(){
        h1 = new Thread(this);
        h1.start();
    }

    @Override
    public void run() {
        Thread ot = Thread.currentThread();
     
     while(ot==h1){
         calcula();
         hora = horas + ":" + minutos + ":" + segundos + " " + ampm;
         System.out.println(hora);
         mCanal.SetStatus("HORA:  "+hora);
         try{
             Thread.sleep(1000);
         }catch(InterruptedException e){             
         }
     }     
    }
    
    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            horas = h>9?""+h:"0"+h;
        }else{
            horas =  calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+ calendario.get(Calendar.SECOND);
    }
        
}

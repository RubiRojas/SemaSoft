package Paquete;

import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

public class Hora implements Observer {

    
    public void update(Observable o, Object arg) {

        //Obtenemos el mensaje que recibió el Canal
        String mensaje = arg.toString().toUpperCase();

        //Realizamos las tareas que corresponden al mensaje
        if (mensaje.equals("HORA") ) {
            Calendar calendario = Calendar.getInstance();
            int hora, min, seg;
            hora = calendario.get(Calendar.HOUR_OF_DAY);
            min = calendario.get(Calendar.MINUTE);
            seg = calendario.get(Calendar.SECOND);
            String msj =  hora + ":" + min + ":"+ seg;
            System.out.println(msj);
        }
        if (mensaje.equals("ENCENDER")) {
            System.out.println("Servicios prendidos");
        }
        if (mensaje.equals("APAGAR")) {
            System.out.println("Servicios apagados");
        }
    }
    
}

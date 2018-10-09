/*
 * La clase MáquinaSoda se encarga de servir automáticamente las sodas
 * de los paquetes
 */

package invocacionimplicita;

import java.util.Observer;
import java.util.Observable;

public class MaquinaSoda implements Observer{

    //Este método es heredado de la clase Observer
    //Se activa cada vez que el BroadCast recibe un mensaje.
    public void update(Observable o, Object arg) {

        //Obtenemos el mensaje que recibió el BroadCast
        //NO sabemos quien lo envió.
        String evento=arg.toString();

        //Realizamos las tareas que corresponden al mensaje
        if(evento.equals("PAQUETE A")||evento.equals("PAQUETE C"))
            System.out.println("Maquina Soda::Sirve 1 soda");
        if(evento.equals("ENCENDER"))
            System.out.println("Maquina Soda::Lista");
        if(evento.equals("APAGAR"))
            System.out.println("Maquina Soda::Apagada");
    }
}

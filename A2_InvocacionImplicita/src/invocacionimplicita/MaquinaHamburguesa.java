/*
 * La clase MáquinaHamburgesa se encarga de servir automáticamente las hamburguesa
 * de los paquetes
 */

package invocacionimplicita;

import java.util.Observable;
import java.util.Observer;


public class MaquinaHamburguesa implements Observer{

    //Este método es heredado de la clase Observer
    //Se activa cada vez que el BroadCast recibe un mensaje.
    public void update(Observable o, Object arg) {

        //Obtenemos el mensaje que recibió el BroadCast
        //NO sabemos quien lo envió.
        String evento=arg.toString();

        //Realizamos las tareas que corresponden al mensaje
        if(evento.equals("PAQUETE A")||evento.equals("PAQUETE B"))
            System.out.println("Maquina Hamburgesa::Sirve 1 hamburguesa");
        if(evento.equals("ENCENDER"))
            System.out.println("Maquina Hamburgesa::Lista");
        if(evento.equals("APAGAR"))
            System.out.println("Maquina Hamburgesa::Apagada");
    }

}

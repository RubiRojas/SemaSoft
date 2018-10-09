/*
 * La clase MáquinaHamburgesa se encarga de servir automáticamente las papas
 * de los paquetes
 */

package invocacionimplicita;

import java.util.Observable;
import java.util.Observer;

public class MaquinaPapas implements Observer{

    //Este método es heredado de la clase Observer
    //Se activa cada vez que el BroadCast recibe un mensaje.
    public void update(Observable o, Object arg) {

        //Obtenemos el mensaje que recibió el BroadCast
        //NO sabemos quien lo envió.
        String evento=arg.toString();

        //Realizamos las tareas que corresponden al mensaje
        if(evento.equals("PAQUETE B")||evento.equals("PAQUETE C"))
            System.out.println("Maquina Papas::Sirve 1 papas fritas");
        if(evento.equals("ENCENDER"))
            System.out.println("Maquina Papas::Lista");
        if(evento.equals("APAGAR"))
            System.out.println("Maquina Papas::Apagada");
    }
}

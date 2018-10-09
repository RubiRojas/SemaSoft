/*
 * Esta maquina saluda al usuario al inicia y terminar el programa
 */
package invocacionimplicita;

import java.util.*;
import javax.swing.JOptionPane;

public class MaquinaSaludo implements Observer{
    
    //Este metodo se ejecuta cuando hay un cambio en el BroadCast
    public void update(Observable broadcast, Object mensaje){
        //Recibir el mensaje puesto en el broadcast
        String mensaje_recibido = mensaje.toString();
        
        if(mensaje_recibido.equals("ENCENDER"))
            JOptionPane.showMessageDialog(null,"Bienvenido");
        
        if(mensaje_recibido.equals("APAGAR"))
            JOptionPane.showMessageDialog(null,"Gracias por usar nuestro servicio");
    }
}

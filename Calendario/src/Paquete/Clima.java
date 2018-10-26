
package Paquete;

import java.util.Observable;
import java.util.Observer;


public class Clima implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String Mensaje = arg.toString().toUpperCase();
       
        
        if (Mensaje.equals("CLIMA")) {
            int Numero = (int) (Math.random() * 36) + 1;
            System.out.println("Clima es de "+ Numero);
            new FrmClima().setVisible(true);
        }
        if (Mensaje.equals("ENCENDER")) {
            System.out.println("Clima Listo");
        }
        if (Mensaje.equals("APAGAR")) {
            System.out.println("Clima Apagado");
        }
    
    }
    
}

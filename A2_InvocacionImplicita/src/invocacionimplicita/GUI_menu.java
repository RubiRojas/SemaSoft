/*
 La interfaz interactua con el usuario y muestra el menu y envia los mensajes para el Main
 */

package invocacionimplicita;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class GUI_menu {
    int opcion;

    public void mostrar_menu(){
        try{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:"
                + "\n1-Paquete A"
                + "\n2-Paquete B"
                + "\n3-Paquete C"));
        }
        catch(Exception error){
          opcion=0;
        }
    }

    public String obtener_mensaje(){
        String mensaje;
        switch(opcion){
            case 1:
                mensaje="PAQUETE A";
                break;
            case 2:
                mensaje="PAQUETE B";
                break;
            case 3:
                mensaje="PAQUETE C";
                break;
            default:
                mensaje="SALIR";
            }
        return mensaje.toUpperCase();
    }
}

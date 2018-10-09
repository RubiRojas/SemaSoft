/*
 * Proyecto de invocación implicita
 * Clase BroadCast es una clase que permite la comunicación entre los elementos
 * suscritos a ella, los mensajes deben ser bajo "contrato", es decir, deben ser conocidos
 * por los demás elementos.
 */
package invocacionimplicita;

import java.util.Observable;

public class BroadCast extends Observable{
    private String mensaje;

    public BroadCast(){
        mensaje="";
    }

    public void setStatus(String m){
        this.mensaje=m;

        //Indica que el estado del BroadCast ha sido modificado
        this.setChanged();
        //Comunica el mensaje (m) a los elementos adscritos al BroadCast
        this.notifyObservers(m);
    }

    public String getStatus(){
        return this.mensaje;
    }
}

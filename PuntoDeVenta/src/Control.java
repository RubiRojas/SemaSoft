import Paquete.*;

public class Control {
    Canal mCanal;
    Hora mHora;
    
    public Control(){
        mCanal =  new Canal();
        mHora = new Hora();
    }
    
    public void Suscribir(){
        mCanal.addObserver(mHora);
    }
    
    public void Enviar_Mensaje(String msj){
        mCanal.SetStatus(msj);
    }
}

/*
 * El objetivo de este programa es mostrar, a través de un ejemplo sencillo, la arquitectura
 * basada en eventos (invocación implícita).
 *
 * Este proyecto simula un despachador de paquetes de alimentos.
 * Los paquetes disponibles son:
 * -Paquete A (hamburguesa, soda)
 * -Paquete B (hamburguesa, papas)
 * -Paquete C (soda, papas)
 */

package invocacionimplicita;


public class Main {

    public static void main(String[] args) {

        //Crear las instancias de cada elemento
        BroadCast mBroadCast=new BroadCast();
        MaquinaHamburguesa mMaquinaHamburguesa= new MaquinaHamburguesa();
        MaquinaSoda mMaquinaSoda= new MaquinaSoda();
        MaquinaPapas mMaquinaPapas= new MaquinaPapas();
        String mensaje;
        GUI_menu mMenu= new GUI_menu();
        MaquinaSaludo mMaquinaSaludo = new MaquinaSaludo();

        //Suscribir las "maquinas" al BroadCast
        //De esta manera todos los mensajes enviados al BroadCast se distribuirán
        //entre las maquinas suscritas.
        mBroadCast.addObserver(mMaquinaSoda);
        mBroadCast.addObserver(mMaquinaHamburguesa);
        mBroadCast.addObserver(mMaquinaPapas);
        mBroadCast.addObserver(mMaquinaSaludo);

        mBroadCast.setStatus("ENCENDER");

        do{
            mMenu.mostrar_menu();
            mensaje=mMenu.obtener_mensaje();

            //Se notifica el mensaje al BroadCast y este lo hace extensivo a todos
            //los elementos inscritos a él
            mBroadCast.setStatus(mensaje);
            System.out.println("Orden despachada--------------------");
        }while(!mensaje.equals("SALIR"));

        mBroadCast.setStatus("APAGAR");
    }

}

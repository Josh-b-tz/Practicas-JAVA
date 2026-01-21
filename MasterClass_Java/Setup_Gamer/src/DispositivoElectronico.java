public class DispositivoElectronico {

    private boolean encendido;

    public DispositivoElectronico() {
        encendido = false;
    }

    public void encender(boolean encendido){
        this.encendido = encendido;
        if(encendido){
            System.out.println("Encendiendo...");
        } else{
            System.out.println("Debe de encender la PC");
        }
    }
}



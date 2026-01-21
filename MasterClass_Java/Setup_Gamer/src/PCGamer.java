public class PCGamer {
    private Monitor miMonitor;
    private Teclado miTeclado;
    private Mouse miMouse;

    public PCGamer() {
        miMonitor = new Monitor();
        miTeclado = new Teclado();
        miMouse = new Mouse();
    }

    public void empezarJuego(boolean encender){
        this.miMonitor.encender(encender);
        this.miMouse.encender(encender);
        this.miTeclado.encender(encender);

        if(encender){
            miMonitor.dibujarPixel();
            miMouse.hacerClick();
            miTeclado.escribir();
        }
    }
}

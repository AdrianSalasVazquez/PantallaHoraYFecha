
public class PantallaHoraYFecha{
    
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;
    private PantallaDosDigitos pantallaDias;
    private PantallaDosDigitos pantallaMeses;
    private PantallaDosDigitos pantallaAños;
    
    public PantallaHoraYFecha(){
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        pantallaDias = new PantallaDosDigitos(1, 30);
        pantallaMeses = new PantallaDosDigitos(1, 12);
        pantallaAños = new PantallaDosDigitos(1, 99);
    }
    
}

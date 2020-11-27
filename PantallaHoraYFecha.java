
public class PantallaHoraYFecha{
    
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;
    private PantallaDosDigitos pantallaDias;
    private PantallaDosDigitos pantallaMeses;
    private PantallaDosDigitos pantallaAños;
    
    public PantallaHoraYFecha(){
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        pantallaDias = new PantallaDosDigitos(1, 31);
        pantallaMeses = new PantallaDosDigitos(1, 13);
        pantallaAños = new PantallaDosDigitos(1, 100);
    }
    
    public String getFechaYHora() {
        String fechaYHora;
        fechaYHora = (pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla() + " " + pantallaDias.getTextoDeLaPantalla() + "-" + pantallaMeses.getTextoDeLaPantalla() + "-" + pantallaAños.getTextoDeLaPantalla());
        return fechaYHora;
    }
    
    public void avanzarMinuto() {
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 0) {
            pantallaHoras.incrementaValorAlmacenado();
            if (pantallaHoras.getValorAlmacenado() == 0) {
                pantallaDias.incrementaValorAlmacenado();
                if (pantallaDias.getValorAlmacenado() == 1) {
                    pantallaMeses.incrementaValorAlmacenado();
                    if (pantallaMeses.getValorAlmacenado() == 1) {
                        pantallaAños.incrementaValorAlmacenado();
                    }
                }
            }
        }
    }
    
    public void fijarFechaYHora(int hora, int minuto, int dia, int mes, int año) {
        pantallaHoras.setValorAlmacenado(hora);
        pantallaMinutos.setValorAlmacenado(minuto);
        pantallaDias.setValorAlmacenado(dia);
        pantallaMeses.setValorAlmacenado(mes);
        pantallaAños.setValorAlmacenado(año);
    }
    
}

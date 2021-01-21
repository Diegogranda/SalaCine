public class InfoCine {

    private String PeliculaReproducida;
    private double PrecioEntrada;
                      //Constructor

    public InfoCine(String peliculaReproducida, double precioEntrada) {
        PeliculaReproducida = peliculaReproducida;
        PrecioEntrada = precioEntrada;
    }


                        //Setters
    public void setPeliculaReproducida(String peliculaReproducida) {
        PeliculaReproducida = peliculaReproducida;
    }

    public void setPrecioEntrada(double precioEntrada) {
        PrecioEntrada = precioEntrada;
    }


                        //Getters
    public String getPeliculaReproducida() {
        return PeliculaReproducida;
    }

    public double getPrecioEntrada() {
        return PrecioEntrada;
    }
}
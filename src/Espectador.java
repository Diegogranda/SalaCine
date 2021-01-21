public class Espectador {
    private int Edad;
    private double DineroQueTiene;

                    //Constructors
    public Espectador(int edad, double dineroQueTiene) {
        Edad = edad;
        DineroQueTiene = dineroQueTiene;
    }



                    //Setters
    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setDineroQueTiene(double dineroQueTiene) {
        DineroQueTiene = dineroQueTiene;
    }



                    //Getters
    public int getEdad() {
        return Edad;
    }

    public double getDineroQueTiene() {
        return DineroQueTiene;
    }
}

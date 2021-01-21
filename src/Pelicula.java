public class Pelicula {

        private String titulo;
        private String director;
        private int duracion;
        private int edadminima;

        //constructor
        public Pelicula(String titulo, String director, int anyo,
                        String sinopsis, String genero) //constructor
        {

            this.titulo = titulo;
            this.director = director;
            this.edadminima = edadminima;
            this.duracion = duracion;

        }
        //Setters
        public void setTitulo(String titulo)
        {
            this.titulo = titulo;
        }

        public void setDirector(String director)
        {
            this.director = director;
        }

        public void setAnyo(int anyo)
        {
            this.edadminima = edadminima;
        }


        public void setSinopsis(String sinopsis)
        {
            this.duracion = duracion;
        }
        //Getters
        public String getTitulo()
        {
            return titulo;
        }

        public String getDirector()
        {
            return director;
        }

        public int getedadminima()
        {
            return edadminima;
        }



        public int getDuracion()
        {
            return duracion;
        }

        public void mostrarInfoPelicula()
        {
            System.out.println();
            System.out.println("Película:" + "<" + titulo + ">");
            System.out.println("Director:" + "<" + director + ">");
            System.out.println("Año:" + "<" + edadminima + ">");
            System.out.println("Sinopsis:" + "<" + duracion + ">");
            System.out.println();
        }

    }


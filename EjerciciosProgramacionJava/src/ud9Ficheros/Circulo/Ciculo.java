package ud9Ficheros.Circulo;

/**
 *
 * Clase que representa un circulo
 *
 * @author José David Rosales Rios
 * @version 14-03-2022
 *
 */
public class Ciculo {

    
    public class Circulo {

        private double centroX;
        private double centroY;
        private double radio;

        /**
         * Constructor del circulo
         * @param x centro indica la coordenada x del centro del circulo
         * @param y centro indica la coordenada y del centro del circulo
         * @param r indica el tamaño del radio del circulo
         */
        public Circulo(double x, double y, double r) {
            centroX = x;
            centroY = y;
            radio = r;
        }

        /**
         * Getter de la coordenada x del circulo
         * @return devuelve la coordenada x del centro del circulo 
         */
        public double getCentroX() {
            return centroX;
        }

        /**
         * Getter del perimetro del circulo
         * @return devuelve el perimetro del circulo
         */
        public double getPerimetro() {
            return 2 * Math.PI * radio;
        }

        /**
         * Metodo para desplazar el circulo
         * @param despX indica el valor que se le sumara a la coordenada x para poder desplazar el circulo
         * @param despY indica el valor que se le sumara a la coordenada y para poder desplazar el circulo
         */
        public void mueve(double despX, double despY) {
            centroX = centroX + despX;
            centroY = centroY + despY;
        }
    }
}

package herencia;

public class App {
    
    /** 
     * Esta clase es la actividad uno y dos de la práctica 7.
     * @param args Object?
     * @throws Exception The exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("1***************************");
        //Las clases base se pueden comportar como sus subclases.

        Poligono poligono = new Poligono();
        System.out.println(poligono);
    
        Object objeto = new Object();
        System.out.println("Objeto" +   objeto);

        objeto = poligono;
        System.out.println("Objeto como Poligono " + objeto);

        System.out.println("2***************************");
        //Uso de instanceof

        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);

        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);

        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);

    }

    
    /** 
     * @param poligono herencia.Poligono 
     */
    public static void selectorPoligonos(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("El objeto es un triangulo.");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("El objeto es un cuadrilatero.");
        } else if (poligono instanceof Poligono) {
            System.out.println("El objeto es un poligono.");
        } else {
            System.out.println("El objeto es una figura.");
        }

    }

}

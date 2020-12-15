package claseAbstracta;

public class MPOOP72 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("3***********************");
        //Poligono poligono = new Poligono(); X 
        //Syntaxis incorrecta -> Poligono es abtrracta, no se puede instanciar.
        Poligono poligono = new Triangulo();
        System.out.println(poligono);

       poligono = new Cuadrilatero();
       System.out.println(poligono);
    }

}
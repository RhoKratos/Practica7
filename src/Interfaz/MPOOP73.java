package Interfaz;

public class MPOOP73 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("4*******************");
        //Interfaz
        
        // InstrumentoMusical instumento = new InstrumentoMusical(); X

        InstrumentoMusical instrumento;
        instrumento = new InstrumentoViento();
        instrumento.afinar();
        System.out.println(instrumento);
        
        instrumento = new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
    }
}

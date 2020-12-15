package Interfaz;

public class InstrumentoViento implements InstrumentoMusical{
    
    public InstrumentoViento() {
    }

    @Override
    public void tocar() {
        System.out.println("Estoy tocando un instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando un instrumento de viento");
    }

    
    /** 
     * @return String
     */
    @Override
    public String tipoInstrumento(){
        return "Intrumento de viento.";
    }
    
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "InstrumentoViento []";
    }
  
}

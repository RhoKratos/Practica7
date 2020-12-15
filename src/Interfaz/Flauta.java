package Interfaz;

public class Flauta extends InstrumentoViento {

    public Flauta() {
    }

    
    /** 
     * @return String
     */
    public String tipoInstrumento(){
        return "Flauta";
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Flauta []";
    }
    
    
}

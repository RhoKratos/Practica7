package claseAbstracta;

public abstract class Poligono {
    
    
    /** 
     * @param toString(
     * @return float
     */
    public abstract float area();
    
    /** 
     * @param toString(
     * @return float
     */
    public abstract float perimetro();

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Poligono {" + '}';
    }

    
}

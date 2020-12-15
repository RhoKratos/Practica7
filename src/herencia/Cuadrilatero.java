package herencia;


public class Cuadrilatero extends Poligono{
    
    
    /**
      * Esta clase hereda de poligono para ser un cuadrilatero
      */
    
    
    private int alpha, beta;
    private float a, b, base, altura;

    
    public Cuadrilatero(){
    }

    public Cuadrilatero(float a, float b){
        this.a = a;
        this.b = b;
    }

    
    /** 
     * @return int alpha angulo
     */
    public int getAlpha() {
        return alpha;
    }

    
    /** 
     * @param alpha Angulo alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    
    /** 
     * @return int Angulo beta
     */
    public int getBeta() {
        return beta;
    }

    
    /** 
     * @param beta Agulo beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    
    /** 
     * @return float Lado A
     */
    public float getA() {
        return a;
    }

    
    /** 
     * @param a Lado A
     */
    public void setA(float a) {
        this.a = a;
    }

    
    /** 
     * @return float Lado B
     */
    public float getB() {
        return b;
    }

    
    /** 
     * @param b Lado B
     */
    public void setB(float b) {
        this.b = b;
    }

    
    /** 
     * @return float Base
     */
    public float getBase() {
        return base;
    }

    
    /** 
     * @param base Base
     */
    public void setBase(float base) {
        this.base = base;
    }

    
    /** 
     * @return float Altura
     */
    public float getAltura() {
        return altura;
    }

    
    /** 
     * @param altura Altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    /** 
     * @return String Cadena de Cuadrilatero
     */
    @Override
    public String toString() {
        return "Cuadrilatero [a=" + a + ", alpha=" + alpha + ", altura=" + altura + ", b=" + b + ", base=" + base
                + ", beta=" + beta + "]";
    }

}

package claseAbstracta;

public class Cuadrilatero extends Poligono{
    
    private int alpha, beta;
    private float a, b, base, altura;

    public Cuadrilatero(){

    }

    public Cuadrilatero(float a, float b){
        this.a = a;
        this.b = b;
    }

    
    /** 
     * @return int
     */
    public int getAlpha() {
        return alpha;
    }

    
    /** 
     * @param alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    
    /** 
     * @return int
     */
    public int getBeta() {
        return beta;
    }

    
    /** 
     * @param beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    
    /** 
     * @return float
     */
    public float getA() {
        return a;
    }

    
    /** 
     * @param a
     */
    public void setA(float a) {
        this.a = a;
    }

    
    /** 
     * @return float
     */
    public float getB() {
        return b;
    }

    
    /** 
     * @param b
     */
    public void setB(float b) {
        this.b = b;
    }

    
    /** 
     * @return float
     */
    public float getBase() {
        return base;
    }

    
    /** 
     * @param base
     */
    public void setBase(float base) {
        this.base = base;
    }

    
    /** 
     * @return float
     */
    public float getAltura() {
        return altura;
    }

    
    /** 
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Cuadrilatero [a=" + a + ", alpha=" + alpha + ", altura=" + altura + ", b=" + b + ", base=" + base
                + ", beta=" + beta + "]";
    }

    
    /** 
     * @return float
     */
    @Override
    public float area(){
        return base*altura;
    }

    
    /** 
     * @return float
     */
    @Override
    public float perimetro(){
        return 2*a +2*b;
    }

}

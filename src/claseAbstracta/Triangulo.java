package claseAbstracta;

public class Triangulo extends Poligono{
    private int alpha, beta, gamma;
    private float a, b, c, base, altura;

    public Triangulo(){
    }

    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    /** 
     * @return int
     */
    public int getAlpha(){
        return alpha;
    }

    
    /** 
     * @param alpha
     */
    public void setAlpha(int alpha){
        this.alpha = alpha;
    }

    
    /** 
     * @return int
     */
    public int getBeta(){
        return beta;
    }

    
    /** 
     * @param beta
     */
    public void setBeta(int beta){
        this.beta = beta;
    }

    
    /** 
     * @return int
     */
    public int getGamma(){
        return gamma;
    }

    
    /** 
     * @param gamma
     */
    public void setGamma(int gamma){
        this.gamma = gamma;
    }

    
    /** 
     * @return float
     */
    public float getA(){
        return a;
    }

    
    /** 
     * @param a
     */
    public void setA(float a){
        this.a = a;
    }

    
    /** 
     * @return float
     */
    public float getB(){
        return b;
    }

    
    /** 
     * @param b
     */
    public void setB(float b){
        this.b = b;
    }

    
    /** 
     * @return float
     */
    public float getC(){
        return c;
    }

    
    /** 
     * @param c
     */
    public void setC(float c){
        this.c = c;
    }

    
    /** 
     * @return float
     */
    public float getBase(){
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
        return "Triangulo {" + "alpha = " + alpha + "beta = " + beta +"gamma = " + gamma + "a = " + a + "b = " + b + "c = " + c + "base = " + base + "altura = " + altura;
    }

    
    /** 
     * @return float
     */
    @Override
    public float area(){
        return base*altura/2;
    }

    
    /** 
     * @return float
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
}
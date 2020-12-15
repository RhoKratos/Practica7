 package herencia;


public class Triangulo extends Poligono{

    /**
     * Clase Triangulo que hereda de la clase padre Pöligono
     */
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
     * @return int Angulo alpha
     */
    public int getAlpha(){
        return alpha;
    }

    
    /** 
     * @param alpha Modifica angulo alpha
     */
    public void setAlpha(int alpha){
        this.alpha = alpha;
    }

    
    /** 
     * @return int Regresa angulo beta
     */
    public int getBeta(){
        return beta;
    }

    
    /** 
     * @param beta Modifica angulo beta
     */
    public void setBeta(int beta){
        this.beta = beta;
    }

    
    /** 
     * @return int Regresa angulo alpha
     */
    public int getGamma(){
        return gamma;
    }

    
    /** 
     * @param gamma Modifica angulo alpha
     */
    public void setGamma(int gamma){
        this.gamma = gamma;
    }

    
    /** 
     * @return float Regresa lado a
     */
    public float getA(){
        return a;
    }

    
    /** 
     * @param a Modifica lado a
     */
    public void setA(float a){
        this.a = a;
    }

    
    /** 
     * @return float regresa lado b
     */
    public float getB(){
        return b;
    }

    
    /** 
     * @param b modifica lado b
     */
    public void setB(float b){
        this.b = b;
    }

    
    /** 
     * @return float regresa lado c
     */
    public float getC(){
        return c;
    }

    
    /** 
     * @param c Modifica lado c
     */
    public void setC(float c){
        this.c = c;
    }

    
    /** 
     * @return float Regresa lado c
     */
    public float getBase(){
        return base;
    }
    
    
    /** 
     * @param base Modifica la base
     */
    public void setBase(float base) {
        this.base = base;
    }

    
    /** 
     * @return float Regresa altura
     */
    public float getAltura() {
        return altura;
    }

    
    /** 
     * @param altura Modifica altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    /** 
     * @return String Regresa la clase Triangulo en forma de cadena
     */
    @Override
    public String toString() {
        return "Triangulo {" + "alpha = " + alpha + "beta = " + beta +"gamma = " + gamma + "a = " + a + "b = " + b + "c = " + c + "base = " + base + "altura = " + altura;
    }
}
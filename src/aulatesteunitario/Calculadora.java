package aulatesteunitario;
public class Calculadora {
    public static double soma(double a, double b){
        return a + b;
    }
    
    public static double multiplicacao(double a, double b){
        return a * b;
    }
    
    public static double raiQuadrada(double x) throws Exception{
        if(x < 0){
            throw new Exception("Não há raiz quadrada com negativos");
        }
        return Math.sqrt(x);
    }
    
    
}

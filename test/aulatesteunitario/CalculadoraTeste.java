package aulatesteunitario;

//import org.junit.Assert;
import junit.framework.Assert;
//import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void testarSoma(){
        Assert.assertEquals(4.0, Calculadora.soma(2, 2));
        Assert.assertEquals(10.0, Calculadora.soma(10, 0));
    }
    
    @Test
    public void testarMultiplicacao(){
        Assert.assertEquals(4.0, Calculadora.multiplicacao(2, 2));
        Assert.assertEquals(21.0, Calculadora.multiplicacao(2, 2));        
    }
    
    @Test
    public void testarRaizQuadrada(){
        
        Assert.assertEquals(9.0, Calculadora.raiQuadrada(81));
        Assert.assertEquals(-4.0, Calculadora.raiQuadrada(-4));
    }
    
    
    
    
}

package aulatesteunitario;

//import org.junit.Assert;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            Assert.assertEquals(Exception.class, Calculadora.raiQuadrada(-4));
            Assert.assertEquals(9.0, Calculadora.raiQuadrada(81));
            Assert.assertEquals(-4.0, Calculadora.raiQuadrada(-4));
        } catch (Exception ex) {
            //Logger.getLogger(CalculadoraTeste.class.getName()).log(Level.SEVERE, null, ex);
            Assert.assertEquals("Não há raiz quadrada de negativos", this);
        }
    }
    
    
    
    
}

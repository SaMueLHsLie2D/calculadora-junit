import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {

    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5.0, calc.somar(2.0, 3.0));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1.0, calc.subtrair(4.0, 3.0));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12.0, calc.multiplicar(3.0, 4.0));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6.0, 3.0));
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5.0, 0);
        });
    }

    @Test
    public void testPotenciar() {
        assertEquals(8.0, calc.potenciar(2.0, 3.0));
    }
}

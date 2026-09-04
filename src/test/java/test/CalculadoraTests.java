package test;

import model.Calculadora;
import view.jFrameCalculadora;
import java.awt.event.KeyEvent;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {

    /** Bug 1: o operador aritmético estava errado, deveria ser "+" e não "-" */
    @Test
    public void testSomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(5, 3);
        assertEquals(8, calculadora.resultado);
    }

    /** Bug 2: o operador aritmético estava errado, deveria ser "-" e não "+" */
    @Test
    public void testSubstrairDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.substrair(5, 3);
        assertEquals(2, calculadora.resultado);
    }

    /** Bug 3: o operador aritmético estava errado, deveria ser "*" e não "+" */
    @Test
    public void testMultiplicarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(5, 3);
        assertEquals(15, calculadora.resultado);
    }

    /** Bug 4: o operador aritmético estava errado, deveria ser "/" e não "*" */
    @Test
    public void testDividirDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(6, 3);
        assertEquals(2, calculadora.resultado);
    }

    /*jFrameCalculadora  */

    /** Bug 5: a tecla "7" estava funcionando como "4", deve enviar o dígito "7" */
    @Test
    public void testTeclaSeteEnviaSete() {
        jFrameCalculadora frame = new jFrameCalculadora();
        KeyEvent tecla = new KeyEvent(new javax.swing.JLabel(), KeyEvent.KEY_PRESSED,
                System.currentTimeMillis(), 0, KeyEvent.VK_7, '7');
        frame.jButtonNumero1KeyPressed(tecla);
        assertEquals("7", frame.getDisplayText());
    }

    /** Bug 6:  a tecla "L" estava indo para a função "+", deve acionar o "Limpar" */
    @Test
    public void testTeclaLimparComL() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        KeyEvent tecla = new KeyEvent(new javax.swing.JLabel(), KeyEvent.KEY_PRESSED,
                System.currentTimeMillis(), 0, KeyEvent.VK_L, 'l');
        frame.jButtonNumero1KeyPressed(tecla);
        assertEquals("0", frame.getDisplayText());
    }

    /** Bug 7: no estado 0 o dígito "0" era exibido como "1", deve mostrar "0" */
    @Test
    public void testDigitoZeroNoEstadoInicial() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("0");
        assertEquals("0", frame.getDisplayText());
    }

  /** Bug 8: o "Limpar" mudava para o estado 1 e o próximo numero concatenava com o "0", deveria permanecer no estado 0 */
    @Test
    public void testLimparNoEstadoInicial() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("Limpar");
        assertEquals("0", frame.getDisplayText());
    }

     /** Bug 9: no estado 1 o dígito "5" era ignorado (return), deveria concatenar como qualquer outro numero */
    @Test
    public void testDigitoCincoNoEstadoUm() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        assertEquals("5", frame.getDisplayText());
    }

    /** Bug 10: no estado 1 o operador "+" funcionava como "-", deve gravar "+" e somar certo */
    @Test
    public void testOperadorSomaGravaMais() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        assertEquals("8.0", frame.getDisplayText());
    }

       /** Bug 11: no estado 1 o "Limpar" mostrava "0.0" (valor do double), deveria mostrar "0" e resetar a operação */
    @Test
    public void testLimparNoEstadoUm() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("Limpar");
        assertEquals("0", frame.getDisplayText());
    }

    /** Bug 12: no estado 2 o digito "9" do segundo número era exibido como "8", deve mostrar "9" */
    @Test
    public void testDigitoNoveSegundoNumero() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("9");
        assertEquals("9", frame.getDisplayText());
    }

    /** Bug 13: no estado 2 ao trocar o operador, o "+" era registrado como "*", deve gravar o pressionado */
    @Test
    public void testTrocaDeOperadorMantemMais() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        assertEquals("8.0", frame.getDisplayText());
    }

    /** Bug 14: no estado 2 o "Limpar" deixava o display vazio e travava, deve resetar para "0" */
    @Test
    public void testLimparNoEstadoDois() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("Limpar");
        assertEquals("0", frame.getDisplayText());
    }

    /** Bug 15: no estado 3 o dígito "3" era concatenado duas vezes ("33"), deve concatenar uma única vez */
    @Test
    public void testDigitoTresConcatenaUmaVez() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("3");
        assertEquals("33", frame.getDisplayText());
    }

    /** Bug 16: no caso "=" a divisão por zero era sobrescrita, deve exibir "Erro" e resetar */
    @Test
    public void testDivisaoPorZeroMostraErro() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("/");
        frame.maquinaEstadoFinitoCalculadora("0");
        frame.maquinaEstadoFinitoCalculadora("=");
        assertEquals("Erro", frame.getDisplayText());
        frame.maquinaEstadoFinitoCalculadora("7");
        assertEquals("7", frame.getDisplayText());
    }

    /** Bug 17: o resultado era multiplicado por 10, deve exibir o valor real */
    @Test
    public void testResultadoSemMultiplicarPorDez() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("2");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        assertEquals("5.0", frame.getDisplayText());
    }

      /** Bug 18: no estado 3 o "Limpar" mostrava "0.0" (valor do double), deveria mostrar "0" e resetar a operação */
    @Test
    public void testLimparNoEstadoTres() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("5");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("Limpar");
        assertEquals("0", frame.getDisplayText());
    }

    /** Bug 19: no estado 4 digitar número após o resultado concatenava, deve iniciar cálculo novo */
    @Test
    public void testDigitoAposResultadoIniciaNovoCalculo() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("2");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        frame.maquinaEstadoFinitoCalculadora("7");
        assertEquals("7", frame.getDisplayText());
    }

      /** Bug 20: no estado 4 o operador zerava o primeiro número, deveria encadear a partir do resultado anterior */
    @Test
    public void testOperadorEncadeiaResultadoAnterior() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("2");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("4");
        frame.maquinaEstadoFinitoCalculadora("=");
        assertEquals("9.0", frame.getDisplayText());
    }

     /** Bug 21: no estado 4 o "=" repetido somava +1 ao resultado, deveria não fazer nada */
    @Test
    public void testIgualRepetidoNaoSoma() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("2");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        frame.maquinaEstadoFinitoCalculadora("=");
        assertEquals("5.0", frame.getDisplayText());
    }

    /** Bug 22: no estado 4 o "Limpar" reescrevia o mesmo texto (não limpava), deveria resetar para "0" */
    @Test
    public void testLimparNoEstadoQuatro() {
        jFrameCalculadora frame = new jFrameCalculadora();
        frame.maquinaEstadoFinitoCalculadora("2");
        frame.maquinaEstadoFinitoCalculadora("+");
        frame.maquinaEstadoFinitoCalculadora("3");
        frame.maquinaEstadoFinitoCalculadora("=");
        frame.maquinaEstadoFinitoCalculadora("Limpar");
        assertEquals("0", frame.getDisplayText());
    }
}
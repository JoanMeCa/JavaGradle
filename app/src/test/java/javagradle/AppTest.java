/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javagradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testContarElementos() {
        int[] array = {1, 2, 3, 4, 5};
        App gestor = new App(array);
        assertEquals(5, gestor.contarElementos());
    }
    @Test
    public void testContarElementosConArrayVacio() {
        int[] array = {};
        App gestor = new App(array);
        assertEquals(0, gestor.contarElementos());
    }

    @Test
    public void testRetornarPrimer() {
        int[] array = {1, 2, 3, 4, 5};
        App gestor = new App(array);
        assertEquals(1, gestor.retornarPrimer());
    }

    @Test
    public void testRetornarPrimerConArrayVacio() {
        int[] array = {};
        App gestor = new App(array);
        assertEquals(null, gestor.retornarPrimer());
    }

    @Test
    public void testRetornarDarrer() {
        int[] array = {1, 2, 3, 4, 5};
        App gestor = new App(array);
        assertEquals(5, gestor.retornarDarrer());
    }

    @Test
    public void testRetornarDarrerConArrayVacio() {
        int[] array = {};
        App gestor = new App(array);
        assertEquals(null, gestor.retornarDarrer());
    }

    @Test
    public void testRetornarTercer() {
        int[] array = {1, 2, 3, 4, 5};
        App gestor = new App(array);
        assertEquals(Integer.valueOf(3), gestor.retornarTercer());
    }

    @Test
    public void testRetornarTercerCon2ElementosEnElArray() {
        int[] array = {1, 2};
        App gestor = new App(array);
        assertEquals(null, gestor.retornarTercer());
    }

    @Test
    public void testRetornarTercerConArrayVacio() {
        int[] array = {};
        App gestor = new App(array);
        assertEquals(null, gestor.retornarTercer());
    }

    @Test
    public void testSumaElementos() {
        int[] array = {1, 2, 3, 4, 5};
        App gestor = new App(array);
        assertEquals(15, gestor.sumaElementos());
    }

    @Test
    public void testSumaElementosConNumerosPositivosYNegativos() {
        int[] array = {1, -2, 3, -4, 5};
        App gestor = new App(array);
        assertEquals(3, gestor.sumaElementos());
    }

    @Test
    public void testSumaElementosConArrayVacio() {
        int[] array = {};
        App gestor = new App(array);
        assertEquals(0, gestor.sumaElementos());
    }

    @Test
    public void testMediaElementos() {
        int[] array = {1, 2, 3, 4, 5};
        App gestor = new App(array);
        assertEquals(3.0, gestor.mediaElementos(), 0.001);
    }

    @Test
    public void testMediaElementosConNumerosPositivosYNegativos() {
        int[] array = {1, 2, 3, 4, -5};
        App gestor = new App(array);
        assertEquals(1.0, gestor.mediaElementos(), 0.001);
    }

    @Test
    public void testMediaElementosConArrayVacio() {
        int[] array = {};
        App gestor = new App(array);
        assertEquals(0.0, gestor.mediaElementos(), 0.001);
    }
}
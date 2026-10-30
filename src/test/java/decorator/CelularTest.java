package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelularTest {

    @Test
    void deveRetornarPrecoCelular() {
        Celular celular = new CelularBase(1000.0f);
        assertEquals(1000.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularPelicula() {
        Celular celular = new Pelicula(new CelularBase(1000.0f));
        assertEquals(1010.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularCapinha() {
        Celular celular = new Capinha(new CelularBase(1000.0f));
        assertEquals(1020.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularCartaoSD() {
        Celular celular = new CartaoSD(new CelularBase(1000.0f));
        assertEquals(1030.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularPeliculaCapinha() {
        Celular celular = new Pelicula(new Capinha(new CelularBase(1000.0f)));
        assertEquals(1030.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularPeliculaCartaoSD() {
        Celular celular = new Pelicula(new CartaoSD(new CelularBase(1000.0f)));
        assertEquals(1040.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularCapinhaCartaoSD() {
        Celular celular = new Capinha(new CartaoSD(new CelularBase(1000.0f)));
        assertEquals(1050.0f, celular.getPrecoFinal());
    }

    @Test
    void deveRetornarPrecoCelularPeliculaCapinhaCartaoSD() {
        Celular celular = new Pelicula(new Capinha(new CartaoSD(new CelularBase(1000.0f))));
        assertEquals(1060.0f, celular.getPrecoFinal());
    }

}
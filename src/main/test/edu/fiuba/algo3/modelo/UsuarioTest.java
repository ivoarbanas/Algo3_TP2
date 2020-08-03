package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    public void eligeRespuestasDelUsuarioYCargaCorrectamente(){
        Opcion opcionCorrecta1 = new Opcion("0");
        Opcion opcionCorrecta2 = new Opcion("-1");
        Opcion opcionIncorrecta = new Opcion("Mas que vos");
        ArrayList<Opcion> respuestaUsuario = new ArrayList<Opcion>();
        Usuario jugador = new Usuario("July");
        respuestaUsuario.add(opcionCorrecta1);
        respuestaUsuario.add(opcionCorrecta2);
        respuestaUsuario.add(opcionIncorrecta);
        jugador.cargarRespuestas(respuestaUsuario);

        assertEquals(opcionCorrecta1.valor(), jugador.respuestas().get(0).valor());
        assertEquals(opcionCorrecta2.valor(), jugador.respuestas().get(1).valor());
        assertEquals(opcionIncorrecta.valor(), jugador.respuestas().get(2).valor());
        assertEquals(3, jugador.respuestas().size());
    }
    @Test
    public void seCreaUnaNuevaRondaYSeBorranLasRespuestasAnterioresDelUsuario(){
        Opcion opcionCorrecta1 = new Opcion("0");
        Opcion opcionCorrecta2 = new Opcion("-1");
        Opcion opcionIncorrecta = new Opcion("Mas que vos");
        ArrayList<Opcion> respuestaUsuario = new ArrayList<Opcion>();
        Usuario jugador = new Usuario("July");
        respuestaUsuario.add(opcionCorrecta1);
        respuestaUsuario.add(opcionCorrecta2);
        respuestaUsuario.add(opcionIncorrecta);
        jugador.cargarRespuestas(respuestaUsuario);

        jugador.vaciarRespuestas();

        assertEquals(0, jugador.respuestas().size());
    }
}

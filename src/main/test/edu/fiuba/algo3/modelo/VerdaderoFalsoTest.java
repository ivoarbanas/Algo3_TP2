package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerdaderoFalsoTest {
    @Test
    public void seCreaPreguntaVerdaderoFalsoIndicandoRespuestaCorrecta(){

        OpcionCorrecta opcionCorrecta = new OpcionCorrecta("Verdadero");
        OpcionIncorrecta opcionIncorrecta = new OpcionIncorrecta("Falso");
        VerdaderoFalsoClasico pregunta = new VerdaderoFalsoClasico("Aprobé el parcial","Verdadero","Falso");
        assertEquals(opcionCorrecta.valor(), pregunta.opciones().get(0).valor());
    }

    @Test
    public void recibeUnaListaDeRespuestasYAsignaCorrectamentePuntosALosJugadoresQueRespondieronCorrectamente(){

        Usuario jugador1 = new Usuario("Jorge");
        Usuario jugador2 = new Usuario("Ramiro");
        VerdaderoFalsoClasico pregunta = new VerdaderoFalsoClasico("Aprobé el parcial","Verdadero","Falso");
        //metodo de K! que habla con sus usuarios para limpiar sus respuestas anteriores
        jugador1.vaciarRespuestas();
        jugador2.vaciarRespuestas();
        //
        jugador1.elegirRespuesta(pregunta);//elijo 0
        jugador2.elegirRespuesta(pregunta);//elijo 1
        Verificador verificador = new Verificador();
        verificador.verificar(pregunta, jugador1);
        verificador.verificar(pregunta, jugador2);
        assertEquals(jugador1.puntos().valor(), 1);
        assertEquals(jugador2.puntos().valor(), 0);
    }
}

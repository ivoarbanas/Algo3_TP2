package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class VerdaderoFalsoPenalidad extends VerdaderoFalso{

    public VerdaderoFalsoPenalidad(String enunciado, boolean esVerdadera){
        super(enunciado, esVerdadera);
    }

    public  Puntaje calcularPuntajeParaRespuesta(ArrayList<Opcion> listaDeRespuestas) {
        if (listaDeRespuestas.get(0).valor() == opcionCorrecta().get(0).valor()){
            Puntaje puntajePositivo = new Puntaje(1);
            return puntajePositivo;
        }
        Puntaje puntajeNegativo = new Puntaje(-1);
        return puntajeNegativo;
    }

    public Puntaje calcularPuntajeConMultiplicador(Puntaje puntaje, Multiplicador multiplicador){
        return multiplicador.aplicarValorDelMultiplicador(puntaje);
    }

    public Puntaje calcularPuntajeConExclusividad(Puntaje puntaje, ExclusividadDePuntaje exclusividad){
        return puntaje;
    }

}



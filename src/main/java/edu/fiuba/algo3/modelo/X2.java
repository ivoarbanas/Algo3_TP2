package edu.fiuba.algo3.modelo;

public class X2 extends Multiplicador {


    public Puntaje calcularPuntajeConMultiplicador(Puntaje puntajeAMultiplicar){

        puntajeAMultiplicar.cantidad( ( puntajeAMultiplicar.valor() ) * 2 );
        return puntajeAMultiplicar;

    }

    public int valorDelMultiplicador(){
        return 2;
    }
}

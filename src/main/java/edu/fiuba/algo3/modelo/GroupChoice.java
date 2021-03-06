package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class GroupChoice extends Pregunta {

    private String grupoUno;
    private String grupoDos;
    private ArrayList<Opcion> listaOpcionesGrupoUno;
    private ArrayList<Opcion> listaOpcionesGrupoDos;

    public GroupChoice(String nombreGrupoUno, String nombreGrupoDos) {
        super("Coloque las opciones en el grupo adecuado");
        grupoUno = nombreGrupoUno;
        grupoDos = nombreGrupoDos;
        listaOpcionesGrupoUno = new ArrayList<>();
        listaOpcionesGrupoDos = new ArrayList<>();
    }

    private boolean opcionEstaEnListaGrupo(ArrayList<Opcion> listaGrupo, Opcion opcion) {
        for (Opcion unaOpcion : listaGrupo) {
            if (unaOpcion.valor().equals(opcion.valor())) return true;
        }
        return false;
    }

    public Puntaje calcularPuntajeParaRespuesta(ArrayList<Opcion> listaDeRespuestasGrupoUno) {

        if (!(listaOpcionesGrupoUno.size() == listaDeRespuestasGrupoUno.size())) {
            Puntaje puntajeNulo = new Puntaje(0);
            return puntajeNulo;
        }
        for (Opcion unaOpcion : listaDeRespuestasGrupoUno) {
            if (!opcionEstaEnListaGrupo(listaOpcionesGrupoUno, unaOpcion)) {
                Puntaje puntajeNulo = new Puntaje(0);
                return puntajeNulo;
            }
        }
        Puntaje puntajePositivo = new Puntaje(1);
        return puntajePositivo;
    }

    public Puntaje calcularPuntajeConMultiplicador(Puntaje puntaje, Multiplicador multiplicador){
        return puntaje;
    }

    public Puntaje calcularPuntajeConExclusividad(Puntaje puntaje, ExclusividadDePuntaje exclusividad){
        return exclusividad.aplicarExclusividad(puntaje);
    }

    public void cargarOpcionesGrupoUno(Opcion opcion){
        listaOpcionesGrupoUno.add(opcion);
        opciones.add(opcion);
    }

    public void cargarOpcionesGrupoDos(Opcion opcion){
        listaOpcionesGrupoDos.add(opcion);
        opciones.add(opcion);
    }

    public String grupoUno(){
        return grupoUno;
    }

    public String grupoDos(){
        return grupoDos;
    }

    public ArrayList<Opcion> listaOpcionesGrupoUno(){
        return listaOpcionesGrupoUno;
    }

    public ArrayList<Opcion> listaOpcionesGrupoDos(){
        return listaOpcionesGrupoDos;
    }

    public ArrayList<Opcion> opcionCorrecta() {
        return opciones;
    }
}

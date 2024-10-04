package org.example;

import java.io.BufferedWriter;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class EquipoDao implements Dao{

    @Override
    public void getTabla() {

    }

    @Override
    public void guardar(List<Equipo> equipos) {

    }

    @Override
    public void cargar() {

    }

    @Override
    public Equipo add(String nombre, int victorias, int derrotas, int puntosAFavor, int puntosEnContra) {
        Equipo e = new Equipo(nombre, victorias,derrotas,puntosAFavor,puntosEnContra);

        return e;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public interface Dao {
    List<Equipo> equipos = new ArrayList<>();
    void getTabla();
    void guardar(List<Equipo> e);
    void cargar();
    Equipo add(String nombre, int victorias, int derrotas, int puntosAFavor, int puntosEnContra);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.List;

/**
 *
 * @author Daniel
 */
public interface OrdenarNumList {
    public List<Integer> generarNumAleatorios(int cantidad);
    public List<Integer> ordenarNumList(List<Integer> lista);
    public void mostrarListaOrdenada(List<Integer> lista);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Daniel
 */
public class GitHubTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** Metodo de Daniel **********");
        
        OrdenarNumList dan = new MetodoDaniel();
        
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        
        dan.mostrarListaOrdenada(dan.ordenarNumList(
                                 dan.generarNumAleatorios(100)));
        System.out.println("");
        time_end = System.currentTimeMillis();
        System.out.println("La tarea con el metodo de daniel tomo " + 
                          ( time_end - time_start ) + " milisegundos");
        
        System.out.println("");
        /**
         * Práctica para el grupo
         * Realizar su propia implementacion de los métodos de la interfaz
         * OrdenarNumList y subirlo al gitHub
         * Usar algoritmos de ordenamiento como el quicksort, bubblesort,etc
         */
        System.out.println("***** Metodo de Marcial **********");
        /**
         * long time_start, time_end;
         * time_start = System.currentTimeMillis();
         * 
         * OrdenarNumList mar = new MetodoMarcial();
         * mar.mostrarListaOrdenada(mar.ordenarNumList(
         *                          mar.generarNumAleatorios(100)));
         * 
         * System.out.println("");
           time_end = System.currentTimeMillis();
           System.out.println("La tarea con el metodo de Marcial tomo " + 
                          ( time_end - time_start ) + " milisegundos");
        
           System.out.println("");
        */
        
        
        // y asi sucesivamente para todos...
        
        
    } 
}

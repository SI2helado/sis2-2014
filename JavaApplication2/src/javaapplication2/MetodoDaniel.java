/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Daniel
 */
public class MetodoDaniel implements OrdenarNumList{

    @Override
    public List<Integer> generarNumAleatorios(int cantidad) {
        List<Integer> res = new ArrayList<>();
        Random rnd = new Random();
        int c = 0;
        while(c < cantidad){
            res.add((int)(rnd.nextDouble() * cantidad + 1));
            c++;
        }
        return res;
    }

    @Override
    public List<Integer> ordenarNumList(List<Integer> lista) {
        lista.sort(null);
        return lista;
    }

    @Override
    public void mostrarListaOrdenada(List<Integer> lista) {
        int c = 0;
        for (Integer num : lista) {
            if(c < 15)
                System.out.print(num + ", ");
            else{
                System.out.println(num + ", ");
                c = -1;
            }
            c++;
        }
        System.out.println("");
    }
    
}

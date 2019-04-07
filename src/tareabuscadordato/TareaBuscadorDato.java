/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareabuscadordato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NORMAN
 */
public class TareaBuscadorDato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerosIngresar = 0;
        System.out.println("Introducir numeros a promediar, presione 0 para terminar de ingresar numeros");
        Scanner reader = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        do {
            numerosIngresar = reader.nextInt();
            lista.add(numerosIngresar);
        } while (numerosIngresar != 0);
        System.out.println("Numero a buscar, dentro de la lista: ");
        int buscador = 0;
        Scanner buscando = new Scanner(System.in);
        buscador = buscando.nextInt();
        if (lista.contains(buscador)) {
            for (int x = 0; x < lista.size(); x++) {
                lista.get(x);
                if (lista.get(x) == buscador) {
                    System.out.println("El numero esta en la posicion " + (x + 1));
                }
            }
        } else {
            System.out.println("-1");
        }
    }

}

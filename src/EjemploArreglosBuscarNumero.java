import java.io.Console;
import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.println("\r\nIngrese un número a buscar:");
        int num = s.nextInt();
        int i = 0;
        for(; i < a.length && a[i] != num; i++){}

        if(i == a.length){
            System.out.println("Número no encontrado");
        } else if(a[i] == num){
            System.out.println("Encontrado en la posición: " + i);
        }

    /**
     * Practicas de Busqueda de arreglo:
     */
//        int[] myLista = new int[10];
//        myLista[0]=12;
//        myLista[1]=34;
//        myLista[2]=2;
//        myLista[3]=1;
//        myLista[4]=6;
//        myLista[5]=57;
//        myLista[6]=7;
//        myLista[7]=9;
//        myLista[8]=8;
//        myLista[9]=3;
//    int[] myLista= {12, 34, 2, 1, 6, 57, 7, 9, 8, 3};
//
//        System.out.println(myLista[9]);

    }
}

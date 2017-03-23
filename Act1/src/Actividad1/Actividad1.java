package Actividad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Actividad1 {

	public static void numerosTodos(int[] numerosEnteros){
		ArrayList<Integer> numerosParesImpares=new ArrayList<Integer>();
		System.out.print("ArrayList con pares e inpares");
		for (int i=0; i<numerosEnteros.length; i++){
			if(numerosEnteros[i]%2==0){
				numerosParesImpares.add(0, numerosEnteros[i]);
			}
			else numerosParesImpares.add(numerosEnteros[i]);
	}
		System.out.println(numerosParesImpares);
	}
	//OLA K ASE
	//CODDIGO MAL HECHO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		int [] numerosEnteros=new int[10];
		for (int i=0; i<numerosEnteros.length; i++){
			numerosEnteros[i]=rnd.nextInt(50-0+1)+0;
		}
		System.out.println(Arrays.toString(numerosEnteros));//Per a guardar el "numerosEnteros" en un string y mostrarlo per pantalla
		numerosTodos(numerosEnteros);// Este apartat per a que es guarde en el static
	}

}

package array;


import java.util.Scanner;

public class DesafioArray {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe a quantidade de notas");
	int qtdeNotas = entrada.nextInt();
	
	double [] notas = new  double [qtdeNotas];
	
	for (int i = 0; i < notas.length; i++) {
		System.out.println("Informe a nota" + i + 1 + ": ");
		notas[i] = entrada.nextDouble();
	}
	double total = 0;
	for(double nota: notas) {
		total += nota;
	}
	double media = total / notas.length;
	System.out.println("A media e " + media + "!");
	entrada.close();
}
}

package array;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [3];
		notasAlunoA [0] = 7.9;
		notasAlunoA [1] = 10.0;
		notasAlunoA [2] = 7.2;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for (int i = 0; i <notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println(total / notasAlunoA.length);
		
		double totalAlunoB = 0;
		
		double [] notasAlunoB = {6.9, 3.4, 1.8, 10};
				for (int b = 0; b < notasAlunoB.length; b++) {
					totalAlunoB += notasAlunoB[b];
				}
				System.out.println(totalAlunoB / notasAlunoB.length);
		
	}
	
}

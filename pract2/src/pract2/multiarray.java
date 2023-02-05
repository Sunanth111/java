package pract2;

public class multiarray {

	public static void main(String [] args) {
		int population[][]= {{123,345,456},
							 {234,348,678},
							 {467,789,890}
							 };
		for(int i=0;i<population.length;i++) {
			for(int j=0;j<population[i].length;j++) {
				System.out.print(population[i][j]+" ");
		
		}
			System.out.println();	
	}
}
}

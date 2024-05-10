package contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int parametroUm = 0;
		int parametroDois = 0;
		
		System.out.print("Informe o Primeiro parâmetro ");
		parametroUm = sc.nextInt();
		
		System.out.print("Informe o Segundo parâmetro ");
		parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}else {
			int contador = parametroDois-parametroUm;
			
			for (int x = 0; x<contador; x++) {
				System.out.print("Imprimindo o numero "+(x+1)+", ");
			}
		}
	}

}

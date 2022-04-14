package dinheiro;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;
public class troco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("###,##0.00");
		
		int nota[] = {100, 50, 20, 10, 5, 2, 1};
	    int centavos[] = {50, 25, 10, 5, 1};
		int i, valor, conta;
		
		System.out.println("Digite o valor do produto: ");
		double x = sc.nextDouble();
		System.out.println("Digite o valor � pagar: ");
		double y= sc.nextDouble();
		
		double calculos = calculosTroco(x,y);
	    
	    if (x > y) {
	    	System.out.println("Vo�� deve: "+"R$ "+ calculos );
	    }
	    if (x == y){
	    	System.out.println("Valor debitado");
	    }
		if (x < y) {
			System.out.println("Seu troco: "+"R$ "+ calculos * (-1) +"\n" );
		
        valor = (int) calculos;
		i = 0;
	      while (valor != 0) {
	        conta = valor / nota[i]; 
	        if (conta != 0) {
	        	System.out.println(conta * (-1)  +" nota(s) de R$"+ nota[i] +"\n");
	           valor = valor % nota[i];
	        }
	        i++;
	    }
	      valor = (int)Math.round((calculos - (int)calculos) * 100);
	      i = 0;
	      while (valor != 0) {
	        conta = valor / centavos[i]; 
	        if (conta != 0) {
	        	System.out.println(conta * (-1) +" moeda(s) de "+ centavos[i] +" centavo(s)\n");
	           valor = valor % centavos[i];
	        }
	        i = i + 1; 
	    }
	 
    }
}
	private static double calculosTroco(double x, double y) {
		double valor = x - y;
		return valor;
		
	}
}
	    



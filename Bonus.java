package TERNARIO;

public class Bonus {
	public static void main(String[] args) {
	double tempoDeServico = 2;
	
	double salario = 1000.00;
	
	double bonus = tempoDeServico <= 3 
	    ? salario * 0.05 
	    : salario * 0.07;
	
	System.out.printf("salário + bonus  "+ (salario + bonus));
	}
}


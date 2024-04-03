package TERNARIO;
public class BonusIf {

  public static void main(String[] args) {
    double tempoDeServico = 2;
    double salario = 1000.00;

    double bonus;
    if (tempoDeServico <= 3) {
      bonus = salario * 0.05;
    } else {
      bonus = salario * 0.07;
    }

    System.out.println("salário + bonus: "+ (salario + bonus));
  }
}
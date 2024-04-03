package TERNARIO;
public class BonusCase {

  public static void main(String[] args) {
    double tempoDeServico = 2;
    double salario = 1000.00;

    int categoriaTempo = (int) tempoDeServico; // Convert to int for switch

    double bonus;
    switch (categoriaTempo) {
      case 3: 
      case 2: 
      case 1:
        bonus = salario * 0.05;
        break;
      default:
        bonus = salario * 0.07;
    }

    System.out.println("salário + bonus:"+ (salario + bonus));
  }
}
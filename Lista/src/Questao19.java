import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas bimestrais:");

        System.out.print("1º Bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("2º Bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("3º Bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.print("4º Bimestre: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}

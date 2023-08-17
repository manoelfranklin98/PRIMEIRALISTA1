import java.util.Scanner;
public class Questao20 {
    public  static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("valor do salario: ");
        double salario = scanner.nextInt();


        Scanner horas = new Scanner (System.in);
        System.out.println("quantas horas voce trabalhou");
        double hours = scanner.nextInt();


        double salarioBruto = salario * hours;
        double ir = salario *11 / 100;
        double inss = salario *8 / 100;
        double sindicato = salario * 0.05;
        double descontosTotais = salarioBruto - ir- inss - sindicato;


        System.out.println("o total do salario brutoR$:"+salarioBruto);

        System.out.println("o valor toytal pago oa ir foi de R$:"+ir);

        System.out.println("o valor total pago ao inss foi de R$:"+inss);

        System.out.println("o valor total pago ao sindicato foi R$:"+sindicato);

        System.out.println("o desconto total foi  de R$:"+descontosTotais);


    }
}

import java.util.Scanner;

public class ValidaFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorFuncionarios = 3;

        Funcionario[] funcionarios = new Funcionario[contadorFuncionarios];

        for (int i=0; i<contadorFuncionarios; i++){
            Funcionario funcionario = new Funcionario();

            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite seu salário:");
            double salario = scanner.nextDouble();

            funcionario.nome = nome;
            funcionario.salario = salario;

            if (salario <= 1000){
                funcionario.bonus = salario * 0.2;
            }if (salario > 1000 && salario < 2000){
                funcionario.bonus = salario * 0.1;
            }else if (salario >= 2000){
                funcionario.bonus = (salario * 0.1) * -1;
            }

            funcionarios[i] = funcionario;

            System.out.println();

            scanner.nextLine();
        }

        for (Funcionario funcionario : funcionarios){
            System.out.println("Funcionário: " + funcionario.nome);
            System.out.println("Salário: " + funcionario.salario);
            System.out.println((funcionario.bonus < 0)
                    ? "Desconto: " + Math.abs(funcionario.bonus)
                    : "Bônus: " + funcionario.bonus);
            System.out.println("Salário Líquido: " + (funcionario.salario + funcionario.bonus));
            System.out.println();
        }

        scanner.close();
    }
}
class Funcionario {
    String nome;
    Double salario;
    Double bonus;
}


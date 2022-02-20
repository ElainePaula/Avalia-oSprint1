import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
                "Em qual ano o Corinthians foi campeão mundial?",
                "Em qual país o chuveiro elétrico foi inventado?",
                "Qual o maior país do mundo?",
                "Em qual ano o homem foi à lua?",
                "As pessoas de qual tipo sanguíneo são consideradas doadores universais?"
        };
        String[] respostas = {
                "2012",
                "Brasil",
                "China",
                "1969",
                "O"
        };

        System.out.println("Digite seu usuário:");
        String usuario = scanner.nextLine();
        System.out.println();

        int acertos = 0;
        for (int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase(respostas[i])) {
                System.out.println("Você acertou!");
                ++acertos;
            }else {
                System.out.println("Você errou!");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Usuário: " + usuario);
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + (perguntas.length - acertos));

        scanner.close();
    }
}


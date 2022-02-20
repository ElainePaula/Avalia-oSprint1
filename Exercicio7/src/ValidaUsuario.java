import java.time.LocalDateTime;
import java.util.Scanner;

public class ValidaUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usuarios = {"elaine"};
        String[] senhas = {"batatinhafrita123"};

        String[] mensagens = {
                "Bom dia, você se logou ao nosso sistema.",
                "Boa tarde, você se logou ao nosso sistema.",
                "Boa noite, você se logou ao nosso sistema.",
                "Boa madrugada, você se logou ao nosso sistema."
        };

        System.out.println("Digite seu usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        System.out.println();

        LocalDateTime agora = LocalDateTime.now();
        int hora = agora.getHour();

        if (usuario.equals(usuarios[0]) && senha.equals(senhas[0])){
            if (hora >= 6 && hora <= 11){
                System.out.println(mensagens[0]);
            }else if (hora >= 12 && hora <= 17){
                System.out.println(mensagens[1]);
            }else if (hora >= 18 && hora <= 23){
                System.out.println(mensagens[2]);
            }else System.out.println(mensagens[3]);
        }else{
            System.out.println("Usuário e/ou senha incorretos.");
        }
        scanner.close();
    }
}



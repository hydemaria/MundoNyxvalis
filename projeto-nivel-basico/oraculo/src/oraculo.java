//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class oraculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- Bem-vindo ao Oráculo da Lua!!------- ");

        String[] respostas = new String[]{"Sim", "Não", "Talvez", "O destino dirá…", "As estrelas estão em silêncio", "A Lua sussurra que sim", "O futuro ainda não está escrito."};

        System.out.println("Pergunte ao Oráculo: ");
        String pergunta = scanner.nextLine();

        int sorteio = (int)(Math.random() * (double)respostas.length);

        System.out.println("--------------");
        System.out.println("Oráculo responde: " + respostas[sorteio]);
        System.out.println("--------------");


        scanner.close();
    }
}

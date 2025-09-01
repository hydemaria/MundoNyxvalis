import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CacadorLunar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("------- Bem-vindo ao Caçador Lunar!!------- \n");
        System.out.println("Você é um Caçador Lunar em uma floresta escura. Sua missão é sobreviver!");
        System.out.println("Qual seu nome? ");

        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "! Você começará com 10 pontos! ");

        String [] missao = {"Lobo", "Clareira", "Ervas"};

        int vida = 10;
        int honra = 5;
        int rodada = 0;

        while (vida > 0) {
            System.out.println("Agora vamos a sua missão! Escolha um numero de 1 a 3: ");
            int escolha = scanner.nextInt();
            System.out.println("Você escolheu a missão " + escolha + " !" );

            switch (escolha) {
                case 1:
                    System.out.println("\n--------------");
                    System.out.println("Missão: Lobo à espreita");
                    System.out.println("--------------\n");
                    System.out.println("Um lobo aparece! O que você faz?");
                    System.out.println("1 - atacar  \n2 - fugir");
                    int acaoLobo = scanner.nextInt();
                    if (acaoLobo == 1) {
                        vida -= 2;
                        System.out.println("Você escolheu atacar! Perdeu pontos! Vida restante " + vida);
                    } else if (acaoLobo == 2) {
                        vida += 2;
                        System.out.println("Você escolheu fugir! Ganhou pontos! Honra: " + honra );
                    }
                    rodada++;


                case 2:
                    System.out.println("\n--------------");
                    System.out.println("Missão: Clareira Iluminada");
                    System.out.println("--------------\n");
                    System.out.println("Você encontrou uma lareira iluminada pela lua. Qual você escolhe?");
                    System.out.println("1 - descansar um pouco \n2 - continuar andando pela floresta");
                    int acaoClareira = scanner.nextInt();
                    if (acaoClareira == 1) {
                        vida += 2;
                        System.out.println("Você escolheu descansar! Ganhou pontos! Vida atual: " + vida);
                    } else if (acaoClareira == 2) {
                        vida -= 2;
                        System.out.println("Você escolheu continuar andando pela floresta! Vida atual: " + vida);
                    }
                    rodada++;


                case 3:
                    System.out.println("\n--------------");
                    System.out.println("Missão: Ervas Misteriosas");
                    System.out.println("--------------\n");
                    System.out.println("Você achou ervas brilhantes no chão. O que você faz?");
                    System.out.println("1 - comer (pode ganhar 2 pontos ou perder 2, é arriscado!!)\n2 - ignorar e seguir");
                    int acaoErvas = scanner.nextInt();
                    int resultado = gerador.nextInt(2);
                    if (acaoErvas == 1) {
                        if (resultado == 0) {
                            vida -= 2;
                            System.out.println("Puts, era venenoso! Vida restante: " + vida);
                        } else {
                            vida += 2;
                            System.out.println("Que sorte, ein! Agora você ficou mais forte! " + vida);
                        }
                        } else if (acaoErvas == 2) {
                            System.out.println("Você escolheu ignorar e seguir. Não perdeu e nem ganhou pontos! Vida atual: " + vida);
                    }
                    rodada++;

                }
                    if (vida <= 0) {
                        System.out.println("Oh não! Sua vida acabou… O Caçador Lunar não sobreviveu desta vez!");
                    } else {
                        System.out.println("Parabéns, " + nome + "! Você sobreviveu a todas as missões e se tornou um verdadeiro Caçador Lunar!");
                        System.out.println("Vida final: " + vida + " | Honra final: " + honra);

                    }
        }scanner.close();
    }
    }




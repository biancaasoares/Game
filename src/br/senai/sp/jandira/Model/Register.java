package br.senai.sp.jandira.Model;

import java.util.Locale;
import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia player
     */
    Player player = new Player();

    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    /**
     * Instancia Output
     */
    Output output = new Output();

    public void BothRegister() {
        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.Print(player);
        output.Print2(enemy);

    }

    public void PlayerRegister() {
        /** Coleta de dados do Player-1 */
        System.out.println("--------------- Cadastro Player -------------");
        System.out.println("Qual é o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha a sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("-------- Player Cadastrado com Sucesso!! ----------");

        if (validaPrint != 1) {
            /** Printa as informações cadastradas */
            output.Print(player);

        }
    }

    public void EnemyRegister() {
        /** Coleta de dados do Enemy-1 */
        System.out.println("--------------- Cadastro Enemy -------------");
        System.out.println("Qual é o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha a sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("-------- Enemy Cadastrado com Sucesso!! ----------");

        if (validaPrint != 1) {
            /** Printa as informações cadastradas */
            output.Print2(enemy);
        }
    }

    public void RegisterDecision() {

        String decision;

        System.out.println("Seja Bem Vindo !!!");
        System.out.println(" Deseja Cadastrar [ 1- Player 2- Enemy  3- Ambos]");
        decision = teclado.nextLine();


        switch (decision.toUpperCase()) {
            case "Player":
                PlayerRegister();
                break;
            case "Enemy":
                EnemyRegister();
                break;
            case "Ambos":
                BothRegister();
                break;

        }
        System.out.println("Deseja retornar ao cadastro [1-Sim 2- Não]: ");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            RegisterDecision();
        }


    }

}



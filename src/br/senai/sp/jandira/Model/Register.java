package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Register {

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia player */
    Player player = new Player();

    /** Instancia Enemy */
    Enemy enemy = new Enemy();

    public void BothRegister() {
     PlayerRegister();
     EnemyRegister();

    }

    public void PlayerRegister() {
        /** Coleta de dados do Player-1 */
        System.out.println("--------------- Cadastro Player -------------");
        System.out.println("Qual é o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha a sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("-------- Player Cadastrado com Sucesso!! ----------");

    }

    public void EnemyRegister() {
        /** Coleta de dados do Enemy-1 */
        System.out.println("--------------- Cadastro Enemy -------------");
        System.out.println("Qual é o seu nome: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha a sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("-------- Enemy Cadastrado com Sucesso!! ----------");

    }

    public void RegisterDecision(){

        String decision;

        System.out.println("Seja Bem Vindo !!!");
        System.out.println(" Deseja Cadastrar [ 1- Player 2- Enemy  3- Ambos");
        decision = teclado.nextLine();


        switch(decision){
            case "Player":
                PlayerRegister();
                break;
            case "Enemy":
                EnemyRegister();
                break;
            case "Ambos":
                BothRegister();

            default:
                System.out.println("Digite uma opção válida");

        }

        }

        }



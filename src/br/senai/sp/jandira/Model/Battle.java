package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Battle {
    /** Declarar variaveis */
     String scenarioBattle;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Scenario */
     Scenario scenario = new Scenario();

     public void Battle(Player player , Enemy enemy){
         System.out.println(player);
         System.out.println(enemy);
     }

    public void ChoiceScenario(){
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Escolha um cenário [1- Torre Eiffel  2-Arabia  3-Turquia] :  ");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        int choiceScenario = teclado.nextInt();

       scenarioBattle = scenario.Scenario(choiceScenario);

        System.out.println(scenarioBattle);
    }




}

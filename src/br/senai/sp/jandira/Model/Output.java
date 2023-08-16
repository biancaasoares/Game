package br.senai.sp.jandira.Model;


public class Output {

     public void Print(Player player){
         /** printar informações */
         System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
         System.out.println("------------------ Player  -------------------------");
         System.out.println(" O nome do Player é: " + player.nome);
         System.out.println("A skin do seu player: " + player.skin);
         System.out.println("A vida do seu player é: " + player.getLife());
         System.out.println("----------------------------------------------------");
         System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
     }
    public void Print2(Enemy enemy){
        /** printar informações */
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("------------------ Enemy -------------------------");
        System.out.println(" O nome do Enemy é: " + enemy.nome);
        System.out.println("A skin do seu Enemy: " + enemy.skin);
        System.out.println("A vida do seu player é: " + enemy.getLife());
        System.out.println("----------------------------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }

}

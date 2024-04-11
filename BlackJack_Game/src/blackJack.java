import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        ArrayList<Integer> cards = new ArrayList<>();
        Random b = new Random();
        int player;
        int total = 0;
        int bot;
        bot  = b.nextInt(8)+13;
        for (int i = 0; i < 2; i++) {
            player = b.nextInt(10) + 1;
            cards.add(player);
        }
        for (Integer card : cards) {
            total += card;
        }
        System.out.println(cards);
        if (bot==21){
            System.out.println("bot win");
        }

        while (total<=21&&bot<=21){
            Scanner x = new Scanner(System.in);
            System.out.print("response '1' to open cards '0' to add card: ");
            int ans = x.nextInt();
            if (ans == 0){
                player = b.nextInt(10) + 1;
                cards.add(player);
                System.out.println(cards);
            }
            else if (ans == 1){
                if (total>bot){
                    System.out.println("----------------------YOU WIN----------------------");
                    System.out.println("Total of your cards is:"+total);
                    System.out.println("and Total of our cards is:"+bot);
                    break;
                }
                else{
                    System.out.println("----------------------YOU LOSE----------------------");
                    System.out.println("Total of your cards is:"+total);
                    System.out.println("and Total of our cards is:"+bot);
                    break;
                }
            }
            total = 0;
            for (Integer card : cards) {
                total += card;
            }
            if (total==21){
                System.out.println("----------------------YOU WIN----------------------");
                System.out.println(cards);
                break;
            }
            else if (total>21){
                System.out.println("----------------------YOU LOSE----------------------");
                System.out.println(cards);
                System.out.println("Total of your cards is:"+total);
                System.out.println("and Total of our cards is:"+bot);
                break;
            }
        }
    }
}

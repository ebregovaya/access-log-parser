import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        guessGame();
    }
    public static void guessGame() {
        int randomNum = 3;
        int x=0;
        int res=0; // количество попыток
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        while (x!=randomNum) {
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
                res++;
            } else {
                System.out.println("Yes, it`s " + randomNum);
                res++;
            }
        }
        System.out.println("Количество попыток " + res);
    }
}
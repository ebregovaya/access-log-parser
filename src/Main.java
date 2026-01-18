import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String plus="Сумма: ";
        String min ="Разность: ";
        String mult ="Произведение: ";
        String div ="Частное: ";
        System.out.println("Введите первое число");
        int number1= new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int number2= new Scanner(System.in).nextInt();
        System.out.println(plus+(number1+number2));
        System.out.println(min+(number1-number2));
        System.out.println(mult+(number1*number2));
        System.out.println(div+((double)number1/number2));

        }
    }

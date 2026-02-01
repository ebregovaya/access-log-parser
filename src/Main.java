import java.io.File;
import java.util.Scanner;

public class Main {public static void main(String[] args) {
    //C:\_git\AccessLogParser\src\Main.java
    int res=0;
         while (true) {
            System.out.println("Укажите путь к файлу :");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
             if (file.isDirectory()) {
                 System.out.println("Это директория ");
             }
              else if (file.exists()) {
                System.out.println("Путь указан верно: " + file.getAbsolutePath());
                 res++;
                 System.out.println("Это файл номер " + res);
              }
               else {
                 System.out.println("Файл не существует  " + file.getAbsolutePath());

               }
          }

         }
        }





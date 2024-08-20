import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int verno = 0;

        while (true){
            System.out.println("Введите путь к файлу на компьютере: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!file.exists() || file.isDirectory()) {
                System.out.println("Это не путь к файлу!");
            } else
            {
                System.out.println("Путь верный: ");
                verno++;
                System.out.println("Это файл номер "+verno);
            }
            continue;
        }
    }
}


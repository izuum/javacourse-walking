package day20.Task1;

import day20.Task1.model.File;
import day20.Task1.service.FileService;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static day20.Task1.model.TypeFile.*;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService(initFiles());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Для поиска введи название файла: ");
        String desiredFileName = scanner.nextLine();

        scanner.close();

        try {
            File foundFile = fileService.findFile(desiredFileName);
            System.out.println(foundFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not exists");
        }
    }




    private static File[] initFiles() {
        File file1 = new File("Dogovor", 5, TXT);
        File file2 = new File("Music", 50, FLAC);
        File file3 = new File("Home Video", 200, MOV);
        File file4 = new File("Family Photo", 1, JPG);
        File file5 = new File("Avengers", 5047, MOV);
        File file6 = new File("Captain America", 4056, MOV);
        File file7 = new File("Best Sing", 10, FLAC);
        File file8 = new File("Favourite photo", 43, JPG);
        File file9 = new File("Document", 11, TXT);
        File file10 = new File("My dog", 30, JPG);


        return new File[]{file1, file2, file3, file4, file5, file6, file7, file8, file9, file10};
    }
}



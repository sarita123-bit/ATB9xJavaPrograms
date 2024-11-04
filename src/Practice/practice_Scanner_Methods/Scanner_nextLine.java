package Practice.practice_Scanner_Methods;

import java.util.Scanner;

public class Scanner_nextLine {
    public static void main(String[] args) {
        String s = "Gfg \n Geeks \n GeeksForGeeks";
        //String s = "Gfg\nGeeks\nGeeksForGeeks";

        // create a new scanner
        // with the specified String Object
        Scanner scanner = new Scanner(s);

        // print the next line
        System.out.println(scanner.nextLine());

        // print the next line again
        System.out.println(scanner.nextLine());

        // print the next line again
        System.out.println(scanner.nextLine());

        scanner.close();
    }
}

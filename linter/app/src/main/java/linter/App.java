package linter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws FileNotFoundException
    {
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js";
        try {
            JavaScriptLinter(path);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }
    }
    public static void JavaScriptLinter(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scan = new Scanner(file);
        String str;
        int count = 0;
        while (scan.hasNextLine()) {
            str = scan.nextLine();
            ++count;
            int size = str.length();
            if (size == 0 ||
                    str.charAt(size - 1) == '{' ||
                    str.charAt(size - 1) == '}' ||
                    str.contains("if") ||
                    str.contains("else")) {
                continue;
            }
            if (size > 0 && str.charAt(size - 1) != ';') {
                System.out.println("Line " + count + ": Missing semicolon.");
            }
        }
        scan.close();
    }
}

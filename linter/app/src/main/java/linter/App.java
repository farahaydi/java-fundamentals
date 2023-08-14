package linter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
//        String test ="C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\test\\resources\\containsFewErrors.js";
        String path = "C:\\Users\\farah\\java-projects\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js";

//        System.out.println(JavaScriptLinter(path));
        try {
            String lintResult = JavaScriptLinter(path);
            if (lintResult.isEmpty()) {
                System.out.println("No linter errors found.");
            } else {
                System.out.println("Linter errors:\n" + lintResult);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }
    }

    public static String JavaScriptLinter(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scan = new Scanner(file);
        String str;
        int count = 0;
        StringBuilder lintResult = new StringBuilder();

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
                lintResult.append("Line " + count + ": Missing semicolon.\n");
            }
        }

        scan.close();
        return lintResult.toString();
    }
}

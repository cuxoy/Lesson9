package lesson9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Support extends User {



    public boolean reader (String text) throws IOException {
        String path = "src/main/resources/userSupportAdmin.txt";
        FileReader read1 = new FileReader(path);
        Scanner scanner = new Scanner(read1);
        while (scanner.hasNext()) {
            String check = scanner.next();
           if (text.equalsIgnoreCase(check)){

            return true;
        }
    }

        return false;
    }}

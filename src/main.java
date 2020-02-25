import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class main {

    public static void main(String args[]) throws IOException, NoSuchAlgorithmException {

        Set set = new Set();
        List<String> list = Files.readAllLines(Paths.get("/Users/cmummery/Training/wordlist.txt"), Charset.defaultCharset());
        for(String item: list){
            System.out.println(item);
            set.add(item);
        }

        System.out.println(set.contains("e"));
        System.out.println(set.contains("kfdvqkefvqejfbheflqehv"));
        System.out.println(set.contains("erq"));
        System.out.println(set.contains("kfdvqkefvqejfbheflqehv"));
        System.out.println(set.contains("wfbgrg"));
        System.out.println(set.contains("kfdvqkerwwfvqejfbheflqehv"));
        System.out.println(set.contains("qrqsa"));
        System.out.println(set.contains("qwe"));
        System.out.println(set.contains("asfc`xs"));
        System.out.println(set.contains("sdfqergf"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
        System.out.println(set.contains("qreg"));
    }
}

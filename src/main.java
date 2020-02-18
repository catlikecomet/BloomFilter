import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class main {

    public static void main(String args[]) throws IOException, NoSuchAlgorithmException {
        List<String> list = Files.readAllLines(Paths.get("/Users/cmummery/Training/wordlist.txt"), Charset.defaultCharset());

        Set set = new Set();

        set.add("e");

        System.out.println(set.contains("e"));
    }
}

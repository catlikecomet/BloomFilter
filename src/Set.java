import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Set {

    List<String> contents = new ArrayList<>();
    private BloomFilter bloomFilter = new BloomFilter();

    public Set() throws NoSuchAlgorithmException{}

    public void add(String value) {
        contents.add(value);
        bloomFilter.add(value);
    }

    public boolean contains(String value) {
        return bloomFilter.contains(value);
    }
}

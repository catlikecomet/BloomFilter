import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BloomFilter {

    public boolean[] bitmap = new boolean[256];
    MessageDigest md = MessageDigest.getInstance("MD5");
    byte[] result;

    public BloomFilter() throws NoSuchAlgorithmException{}

    void add(String value) {
        //hashing the values
        result = md.digest(value.getBytes());

        double random = Math.random();

            bitmap[result[(int)random] + 128] = true;
            bitmap[result[(int)random] + 128] = true;
            bitmap[result[(int)random] + 128] = true;
    }

    boolean contains(String value) {
        result = md.digest(value.getBytes());
        if (bitmap[result[0] + 128] && bitmap[result[5] + 128] && bitmap[result[9] + 128]) {
            return true;
        }
        return false;
    }
}

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BloomFilter {

    public boolean[] bitmap = new boolean[256];
    MessageDigest md = MessageDigest.getInstance("MD5");
    byte[] result;
    double random = Math.random();
    int iRandom = (int) random;

    public BloomFilter() throws NoSuchAlgorithmException{}

    void add(String value) {
        //hashing the values
        result = md.digest(value.getBytes());

            bitmap[result[iRandom] + 128] = true;
            bitmap[result[iRandom] + 128] = true;
            bitmap[result[iRandom] + 128] = true;
    }

    boolean contains(String value) {
        result = md.digest(value.getBytes());
        if (bitmap[result[iRandom] + 128]) {
            return true;
        }
        return false;
    }
}

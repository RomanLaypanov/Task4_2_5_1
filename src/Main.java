import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        byte[] array = new byte[]{1, 2, 4, 10};
        InputStream inputStream = new ByteArrayInputStream(array);

        try {
            System.out.println(SumOfStream.sumOfStream(inputStream));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
import java.io.IOException;
import java.io.InputStream;

public class SumOfStream {
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int buff;
        int result = 0;

        while ((buff = inputStream.read()) != -1) {
            result += buff;
        }

        return result;
    }
}

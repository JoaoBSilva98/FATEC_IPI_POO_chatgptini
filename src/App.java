import java.io.FileInputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        var properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        final String OPENAI_KEY = properties.getProperty("OPENAI_KEY");
        System.out.println(OPENAI_KEY);


    }
}

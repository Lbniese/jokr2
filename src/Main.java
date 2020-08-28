import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean isRunning = true;
        Scanner console = new Scanner(System.in);

        while (isRunning) {
            String input = console.nextLine();
            if (input != null) {
                String jokesUrl = new Scanner(new URL("https://sv443.net/jokeapi/v2/joke/Any?format=txt").openStream(), "UTF-8").useDelimiter("\\A").next();

                System.out.println(jokesUrl);

            }
        }
    }
}

package L16.SaveFileFromUrl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class solution {
    public static void main(String[] args) throws IOException {


        URL url = new URL("https://www.york.ac.uk/teaching/cws/wws/webpage1.html");

        InputStream input = url.openStream();                                       // reading url page
        Path temp = Files.createTempFile(null, ".txt");                 // creating temp file

        Files.write(temp, input.readAllBytes());                                    // Write url content to temp file

        System.out.println(Files.readString(temp));                                 // read from temp file
        System.out.println("file " + temp.getFileName() + " created. Content above ^");

    }
}

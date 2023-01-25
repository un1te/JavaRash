package L16.FilesMove;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// copy only files from one dit to another
public class Solution {
    static Path sourceDirectory = Paths.get("src/main/java/L1/FilesMove/source");
    static Path targetDirectory = Paths.get("src/main/java/L1/FilesMove/target");


    public static void main(String[] args) {

        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {  // get all files and dirs
            for (Path path : files) {                                                   // loop all entries in files list
                if (Files.isRegularFile(path)) {                                        // check if entry is a file and move it to target dir
                    Path target = targetDirectory.resolve(path.getFileName());
                    Files.move(path, target);
                    System.out.println("<" + path.getFileName() + "> moved from <"
                            + path.getParent() + "> to <" + target.getParent() + ">");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






}
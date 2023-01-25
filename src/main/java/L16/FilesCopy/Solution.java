package L16.FilesCopy;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// copy only files from one dit to another
public class Solution {
    static Path sourceDirectory = Paths.get("src/main/java/L1/FilesCopy/source");
    static Path targetDirectory = Paths.get("src/main/java/L1/FilesCopy/target");


    public static void main(String[] args) {

        copyFiles();
        deleteFilesFromTarget();

    }

    public static void copyFiles() {
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {     // get all files and dirs
            for (Path path : files) {                                                       // loop all entries in files list
                if (Files.isRegularFile(path)) {                                            // check if entry is a file and copy it
                    Path target = targetDirectory.resolve(path.getFileName());              //  get file name from source
                    Files.copy(path, target);
                    System.out.println("<" + path.getFileName() + "> copied from <"
                            + path.getParent() + "> to <" + target.getParent() + ">");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFilesFromTarget() {
        // Delete all files from target dir
        try (DirectoryStream<Path> files = Files.newDirectoryStream(targetDirectory)) {
            for (Path path : files) {
                Files.delete(path);
                System.out.println("files deleted");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
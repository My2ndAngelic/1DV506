package eh223im_assign4;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws Exception {
        String inputDir = System.getProperty("user.dir")+"/temp/";
        String inputFile = inputDir + "input.txt";

        try {
            Files.createDirectory(Paths.get(inputDir));
        } catch (FileAlreadyExistsException e) {
            try {
                Files.createFile(Paths.get(inputFile));
            } catch (FileAlreadyExistsException e2) {

            }
        }


    }
}

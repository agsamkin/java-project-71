package hexlet.code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class FilesUtil {
    public static String readFile(String filePath) throws Exception {
        Path path = Paths.get(filePath).toAbsolutePath().normalize();
        if (!Files.exists(path)) {
            throw new Exception("File " + filePath + " does not exist");
        }
        return Files.readString(path);
    }

    public static String getFileExtension(String filePath) {
        int index = filePath.indexOf('.');
        return index == -1 ? "" : filePath.substring(index + 1);
    }
}


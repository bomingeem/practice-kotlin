package lec03;

public abstract class JavaStringUtils {

    private JavaStringUtils() {}

    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}

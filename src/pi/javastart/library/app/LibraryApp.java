package pi.javastart.library.app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Library v1.7";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }

}

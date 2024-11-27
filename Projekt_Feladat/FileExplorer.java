import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * Fájlok feltérképezése, és mappák bejárasa
 * Ami majd a képek elérési útvonalát visszadja lokálisan
*/
public class FileExplorer {
    private File rootDirectory;

    public FileExplorer(String rootPath) {
        this.rootDirectory = new File(rootPath);
    }

    public File getRootDirectory() {
        return this.rootDirectory;
    }

    public List<File> getAllDictories() {
        return getAllDirectoriesRecursive(rootDirectory);
    }

    // Ez keressi meg lokálisan hogy van-e kép
    public List<File> getImagesInDictory(File dir) {
        List<File> images = new ArrayList<>();

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && isImage(file)) {
                    images.add(file);
                }
            }
        }

        return images;
    }

    // Megkeressi az összes Mappát Rekurzivan
    private List<File> getAllDirectoriesRecursive(File dir) {
        List<File> directories = new ArrayList<>();
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    directories.add(file);
                    directories.addAll(getAllDirectoriesRecursive(file));
                }
            }
        }

        return directories;
    }

    private boolean isImage(File file) {
        String name = file.getName().toLowerCase();
        return name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png");
    }
}

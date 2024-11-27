public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <path_to_images>");
            return;
        }

        String rootPath = args[0]; // Root directory passed as args[0]
        System.out.println(rootPath);
        ImageGalleryApp app = new ImageGalleryApp(rootPath);
        app.generateGallery();
    }
}

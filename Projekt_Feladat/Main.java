public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <path_to_images>");
            System.exit(1);
        }

        String rootPath = args[0];
        System.out.println(rootPath);
        ImageGalleryApp app = new ImageGalleryApp(rootPath);
        app.generateGallery();
    }
}

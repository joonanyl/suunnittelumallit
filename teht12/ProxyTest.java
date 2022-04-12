package factorymethod.teht12;

import java.util.*;

public class ProxyTest {
    public static void main(String[] args) {
        List<Image> photoAlbum = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_12MB_HolidayPhoto1");
        Image image4 = new ProxyImage("HiRes_11MB_HolidayPhoto2");
        photoAlbum.add(image1);
        photoAlbum.add(image2);
        photoAlbum.add(image3);
        photoAlbum.add(image4);

        // Show content
        System.out.println(".../Photoalbum/");
        for (Image i : photoAlbum) {
            i.showData();
        }


        // Traverse photoalbum
        System.out.println("\nSlideshow begins... \nWrite l or r to traverse pictures, exit to quit.\n");
        boolean bool = false;
        String direction = "";
        int i = 0;
        while (!bool) {
            if (direction.equals("exit")) {
                bool = true;
                break;
            } else if (direction.equals("l")) {
                if (i > 0)
                    i--;
            } else if (direction.equals("r")) {
                if (i < photoAlbum.size() - 1)
                    i++;
            }
            photoAlbum.get(i).displayImage();
            direction = scanner.nextLine();
        }
    }
}

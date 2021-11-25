package advisor;

import java.util.Scanner;

/**
 * Інтерфейс
 */
public class Advisor {

    public void start() {

        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        String query = scanner.nextLine();
        while (!query.equals("exit")) {
            switch (query) {
                case ("auth"):
                    service.setAuthorization();
                    break;
                case ("new"):
                    System.out.println(service.getReleases());
                    break;
                case ("featured"):
                    System.out.println(service.getFeatured());
                    break;
                case ("categories"):
                    System.out.println(service.getCategories());
                    break;
                case ("playlists Mood"):
                    System.out.println(service.getPlaylists());
                    break;
            }
            query = scanner.nextLine();
        }
        System.out.println("---GOODBYE!---");
    }
}
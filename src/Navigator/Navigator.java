package Navigator;

import RouteStrategy.IRouteStrategy;
import RouteStrategy.PublicTransportStrategy;
import RouteStrategy.RoadStrategy;
import RouteStrategy.WalkungStrategy;

import java.util.Scanner;

public class Navigator {
    static String pointA;
    static String pointB;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie Ihr Ort");
        pointA= scanner.nextLine();
        System.out.println("Bitte geben Sie Ziel");
        pointB= scanner.nextLine();
        System.out.println("Für Auto   1\nFür Public 2\nFür zu Fuß 3 drucken");
        int routeAuswahl=scanner.nextInt();

        IRouteStrategy routeStrategy = switch (routeAuswahl) {
            case 1 -> new RoadStrategy();
            case 2 -> new PublicTransportStrategy();
            case 3 -> new WalkungStrategy();
            default -> null;
        };
//        IRouteStrategy routeStrategy=iRouteStrategy();
        assert routeStrategy != null;
        routeStrategy.buildRoute(pointA, pointB); // Perform navigation using the selected strategy

    }



}

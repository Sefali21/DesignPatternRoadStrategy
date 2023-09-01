package RouteStrategy;

import java.util.Scanner;

public class PublicTransportStrategy implements IRouteStrategy {
    @Override
    public void buildRoute(String pointA, String pointB) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Für Zug      1\nFür Flugzeug 2\nFür Bus      3\nFür Schiff   4 drucken");
        int auswahl=scanner.nextInt();
        switch (auswahl) {
            case 1 -> buildRouteZug(pointA, pointB);
            case 2 -> buildRouteFlugZeug(pointA, pointB);
            case 3 -> buildRouteBus(pointA, pointB);
            case 4 -> buildRouteSchiff(pointA, pointB);
            default -> System.out.println("Etwas schiff gelaufen");
        }
    }

    public void buildRouteZug(String pointA, String pointB){
        System.out.printf("Die Route, die mit einem Zug von %s nach %s fahren würde, wird gerade geplant%n", pointA, pointB);
    }

    public void buildRouteFlugZeug(String pointA, String pointB){
        System.out.printf("Die Route, die mit einem Fluegzeug von %s nach %s fahren würde, wird gerade geplant%n", pointA, pointB);
    }

    public void buildRouteBus(String pointA, String pointB){
        System.out.printf("Die Route, die mit einem Bus von %s nach %s fahren würde, wird gerade geplant%n", pointA, pointB);
    }

    public void buildRouteSchiff(String pointA, String pointB){
        System.out.printf("Die Route, die mit einem Schiff von %s nach %s fahren würde, wird gerade geplant%n", pointA, pointB);
    }
}

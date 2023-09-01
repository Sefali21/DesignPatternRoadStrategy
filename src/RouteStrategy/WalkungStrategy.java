package RouteStrategy;

public class WalkungStrategy implements IRouteStrategy {

    @Override
    public void buildRoute(String pointA, String pointB) {
            System.out.printf("Die Route, die zu Fuß oder mit einem Fahrrad von %s nach %s fahren würde, wird gerade geplant%n", pointA, pointB);
        }
    }


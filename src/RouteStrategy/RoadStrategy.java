package RouteStrategy;

public class RoadStrategy implements IRouteStrategy {
    @Override
    public void buildRoute(String pointA, String pointB) {
        System.out.printf("Die Route, die mit einem Auto von %s nach %s fahren würde, wird gerade geplant%n", pointA, pointB);
    }
}

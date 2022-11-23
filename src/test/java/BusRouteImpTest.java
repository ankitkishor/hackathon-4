import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusRouteImpTest {
    BusRouteImp busRoute;
    BusRoute route;
    String fileName="sample.csv";
    @Before
    public void setUp() throws Exception {
        busRoute = new BusRouteImp();
        route=new BusRoute("KIAS-12/5","KIAS-12UP",9387.0,1,11359.0,39,"01/09/2018","02:02:58",281.0,49.3);
    }

    @After
    public void tearDown() throws Exception {
        busRoute = null;
        route=null;
    }
    @Test
    public void givenWrongDataFormatThrowsNumberFormatException() {
        List<BusRoute> output = busRoute.readingFile(fileName);
        assertNotEquals(12, output.size());
    }

    @org.junit.jupiter.api.Test
   public void readingFile() {
        List<BusRoute> output = busRoute.readingFile(fileName);
        assertEquals(49,output.size());
    }

    @org.junit.jupiter.api.Test
    void getSortedAccDistanceTraveled() {
        List<BusRoute> output = busRoute.readingFile(fileName);
        assertEquals(49.5,busRoute. getSortedAccDistanceTraveled(output).get(0).getTravelledKM(),0);

    }

    @org.junit.jupiter.api.Test
    void getTotalCollectionBySales() {
        List<BusRoute> output = busRoute.readingFile(fileName);
        assertEquals(10348.0,busRoute.getTotalCollectionBySales(output));
    }
}


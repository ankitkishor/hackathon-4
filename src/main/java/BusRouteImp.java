/*
 * Author : Ankit Kishor
 * Date: 23-11-2022
 * Created with :Intellij IDEA Community Edition
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;


public class BusRouteImp {

    public List<BusRoute> readingFile(String fileName) {

        List<BusRoute>list=new ArrayList<>();
        try (FileReader fileReader=new FileReader(fileName);
             BufferedReader buffer=new BufferedReader(fileReader)){
            String line= buffer.readLine();
            while((line= buffer.readLine())!=null){
                String[] value=line.split(",");
                BusRoute busRoute=new BusRoute();
                busRoute.setScheduleNo(value[0]);
                busRoute.setRouteNo(value[1]);
                busRoute.setTicketTillStopId(Double.parseDouble(value[2]));
                busRoute.setTicketFromStopSeqNo(Integer.parseInt(value[3]));
                busRoute.setTicketFromStopId(Double.parseDouble(value[4]));
                busRoute.setTicketTillStopSeqNo (Integer.parseInt(value[5]));
                busRoute.setTicketDate(value[6]);
                busRoute.setTicketTime(value[7]);
                busRoute.setTotalTicketAmount(Double.parseDouble(value[8]));
                busRoute.setTravelledKM(Double.parseDouble(value[9]));
                list.add(busRoute);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;

    }
    public List<BusRoute> getSortedAccDistanceTraveled(List<BusRoute> busData) {

        Collections.sort(busData, ( o1,  o2)-> Double.compare(o2.getTravelledKM(), o1.getTravelledKM()));

        return busData;
    }
    public Double getTotalCollectionBySales(List<BusRoute> busData){

        List<Double>list = new ArrayList<>();

        for (BusRoute bus:busData) {
            list.add(bus.getTotalTicketAmount());
        }
        Supplier<Double> supplier=()-> {
                double sum=0;
                for (Double value:list) {
                    sum=sum+value;
                }
                return sum;
            };



   return supplier.get();

    }

    public static void main(String[] args) {
        BusRouteImp busRouteImp= new BusRouteImp();
        System.out.println(busRouteImp.getTotalCollectionBySales(busRouteImp.readingFile("sample.csv")));
        System.out.println(busRouteImp.getSortedAccDistanceTraveled(busRouteImp.readingFile("sample.csv")));
    }
}

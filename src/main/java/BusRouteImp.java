/*
 * Author : Ankit Kishor
 * Date: 23-11-2022
 * Created with :Intellij IDEA Community Edition
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BusRouteImp {
    public class  {
        // Read the data from the file and store in a List
        public List<SalesRecord> readFile(String fileName) {
            List<SalesRecord>list=new ArrayList<>();
            try (FileReader fileReader=new FileReader(fileName);
                 BufferedReader buffer=new BufferedReader(fileReader)){
                String line= buffer.readLine();
                while((line= buffer.readLine())!=null){
                    String[] value=line.split(",");
                    SalesRecord salesRecord=new SalesRecord();
                    salesRecord.setDate(value[0]);
                    salesRecord.setCustomer_id(Integer.parseInt(value[1]));
                    salesRecord.setProduct_category(Integer.parseInt(value[2]));
                    salesRecord.setPayment_method(value[3]);
                    salesRecord.setAmount(Double.parseDouble(value[4]));
                    salesRecord.setTime_on_site(Double.parseDouble(value[5]));
                    salesRecord.setClicks_in_site(Integer.parseInt(value[6]));
                    list.add(salesRecord);

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return list;

        }
}

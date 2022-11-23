import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BusRoute {

    private String  scheduleNo;
    private String  routeNo;
    private Double  ticketFromStopId;
    private Integer ticketFromStopSeqNo;
    private Double  ticketTillStopId;
    private Integer ticketTillStopSeqNo;
    private String  ticketDate;
    private String  ticketTime;
    private Double  totalTicketAmount;
    private Double  travelledKM;

    public BusRoute() {
    }

    public BusRoute(String scheduleNo, String routeNo, Double ticketFromStopId, Integer ticketFromStopSeqNo, Double ticketTillStopId, Integer ticketTillStopSeqNo, String ticketDate, String ticketTime, Double totalTicketAmount, Double travelledKM) {
        this.scheduleNo = scheduleNo;
        this.routeNo = routeNo;
        this.ticketFromStopId = ticketFromStopId;
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAmount = totalTicketAmount;
        this.travelledKM = travelledKM;
    }

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public Double getTicketFromStopId() {
        return ticketFromStopId;
    }

    public void setTicketFromStopId(Double ticketFromStopId) {
        this.ticketFromStopId = ticketFromStopId;
    }

    public Integer getTicketFromStopSeqNo() {
        return ticketFromStopSeqNo;
    }

    public void setTicketFromStopSeqNo(Integer ticketFromStopSeqNo) {
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
    }

    public Double getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(Double ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public Integer getTicketTillStopSeqNo() {
        return ticketTillStopSeqNo;
    }

    public void setTicketTillStopSeqNo(Integer ticketTillStopSeqNo) {
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public Double getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public void setTotalTicketAmount(Double totalTicketAmount) {
        this.totalTicketAmount = totalTicketAmount;
    }

    public Double getTravelledKM() {
        return travelledKM;
    }

    public void setTravelledKM(Double travelledKM) {
        this.travelledKM = travelledKM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusRoute)) return false;
        BusRoute busRoute = (BusRoute) o;
        return Objects.equals(getScheduleNo(), busRoute.getScheduleNo()) && Objects.equals(getRouteNo(), busRoute.getRouteNo()) && Objects.equals(getTicketFromStopId(), busRoute.getTicketFromStopId()) && Objects.equals(getTicketFromStopSeqNo(), busRoute.getTicketFromStopSeqNo()) && Objects.equals(getTicketTillStopId(), busRoute.getTicketTillStopId()) && Objects.equals(getTicketTillStopSeqNo(), busRoute.getTicketTillStopSeqNo()) && Objects.equals(getTicketDate(), busRoute.getTicketDate()) && Objects.equals(getTicketTime(), busRoute.getTicketTime()) && Objects.equals(getTotalTicketAmount(), busRoute.getTotalTicketAmount()) && Objects.equals(getTravelledKM(), busRoute.getTravelledKM());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScheduleNo(), getRouteNo(), getTicketFromStopId(), getTicketFromStopSeqNo(), getTicketTillStopId(), getTicketTillStopSeqNo(), getTicketDate(), getTicketTime(), getTotalTicketAmount(), getTravelledKM());
    }

    @Override
    public String toString() {
        return "BusRoute{" +
                "scheduleNo='" + scheduleNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", ticketFromStopId=" + ticketFromStopId +
                ", ticketFromStopSeqNo=" + ticketFromStopSeqNo +
                ", ticketTillStopId=" + ticketTillStopId +
                ", ticketTillStopSeqNo=" + ticketTillStopSeqNo +
                ", ticketDate='" + ticketDate + '\'' +
                ", ticketTime='" + ticketTime + '\'' +
                ", totalTicketAmount=" + totalTicketAmount +
                ", travelledKM=" + travelledKM +'\n'+
                '}';
    }
}

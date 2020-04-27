import java.util.ArrayList;

public class Airplane {
    private String carrier;
    private int lastmonthMaintained;
    private int lastyearMaintained;
    private ArrayList<Flight> flights;

    public int getLastmonthMaintained(){
        return lastmonthMaintained;
    }
    public int getLastyearMaintained(){
        return lastyearMaintained;
    }
    public String getCarrier(){
        return carrier;
    }
    public ArrayList<Flight> getFlights(){
        return flights;
    }
    public boolean MaintenanceNeeded(int currMonth, int currYear){
        for (Flight f: flights) {
            if(f.macanicalIssues()){
                return true;
            }
        }
        if(currYear-lastyearMaintained>1){
            return true;
        }
        else if(currYear-lastyearMaintained==1 &&currMonth-lastmonthMaintained==0){
            return true;
        }
        return false;
    }
}

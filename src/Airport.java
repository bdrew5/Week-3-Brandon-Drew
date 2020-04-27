import java.util.ArrayList;
import java.util.List;

public class Airport {
    private Airplane[] airplanes;
    public List<Airplane> carrierMaintenance(String Carrier, int currMonth, int currYear){
        List<Airplane> needMaintenance = new ArrayList<Airplane>();
        for (Airplane a:airplanes) {
            if(Carrier.equals(a.getCarrier()) && a.MaintenanceNeeded(currMonth,currYear)){
                needMaintenance.add(a);
            }
        }
        return needMaintenance;
    }
}

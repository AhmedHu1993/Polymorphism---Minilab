import java.util.*;

public class Network {

    private String name;
    private ArrayList<IConnect> devices;
    private int maxLimit;

    public Network(String name, int maxLimit){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.maxLimit = maxLimit;
    }

    public String getName() {
        return name;
    }

    public int deviceCount() {
        return devices.size();
    }

    public String  connect(IConnect device) {
        if (this.getFreeSlots() >= 1){
            devices.add(device);
            return "Added Successfully";
        }
        return "Sorry, Max number reached";
    }

    public void disconnectAll() {
        devices.clear();
    }

    public int getFreeSlots(){
        return this.maxLimit - this.devices.size();
    }
}
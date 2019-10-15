public class InternetRadio implements IConnect {

    public String connect(String data){
        return "connecting to: " + data;
    }

    public String tune(String station){
        return "tuned to " + station;
    }
}

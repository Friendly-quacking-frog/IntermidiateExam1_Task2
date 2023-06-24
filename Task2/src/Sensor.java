import java.util.Random;

public class Sensor {

    Sensor(){}

    // get humidity sensor data
    public int getSensorData(){
        Random r = new Random();
        return r.nextInt(100);
    }
    
}

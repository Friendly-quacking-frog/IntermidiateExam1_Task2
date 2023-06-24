import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

public class Irrigation {
    
    // set up localDate instance
    LocalDate date;
    Sensor sensor;

    // get last irrigation date in constructor
    // and conver it to type LocalDate for easier 
    // date/time calculations
    Irrigation(Date lastIrrigation){
        sensor = new Sensor();
        date = lastIrrigation.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

        // check if date is in winter months
    private boolean isWinter(LocalDate date){
        int month = date.getMonthValue();
        if (month==1||month==2||month==12){
            return true;
        } else return false;
    }

    // check if it's autumn or spring
    private boolean isSpringAutumn(LocalDate date){
        int month = date.getMonthValue();
        if ((month>2&&month<6) || (month>9&&month<12)){
            return true;
        } else return false;
    }

    // get next irrigation date
    public void nextIrrigationDate(){
        if (isWinter(date)){
            // if date is in winter
            System.out.println("Дата следующего полива: " + date.plusMonths(1).toString());
        } else if (isSpringAutumn(date)) {
            // if date is in autumn or spring
            System.out.println("Дата следующего полива: " + date.plusWeeks(1).toString());
        } else{
            // if date is in summer
            // check humidity sensor
            // if it's lower than 30, need to water the cactus
            if (sensor.getSensorData()<30) System.out.println("Дата следующего полива: " + date.plusDays(2).toString());
            else System.out.println("Полив кактуса не требуется");
        }
    }

}   

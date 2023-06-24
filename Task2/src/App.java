import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Формат даты: dd/mm/yyyy");
        System.out.print("Введите дату последнего полива: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(sc.nextLine());
        Irrigation irrigation = new Irrigation(date);
        irrigation.nextIrrigationDate();
    }
}

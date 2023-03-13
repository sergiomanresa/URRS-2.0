package Fechas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(formatearCalendar(c));
        //Sumar 2 meses
        c.add(Calendar.MONTH, 2);

        //Sumar un dia del año
        c.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println(c.getTime());

        /*
        Date fecha1 = new Date();
        Date fecha2 = new Date();
        System.out.println((fecha2.getTime() - fecha1.getTime());
    */
    }
    public static String formatearCalendar(Calendar c) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        return df.format(c.getTime());
    }
}

package bee.vimpelcom;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("w-yyyy");
        Date date = new Date();

        //System.out.println(simpleDateFormat.format(date));
        //System.out.println(simpleDateFormat.format(LocalDateTime.now().toString()));
        System.out.println((simpleDateFormat.format(date)).replace("-","H-"));





        Month jan = Month.of(1);
        Locale loc = Locale.forLanguageTag("ru");
        System.out.println(jan.getDisplayName(TextStyle.FULL_STANDALONE, loc)); // Вернёт Январь

    }
}
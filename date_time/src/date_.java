import java.time.*;
public class date_ {
    public static void main(String[] args) {
        //current date:-
        LocalDate c = LocalDate.now();
        //date of any day
        LocalDate l = LocalDate.of(2004,3,27);
        //to parse a string use:-
        LocalDate p = LocalDate.parse("2004-03-27");

        System.out.println(c);
        System.out.println(l);
        System.out.println(p);


                //.isBefore .isAfter
    }
}
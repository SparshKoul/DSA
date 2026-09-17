package lamdafxn;

//file for lamda fxn
import java.time.*;
import java.util.*;
import java.time.format.*;
public class finallamda1 {
    static class Student {
        String name;
        int age;
        int marks;

        Student(String name, int age, int marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
    }
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("John", 20, 85));
        list.add(new Student("Alice", 19, 90));
        list.add(new Student("Bob", 21, 75));
        list.add(new Student("Eve", 22, 95));

        //using lamda fxn
        Collections.sort(list, (s1, s2) -> Integer.compare(s1.marks, s2.marks));
        System.out.println("Sorted by Marks:");
        for(Student s : list) {
            System.out.println(s.name + " " + s.age + " " + s.marks);
        }


        //DATE TIME API
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        LocalDate futureDate = date.plusDays(10);
        System.out.println("Date after 10 days: " + futureDate);
        LocalDate pastDate = date.minusMonths(2);
        System.out.println("Date 2 months ago: " + pastDate);




        //CREATING A LOCALTIME DATE
        LocalDate randomdate = LocalDate.of(2023, 10, 1);
        System.out.println("Random date: " + randomdate);




        //getting individual components of date
        int year = date.getYear();
        int monthValue = date.getMonthValue();
        //beneth2 give same outpur of name.
        Month month = date.getMonth();
        String monthname = date.getMonth().toString();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month Value: " + monthValue);
        System.out.println("Month: " + month);
        System.out.println("Month Name: " + monthname);
        System.out.println("Day: " + day);



        //getting day of week
        String dayOfWeek = date.getDayOfWeek().toString();
        //OR DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);


        //day of year
        int dayOfYear = date.getDayOfYear();
        System.out.println("Day of Year: " + dayOfYear);    





        //addigng and subtracting date
        LocalDate presemtDate = LocalDate.now();
        System.out.println("Present Date: " + presemtDate);

        LocalDate newDate1 = presemtDate.plusDays(5);
        System.out.println("New Date after adding 5 days: " + newDate1);

        LocalDate newDate3 = presemtDate.plusMonths(2);
        System.out.println("New Date after adding 2 months: " + newDate3);

        LocalDate newDate4 = presemtDate.plusWeeks(10);
        System.out.println("New Date after adding 10 weeks: " + newDate4);

        LocalDate newDate5 = presemtDate.plusYears(1);
        System.out.println("New Date after adding 1 year: " + newDate5);



        //subtracting date
        LocalDate newDate6 = presemtDate.minusDays(5);
        System.out.println("New Date after subtracting 5 days: " + newDate6);

        LocalDate newDate2 = presemtDate.minusMonths(1);
        System.out.println("New Date after subtracting 1 month: " + newDate2);

        LocalDate newDate7 = presemtDate.minusWeeks(10);
        System.out.println("New Date after subtracting 10 weeks: " + newDate7);

        LocalDate newDate8 = presemtDate.minusYears(1);
        System.out.println("New Date after subtracting 1 year: " + newDate8);


        LocalDate newDate = date.plusDays(5).minusMonths(1);
        System.out.println("New Date: " + newDate); 









        ///COMPARING DATES
        LocalDate date1 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2023, 10, 5);
        if(date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if(date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is equal to " + date2);    
        }
















        //LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);


        //creatinf specific time
        LocalTime randomTime = LocalTime.of(10, 30, 45);//hr min sec.
        System.out.println("Random time: " + randomTime);
        


        //getting individual components of time
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);        
        System.out.println("Second: " + second);




        //adding and subtracting time
        LocalTime presentTime = LocalTime.now();
        System.out.println("Present Time: " + presentTime);

        LocalTime newTime1 = presentTime.plusHours(2);
        System.out.println("New Time after adding 2 hours: " + newTime1);

        LocalTime newTime2 = presentTime.plusMinutes(30);
        System.out.println("New Time after adding 30 minutes: " + newTime2);

        LocalTime newTime5 = presentTime.plusSeconds(45);
        System.out.println("New Time after adding 45 seconds: " + newTime5);    


        LocalTime newTime3 = presentTime.minusHours(1);
        System.out.println("New Time after subtracting 1 hour: " + newTime3);

        LocalTime newTime4 = presentTime.minusMinutes(45);
        System.out.println("New Time after subtracting 45 minutes: " + newTime4);

        LocalTime newTime6 = presentTime.minusSeconds(30);
        System.out.println("New Time after subtracting 30 seconds: " + newTime6);


        //mix
        LocalTime newTime = presentTime.plusHours(1).minusMinutes(15).plusSeconds(45);
        System.out.println("New Time: " + newTime);
       

        //comparing time

        LocalTime time1 = LocalTime.of(10, 30, 45);
        LocalTime time2 = LocalTime.of(11, 15, 30);
        if(time1.isBefore(time2)) {
            System.out.println(time1 + " is before " + time2);
        } else if(time1.isAfter(time2)) {
            System.out.println(time1 + " is after " + time2);
        } else {
            System.out.println(time1 + " is equal to " + time2);
        }





        //combining date and time  = LocalDateTime  

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);
        //output: Current date and time: 2023-10-01T10:30:45.123456789 (example output)


        //creating specific date and time
        LocalDateTime randomDateTime = LocalDateTime.of(2023, 10, 1, 10, 30, 45);
        System.out.println("Random date and time: " + randomDateTime);




        //creating date and time from existing date and time
        LocalDate date3 = LocalDate.of(2023, 10, 1);
        LocalTime time3 = LocalTime.of(10, 30, 45);
        LocalDateTime dateTime2 = LocalDateTime.of(date3, time3);

        ////or putting values directly

        LocalDateTime dateTime3 = LocalDateTime.of(2023, 10, 1, 10, 30);
        System.out.println("Date and time from existing date and time: " + dateTime3);
        System.out.println("Date and time from existing date and time: " + dateTime2);




        //getting individual components of date and time
        int year1 = dateTime.getYear();
        int month1 = dateTime.getMonthValue();
        String monthname1 = dateTime.getMonth().toString();
        int day1 = dateTime.getDayOfMonth();
        int hour1 = dateTime.getHour();
        int minute1 = dateTime.getMinute();
        int second1 = dateTime.getSecond();


        System.out.println("Year: " + year1);
        System.out.println("Month: " + month1);
        System.out.println("Month Name: " + monthname1);
        System.out.println("Day: " + day1);
        System.out.println("Hour: " + hour1);
        System.out.println("Minute: " + minute1);
        System.out.println("Second: " + second1);  
        
        


        //adding and subtracting date and time
        LocalDateTime radomdatetime1 =LocalDateTime.of(2023, 10, 1, 10, 30, 45);
        LocalDateTime newDateTime1 = radomdatetime1.plusDays(5).minusHours(2).plusMinutes(30);
        System.out.println("Random Date and Time: " + radomdatetime1);
        System.out.println("New Date and Time: " + newDateTime1);




        //extracting date and time from LocalDateTime
        LocalDateTime dateTime4 = LocalDateTime.of(2023, 10, 1, 10, 30, 45);
        LocalDate extractedDate = dateTime4.toLocalDate();
        LocalTime extractedTime = dateTime4.toLocalTime();
        System.out.println("Extracted Date: " + extractedDate);
        System.out.println("Extracted Time: " + extractedTime);






        //comparing date and time
        LocalDateTime dateTime5 = LocalDateTime.of(2023, 10, 1, 10, 30, 45);
        LocalDateTime dateTime6 = LocalDateTime.of(2023, 10, 1, 11, 15, 30);
        if(dateTime5.isBefore(dateTime6)) {
            System.out.println(dateTime5 + " is before " + dateTime6);
        } else if(dateTime5.isAfter(dateTime6)) {
            System.out.println(dateTime5 + " is after " + dateTime6);
        } else { 
            System.out.println(dateTime5 + " is equal to " + dateTime6);
        }






        //periods and durations used to calc difference between dates and times

        //here days years and months are calculated not year month day.

        LocalDate startDate = LocalDate.of(2023, 10, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 15);
        Period p = Period.between(startDate, endDate);
        System.out.println("Period between " + startDate + " and " + endDate + ": " + p.getDays() + " days "+ p.getMonths() + " months "+ p.getYears() + " years");





        //ex age calc
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");





        //duration for difference between times
        LocalTime startTime = LocalTime.of(10,30,45);
        LocalTime endTime = LocalTime.of(12,15,30);
        Duration d = Duration.between(startTime, endTime);
        System.out.println("Duration between " + startTime + " and " + endTime + ": " + d.toHours() + " hours " + d.toMinutesPart() + " minutes " + d.toSecondsPart() + " seconds");
        System.out.println("Duration between " + startTime + " and " + endTime + ": " + d.toMinutes() + " minutes " + d.toSecondsPart() + " seconds");







        //formating date and time
        //suppose java gives date in 2023-10-01T10:30:45 format but we want it in dd-MM-yyyy HH:mm:ss format then we can use DateTimeFormatter class.


        LocalDate dt = LocalDate.of(2023, 10, 1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = dt.format(dtf);
        System.out.println("Formatted Date: " + formattedDate);



        //formatting time
        LocalTime tm = LocalTime.of(10, 30, 45);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = tm.format(dtf1);
        System.out.println("Formatted Time: " + formattedTime);

        //formatting date and time

        LocalDateTime dateTime7 = LocalDateTime.of(2023, 10, 1, 10, 30, 45);
        System.out.println("Original Date and Time: " + dateTime7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime7.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

    }
    
}

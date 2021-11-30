package in.edu.tint.cse.lab.one.one;

public class Time {
    int hour;
    int minute;
    int second;

    //A Constructor to initialize instance variables with default values.
    Time(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    //A Constructor to initialize instance variables with values.
    Time(int hour, int minute, int second){
        if(hour <24 && minute <60 && second <60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
            System.out.println("Invalid Input");
        }
    }

    //Display the time in AM/PM format
    void display(){
        String f = "AM";
        if (hour >11){
            f = "PM";
            if(hour >12)
                hour = hour - 12;
        }
        System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second) + f);
    }
}

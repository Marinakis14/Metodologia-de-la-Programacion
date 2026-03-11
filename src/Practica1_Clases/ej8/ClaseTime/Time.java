package Practica1_Clases.ej8.ClaseTime;

public class Time {
    //private instance variables
    private int hour;
    private int minute;
    private int second;

    /** Constructs a Time instance with the given hour, minute and second */
    Time( int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter for instance variable hour
    public int getHour() {
        return hour;
    }

    // Getter for instance variable minute
    public int getMinute() {
        return minute;
    }

    // Getter for instance variable second
    public int getSecond() {
        return second;
    }

    // Setter for instance variable hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Setter for instance variable minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Setter for instance variable second
    public void setSecond(int second) {
        this.second = second;
    }

    // Setter for instance Time
    public void setTime( int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /** Return a self-descriptive string of this instance in the form of hh:mm:ss */
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // advances by 1 second and returns this instance
    public Time nextSecond() {
        this.second += 1;
        if (second == 60) {
            this.second = 0;
            this.minute += 1;
        }
        if (minute == 60) {
            this.minute = 0;
            this.hour += 1;
        }
        if (hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    // goes back by 1 second and returns this instance
    public Time previousSecond() {
        this.second -= 1;
        if (second < 0) {
            this.second = 59;
            this.minute -= 1;
        }
        if (minute < 0) {
            this.minute = 59;
            this.hour -= 1;
        }
        if (hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}

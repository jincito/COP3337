package util;

public class Date implements Comparable<Date>{
    private int day;
    private int month;
    private int year;

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
    // adds leading 0, 8 date characters + 2 slashes = 10 characters

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Date other) {
        if(this.year != other.year)
            return this.year - other.year;//new Integer(year).compareTo(other.year);
        if(this.month != other.month)
            return this.month - other.month; // tie-breaker
        return this.day - other.day;
       //return (this.day - other.day) + 31 * (this.month - other.month)
        //       + 372 * (this.year - other.year);
    }
}

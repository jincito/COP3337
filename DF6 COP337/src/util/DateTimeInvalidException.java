package util;

public class DateTimeInvalidException extends RuntimeException {
    private DateTime dateTime;

    public DateTimeInvalidException(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String getMessage() {
        return dateTime + " is invalid";
    }

    private static boolean isValid(Date d) {
        if(d == null)
            return false;
        if (d.getYear() >= 10000 || d.getYear() <= 1)
            return false;
        if (d.getMonth() < 1 || d.getMonth() > 12)
            return false;
        if (d.getDay() < 1)
            return false;
        switch (d.getMonth()) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return d.getDay() <= 31;
            case 4: case 6: case 9: case 11:
                return d.getDay() <= 30;
            default:
                if (d.getDay() % 400 == 0 || d.getYear() % 4 == 0 && d.getYear() % 100 != 0)
                    return d.getDay() <= 29;
                else
                    return d.getDay() <= 28;
        }
    }

    public static boolean isValid(DateTime dt) {
        if(dt == null)
            return false;
        if (!isValid(dt.getDate()))
            return false;
        if (dt.getHour() < 0 || dt.getHour() > 11)
            return false;
        if (dt.getMinute() < 0 || dt.getMinute() > 59)
            return false;
        if (dt.getSecond() < 0 || dt.getSecond() > 59)
            return false;
        return true;
    }
}

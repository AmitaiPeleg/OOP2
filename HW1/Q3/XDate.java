package Q3;

import java.util.Date;

@SuppressWarnings("deprecation")
public class XDate extends Date {
    public XDate(int date, int month, int year) {
        super(year - 1900, month - 1, date);
    }

    public XDate(int date, int month, int year, int hour, int min, int sec) {
        super(year, month, date, hour, min, sec);
    }

    public int getMonth() {
        return super.getMonth() + 1;
    }

    public int getYear() {
        return super.getYear() + 1900;
    }

    public XDate addDays(int n) {
        return new XDate(getDate() + n, getMonth(), getYear());
    }

    public static XDate now() {
        Date d = new Date();
        return new XDate(d.getDate(), d.getMonth(), d.getYear(), d.getHours(), d.getMinutes(),
                d.getSeconds());
    }
}

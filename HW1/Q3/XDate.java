package Q3;

import java.util.Date;

@SuppressWarnings("deprecation")
public class XDate extends Date {
    public XDate(int date, int month, int year) {
        super(year - 1900, month - 1, date);
    }

    public int getMonth() {
        return super.getMonth() + 1;
    }

    public int getYear() {
        return super.getYear() + 1900;
    }

    public XDate addDays(int n) {
        return new XDate(getYear(), getMonth(), getDate() + n);
    }

    public static XDate now() {
        Date d = new Date();
    
    }
}

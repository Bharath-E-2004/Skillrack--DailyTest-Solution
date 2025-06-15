import java.util.*;

class Date implements Comparable<Date> {

    public static final List<String> monthList = Arrays.asList(
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    );

    String date;
    int day, month, year;

    public Date(String m) {
        this.date = m;

        String[] parts = m.split("-");
        this.day = Integer.parseInt(parts[0]);
        this.month = monthList.indexOf(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    @Override
    public int compareTo(Date other) {
        if (this.day != other.day) {
            return Integer.compare(this.day, other.day);
        } else if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        } else {
            return Integer.compare(this.year, other.year);
        }
    }

    @Override
    public String toString() {
        return date;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Date> dates = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dates.add(new Date(sc.nextLine()));
        }

        Collections.sort(dates);

        for (Date d : dates) {
            System.out.println(d);
        }
    }
}

/*
 Example Input/Output 1:

Input:

10

31-Jan-1990

15-Jul-2021

15-Feb-2011

15-Sep-2009

08-Aug-2019

01-Dec-2050

15-Jul-2019

15-Jul-2010

07-Mar-2019

29-Feb-2000

Output

01-Dec-2050

07-Mar-2019

08-Aug-2019

15-Feb-2011

15-Jul-2010

15-Jul-2019

15-Jul-2021

15-Sep-2009

29-Feb-2000

31-Jan-1990

Explanation:

Here N = 10.

After sorting the 10 dates based on the given conditions, the dates become

01-Dec-2050

07-Mar-2019

08-Aug-2019

15-Feb-2011

15-Jul-2010

15-Jul-2019

15-Jul-2021

15-Sep-2009

29-Feb-2000

31-Jan-1990
*/

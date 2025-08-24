import java.util.*;

class Store implements Comparable<Store> {
    int YY;
    String DD;
    int NNN;

    public Store(String S) {
        this.YY = Integer.parseInt(S.substring(0, 2));
        this.DD = S.substring(2, 4);
        this.NNN = Integer.parseInt(S.substring(4));
    }

    @Override
    public String toString() {
        return String.format("%02d%s%03d", this.YY, this.DD, this.NNN);
    }

    @Override
    public int compareTo(Store other) {
        if (this.YY != other.YY) {
            return other.YY - this.YY; // Descending order by YY
        } else if (!this.DD.equals(other.DD)) {
            return this.DD.compareTo(other.DD); // Ascending order by DD
        } else {
            return this.NNN - other.NNN; // Ascending order by NNN
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Store> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            list.add(new Store(str));
        }

        Collections.sort(list);

        for (Store s : list) {
            System.out.println(s);
        }
    }
}
/*
Sort Registration Numbers

The program must accept the registration numbers of N students as the input.
The format of the registration number is YYDDNNN, where YY represents the last digits of the year of graduation,
DD represents the shortcode of the department name and NNN represents the roll number. The program must sort the registration numbers based on the following conditions.

- The year of graduation YY must be sorted in descending order.

- The department short code DD in each graduation year must be in sorted order.

- The roll numbers in each department must be sorted ascending order.

Finally, the program must print the sorted registration numbers as the output.

Input:

18

20EC001

20EC002

20EC003

19IT001

191T002

19IT003

20CS002

20CS003

20CS001

201T002

201T001

201T003

21CS001

21C5003

21CS002

19EE004

19EE005

19EE006

Output

21CS001

21CS002

21CS003

20CS001

20CS002

20CS003

20EC001

20EC002

20EC003

201T001

201T002

201T003

19EE004

19EE005

19EE006

19IT001

19IT002

191T003

Expected Output:

21CS001

21CS002

21CS003

20CS001

20CS002

20CS003

20EC001

20EC002

20EC003

201T001

201T002

201T003

19EE004

19EE005

19EE006

19IT001

19IT002

19IT003
*/

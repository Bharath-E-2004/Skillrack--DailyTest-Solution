import java.util.*;

public class Main {

    public static int totalSeconds(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return hour * 3600 + min * 60;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[][] data = new String[n][3];
        int[] work = new int[n];

        for (int i = 0; i < n; i++) {
            data[i][0] = sc.next(); // name
            data[i][1] = sc.next(); // inTime
            data[i][2] = sc.next(); // outTime

            work[i] = totalSeconds(data[i][2]) - 
                      totalSeconds(data[i][1]);
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                boolean swap = false;

                // 1️⃣ Descending working time
                if (work[i] < work[j]) {
                    swap = true;
                }

                // 2️⃣ If equal working time
                else if (work[i] == work[j]) {

                    int in1 = totalSeconds(data[i][1]);
                    int in2 = totalSeconds(data[j][1]);

                    // Ascending in-time
                    if (in1 > in2) {
                        swap = true;
                    }

                    // 3️⃣ If equal in-time
                    else if (in1 == in2) {
                        if (data[i][0].compareTo(data[j][0]) > 0) {
                            swap = true;
                        }
                    }
                }

                if (swap) {
                    // swap work
                    int temp = work[i];
                    work[i] = work[j];
                    work[j] = temp;

                    // swap data row
                    String[] t = data[i];
                    data[i] = data[j];
                    data[j] = t;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0]);
        }
    }
}

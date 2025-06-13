import java.util.*;

class Movie implements Comparable<Movie> {
    String name;
    int time;       // time in minutes
    int year;
    String timeStr; // original time string, like "02:30"

    public Movie(String name, String timeStr, int year) {
        this.name = name;
        this.timeStr = timeStr;
        String[] Time = timeStr.split(":");
        this.time = Integer.parseInt(Time[0]) * 60 + Integer.parseInt(Time[1]);
        this.year = year;
    }

    @Override
    public int compareTo(Movie other) {
        if (this.year != other.year)
            return other.year - this.year; // descending year
        if (this.time != other.time)
            return other.time - this.time; // descending time
        return this.name.compareTo(other.name); // ascending name
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.name, this.timeStr, this.year);
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        List<Movie> movies = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] currMovie = sc.nextLine().trim().split("\\s+");
            // Assuming input is: Name Time(HH:MM) Year
            Movie movie = new Movie(currMovie[0], currMovie[1], Integer.parseInt(currMovie[2]));
            movies.add(movie);
        }

        Collections.sort(movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
/*
   The program must accept the name, duration(HH:MM) and released year of N movies as the input. The program must sort the movies based on the following conditions.

- The program must sort the movies in descending order based on the released year.

- If two or movies released in the same year, then the program must sort the movies in descending order based on the duration.

- If two or movies have the same duration and released in the same year, then the program must sort the movies based on their names.

Your task is to define the class Movie so that the program runs successfully.

Example Input/Output 1:

Input:

5

Aquaman 02:22 2018

Joker 02:05 2019

IronMan2 02:04 2010

Aladdin 02:05 2019

Venom 02:20 2018

Output:

Aladdin 02:05 2019

Joker 02:05 2019

Aquaman 02:22 2018

Venom 02:20 2018

IronMan2 02:04 2010

Explanation:

Here N=5

After sorting the 5 movies based on the given conditions, the movies become

Aladdin 02:05 2019

Joker 02:05 2019

Aquaman 02:22 2018

Venom 02:20 2018

IronMan2 02:04 2010
*/

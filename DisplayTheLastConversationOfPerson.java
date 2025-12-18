import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] messages = new String[N];

        for (int i = 0; i < N; i++) {
            messages[i] = sc.nextLine();
        }

        // To store contacts already printed
        Set<String> seen = new HashSet<>();

        // Traverse from last message to first
        for (int i = N - 1; i >= 0; i--) {
            String[] parts = messages[i].split(":", 2);
            String name = parts[0];

            if (!seen.contains(name)) {
                System.out.println(messages[i]);
                seen.add(name);
            }
        }
    }
}

/*
A person receives N messages in his messenger app. The messenger app shows the contacts and their last message in reverse chronological order based on the time of the last received message. The person receives N messages. The names of the senders and their messages are passed as the input to the program in chronological order. The program must print the names of the contacts who sent the messages to the person and their last message in the order as in the messenger app.

Boundary Condition(s):

2 <= N <= 100

3<= Length of each line (name and message) <= 100

Input Format:

The first line contains N.

The next N lines, each contains the name of the sender and his/her message separated by a colon.

Output Format:

The lines contain the names of the contacts and their last message in the order as in the

messenger app.

Example Input/Output 1:

Input

8

Hector:Hi

Arun:Good Morning

Hector:How are you?

John:r u there?

Arun:Have a good day.

John:Pls call me

John:Urgent

Arun:Where are you?

Output:

Arun:Where are you?

John:Urgent

Hector:How are you?
*/

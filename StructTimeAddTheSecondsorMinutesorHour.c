#include <stdio.h>
#include <string.h>
#include <ctype.h>

struct Time {
    int hours;
    int minutes;
    int seconds;
};

void updateTime(struct Time *time, char *str) {
    int i = 0;
    int totalSeconds = 0;

    // Extract numeric part
    while (isdigit(str[i])) {
        totalSeconds = totalSeconds * 10 + (str[i++] - '0');
    }

    // Determine unit (seconds, minutes, hours)
    char unit = tolower(str[i]);
    if (unit != 's') {
        totalSeconds *= (unit == 'm') ? 60 : 3600;
    }

    // Add total seconds to time
    int total = time->hours * 3600 + time->minutes * 60 + time->seconds + totalSeconds;

    // Adjust within 24 hours
    total %= 86400; 

    time->hours = total / 3600;
    total %= 3600;
    time->minutes = total / 60;
    time->seconds = total % 60;
}

int main() {
    struct Time t;
    char timeStr[20], updateStr[20];
    scanf("%d:%d:%d", &t.hours, &t.minutes, &t.seconds);
    scanf("%s", updateStr);

    updateTime(&t, updateStr);
    printf("%02d:%02d:%02d\n", t.hours, t.minutes, t.seconds);

    return 0;
}
/*
The function/method updateTime accepts two arguments time and str. The first argument time represents a time in 24-hour format (HH:MM:SS). The string str contains an integer X that ends with a letter denoting the unit of time (h or H - hours, m or M - minutes, s or S -seconds).

The function/method updateTime must update the time by adding X (hours or minutes or seconds).

Your task is to implement the function updateTime so that the program runs successfully.

The following structure is used to represent the Time and is already defined in the default code (Do not write this definition again in your code).

struct Dima

{

int hours;

int minutes,

int seconds;

IMPORTANTE: Do not write the main() function as it is already defined.

You have used 2 reveals out of 2 in the past 7 Days.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

10:45:20 50s

Output:

10:46:10

Explanation:

Here X = 50 seconds.

After adding 50 seconds, the time becomes 10:46:10.

Example Input/Output 2:

Input

15:30:55

125M

Output 17:35:55

Explanation:

Here X 125 minutes.

After adding 125 minutes, the time becomes 17:35:55.

Example Input/Output 3:

Input:

23:50:47

2h

Output:

01:50:47

*/

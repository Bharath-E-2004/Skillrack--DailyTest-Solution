#include <string.h>
#include <stdlib.h>
#include <stdio.h>

struct Duration getTotalDuration(char *str)
{
    struct Duration result;
    result.days = 0;
    result.hours = 0;
    result.minutes = 0;
    result.seconds = 0;

    char *token = strtok(str, " ");

    while(token != NULL)
    {
        int h, m, s;
        sscanf(token, "%d:%d:%d", &h, &m, &s);

        result.hours   += h;
        result.minutes += m;
        result.seconds += s;

        token = strtok(NULL, " ");
    }

    // normalize seconds → minutes
    result.minutes += result.seconds / 60;
    result.seconds = result.seconds % 60;

    // normalize minutes → hours
    result.hours += result.minutes / 60;
    result.minutes = result.minutes % 60;

    // normalize hours → days
    result.days = result.hours / 24;
    result.hours = result.hours % 24;

    return result;
}
/*
The function/method getTotal Duration accepts an argument str representing a string value. The string str contains the duration of a certain number of videos (in 24-hr format HH:MM:SS) separated by a space.

The function/method get Total Duration must return the total duration of the videos in days, hours, minutes and seconds.

Your task is to implement the function getTotalDuration so that the program runs successfully.

The following structure is used to represent the Duration and is already defined in the default code (Do not write this definition again in your code).

struct Duration

{

4

int days;

int hours;

int minutes;

int seconds;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

01:50:30 23:30:15 00:05:08

Output

11 25 53

Explanation:

1st videa: 01:50:30

2nd video: 23:30:15

3rd video: 00:05:08

The total duration of the 3 videos in days, hours, minutes and seconds is given below.

1 day, 1 hour, 25 minutes and 53 seconds.

Example Input/Output 2:

Input:

20:25:50

20:25:50

00:00:01

20:25:50

Output:

2 13 17 31
*/

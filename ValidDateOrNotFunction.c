int validateDate(char dateStr[])
{
    int day = 0, month = 0, year = 0;
    int i = 0;

    /* Extract day */
    while (dateStr[i] >= '0' && dateStr[i] <= '9')
    {
        day = day * 10 + (dateStr[i] - '0');
        i++;
    }

    if (dateStr[i] != '-') return 0;
    i++;

    /* Extract month */
    while (dateStr[i] >= '0' && dateStr[i] <= '9')
    {
        month = month * 10 + (dateStr[i] - '0');
        i++;
    }

    if (dateStr[i] != '-') return 0;
    i++;

    /* Extract year */
    while (dateStr[i] >= '0' && dateStr[i] <= '9')
    {
        year = year * 10 + (dateStr[i] - '0');
        i++;
    }

    /* Year validation */
    if (year < 1000 || year > 9999)
        return 0;

    /* Month validation */
    if (month < 1 || month > 12)
        return 0;

    /* Day validation */
    if (day < 1)
        return 0;

    /* Months with 30 days */
    if (month == 4 || month == 6 || month == 9 || month == 11)
    {
        if (day > 30)
            return 0;
    }
    /* February */
    else if (month == 2)
    {
        int isLeap = (year % 400 == 0) ||
                     (year % 4 == 0 && year % 100 != 0);

        if (isLeap)
        {
            if (day > 29)
                return 0;
        }
        else
        {
            if (day > 28)
                return 0;
        }
    }
    /* Months with 31 days */
    else
    {
        if (day > 31)
            return 0;
    }

    return 1;
}

/*
The function/method validateDate accepts an argument dateStr representing a string value which contains a date in the format "DD-MM-YYYY".

The function/method validateDate must return 1 if the given date is valid. Else the function must return 0.

Your task is to implement the function validateDate so that the program runs successfully.

Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

26-08-2021

Output

Example Input/Output 2:

Input

09-15-2010

Output:

0

Explanation: Invalid month 15.

Example Input/Output 3:

Input:

39-12-2100

Output:

Explanation:

Invalid date 39 in December.
*/

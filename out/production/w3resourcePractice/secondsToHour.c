/**
 * @file secondsToHour.c
 * 17. Write a C program to convert a given integer (in seconds) to hours, minutes and seconds. Go to the editor
Test Data :
Input seconds: 25300
Expected Output:
There are:
H:M:S - 7:1:40
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-28
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>
int main()
{
    int seconds, hour, min, second;
    printf("Enter seconds : \n");
    scanf("%d", &seconds);
    hour = seconds/3600;
    min    = seconds - (hour*3600);
    min    = min/60;
    second = seconds - ((hour*3600)+(min*60));
    printf("H:M:S - %d:%d:%d\n", hour, min, second);
    return 0;
}

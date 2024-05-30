/**
 * @file convertDaysToYear.c
 * 8. Write a C program to convert specified days into years, weeks and days.
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-25
 * 
 * @copyright Copyright (c) 2022
 * 
 */
#include <stdio.h>
int main()
{
    
    int givenDay, year, week, day;
    printf("Enter days : ");
    scanf("%d", &givenDay);

    year    = givenDay/365;
    week    = (givenDay%365)/7;
    day     = givenDay - (year*365+week*7);
    
    printf("%d is converted: %d year, %d week and %d days.\n", givenDay, year, week, day);

    return 0;
}

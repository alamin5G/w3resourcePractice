/**
 * @file consecutiveOddSummation.c
 * 34. Write a C program to compute the sum of consecutive odd numbers from a given pair of integers. Go to the editor
Test Data :
Input a pair of numbers (for example 10,2):
Input first number of the pair: 10
Input second number of the pair: 2
Expected Output:
List of odd numbers: 3
5
7
9
Sum=24
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
    int first, last, temp, sum =0;
    printf("Enter 1st and last number of pair: \n");
    scanf("%d%d", &first, &last);
    
    if (last < first )
    {
        temp = first;
        first = last;
        last = temp;
    }

    if (first%2==0)
    {
        first++;
    }
    

    for (int i = first; i <= last; i+=2)
    {
        sum = sum + i;
        printf("%d\n", i);
    }

    printf("Sum of Odd: %d\n", sum);
    
    
    return 0;
}

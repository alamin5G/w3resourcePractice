/**
 * @file pairOfAscendingOrDescending.c
 * 35. Write a C program to check whether two numbers in a pair is in ascending order or descending order. Go to the editor
Test Data :
Input a pair of numbers (for example 10,2 : 2,10):
Input first number of the pair: 10
Expected Output:
Input second number of the pair: 2
The pair is in descending order!
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-28
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

void main()
{
    int first, last;
    printf("Enter 1st and last number of the pair: \n");
    scanf("%d%d", &first, &last);
    if (first < last)
    {
        printf("The pair is in Ascending order!\n");
    }else{
        printf("The pair is in descending order!\n");
    }
    

}
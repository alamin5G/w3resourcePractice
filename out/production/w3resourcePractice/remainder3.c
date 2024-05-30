/**
 * @file remainder3.c
 * 32. Write a C program to print all numbers between 1 to 100 which divided by a specified number and the remainder will be 3. Go to the editor
Test Data :
Input an integer: 25
Expected Output:
3
28
53
78
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
    int number,i;
    printf("Enter a number: \n");
    scanf("%d", &number);

    for(i = 1;i <= 100;i++)
    {
        if (i%number == 3)
        {
            printf("%d\n", i);
        }
        
    }
}
/**
 * @file notDivisible17.c
 * 39. Write a C program to calculate the sum of all number not divisible by 17 between two given integer numbers. Go to the editor
Test Data :
Input the first integer: 50 Input the second integer: 99
Expected Output:
Sum: 3521
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
    int first, last, i, sum = 0;
    printf("Enter first and last number: \n");
    scanf("%d%d", &first, &last);
    for (i = first; i <= last; i++)
    {
        if (i%17 != 0)
        {
            sum = sum + i;
        }
        
    }
    printf("sum: %d\n", sum);
    
    return 0;
}

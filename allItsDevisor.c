/**
 * @file allItsDevisor.c
 * 47. Write a C program that reads an integer and find all its divisor. Go to the editor
Test Data:
Input an integer: 45
Expected Output:
All the divisor of 45 are:
1
3
5
9
15
45
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-01
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

int main()
{
    int n, i;
    printf("Enter an number: \n");
    scanf("%d", &n);
    printf("All the divisor of %d are:\n", n);
    for ( i = 1; i <=n; i++)
    {
        if (n%i==0)
        {
            printf("%d\n",i);
        }
        
    }
    
    return 0;
}

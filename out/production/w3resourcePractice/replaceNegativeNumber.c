/**
 * @file replaceNegativeNumber.c
 * 48. Write a C program to read and print the elements of an array of length 7, before print replace every negative number, zero with 100. Go to the editor
Test Data:
Input the 5 members of the array:
25
-5
35
65
15

Expected Output:
Array values are:
n[0] = 25
n[1] = 100
n[2] = 35
n[3] = 65
n[4] = 15
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-01
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

void main()
{
    int i, n, a[7], replace = 100;

    printf("Input the 7 numbers of the array: \n");
    for(i = 0;i < 7;i++)
    {
        scanf("%d", &a[i]);
        if (a[i]<=0)
        {
            a[i] = replace;
        }
        
    }

    for(i = 0;i < 7;i++)
    {
        printf("n[%d] = %d\n",i, a[i]);
    }

}
/**
 * @file tripleValue.c
 * 49. Write a C program to read and print the elements of an array of length 7, before print, put the triple of the previous position starting from the second position of the array. Go to the editor
For example, if the first number is 2, the array numbers must be 2, 6, 18, 54 and 162
Test Data:
Input the first number of the array: 5
Expected Output:
n[0] = 5
n[1] = 15
n[2] = 45
n[3] = 135
n[4] = 405
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
    int i, n, a[7];

    printf("Input the 1st value of the array: \n");
    scanf("%d", &n);

    for(i = 0;i < 7;i++)
    {
        a[i] = n;
        printf("n[%d] = %d\n",i, a[i]);
        n = n*3;
    }

}
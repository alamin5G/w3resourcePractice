/**
 * @file changeTheArrayValue.c
 * 51. Write a C program to read an array of length 6, change the first element by the last, the second element by the fifth and the third element by the fourth. Print the elements of the modified array. Go to the editor
Test Data:
Input the 5 members of the array:
15
20
25
30
35

Expected Output:
array_n[0] = 35
array_n[1] = 30
array_n[2] = 25
array_n[3] = 20
array_n[4] = 15
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
    int a[6], b[6], i, j = 0, t;
    printf("Enter array value: \n");
    for (i = 0; i < 6; i++)
    {
        scanf("%d", &a[i]);
    }

    for (i = 6 - 1; i >= 0; i--)
    {

        t = a[i];
        b[j] = t;
        j++;
    }

    for (j = 0; j < 6; j++)
    {
        printf("a[%d] = %d\n", j, b[j]);
    }

    return 0;
}

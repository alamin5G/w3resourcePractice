/**
 * @file highestValue.c
 * 33. Write a C program that accepts some integers from the user and find the highest value and the input position. Go to the editor
Test Data :
Input 5 integers:
5
7
15
23
45
Expected Output:
Highest value: 45
Position: 5
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
    int arraySize, i, position = 0, maxValue = 0;
    printf("Enter array length: \n");
    scanf("%d", &arraySize);
    int a[arraySize];
    for (i = 1; i <= arraySize; i++)
    {
        scanf("%d", &a[i]);

        if (a[i] > maxValue)
        {
            maxValue = a[i];
            position = i;
        }
    }

    printf("Highest Value: %d\n", maxValue);
    printf("Position: %d\n", position);
    return 0;
}

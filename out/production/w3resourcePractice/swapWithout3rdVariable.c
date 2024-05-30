/**
 * @file swapWithout3rdVariable.c
 * Write a C program that swaps two numbers without using third variable.
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-02
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

void main()
{
    int x, y;
    printf("Enter x and y value: \n");
    scanf("%d%d", &x, &y);
    printf("x = %d and y = %d before swap\n", x, y);
    x = x + y;
    y = x - y;
    x = x - y;
    printf("x = %d and y = %d after swap\n", x, y);
  
}
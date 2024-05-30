/**
 * @file leftShift.c
 * Write a C program to shift given data by two bits to the left.
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
    int a;
    printf("Enter a number: \n");
    scanf("%d", &a);
    printf("inputted value is : %d\n", a);
    
    printf("After 2 bit left shifted %d\n",a<<2 );//works for multiplication

    printf("After 2 bit right shifted %d\n", a>>1); //for division 
}
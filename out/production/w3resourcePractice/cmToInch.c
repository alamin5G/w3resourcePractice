/**
 * @file cmToInch.c
 * 54. Write a C program that accepts a distance in centimeters and prints the corresponding value in inches. Go to the editor
Test Data:
Input Data: 500cms
Input the distance in cm:
Distance of 500.00 cms is = 196.85 inches
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
    int cm;
    float inch;
    printf("Enter distance in Centimeter: \n");
    scanf("%d", &cm);
    inch = (float) cm*0.3937;
    printf("Distance of %d cm is = %.2f inch\n", cm, inch);
}
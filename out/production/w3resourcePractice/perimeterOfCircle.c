/**
 * @file perimeterOfCircle.c
 * 6. Write a C program to compute the perimeter and area of a circle with a given radius.
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-25
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

void main(){
   float area, perimeter, r, pi = 3.1416;
   printf("Enter radius of a circle: ");
   scanf("%f", &r);
   perimeter = 2*pi*r;
   area = pi * (r * r);
   printf("The area of a circle is %.2f\n", area);
   printf("The perimeter of a circle %.2f\n", perimeter);

}
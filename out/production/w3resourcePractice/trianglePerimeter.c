/**
 * @file trianglePerimeter.c
 * 23. Write a C program that reads three floating values and check if it is possible to make a triangle with them. Also calculate the perimeter of the triangle if the said values are valid. Go to the editor
Test Data :
Input the first number: 25
Input the second number: 15
Input the third number: 35
Expected Output:
Perimeter = 75.0
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
    float a, b, c, perimeter;
    printf("Enter triangle value of a, b, c: \n");
    scanf("%f%f%f", &a, &b, &c);
    if ((a<b+c) && (b < c+a) && (c < a+b)){
        perimeter = a+b+c;
        printf("Perimeter is %.2f\n", perimeter);
    }else
    {
        printf("Triangle is not valid.\n");
    }
    
    return 0;
}

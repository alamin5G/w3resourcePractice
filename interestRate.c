/**
 * @file interestRate.c
 * 53. Write a C program that accepts principle, rate of interest, time and compute the simple interest. Go to the editor
Test Data:
Input Data: p = 10000, r = 10% , t = 12 year
Expected Output:
Input principle, Rate of interest & time to find simple interest:
Simple interest = 12000
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-02
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

int main()
{
    int principle, interestRate, duration;
    float total;
    printf("Enter Principle: \n");
    scanf("%d", &principle);
    printf("Enter interest rate: \n");
    scanf("%d", &interestRate);
    printf("Enter duration: \n");
    scanf("%d", &duration);

    while (duration--)
    {
        total += principle*(interestRate/100.00);
    }
    printf("Simple interest %.2f\n", total);
    
    
    return 0;
}

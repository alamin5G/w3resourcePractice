/**
 * @file productWeight.c
 * 11. Write a C program that accepts two item’s weight (floating points' values ) and number of purchase (floating points' values) and calculate the average value of the items. Go to the editor
Test Data :
Weight - Item1: 15
No. of item1: 5
Weight - Item2: 25
No. of item2: 4
Expected Output:
Average Value = 19.444444
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-27
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

int main()
{
    float weight[2], item[2], weightsum=0, avg=0,temp=0;
    int i;
    for ( i = 1; i <= 2; i++){
        printf("Enter Weight-[%d] and Number of purchase for item-[%d]: \n", i, i);
        scanf("%f%f", &weight[i], &item[i]);
        weightsum = weightsum + weight[i] * item[i];
        temp = temp + item[i];
    }
    
        avg = weightsum/temp;
    
    printf("Average Value = %.2f\n", avg);
    
    return 0;
}

/**
 * @file dividedBy7Rem23.c
 * 40. Write a C program to find all numbers which are dividing by 7 and the remainder is equal to 2 or 3 between two given integer numbers. Go to the editor
Test Data :
Input the first integer: 25
Input the second integer: 45
Expected Output:
30
31
37
38
44
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-28
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

void main(){
    int first, last, i;
    printf("Enter first and last number: \n");
    scanf("%d%d", &first, &last);
    
    for(i=first; i<last; i++){
        if(i%7==2){
            printf("%d\n", i);
        }else if(i%7 == 3){
            printf("%d\n", i);
        }
    }
}
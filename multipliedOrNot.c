/**
 * @file multipliedOrNot.c
 * 24. Write a C program that reads two integers and checks whether they are multiplied or not. Go to the editor
Test Data :
Input the first number: 5
Input the second number: 15
Expected Output:
Multiplied!
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
    int n, n2;
    printf("Enter two  integer number n and n2: \n");
    scanf("%d%d", &n, &n2);
    if (n%n2 == 0)
    {
        printf("Multiplied!!\n");
    } else{
        printf("Not multiplied..\n");
    }
    
    return 0;
}

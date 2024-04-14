/**
 * @file reverseNumber.c
 * 57. Write a C program to reverse and print a given number. Go to the editor
Input a number:
The original number = 234
The reverse of the said number = 432
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
    
    int n, remain, rev=0, temp;
    printf("Enter a number: \n");
    scanf("%d", &n);
    temp = n;

    while (n!=0)
    {
        remain = n%10;
        rev = rev + remain*10;
        n = n/10;
        
    }
    
    return 0;
}

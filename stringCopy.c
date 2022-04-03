/**
 * @file stringCopy.c
 * copy one string to another string
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-03
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <string.h>
#include <stdio.h>

void main()
{
    char st1[300], st2[300];
    printf("write some words: \n");
    gets(st1);
    printf("First string is: ");
    puts(st1);
    printf("After copy: ");
    strcpy(st2, st1);
    puts(st2);
}
/**
 * @file stringCopyWithoutLibrary.c
 * copy a string file without library function.
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
    int i;
    printf("write some words: \n");
    gets(st1);
    printf("First string is: ");
    puts(st1);
    printf("After copy: ");
    while (st1[i] != '\0')
    {
        st2[i] = st1[i];
        i++;
    }
    
    puts(st2);
}
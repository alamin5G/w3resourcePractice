/**
 * @file stringCompareWithoutLibrary.c
 * compare two strings without using string library functions
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-03
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int stringComparez(char *st1, char *st2);

int main()
{
    char s[50], s2[50];
    int f;
    printf("Enter a string-1: \n");
    gets(s);
    printf("Enter a string-2: \n");
    gets(s2);
    printf("string 1 : %s\n", s);
    printf("string 2 : %s\n", s2);

    f = stringComparez(s, s2);
    
    if (f!=0)
    {
        printf("String are equal\n");
    }else
    {
        printf("String are not equal.\n");
    }
    

    return 0;
}

int stringComparez(char *st1, char *st2)
{
    int f = 1;
    while (*st1 != '\0' || *st2 != '\0')
    {
        if (*st1 == *st2)
        {
            st1++;
            st2++;
            
        }else if ((*st1 != '\0' || *st2 == '\0') || (*st1 == '\0' || *st2 != '\0') || (*st1 != *st2))
        {
            f = 0;
            break;
        }
        
    }

    return f;
}
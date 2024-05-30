/**
 * @file stringWordCount.c
 * count the total number of words in a string.
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

int main()
{
    char s[50];
    int l, w=1;
    printf("Enter a string: \n");
    gets(s);

    while (s[l] != '\0')
    {
        if (s[l] == ' ' || s[l] == '\n' || s[l] == '\t')
        {
            w++;
        }
        
        l++;
    }    


    printf("\ninputted string words are: %d\n", w);
    
    return 0;
}
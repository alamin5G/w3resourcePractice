/**
 * @file stringCountChar.c
 * count total number of vowel or consonant in a string.
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
    char str[200];
    int i = 0, vowel, consonant;
     vowel = consonant = 0;
    printf("write something\n");
    gets(str);
    
    while(str[i] != '\0'){
        if (str[i] == 'a' || str[i]== 'e' || str[i]== 'i' || str[i]== 'o' || str[i]== 'u' || str[i] == 'A' || str[i]== 'E' || str[i]== 'I' || str[i]== 'O' || str[i]== 'U' )
        {
            vowel++;
        }else{
            consonant++;
        }
        
        i++;
    }

    printf("%d Vowels.\n", vowel);
    printf("%d consonants.\n", consonant);
    return 0;
}

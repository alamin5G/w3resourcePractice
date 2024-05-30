/**
 * @file stringSortAscending.c
 * sort a string array in ascending order.
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
    char s[100], temp;
    int i, j, l;
    printf("Enter string: ");
    gets(s);
    l = strlen(s);
    for(i=1; i<l; i++){
        for(j=0; j<l-i; j++){
            if(s[j]>s[j+1]){
               temp = s[j];
               s[j] = s[j+1];
               s[j+1] = temp;
            }
        }
    }

    puts(s);
    printf("%s",s);

    return 0;
}

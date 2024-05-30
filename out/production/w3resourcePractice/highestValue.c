/**
 * @file highestValue.c
 * find the highest value from an array.
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-04-01
 * 
 * @copyright Copyright (c) 2022
 * 
 */


#include <stdio.h>

int main()
{
    int n, t = 0, pos, i;
    printf("Enter array length: \n");
    scanf("%d", &n);
    int a[n];
    printf("Enter array value: \n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    t = a[0];
    pos = 0;
    
    for (i = 1; i < n; i++)
    {
        if (t < a[i])
        {
            t = a[i];
            pos = i+1;
        }
        
      
    }
    printf("Highest value is : %d\n", t);
    printf("Highest value position is : %d\n", pos);

    return 0;
}
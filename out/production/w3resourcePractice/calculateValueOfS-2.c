/**
 * @file calculateValueOfS-2.c
 * 46. Write a C program to calculate the value of S where S = 1 + 3/2 + 5/4 + 7/8. Go to the editor
Expected Output:
Value of series: 4.62
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
    int i;
    float n=1 , s = 0;
    for(i=1; i<=7; i+=2){
        if(i==1){
            s = n;
            n++;
        }else{
            s = s+i/n;
            n = n*2;
        }
    }

    printf("%.2f\n",s);

    return 0;
}

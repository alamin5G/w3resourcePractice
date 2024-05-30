/**
 * @file comparisonOf4number.c
 * 19. Write a C program that accepts 4 integers p, q, r, s from the user where q, r and s are positive and p is even. If q is greater than r and s is greater than p and if the sum of r and s is greater than the sum of p and q print "Correct values", otherwise print "Wrong values". Go to the editor
Test Data :
Input the first integer: 2
Input the second integer: 5
Input the third integer: 4
Input the fourth integer: 10
Expected Output:
Wrong values
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
    int p, q, r, s;
    printf("Enter p, q, r and s value: \n");
    scanf("%d%d%d%d", &p, &q, &r, &s);
    while ((p % 2 != 0) && (q < 0) && (r < 0) && (s < 0))
    {
        printf("Enter p, q, r and s value: \n");
        scanf("%d%d%d%d", &p, &q, &r, &s);
    }

    if ((q > r) && (s > p) && (r + s) > (p + q))
    {
        printf("Correct values\n");
    }
    else
    {
        printf("Wrong Values.\n");
    }
    return 0;
}

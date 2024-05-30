/**
 * @file bankNotes.c
 * 16. Write a C program to read an amount (integer value) and break the amount into smallest possible number of bank notes. Go to the editor
Test Data :
Input the amount: 375
Expected Output:
There are:
3 Note(s) of 100.00
1 Note(s) of 50.00
1 Note(s) of 20.00
0 Note(s) of 10.00
1 Note(s) of 5.00
0 Note(s) of 2.00
0 Note(s) of 1.00
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-28
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>
int main(){
    int thousand, fiveHundred, hundred, fifty, twenty, ten, five, two, one, input;

    printf("Amount in check: \n");
    scanf("%d", &input);
    printf("You will get from the Bank: \n");

    thousand = input / 1000;
    fiveHundred = (input % 1000)/500;
    hundred = input - ((thousand*1000)+(fiveHundred*500));
    hundred = hundred/100;
    fifty   = input- ((thousand*1000)+(fiveHundred*500)+(hundred*100));
    fifty   = fifty/50;
    twenty  = input- ((thousand*1000)+(fiveHundred*500)+(hundred*100)+(fifty*50));
    twenty  = twenty/20;
    ten     = input- ((thousand*1000)+(fiveHundred*500)+(hundred*100)+(fifty*50)+(twenty*20));
    ten     = ten/10;
    five    = input- ((thousand*1000)+(fiveHundred*500)+(hundred*100)+(fifty*50)+(twenty*20)+(ten*10));
    five    = five/5;
    two     = input- ((thousand*1000)+(fiveHundred*500)+(hundred*100)+(fifty*50)+(twenty*20)+(ten*10)+(five*5));
    two     = two/2;
    one     = input- ((thousand*1000)+(fiveHundred*500)+(hundred*100)+(fifty*50)+(twenty*20)+(ten*10)+(five*5)+(two*2));
    printf("%d note(s) of 1000.\n", thousand);
    printf("%d note(s) of 500.\n", fiveHundred);
    printf("%d note(s) of 100.\n", hundred);
    printf("%d note(s) of 50.\n", fifty);
    printf("%d note(s) of 20.\n", twenty);
    printf("%d note(s) of 10.\n", ten);
    printf("%d note(s) of 5.\n", five);
    printf("%d note(s) of 2.\n", two);
    printf("%d note(s) of 1.\n", one);
}
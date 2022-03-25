/**
 * @file cVersion.c
 * 2. Write a C program to get the C version you are using.
 * @author Md. Alamin (alamin5g@yahoo.com)
 * I would love be a software engineer at Google. That is why anybody can uses this code without any condition, if you face any difficulty, then try to email me.
 * @version 0.1
 * @date 2022-03-25
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

int main(){
    if(__STDC_VERSION__ >= 201710L){
        printf("We are using C18!");
    }else if(__STDC_VERSION__ >= 201112L){
        printf("We are using C11!");
    } else{
        printf("I don't know, :P");
    }
    return 1;
}
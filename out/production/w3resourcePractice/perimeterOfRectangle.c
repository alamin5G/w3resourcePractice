/**
 * @file perimeterOfRectangle.c
 * 5. Compute the perimeter and area of a rectangle
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
    int perimeter, area, w, l;
    printf("Enter the Height and Length: ");
    scanf("%d%d", &l, &w);
    perimeter = 2*(w+l);
    area = w*l;
    printf("Perimeter of the rectangle: %d\n", perimeter);
    printf("Area of the rectangle: %d", area);

    return 0;
}
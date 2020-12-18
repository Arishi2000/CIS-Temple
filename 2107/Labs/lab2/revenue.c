/*
Name: Dom Arishi
Date: sep 6, 2020
Course: 2107
Assignment: Lab2/Revenue
Statement:
*/

#include<stdio.h>
#include<stdlib.h>

int main(){
        
        float item_price,total, discount;
        int quantity; 
       
         printf("Welcome to \"Temple\" store\n");
	printf("\n");      

        printf("\tEnter item price: ");
        scanf("%f", &item_price);
      
       if(item_price<0.25 || item_price>100)
       {
       printf("Invalid item price.\n");
       printf("Please Try again\n");
      
       }
       else
       {
       printf("\tEnter quantity: ");
        scanf("%d", &quantity);
       if(quantity<0 || quantity-(int)quantity >0)
       {
       printf("Invalid quantity order.\n");
       printf("Please Try again\n");
       }
       else
       {
      
      
       if(quantity<50)
       {
       discount = 0;
       }
       else if(quantity<100)
       {
       discount = 10;
       }
       else if(quantity<150)
       {
       discount = 15;
       }
       else
       {
       discount = 25;
       }
      
      printf("\n");
       printf("\tThe item price is: $%.1f\n", item_price);
       printf("\tThe order is: %d item(s)\n", (int)quantity);
       printf("\tThe cost is: $%.1f\n", (quantity*item_price));

      
       printf("\tThe discount is: %.1f%%\n",(double)discount);
       printf("\tThe discount amount is: $%.1f\n",(discount*(quantity*item_price)/100.0));
       printf("\tThe total is: $%.1f\n",((quantity*item_price)-(discount*(quantity*item_price)/100.0)));
      
      
       }
       }
      printf("\n");
       printf("Thank you for using \"Temple\" store\n");
      
      
   }

//
//  main.c
//  Lab3
//
//  Created by abdullah arishi on 9/10/20.
//  Copyright © 2020 Abdullah. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

// this functions asking for PIN.
int PIN() {
   int i, PIN;
  
   // it will ask user 3 times until, the corect PIN is entered.
   for(i=0; i<3; i++) {
       printf("\nPlease enter PIN to continue : ");
       scanf("%d", &PIN);
       if(PIN==3014) return 1;
       else printf("PIN entered is wrong. Please try again! \n");
   }
   if(i==3) {
       printf("You have entered the wrong PIN for 3 times. Due to security reasons, You can't make transcations for now.");
       exit(-1);
   }
   return 1;
}


// this function for withdrawals.
int Withdrawl(int rec, int with, int bal) {
    int i, amount = 0;
  
   // it will ask three times till the valid amount is entered.
   for(i=0; i<3; i++) {
       printf("Enter amount of withdrawal : ");
       scanf("%d", &amount);
       
       if(amount!=0 && amount %20 == 0) break;
       printf("\nPlease enter amount in multiples of $20. Try again!\n");
       }
   
    if(i==3) {
       printf("ERROR: You have entered wrong amount 3 times!!\n");
       exit(-1);
   }
  
   if(bal < amount) {
       printf("\nYou don't have enough balance to withdraw $%d", amount);
       return 0;
   }
   with += amount;
   if(with<=1000) {
       if(rec==1) printf("\n----Successfully withdrawn $%d. Please collect the withdrwal reciept -----", amount);
       if(rec==0) printf("\n--- Withdrawal success ! -----");
   }
  
      
   return amount;
}

// this function for deposits.
int Deposit(int rec, int dep) {
   int i, amount = 0;
  
   // it will ask 3 times till the valid amount is entered.
   for(i=0; i<3; i++) {
       printf("Enter amount of deposition : ");
       scanf("%d", &amount);
       if(amount!=0 && amount%5 == 0) break;
       printf("\nPlease enter amount in multiples of $5. Try again !\n");
   }
   if(i==3) {
       printf("ERROR : You have entered wrong amount 3 times. Try next time.");
       exit(-1);
   }
   dep += amount;
   if(dep<=10000) {
       if(rec==1) printf("\n---- Successfully deposited $%d. Please collect deposit reciept -----", amount);
       if(rec==0) printf("\n--- Deposition success ! -----");
   }
   return amount;

}


int main() {
  
   int balance = 5000, choice, transcations = 0, withdrawn = 0, deposited = 0, reciept = 0, amount=0;
  
    PIN();

   while(1) {
       printf("\nPlease Choose from the following menu\n");
       printf("1.Balance \n");
       printf("2.Withdrawal \n");
       printf("3.Deposit\n");
       printf("4.Quit\n");

       printf("\n- Enter choice : ");
       scanf("%d", &choice);
      
       // Terminate program for option 4
       if(choice == 4) {
           printf("\n\n-------------- THANK YOU! -----------------\n");
           printf("Number of transcation that was made: %d \n", transcations);
           break;
       }
       if(choice<1 || choice>4) {
           printf("Please select a valid option. Try again !");
           continue;
       }
      
     
       switch(choice) {
           case 1 : // Balance
                   printf("\n- Total balance : $%d \n", balance);
                   transcations++;
               break;
          
           case 2 : // withdrawal
                   printf("Do you want reciept ? 1:(yes)   2:(No) : (1 or 2): ");
                   scanf("%d", &reciept);
                   
               if((amount = Withdrawl(reciept, withdrawn, balance))) {
                       withdrawn+=amount; // successful withdraw
                       if(withdrawn<=1000) { // withdrawal should not be more than 10000
                           // update balance.
                           balance -= amount;
                           transcations++;
                           printf("\nTotal withdrawals made in this session: %d\n", withdrawn);
                       }
                       else {
                           printf("It is not allowed to withdraw more than $1000 in one day\n");
                           withdrawn -= amount; // unsuccessful withdraw
                           }
                           
                   
                   }
       
               break;
              
           case 3 : // deposits part
              
                   printf("Do you want reciept ? 1:(yes)   2:(No) : (1 or 2): ");
                   scanf("%d", &reciept);
                   
               if((amount = Deposit(reciept, deposited))) {
                       deposited += amount;   // successful Deposit
                       if(deposited<=10000) { // deposit should not be more than 10000
                           balance += amount; // update balance
                           transcations++;
                           printf("\nTotal deposits made in this session: %d", deposited);
                       }
                       else {
                           printf("\n It is not allowed to deposit more than $1000 in one day\n");
                           deposited -= amount;   // unsuccessful deposit
                       }
               break;
       }
   }
}
}

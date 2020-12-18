/*
Name: Dom Arishi
Date: sep 6, 2020
Course: 2107 
Assignment: Lab2/Paycheck
Statement: 
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
int empno;

float hsal,np,otpay,otsal,wktime,ot;
float gp = hsal* wktime;

printf("Welcome To \"TEMPLE HUMAN RESOURCES\"\n");
printf("\tEnter Employee Number: ");
scanf("%d",&empno);
if(empno<=0)
{
	printf("\tInvalid Employee Number.\n\tPlease run the program again\n");
	printf("Thank you for using \"TEMPLE HUMAN RESOURCES\"\n");
	exit(0);
}

printf("\tEnter Hourly Salary: ");
scanf("%f",&hsal);
if(hsal<=0)
{
	printf("\tInvalid hourly salary amount.\n\tPlease run the program again\n");
	printf("Thank you for using \"TEMPLE HUMAN RESOURCES\"\n");
	exit(0);
}

printf("\tEnter Weekly Time: ");
scanf("%f",&wktime);
if(wktime<=0)
{
	printf("\tThis is not a weekly time.\n\tPlease run the program again\n");
	printf("Thank you for using \"TEMPLE HUMAN RESOURCES\"\n");
	exit(0);
}


ot = wktime - 40;

if(wktime < 40){
    
    gp = hsal* wktime;
    np= gp;
}
else{

otsal = hsal * (float)1.5;

gp = (40 * hsal);

otpay=( ot * otsal);  

np= gp + otpay;
}
printf("\t============================\n");
printf("\tEmployee #: %d\n",empno);
printf("\tHourly Salary: $%.1f\n",hsal);
printf("\tWeekly Time: %.1f\n",wktime);
printf("\tRegular Pay: $%.1f\n",gp);

printf("\tOvertime Pay: $%.1f\n",otpay);

printf("\tNet Pay: $%.1f\n",np);
printf("\t============================\n");
printf("Thank you for using \"TEMPLE HUMAN RESOURCES\"\n");
return 0;
}




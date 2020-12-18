/*
Author: Abdullah Arishi
Date: 12th Nov, 2019
input: No input
Output: integers between one and n
Description: this code will find all of the integers between one and n which divide n and print a single line that
 starts with the number n, followd by a colon, followed by the number of factors found in parentheses, followed by a single space and finally a comma separated list of the factors found.  Do this for each n from 1 through 100.
Make all the colons line up in a single column
 
 
 */
 #include<stdio.h>
int main(){
int i,j,x,a[55]; //declaration
for(i=1;i<=100;i++){
x=0;
for(j=1;j<i;j++){
if(i % j == 0){ //checking factor condition
a[x]=j;
x++;
}
}
printf("%d:(%d)",i,x+1);
for(j=0;j<x;j++)
printf("%d,",a[j]);
printf("%d\n",i); //printing last factor
}
return 0;
}


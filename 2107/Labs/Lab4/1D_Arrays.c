/*
Name: Dom Arishi
Date: sept 27, 2020
Course: 2107
Assignment: lab4 1D Arrays
*/

#include <stdio.h>
#include <time.h>
#include <stdlib.h>
// default size of array
#define N 40

int findWithRange(int arr[],int low,int high)
{
   int max = -1;
   for(int i=low;i<=high;i++)
   {
       if(max < arr[i]) // change the max element value when greater element is found
           max = arr[i];
   }
   return max; // return the max element
}

void reverseArray(int arr[],int size)
{
   // reverse first and last element until the mid element
    
   for(int i=0,j=size-1;i<j;i++,j--)
   {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
}
// function to reverse the array of the range
int reverseOrder(int arr[],int size,int low,int high)
{
   // return -1 if the range is not correct
   if(high < low || low < 0 || high >= size)
       return -1;
   // otherwise reverse the array
   for(int i=low,j=high;i<j;i++,j--)
   {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
   return 1;
}
int findSequence(int arr[],int size,int first,int second)
{
   for(int i=0;i<=size-2;i++)
   {
       if(arr[i] == first && arr[i+1] == second)
           return i;
   }
   return -1;
}
void printArray(int arr[])
{
int i;
for (i=0; i < 40; i++)
{
      printf("%d ", arr[i]);
      if((i+1)%10==0)
        printf("\n");
}

printf("\n");
}
int main() {
   // allocating array of size N
   int arr[N];
   // this is for getting different set of random elements every time we execute the code
   srand(time(0));
   int low = 0, high = 39;
  
   for(int i=0;i<N;i++) {
       arr[i] = low + rand() % (high - low + 1);
   }
   // printing the array
   printf("Array: \n");
   for(int i=0;i<N;i++)
       printf("%d ",arr[i]);
   printf("\n\n");

   // getting the max element in the range low, high
    printf("Enter the range to find max: \n");
    printf("Low: ");
    scanf("%d",&low);
    printf("High: ");
    scanf("%d",&high);

    int max = findWithRange(arr,low,high);
    printf("Max = %d\n\n",max);
   
    // revevrsing the array
    printf("Original Array: \n");
    for(int i=0;i<N;i++)
    printf("%d ",arr[i]);
    printf("\n\n");
   
    reverseArray(arr,N);
    
    printf("Reversed Array: \n");
    for(int i=0;i<N;i++)
    printf("%d ",arr[i]);
    printf("\n\n");

   // reversing the array in the range low, high
   printf("Enter the range to reverse: \n");
   printf("Low: ");
      scanf("%d",&low);
      printf("High: ");
      scanf("%d",&high);

    printf("Reversed Array: \n");
    for(int i=0;i<N;i++)
     printf("%d ",arr[i]);
    printf("\n\n");
    int res = reverseOrder(arr,N,low,high);
   if(res == -1)
       printf("Index out of bound\n");
   else {
       printf("Reversing between %d and %d \n",low,high);
       for(int i=0;i<N;i++)
           printf("%d ",arr[i]);
       printf("\n\n");
   }

   // getting the sequence as input and finding that sequence
   int tom,jerry;
   printf("Enter two numbers: \n");
   printf("Tom: ");
    scanf("%d",&tom);
    printf("Jerry: ");
    scanf("%d",&jerry);
   int ind = findSequence(arr,N,tom,jerry);
  
   if(ind == -1)
       printf("sequence not found\n");
   else
       printf("sequence found at index %d\n",ind);
  

   return 0;
}

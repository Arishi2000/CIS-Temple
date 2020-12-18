/* Author: Abdullah Arishi
- * Date : Sept 14th, 2019
- * Input: number of socks of each color and specifiyng two characters
- * Output: one integer
- * Description: this code will calculate the probability of the two entered characters
*/ 
#include <ctype.h>
#include <stdlib.h>
#include <stdio.h>

void main(void)
{
  int n_r,n_g,n_y,n_o,n_b;
  char c1,c2;
  double prob;

  printf("How many red socks will you put in the drawer\n");
  scanf("%d", &n_r);
  printf("How many green socks will you put into the drawer\n");
  scanf("%d", &n_g);
  printf("How many yellow socks will you put into the drawer\n");
  scanf("%d", &n_y);
  printf("How many orange socks will you put in the drawer\n");
  scanf("%d", &n_o);
  printf("How many blue socks will you put into the drawer\n");
  scanf("%d", &n_b);


  if( ( n_r < 0) || (n_g < 0) || (n_y <0) || (n_o < 0) || (n_b < 0 )) 
  {
        printf("%s\n","*** the numbers  cannot be less than Zero ***\n");
	exit(0);
  }

  printf("Enter two char\n");
  scanf(" %c%c", &c1, &c2);

c1 = tolower(c1);
c2 = tolower(c2);  
  int num1;
  int num2;
 if(c1 == c2)
{
   printf("*** Cannot choose same color ***.\n");
   exit(0);
}
  switch( c1)
  {
	case 'r':
	  num1 = n_r;
	  break;
        case 'g':
	  num1 = n_g;
	  break;
        case 'b':
	  num1 = n_b;
	  break;
        case 'y':
	  num1 = n_y;
	  break;
        case 'o':
	  num1 = n_o;
	  break;
        default:
	  printf("%s\n", "*** Invalid color: the colors should be chosen from the five given colors  ***\n");
	  exit(0);
  }

  switch(c2){
       case 'r':
	 num2 = n_r;
	 break;
       case 'g':
	 num2 = n_g;
	 break;
       case 'b':
	 num2 = n_b;
	 break;
       case 'y':
	 num2 = n_y;
	 break;
        case 'o':
	num2 = n_o;
	break;
        default:
	  printf("%s/n", "*** Invalid color: the colors should be chosen from the five given colors  ***\n");
	  exit(0);

  }

  prob = (double) (num1 + num2) / (n_r + n_g + n_b + n_y + n_o);
  printf("The probability of %c and %c is %lf.\n",c1,c2, prob);
}







/*
 * Name: Dom Arishi
 * Date: November 22, 2020
 * Course: 2107
 * Homework Number: 8 Manual.c
*/
#include <stdio.h>
#include <memory.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

//functions
void * upperLower(const char * s);

int convertStrtoInt(const char *s1, const char *s2, const char *s3, const char *s4);

float convertStrtoFloat(const char *s1, const char *s2, const char *s3, const char *s4);

void compareStr(const char *s1, const char *s2);

void comparePartialStr(const char *s1, const char *s2, int n);

void randomize(void);

int tokenizeTelNum(char *num);

void reverse(char *text);

int countSubstr (char * line, char * sub);


int countChar (char * line, char c);

int countWords(char *string);

void countAlpha(char *string);

void startsWithB(char *string[], int n);

void endsWithed(char *string[], int n);

int main() {

    //random generator
    srand(time(NULL));

    //test for upperLower
    puts("Function upperLower");
    const char test[] = "This iS A Test";
    upperLower(test);

    //test for convertStrtoInt
    puts("\n\nFunction convertStrtoInt");
    printf("The sum of 4 strings is: %d", convertStrtoInt("3", "4", "5", "6"));

    //test for convertStrtoFloat
    puts("\n\nFunction convertStrtoFloat");
    printf("The sum of 4 strings is: %.1f", convertStrtoFloat("3.5", "4.5", "5.5", "6.5"));

    //test for compareStr
    puts("\n\nFunction compareStr");
    compareStr("Test1", "Test2");

    //test for comparePartialStr
    puts("\n\nFunction comparePartialStr");
    comparePartialStr("Test1", "Test2", 4);

    //test for randomize
    puts("\n\nFunction randomize");
    randomize();

    //test for tokenize number
    puts("\n\nFunction tokenize number");
    char str[] = "(267) 436-6281";
    tokenizeTelNum(str);

    //test for reverse
    puts("\n\nFunction reverse number");
    char line[] = "Hello world";
    reverse(line);

    //test for countSubstr
    puts("\n\nFunction countSubstr");
    char *line1 = "helloworldworld";
    char *substring = "world";
    printf("Number of Substrings %s inside %s: %d\n", substring, line1, countSubstr(line1, substring));

    //test for countChar
    puts("\n\nFunction countChar");
    char w = 'w';
    printf("Number of character %c inside %s: %d\n", w, line1, countChar(line1, w));

    //test for countAlpha
    puts("\n\nFunction countAlpha");
    char str1[] = "Hello it's me.";
    countAlpha(str1);

    //test for countWords
    puts("\n\nFunction countWords");
    char countstring[] = "hello world!";
    printf("Number of words in string is: %d\n", countWords(countstring));

    //test for startsWithB
    puts("\n\nFunction startsWithB");
    char *series[] = {"bored", "hello", "Brother", "manual", "bothered"};
    int n = sizeof(series)/sizeof(*series);

    startsWithB(series, n);

    //test for endsWithed
    puts("\n\nFunction endsWithed");
    endsWithed(series, n);
    return 0;

}

// 1.(Displaying Strings in Uppercase and Lowercase)
void * upperLower (const char * s) {
    for (int i = 0; i < strlen(s); i++)
        {
            printf("%c", tolower(s[i]));//tolower gives the lowercase of the argument
        }
        printf("\n");
        for (int i = 0; i < strlen(s); i++)
        {
            printf("%c", toupper(s[i]));//toupper gives the uppercase of the argument
        }
}

// 2.(Converting Strings to Integers for Calculations)
int convertStrtoInt(const char *s1, const char *s2, const char *s3, const char *s4) {
    int a = atoi(s1), b = atoi(s2), c = atoi(s3), d = atoi(s4); // atoi converts the string to int
    int sum = a + b + c + d;
    return sum;

}

//3.(Converting Strings to Floating Point for Calculations)
float convertStrtoFloat(const char *s1, const char *s2, const char *s3, const char *s4) {
 float a = atof(s1), b = atof(s2), c = atof(s3), d = atof(s4);// atof converts the string to float
    float sum = a + b + c + d;
    return sum;  

}

//4.(Comparing Strings)
void compareStr(const char *s1, const char *s2) {
 if (strcmp(s1, s2) == 0) //stcmp compares the second argument to the first argument
        printf("\nStrings are equal\n");
    else if (strcmp(s1, s2) > 0)
        printf("\nStrings %s is > than %s\n", s1, s2);
    else if (strcmp(s1, s2) < 0)
        printf("\nStrings %s is < than %s\n", s1, s2);

}

//5.(Comparing Portions of Strings)
void comparePartialStr(const char *s1, const char *s2, int n) {
if (strncmp(s1, s2, n) == 0)//stcmp compares the second argument to the first argument for n places
        printf("\nComparison of first 4 chars: %s = %s\n", s1, s2);
    else if (strncmp(s1, s2, n) > 0)
        printf("\nStrings %s is > than %s\n", s1, s2);
    else if (strncmp(s1, s2, n) < 0)
        printf("\nStrings %s is < than %s\n", s1, s2);

}

//6.(Random Sentences)
void randomize(void) {
   
char *articles[] = {"the", "a", "one", "some", "any"};
   char *nouns[] = {"boy", "girl", "dog", "town", "car"};
   char *verbs[] = {"drove", "jumped", "ran", "walked", "skipped"};
   char *proposition[] = {"to", "from", "over", "under", "on"};

    int randomIndex;
    char total[100];
    
    for(int i = 0; i< 20; i++){
        
        randomIndex = rand() % 5;
        strcat(total,articles[randomIndex]);
        strcat(total, " ");
        
        randomIndex = rand() % 5;
        strcat(total, nouns[randomIndex]);
        strcat(total, " ");
        
        randomIndex = rand() % 5;
        strcat(total, verbs[randomIndex]);
        strcat(total, " ");
        
        randomIndex = rand() % 5;
        strcat(total, proposition[randomIndex]);
        strcat(total, " ");
        
        randomIndex = rand() % 5;
        strcat(total, articles[randomIndex]);
        strcat(total, " ");
        
        randomIndex = rand() % 5;
        strcat(total, nouns[randomIndex]);

        strcat(total, ".");
        total[0] = total[0] - 32; // first letter should be upper case
        printf("%s ", total);
        strcpy(total, "");
        puts("");
    }
   
}


//7.(Tokenizing Telephone Numbers)
int tokenizeTelNum(char *num) {
   
     int areaCode = 0;
    long phoneNum = 0;
    
    char s[5] = "()- ";
    char *token = strtok(num, s);
    
    while(token != NULL){
        printf("%s ", token);
        token = strtok(NULL, s);
    }
    printf("\n\n\n");
    return areaCode;
    
}

//8.(Displaying a Sentence with Its Words Reversed)
void reverse(char *text) {
char *words[100];
    char *token = strtok(text," \t");
    int num = 0;
    
    while(token != NULL){
        words[num] = token;
        token = strtok(NULL, " \t");
        num++;
    
    }
    
    for(int i= num -1 ;i >=0;i--){
        printf("%s ", words[i]);
    }
    printf("\n\n");
    

}

//9.(Counting the Occurrences of a Substring)
int countSubstr (char * line, char * sub) {
  
    int count = 0;

    const char *tmp = line;

    while(tmp = strstr(tmp,sub)){
        count++;
        tmp++;
    }
    return count;
}

//10.(Counting the Occurrences of a Character)
int countChar (char *line, char c) {
   int i = 0, ans = 0;
    for(i; i < strlen(line); i++)
        if(line[i] == c || line[i] == c - 32)
            ans++;

    return ans;
}


//11.(Counting the Letters of the Alphabet in a String)
void countAlpha(char *string) {
 printf("Occurence of Different Characters in string '%s':\n", string);
    int arr[26] = {0};
    int i = 0;
    for(i; i < strlen(string); i++){
        if(string[i] >= 'A' && string[i] <= 'Z')
            string[i] += 32;
        
        arr[ string[i] - 97]++;
    }

    printf("Character \t Occurence\n");
    for(i = 0; i < 26; i++){
        if(arr[i] > 0)
            printf("   %c \t             %d\n",'a' + i, arr[i]);
    }
}

//12.(Counting the Number of Words in a String)
int countWords(char *string) {
   int i  = 0, ans = 0, flag = 1;

    for(i = 1; i < strlen(string); i++){
        if((string[i] == 32 || string[i] == 13)){
            flag = 1;
            continue;
        }
        if((string[i] != 32 || string[i] != 13) && flag == 1){
            ans++;
            flag = 0;
        }
    }

    return ans;
}

//13.(Strings Starting with "b")

void startsWithB(char *string[], int size) {  
char word[size];  
for(size_t i = 0; i < size; ++i) {    
word[i] = tolower(*string[i]);    
if (word[i] == 'b') { 
printf("(%s)", string[i]);    
}  
}  
puts("");
}

//14.(Strings Ending with "ed")

void endsWithed(char *string[], int size) {
    int ans = 0;
    int i = size;
    while(--i >= 0){
        if(string[i][strlen(string[i]) - 1] == 'd' && string[i][strlen(string[i]) - 2] == 'e')
            ans++;
    }

    printf("Strings Ending with 'ed' are %d\n\n", ans);

}

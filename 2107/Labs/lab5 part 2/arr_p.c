/*
 * Name: Dom Arishi
 * Date: November 1, 2020
 * Course: 2107
 * Homework Number: Arrays of Pointers to Functions
*/

#include <stdio.h>
int students = 0;
int exams = 0;

void printArray(const int grades[][exams], size_t pupils, size_t tests);
void minimum(const int grades[][exams], size_t pupils, size_t tests);
void maximum(const int grades[][exams], size_t pupils, size_t tests);
void average(const int grades[][exams], size_t pupils, size_t tests);

int main(void){
    void(*processGrades[4])(const int grades[][exams], size_t putils, size_t tests) = {printArray, minimum, maximum, average};
    
    printf("%s", "\tHow many students are there? ");
    scanf("%d", &students);
    printf("%s", "\tHow many exams are there? ");
    scanf("%d", &exams);
    puts("");
    
    int tester[students][exams];
    
    for(size_t i = 1; i <= students; i++){
        for(size_t j = 1; j <= exams; j++){
            int grade;
            printf("\tPlease enter student %lu, exam %lu: ", i, j);
            scanf("%d", &grade);
            if(grade < 0 || grade > 100){
                puts("\tEntered number is an invalid grade. Please try again.");
                j--;
            }else{
                tester[i][j] = grade;
            }
        }
        puts("");
    }
    puts("\tEnter a choice:");
    puts("\t0  Print the array of grades");
    puts("\t1  Find the minimum grade");
    puts("\t2  Find the maximum grade");
    puts("\t3  Print the average on all tests for each student");
    puts("\t4  End Program");
    printf("%s", "\n\tchoice: ");
    
    size_t choice;
    scanf("%lu", &choice);
    
    while(choice >= 0 && choice < 4){
        (*processGrades[choice])(tester, students, exams);
        puts("\tEnter a choice:");
        puts("\t0 Print the array of grades");
        puts("\t1 Find the minimum grade");
        puts("\t2 Find the maximum grade");
        puts("\t3 Print the average on all tests for each student");
        puts("\t4 End Program");
        printf("%s", "\n\tchoice: ");
        scanf("%lu", &choice);
    }
    puts("\n\tPROGRAM ENDED\n");
}//end main

void printArray(const int grades[][exams], size_t pupils, size_t tests){
    puts("\nThe array is:");
    
    printf("%s","\t\t");
    for(size_t i = 1; i <= tests; i++){
        printf("    [%lu]", i - 1);
        
    }
    for(size_t i = 1; i <= pupils; i++){
        printf("\nstudentGrades[%lu]    ", i - 1);
        for(size_t j = 1; j <= tests; j++){
            printf("%-7d", grades[i][j]);
        }
    }
    puts("");
    puts("");
}

void minimum(const int grades[][exams], size_t pupils, size_t tests){
    int lowGrade = 100;
    
    for(size_t i = 1; i <= pupils; i++){
        for(size_t j = 1; j <= tests; j++){
            if(grades[i][j] < lowGrade){
                lowGrade = grades[i][j];
            }
        }
    }
    printf("\nLowest grade: %d\n\n", lowGrade);
}

void maximum(const int grades[][exams], size_t pupils, size_t tests){
    int highGrade = 0;
    
    for(size_t i = 1; i <= pupils; i++){
        for(size_t j = 1; j <= tests; j++){
            if(grades[i][j] > highGrade){
                highGrade = grades[i][j];
            }
        }
    }
    printf("\nHighest grade: %d\n\n", highGrade);
    
}

void average(const int grades[][exams], size_t pupils, size_t tests){
    double total = 0.0;
    
    for(size_t i = 1; i <= pupils; i++){
        for(size_t j = 1; j <= tests; j++){
            total += grades[i][j];
        }
        printf("\nAverage of student %lu: %.2f", i, total / tests);
        total = 0;
    }
	puts("");
	puts("");
}

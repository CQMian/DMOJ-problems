    /*Harry Xiang
    Mr. Wong
    Nov. 29, 2021
    This program gives you 3 tries to guess a number beteween 1-100
    */
    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    #include <time.h>

    //Declaration Section
    int num; // randomly generated num  
    int guess;  
    int counter; //number of valid guesses from user
    bool success = false; //guessed correctly or not

    void pauseProgram()
    {
        printf("\nPress any key to continue...");
        getchar();
    }

    //Function Title
    void title(char* programTitle) 
    {
        int len = strlen(programTitle);
        system("cls");      //online ide uses "clear" instead
        printf("\n");
        for (int i = 1; i < 40 - len / 2; i++) printf(" ");
        printf("%s\n", programTitle);
    }

    //User Input
    void userInput()
    {
        title("Random Number");
        printf("\nEnter a number between 1 and 100\n");
        scanf("%d", &guess);
        getchar();
    }

    void randNum(){
        /*The following 2 lines are needed for generating
        different random numbers for each execution.
        Simple "srand()" seed: just use "time()"
        */
        unsigned int iseed = (unsigned int)time(NULL);
        srand(iseed);
        
        num = rand() % 100; //generate a random number from 0 to 99
        num = num + 1;       //num is now a random number from 1 to 100
    }
    //Function displayRand
    void display()
    {
        title("Random Number");
        if(guess > num)
            printf("\nCome down!\n");
        else if(guess < num)
            printf("\nWay down there?\n");
        else{
            printf("\nRight on!");
            success = true;
        }
            
        pauseProgram();
    }

    //goodbye method
    void goodbye(){
        if(success)
            printf("Good Job!");
        else
            printf("Try next time. The answer was %d",num);
        printf("\nThis program was made by Harry Xiang. Thank you for using it!");
    }

    //Main program Title
    int main()
    {
        randNum();
        do
        {
            userInput();
            while(guess<1||guess>100){
                printf("Invalid Input Please Try Again!");
                pauseProgram();
                userInput();

            }
            display();

            if(num == guess||counter==2) //get out of the loop
            {
                break;
            }
            counter++;
        }
        while(1); //this is an infinite loop, as 1 is considered true in C
        goodbye();
    }

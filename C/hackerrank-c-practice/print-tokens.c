#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    //Write your logic to print the tokens of the sentence here.
    
    int flag = 0;
    for (int i = 0; i < strlen(s); i++) {
        if (flag == 1) {
            printf("\n");
        }
        if (*(s + i) == ' '){
            flag = 1;
            continue;
        } 
        printf("%c", *(s + i));
        flag = 0;
    }
    return 0;
}
#include <stdio.h>
#include <math.h>

typedef struct{
    int x;
    int y;  
}Pont;

float pont_tavolsag(Pont A, Pont B){
    int a = B.x - A.x;
    int b = B.y - A.y;

    return sqrt(a*a+b*b);
}

int paros_e(int a){
    if(a % 2 == 0){
        return 1;
    }

    return 0;
}

void print_array(int length, int* array){
    for(int i = 0; i < length; i++){
        printf("%d\n", array[i]);
    }
}

int main(){
    /*
    for(unsigned char i = 32; i <= 127; i++){
        printf("%d %c\n", i, i);
    }
    */

    Pont A;
    A.x = 1;
    A.y = 2;

    Pont B;
    B.x = 6;
    B.y = 5;
    
    printf("%d\n",pont_tavolsag(A,B));
    return 0;
}
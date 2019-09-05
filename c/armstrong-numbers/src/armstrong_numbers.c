#include "armstrong_numbers.h"
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int isArmstrongNumber(int num);
unsigned numDigits(const unsigned n);

unsigned numDigits(const unsigned n) {
            if (n < 10) return 1;
            return 1 + numDigits(n / 10);
        }

int isArmstrongNumber(int num){

	int cen = num/100;
	int dez = (num%100)/10;
	int uni = (num%100)%10;
	int nDigits = numDigits(num);

	return (num == (pow(cen, nDigits) + pow(dez, nDigits)+ pow(uni, nDigits)) ? true : false);
}

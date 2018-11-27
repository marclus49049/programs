#ifndef date
#define date

//Function Declarations
int checkLeapYear(int year);

int checkDate(int day, int month, int year);

int julianDay(int day, int month, int year);

int dayOfWeek(int day, int month, int year);

char* strDayOfWeek(int day, int month, int year);

char* strDate(int day, int month, int year);

char* strBonus(int day, int month, int year);

#endif

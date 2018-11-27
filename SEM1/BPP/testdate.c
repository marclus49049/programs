// Done by Marclus and Ankesh
// 19-10-18

#include <stdio.h>
#include "date.h"
#include <stdlib.h>
#include <string.h>

// Question 1
int checkLeapYear(int year){
  if((year%4==0 && year%100!=0) || (year%400==0)){
    return 1; //if leap year
  } else {
    return 0; //if not leap year
  }
}

// Question 2
int checkDate(int day, int month, int year){
  int yearCnt = 0, maxDay = 31;
  int checkLeap = checkLeapYear(year);
  int month30[4]= {4,6,9,11}; //4
  while(year!=0){
    year = year/10;
    yearCnt++;
  }
  if(yearCnt == 4){
    if(month>=1 && month<=12){
      if (month!=2){
        for(int i=0; i < 4; i++){
          if (month30[i] == month){
            maxDay = 30;
            break;
          }
        }
      }else {
        if( checkLeap == 1){
          maxDay = 29;
        } else {
          maxDay = 28;
        }
      }
      if (day>=1 && day<=maxDay){
        return 1;
      }
    } else {
      return 0;
    }
  }
  return 0;
}

// Question 3
int julianDay(int day,int month,int year){
    int julian = 0, checkleap = checkLeapYear(year);
    int days[12] = {31,0,31,30,31,30,31,31,30,31,30,31};
    switch(month){
        case 12 : julian = julian+31;

        case 11 : julian = julian + 30;


        case 10: julian = julian + 31;


        case 9: julian = julian + 30;

        case 8: julian = julian + 31;

        case 7: julian = julian + 31;

        case 6: julian = julian + 30;

        case 5: julian = julian + 31;

        case 4: julian = julian + 30;

        case 3: julian = julian + 31;

        case 2: if(checkleap == 1){
          julian = julian + 29;
          days[1] = 29;
        } else {
          julian = julian + 28;
          days[1] = 28;
        }

        case 1: julian = julian + 31;

    }
    return julian- (days[month-1]-day);
}

// Question 4
int dayOfWeek(int day, int month, int year){
  int dayWeek = 7, dateCheck = checkDate(day, month, year);
  if(dateCheck == 1){
    dayWeek = (year + (julianDay(day, month, year)) + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400))%7;
  }
  return dayWeek;
}

// Question 5
char* strDayOfWeek(int day, int month, int year)
{
    char *mymessage;
    mymessage = malloc (sizeof (char) * 15);


    switch (dayOfWeek(day, month, year)) {
      case 0:
        strcpy(mymessage, "Saturday");
        break;
      case 1:
        strcpy(mymessage, "Sunday");
        break;
      case 2:
        strcpy(mymessage, "Monday");
        break;
      case 3:
        strcpy(mymessage, "Tuesday");
        break;
      case 4:
        strcpy(mymessage, "Wednesday");
        break;
      case 5:
        strcpy(mymessage, "Thursday");
        break;
      case 6:
        strcpy(mymessage, "Friday");
        break;
      case 7:
        strcpy(mymessage, "Wrong Date");
        break;
    }

    return mymessage;
}

// Question 6
char* strDate(int day, int month, int year){
  int dateCheck = checkDate(day, month, year);
  char *dateAsStr;
  dateAsStr = malloc (sizeof (char) * 9);
  if(dateCheck == 1){
    if((month>=1 && month<=9) && (day>=1 && day<=9) ){
      sprintf(dateAsStr,"0%d-0%d-%d", day, month, (year%100));
    }else if(day>=1 && day<=9){
      sprintf(dateAsStr,"0%d-%d-%d", day, month, (year%100));
    }else if(month>=1 && month<=9){
      sprintf(dateAsStr,"%d-0%d-%d", day, month, (year%100));
    } else {
      sprintf(dateAsStr,"%d-%d-%d", day, month, (year%100));
    }


  } else {
    strcpy(dateAsStr, "Wrong Date my dude");
  }
  return dateAsStr;
}

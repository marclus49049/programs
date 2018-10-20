// Done by Marclus and Ankesh
// 19-10-18

#include "date.h"
#include <stdio.h>

int main(){
  int year,month, day, checkLeap;
  printf("Enter Year: ");
  scanf("%d", &year);
  printf("Enter Month: ");
  scanf("%d", &month);
  printf("Enter Day: ");
  scanf("%d", &day);
  checkLeap = checkLeapYear(year);

  if (checkLeap == 1){
    printf("%d is a leap year\n", year);
  } else {
    printf("%d is not  a leap year\n", year);
  }

  if(checkDate(day, month, year) == 1){
    printf("TRUE\n");
    printf("%d Julian Day\n",julianDay(day,month,year));
  } else {
    printf("FALSE\n" );
  }
  printf("%s\n",strDayOfWeek(day, month, year));

  printf("date: %s\n",strDate(day, month, year));

  return 0;
}

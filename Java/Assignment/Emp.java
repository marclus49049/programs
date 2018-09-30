//import statements

class Emp{
  int empID, empSal;
  String empName;
  Emp(){

  }
  Emp(int empID, int empSal, String empName){
    this.empName = empName;
    this.empSal = empSal;
    this.empID = empID;
  }

  void printDetails() {
    System.out.print("\nEmp ID: "+this.empID+" Name: "+this.empName+" Sal: "+this.empSal);
  }
}

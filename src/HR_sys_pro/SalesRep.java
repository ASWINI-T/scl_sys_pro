package HR_sys_pro;

//SalesRep class inheriting from Employee
class SalesRep extends Employee {
double salesMade;

// Constructor
public SalesRep(String firstName, String lastName, int registration, int age,
               int daysWorked, int vacationDaysTaken, double salary, int yearsWorked,
               String username, String password, double salesMade) {
   super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken,
           salary, yearsWorked, username, password);
   this.salesMade = salesMade;
}

@Override
public int calculateBonus() {
   return (int) (super.calculateBonus() + calculateCommission());
}

public int calculateCommission() {
   return (int) (0.1 * salesMade);
}

// Add this method to SalesRep
public int getRegistration() {
   return super.registration;
}

public double getSalesMade() {
   return salesMade;
}
}

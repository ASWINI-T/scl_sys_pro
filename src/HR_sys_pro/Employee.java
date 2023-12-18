package HR_sys_pro;

//Employee class implementing the User interface
class Employee implements User {
String firstName;
String lastName;
int registration;
int age;
int daysWorked;
int vacationDaysTaken;
double salary;
int yearsWorked;
private String username;
private String password;

// Constructor
public Employee(String firstName, String lastName, int registration, int age,
               int daysWorked, int vacationDaysTaken, double salary, int yearsWorked,
               String username, String password) {
   this.firstName = firstName;
   this.lastName = lastName;
   this.registration = registration;
   this.age = age;
   this.daysWorked = daysWorked;
   this.vacationDaysTaken = vacationDaysTaken;
   this.salary = salary;
   this.yearsWorked = yearsWorked;
   this.username = username;
   this.password = password;
}

// Getters for User interface
public String getUsername() {
   return username;
}

public String getPassword() {
   return password;
}

// Login method from User interface
public String login(String inputUsername, String inputPassword) {
   if(username.equals(inputUsername) && password.equals(inputPassword)) {
  	 return "Login successful" ;
   } else {
       return "Invalid login credentials for user ";
   }
}

public int timeToRetirement() {
   return Math.min(60 - age, 40 - yearsWorked);
}

public int vacationTimeLeft() {
   return (int) ((daysWorked / 360) * (30 - vacationDaysTaken));
}

public int calculateBonus() {
   return (int) (2.2 * salary);
}
}

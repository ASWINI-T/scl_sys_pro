package HR_sys_pro;

//SalesManager.java
import java.util.HashMap;
import java.util.Map;

public class SalesManager extends Employee {
Map<Integer, SalesRep> salesTeam;

// Constructor
public SalesManager(String firstName, String lastName, int registration, int age,
                   int daysWorked, int vacationDaysTaken, double salary, int yearsWorked,
                   String username, String password) {
   super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken,
           salary, yearsWorked, username, password);
   this.salesTeam = new HashMap<>();
}

public void addSalesRep(SalesRep salesRep) {
   salesTeam.put(salesRep.getRegistration(), salesRep);
}

@Override
public int calculateBonus() {
   return (int) (super.calculateBonus() + calculateCommission());
}

public double calculateCommission() {
   double totalSales = salesTeam.values().stream().mapToDouble(SalesRep::getSalesMade).sum();
   return 0.03 * totalSales;
}
}

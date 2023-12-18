package HR_sys_pro;

public class HRSystem {
    public static void main(String[] args) {
        // Create employees and sales reps
        Employee employee = new Employee("Aswini", "T", 1, 30, 2500, 13, 70000, 5, "Aswini_T", "aswini21");
        SalesRep salesRep = new SalesRep("Ruba", "Thandavan", 2, 35, 3000, 15, 90000, 10, "Ruba21", "AsAmma", 100000);

        // Create sales manager
        SalesManager salesManager = new SalesManager("Jaswanth", "kutty", 3, 28, 1500, 10, 50000, 3, "Jash123", "littleBoy");

        // Add sales rep to sales manager's team
        salesManager.addSalesRep(salesRep);

        // Test login functionality
        System.out.println("Employee login: " + employee.login("Aswini_T", "aswini21")); 
        System.out.println("Employee Bonus: $" + employee.calculateBonus());
        System.out.println("Time To Retirement :" + employee.timeToRetirement()); 
        System.out.println("Vacation time Left :" + employee.vacationTimeLeft() +"\n");
        
       
        System.out.println("SalesRep login: " + salesRep.login("Ruba21", "AsAmma")); 
        System.out.println("SalesRep Bonus: $" + salesRep.calculateBonus());
        System.out.println("Time To Retirement :" + salesRep.timeToRetirement());
        System.out.println("Commision :" + salesRep.calculateCommission());
        System.out.println("Vacation time Left :" + salesRep.vacationTimeLeft() +"\n");
        
        System.out.println("SalesManager login: " + salesManager.login("Jaswanth", "littleboy"));
        System.out.println("SalesManager Bonus: $" + salesManager.calculateBonus());
        System.out.println("Time To Retirement :" + salesManager.timeToRetirement());
        System.out.println("Commision :" + salesManager.calculateCommission());
        System.out.println("Vacation time Left :" +salesManager.vacationTimeLeft() +"\n");
        
        
    }
}
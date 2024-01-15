public class SalaryManager {
    public static void main(String args[]){
        SalaryManager sample=new SalaryManager();
        System.out.println("Real monthly salary is "+sample.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary){
        double monthlySalary=yearlySalary/12.0;
        
        double tax=calculateTax(monthlySalary);
        double nationalPension=calculateNationalPension(monthlySalary);
        double healthInsurance=calculateHealthInsurance(monthlySalary);
        double totalTax=tax+nationalPension+healthInsurance;

        System.out.println("Tax per month : "+tax);
        System.out.println("National Pension per month : "+nationalPension);
        System.out.println("Health Insurnace per month : "+healthInsurance);

        monthlySalary -= totalTax;

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary){
        double tax=monthlySalary*0.125;
        return tax;
    }

    public double calculateNationalPension(double monthSalary){
        double nationalPension=monthSalary*0.081;
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary){
        double healthInsurance=monthSalary*0.135;
        return healthInsurance;
    }
}

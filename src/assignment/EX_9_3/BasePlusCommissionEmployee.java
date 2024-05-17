package EX_9_3;

public class BasePlusCommissionEmployee {
   private double baseSalary; // base salary per week

   private CommissionEmployee ce;

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName,
         String socialSecurityNumber, double grossSales,
         double commissionRate, double baseSalary) {
      this.ce = new CommissionEmployee(firstName, lastName, socialSecurityNumber,
            grossSales, commissionRate);

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   // calculate earnings
   public double earnings() {
      return getBaseSalary() + ce.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
            super.toString(), "base salary", getBaseSalary());
   }

   public String getFirstName() {
      return ce.getFirstName();
   }

   public String getLastName() {
      return ce.getLastName();
   }

   public String getSocialSecurityNumber() {
      return ce.getSocialSecurityNumber();
   }

   public void setGrossSales(double grossSales) {
      ce.setGrossSales(grossSales);
   }

   public void setCommissionRate(double commissionRate) {
      ce.setCommissionRate(commissionRate);
   }

   public double getGrossSales() {
      return ce.getGrossSales();
   }

   public double getCommissionRate() {
      return ce.getCommissionRate();
   }

}
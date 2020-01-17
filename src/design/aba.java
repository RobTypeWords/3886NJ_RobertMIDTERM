package design;

public abstract class aba implements Employee {

    final String noobie = "Jimmy";
    static int RatePerformance;

            // Abstract Method

    public abstract void welcome();

    // Implementation of methods  from Employee Interface


    public void assignDepartment(String noobie) {
        System.out.println(noobie);
    }

    public void benefitLayout(String noobie) {
        System.out.println(noobie +", we will offer great benefits" );
    }


}



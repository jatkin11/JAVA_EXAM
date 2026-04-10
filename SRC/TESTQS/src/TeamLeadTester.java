public class TeamLeadTester {

    static void main() {
        TeamLead lead1 = new TeamLead("Aaron");
        Employee emp1 = new Employee("John", "Tester");
        Employee emp2 = new Employee("Alice", "Analyst");

        lead1.addReport(emp1);
        lead1.addReport(emp2);

        System.out.println(lead1.toString());

    }

}

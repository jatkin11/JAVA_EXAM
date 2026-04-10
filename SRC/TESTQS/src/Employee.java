public class Employee {
    private String name, job;

    public Employee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public String getJob() {
        return this.job;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.job;
    }
}
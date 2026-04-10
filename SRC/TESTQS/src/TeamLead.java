import java.util.ArrayList;
import java.util.List;

public class TeamLead extends Employee{

    private final List<Employee> reports = new ArrayList<>();


    public TeamLead(String name) {
        super(name,"TeamLead");
    }

    public void addReport(Employee e){
        reports.add(e);
    }
    public boolean hasReport(Employee e)
    {
        return reports.contains(e);
    }

    @Override
    public String toString() {
        return getName() + ", " +getJob() + " with reports: " + getReportNames();
    }

    private String getReportNames(){
        StringBuilder sb = new StringBuilder();
        int reportsSize = this.reports.size();
        for(Employee e: reports)
        {
            sb.append(e.getName());
            reportsSize--;
            if(reportsSize > 0)
            {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}

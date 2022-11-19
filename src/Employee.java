import java.util.Comparator;

class Employee implements Comparable<Employee>{
    private int empid;
    private String empname;
    private double empsalary;
    private Address empaddr;

    Employee(){
        super();
    }
    
    public Employee(int eid, String ename, double esal, Address eadd){
        super();
        this.empid = eid;
        this.empname = ename;
        this.empsalary = esal;
        this.empaddr = eadd;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(double empsalary) {
        this.empsalary = empsalary;
    }

    public Address getEmpaddr() {
        return empaddr;
    }

    public void setEmpaddr(Address empaddr) {
        this.empaddr = empaddr;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddr=" + empaddr
                + "]";
    }

    @Override
    public int compareTo(Employee e) {
        return (int)(this.getEmpsalary() - e.getEmpsalary());
    }

}

class NameSort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpname().compareTo(o2.getEmpname());
    }
    
}

class IdSort implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpid() > o2.getEmpid()){
            return 1;
        }
        if(o1.getEmpid() < o2.getEmpid()){
            return -1;
        }
        return 0;
    }

}
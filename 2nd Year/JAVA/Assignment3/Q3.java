
    class Employee {
        String empName;
        int empNo;
        double basicSal;
        double da;
        double hra;
        double grossSal;
    
        Employee(String name, int no, double basic) {
            empName = name;
            empNo = no;
            basicSal = basic;
            da = basicSal * 0.3;
            hra = basicSal * 0.2;
            grossSal = basicSal + da + hra;
        }
    
        void calGrossSal() {
            grossSal = basicSal + da + hra;
        }
    
        void showEmpDetails() {
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Number: " + empNo);
            System.out.println("Basic Salary: " + basicSal);
            System.out.println("DA: " + da);
            System.out.println("HRA: " + hra);
            System.out.println("Gross Salary: " + grossSal);
        }
    }
    
    public class Q3 {
        public static void main(String[] args) {
            Employee emp1 = new Employee("John", 101, 5000);
            Employee emp2 = new Employee("Sam", 102, 6000);
    
            emp1.showEmpDetails();
            System.out.println();
            emp2.showEmpDetails();
        }
    }

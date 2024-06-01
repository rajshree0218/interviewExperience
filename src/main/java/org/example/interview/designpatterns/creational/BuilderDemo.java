package org.example.interview.designpatterns.creational;

//https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns

public class BuilderDemo {

    public static void main(String[] args) {
        Employee emp = Employee.builder().setId(1).setName("rajshree").build();
        System.out.println(emp.getId()+" : "+emp.getName());
        EmployeeChild obj = EmployeeChild.builder().setId(2).setName("rajshree").setEmail("csfs").setComments("fsfs").build();
        System.out.println(obj.getId()+" : "+obj.getName()+" : "+obj.getEmail()+" : "+obj.getComments());
    }

}

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected Employee (EmployeeBuilder employeeBuilder){
        this.id = employeeBuilder.id;
        this.name = employeeBuilder.name;
    }

    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }
    public static class EmployeeBuilder{
        protected int id;
        protected String name;

        public EmployeeBuilder(){

        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}

class EmployeeChild extends Employee {
    private String email;
    private String comments;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    private EmployeeChild(EmployeeChildBuilder builder){
        super(builder);
        this.email = builder.email;
        this.comments = builder.comments;
    }

    public static EmployeeChildBuilder builder(){
        return new EmployeeChildBuilder();
    }

    public static class EmployeeChildBuilder extends EmployeeBuilder{
        protected String email;
        protected String comments;

        private EmployeeChildBuilder(){
        }

        @Override
        public EmployeeChildBuilder setId(int id) {
            this.id = id;
            return this;
        }

        @Override
        public EmployeeChildBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeChildBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public EmployeeChildBuilder setComments(String comments) {
            this.comments = comments;
            return this;
        }

        public EmployeeChild build(){
            return new EmployeeChild(this);
        }
    }
}

//@Data
//@SuperBuilder
//class Employee{
//    private int id;
//    private String name;
//
//
//}
//@Data
//@SuperBuilder
//class EmployeeChild extends Employee{
//    private String email;
//    private String comments;
//}
//class Test{
//    public static void main(String[] args) {
//        EmployeeChild obj = EmployeeChild.builder().id(3).name("sfs").email("set").comments("").build();
//
//    }
//}


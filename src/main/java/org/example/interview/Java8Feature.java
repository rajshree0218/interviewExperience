package org.example.interview;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;


// https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

// https://javaconceptoftheday.com/java-interview-questions-and-answers/
public class Java8Feature {

    public static void main1(String[] args){
//        int Integer = 24;
//        char String  = 'I';
//        System.out.print(Integer);
//        System.out.print(String);

        //below will give compile time error
//        short x = 10;
//        x =  x * 5;
//        System.out.print(x);

        //Range of byte data in java is -128 to 127. But the byte data type in java is cyclic in nature.
        // ans: -127
//        byte x = 127;
//        x++;
//        x++;
//        System.out.print(x);

        //o/p : 120 200 14
        // 016 is an octal number, its equivalent decimal number is 14. Hence answer is B.
//        int[]  x = {120, 200, 016};
//        for(int i = 0; i < x.length; i++){
//            System.out.print(x[i] + " ");
//        }

        // When an array is passed to a method, a reference of the array is received by the method.

        // O/p:
        // a.length = 5
//                     A[0] = a[(0 + 3) % 5] = a[3] = 1
//                     So, a[0] =  a[3] = 1
//                     A[1] = a[(2 + 3) % 5] = a[0] = 1
        //             Therefore, a[1] = 1;
//        int[] A = {0,2,4,1,3};
//        for(int i = 0; i < A.length; i++){
//            A[i] = A[(A[i] + 3) % A.length];
//            System.out.println(A[i]);
//        }

        //Arrays are objects in java. It is a container that holds a fixed number of items of a single type.

        // The object created with new keyword during run-time.

        // A package is a collection of classes and interfaces.

//        Identify the correct restriction on static methods.
//
//        They must access only static data
//        They can only call other static methods.
//        They cannot refer to this or super.
        // Static methods must only access static data and can call other static methods. Moreover they cannot refer this or super.

        // Static keyword makes a variable belong to a class,rather than being defined for each instance of the class.


        //o/p : Only solution class can directly access and change the value of the variable res.
        // Identify what can directly access and change the value of the variable res.
//        package com.mypackage;
//        public class Solution{
//            private int res = 100;
//        }

        //toString() is defined in java.lang.Object.

        // compareTo() returns an int value

        // str.substring(start, end) returns the string from s[start] till s[end - 1]
        // o/p: bc
//        String str = "abcde";
//        System.out.println(str.substring(1, 3));

        //o/p: -1
        // Since, t isn’t present in the string str, it returns -1.
//        String str = "Hellow";
//        System.out.println(str.indexOf('t'));

        // o/p: onetwo
//        String str1 = "one";
//        String str2 = "two";
//        System.out.println(str1.concat(str2));

        //o/p: Intsrviswbit
        // replace() replaces all the occurrences of the oldcharacter by the newcharacter.
//        String str1 = "Interviewbit".replace('e’,’s’);

        //o/p: 3
        // Using the new keyword creates an object everytime. Hence, 2 objects are created for first two statement. Next, a string is declared which creates another object. For the fourth statement, since, a string ”Interviewbit” already exists, it doesn’t create an additional object again. Hence, answer is 3.
//        How many objects will be created in the following?
//        String a = new String("Interviewbit");
//        String b = new String("Interviewbit");
//        String c = "Interviewbit";
//        String d = "Interviewbit";

        // String class has 13 constructors.

        //  It shows compile error as ++a is not valid identifier.
//        int ++a = 100;
//        System.out.println(++a);

        //o/p : TRUE
        // Since, LHS matches RHS, hence the output is TRUE.
//        if(1 + 1 + 1 + 1 + 1 == 5){
//            System.out.print("TRUE");
//        }
//        else{
//            System.out.print("FALSE");
//        }

        // Explanation - x* = 3 + 7 is equivalent to x * (3 + 7) = x * 10. Therefore, x = 50.
        //o/p : 50
//        Int x = 5;
//        x * = (3 + 7);
//        System.out.println(x);

        //floor returns largest integer that is less than or equal to the given number.
        // 3.0
        // Output of Math.floor(3.6)?

        //Where does the system stores parameters and local variables whenever a method is invoked?
        // The system stores parameters and local variables in a stack.

        // Static cannot be used for constructor.

        // What is the variables declared in a class for the use of all methods of the class called?
        //It is know as instance variable.

        //What is the implicit return type of constructor?
        //Implicit return type of constructor is the class object in which it is defined.

//        Int i;
//        for(i = 1; i < 6; i++){
//            if(i > 3) continue;
//        }
//        System.out.println(i);

        // identify infinite loop
        // for(::)
        //for(int i=0;i<1;i--)
        //for(int i=0;;i++)
        //o/p : all of the above

        // >>>> is Zero fill right shift.

        // JDB is used to find and fix bugs in the program.

        //
//        TreeSet t = new TreeSet();
//        t.add(new StringBuffer("A"));
//        t.add(new StringBuffer("B"));
//        t.add(new StringBuffer("T"));
//        t.add(new StringBuffer("Z"));
//        System.out.println(t);

        Runnable r = new Runnable() {
            public void run() {
                System.out.print("Cat");
            }
        };
        Thread t = new Thread(r) {
            public void run() {
                System.out.print("Dog");
            }
        };
        t.start();


    }
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        HashMap<String, String> map = new HashMap<>();


        List<Integer> list = Arrays.asList(5,9,14);
        list.stream()
                .map(num->  CompletableFuture.supplyAsync(()-> num*num))
                .map(CompletableFuture -> CompletableFuture.thenApply(n-> n*n))
                .map(CompletableFuture::join)
                .forEach(s->System.out.println(":: "+s));


        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        System.out.println("Sorted by name:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - " + emp.getSalary());
        }

        // Sort by salary using traditional Comparator
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        System.out.println("\nSorted by salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - " + emp.getSalary());
        }

        // real time query on Employee list
        //Query 3.1 : How many male and female employees are there in the organization?
        //For queries such as above where you need to group the input elements, use the Collectors.groupingBy() method. In this query, we use Collectors.groupingBy() method which takes two arguments. We pass Employee::getGender as first argument which groups the input elements based on gender and Collectors.counting() as second argument which counts the number of entries in each group.
        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("num of male and female employees : " + noOfMaleAndFemaleEmployees);

        // Query 3.2 : Print the name of all departments in the organization?
        //
        //Use distinct() method after calling map(Employee::getDepartment) on the stream. It will return unique departments.
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);


        // Query 3.3 : What is the average age of male and female employees?
        //
        //Use same method as query 3.1 but pass Collectors.averagingInt(Employee::getAge) as the second argument to Collectors.groupingBy().
        Map<String, Double> avgAgeOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployee);



        //Query 3.4 : Get the details of highest paid employee in the organization?
        //
        //Use Collectors.maxBy() method which returns maximum element wrapped in an Optional object based on supplied Comparator.
         Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Optional<Employee> highestPaidEmployeeWrapper2 = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(highestPaidEmployeeWrapper.get() + " : both result should be same : " + highestPaidEmployeeWrapper2.get());

        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : " + highestPaidEmployee.getId());
        System.out.println("Name : " + highestPaidEmployee.getName());
        System.out.println("Age : " + highestPaidEmployee.getAge());
        System.out.println("Gender : " + highestPaidEmployee.getGender());
        System.out.println("Department : " + highestPaidEmployee.getDepartment());
        System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());
        System.out.println("Salary : " + highestPaidEmployee.getSalary());



        //Query 3.5 : Get the names of all employees who have joined after 2015?
        //
        //For such queries which require filtering of input elements, use Stream.filter() method which filters input elements according to supplied Predicate.
        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);


        // Query 3.6 : Count the number of employees in each department?
        //
        //This query is same as query 3.1 but here we are grouping the elements by department.
        Map<String, Long> employeeCountByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
        for (Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        // Query 3.7 : What is the average salary of each department?
        //
        //Use the same method as in the above query 3.6, but here pass Collectors.averagingDouble(Employee::getSalary) as second argument to Collectors.groupingBy() method.
        Map<String, Double> avgSalaryOfDepartments =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
        for (Map.Entry<String, Double> entry : avgSalaryOfDepartments.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        // Query 3.8 : Get the details of youngest male employee in the product development department?
        // For this query, use Stream.filter() method to filter male employees in product development department and to find youngest among them, use Stream.min() method.
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =
                employeeList.stream()
                        .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                        .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");
        System.out.println("----------------------------------------------");
        System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());
        System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());
        System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());
        System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
        System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());


        // Query 3.9 : Who has the most working experience in the organization?
        // For this query, sort employeeList by yearOfJoining in natural order and first employee will have most working experience in the organization. To solve this query, we will be using sorted() and findFirst() methods of Stream.
        Optional<Employee> seniorMostEmployeeWrapper =
                employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("ID : " + seniorMostEmployee.getId());
        System.out.println("Name : " + seniorMostEmployee.getName());
        System.out.println("Age : " + seniorMostEmployee.getAge());
        System.out.println("Gender : " + seniorMostEmployee.getGender());
        System.out.println("Age : " + seniorMostEmployee.getDepartment());
        System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());
        System.out.println("Salary : " + seniorMostEmployee.getSalary());


        // Query 3.10 : How many male and female employees are there in the sales and marketing team?
        //This query is same as query 3.1, but here use filter() method to filter sales and marketing employees.
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
                employeeList.stream()
                        .filter(e -> e.getDepartment()=="Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countMaleFemaleEmployeesInSalesMarketing);


        //Query 3.11 : What is the average salary of male and female employees?
        //This query is same as query 3.3 where you have found average age of male and female employees. Here, we will be finding average salary of male and female employees.
        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);


        // Query 3.12 : List down the names of all employees in each department?
        //For this query, we will be using Collectors.groupingBy() method by passing Employee::getDepartment as an argument.
        Map<String, List<Employee>> employeeListByDepartment=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet3 = employeeListByDepartment.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entrySet3)
        {
            System.out.println("--------------------------------------");
            System.out.println("Employees In "+entry.getKey() + " : ");
            System.out.println("--------------------------------------");

            List<Employee> list1 = entry.getValue();

            for (Employee e : list1)
            {
                System.out.println(e.getName());
            }
        }


        // Query 3.13 : What is the average salary and total salary of the whole organization?
        //For this query, we use Collectors.summarizingDouble() on Employee::getSalary which will return statistics of the employee salary like max, min, average and total.
        DoubleSummaryStatistics employeeSalaryStatistics=
                employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());


        // Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        //
        //For this query, we will be using Collectors.partitioningBy() method which separates input elements based on supplied Predicate.
        Map<Boolean, List<Employee>> partitionEmployeesByAge=
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet4 = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet4)
        {
            System.out.println("----------------------------");
            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }
            System.out.println("----------------------------");

            List<Employee> list2 = entry.getValue();

            for (Employee e : list2)
            {
                System.out.println(e.getName());
            }
        }


        // Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();

        System.out.println("Name : "+oldestEmployee.getName());
        System.out.println("Age : "+oldestEmployee.getAge());
        System.out.println("Department : "+oldestEmployee.getDepartment());


        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparingInt(Employee::getAge))
                .collect(Collectors.toList()).forEach(System.out::println);


        List<EmployeeA> list22 = new ArrayList<>();
        list22.add(new EmployeeA(01, "Rajshree"));
        list22.add(new EmployeeA(02, "Shree"));
        list22.add(new EmployeeA(03, "ABC"));
        list22.add(new EmployeeA(01, "TEST"));

        Map<Integer, EmployeeA> collect =
                list22.stream().collect(Collectors.toMap(e -> e.getId(), e -> e, (a, b) -> a));
                collect.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue().getName()));

        Map<Integer, EmployeeA> employeeAMap = list22.stream()
                .collect(Collectors.toMap(EmployeeA::getId, e -> e, (existing, replacement) -> existing));

        employeeAMap.forEach((id, employee) -> System.out.println(id + ": " + employee));

        list22.stream()
                .collect(Collectors.toMap(EmployeeA::getId, e -> e, (existing, replacement) -> replacement))
                .forEach((id, employee) -> System.out.println(id + ": " + employee));


        // Q : Given a map of employee->manager.
        //emp -> manager
        //A -> B
        //C-> B
        //B-> D
        //E -> F
        //
        //Wrtie code to get below map
        //manager -> emp
        //B-> A,C
        //D->B
        //F -> E

        Map<String, String> employeeToManager = new HashMap<>();
        employeeToManager.put("A", "B");
        employeeToManager.put("C", "B");
        employeeToManager.put("B", "D");
        employeeToManager.put("E", "F");

        Map<String, List<String>> managerToEmployee = new HashMap<>();

        employeeToManager.forEach((employee, manager) ->
                managerToEmployee.computeIfAbsent(manager, key -> new ArrayList<>()).add(employee));

        managerToEmployee.forEach((manager, employees) ->
                System.out.println(manager + " -> " + String.join(",", employees)));


    }
}
class EmployeeA {
    private int id;
    private String name;

    public EmployeeA(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmployeeA{id=" + id + ", name='" + name + '\'' + '}';
    }
}

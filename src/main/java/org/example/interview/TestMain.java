package org.example.interview;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TestA{
    public void test(String str){
        System.out.println("String Version");
    }

    public void test(int sb){
        System.out.println("parent Version");
    }
}

public class TestMain extends TestA{

    public void test(int number){
        System.out.println("Builder Version");
    }

    public void print(){
        TestMain ob = new TestMain();
        ob.test("test");
        TestA ob1 = new TestMain();
        ob1.test(2);
    }

    public static void main (String[] args) {

        int[] arr ={5,9,1,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        EmployeeData[] emp = new EmployeeData[4];
        emp[0] = new EmployeeData(10, "Ram");
        emp[1] = new EmployeeData(20, "Shyam");
        emp[2] = new EmployeeData(80, "Test2");
        emp[3] = new EmployeeData(6, "Test3");

        Arrays.sort(emp); // using Comparable
        Arrays.sort(emp, EmployeeData.NameComparator); // using Comparator
        System.out.println("default sorting of employee array "+Arrays.toString(emp));


//        TestMain ob = new TestMain();
//        ob.test("test");
//        TestA ob1 = new TestMain();
//        ob1.test(2);



//        int[] n1 = new int[0];
//        boolean[] n2 = new boolean[-200];
//        double[] n3 = new double[2241423798];
//        double[] n3 = new double[-(2147483647)];
//        char[] ch = new char[20];

//        runtest();
//        stringTest();


        // to reverse the string
        String reverse = Stream.of("test")
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());

        //remove a given value from array list having string values;
        List<String> list = new ArrayList<>();
        list.add("Rajshree");
        list.add("Jayshree");
        list.add("Mudit");
        list.add("Jay");

        System.out.println(list.toString());
        list.remove(2);
        list.remove("Jay");
        System.out.println(list.toString());

        // write a method to return maximum value from an integer array passed as an input parameter in java
        int array[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(array)
                .max()
                .getAsInt();
        System.out.println(max);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(200);
        list1.add(120);
        list1.add(5);
        int max2 = Collections.max(list1);
        System.out.println(max2);


        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);

        LinkedList<Integer> ll1 = new LinkedList<>();
        ls.descendingIterator().forEachRemaining(ll1::add);




        List<String> list3 = Arrays.asList("a", "b", "c", "def", "g", "h");
        List<String> ab = list3.stream().map(obj -> {
            if(obj.length()>1){
                char[] chars = obj.toCharArray();
                int length = chars.length;
                for(int i=0; i<length/2;i++){
                    char temp = chars[i];
                    chars[i]  =  chars[length-1-i];
                    chars[length-1-i] = temp;
                }
                return new String(chars);
            }
            return obj;
        }).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        Collections.sort(list3, (s1,s2)->Integer.compare(list3.indexOf(s2), list3.indexOf(s1)));
        List<String> news = list3.stream().sorted((s1,s2)->Integer.compare(list3.indexOf(s2), list3.indexOf(s1)))
                .collect(Collectors.toList());
        System.out.println(news);
        System.out.println(ab);

        int number = 153;
        int temp;
        int total = 0;
        int num = number ;
        for(; num!=10; num/=10){
            temp = num%10;
            total = total + temp * temp* temp;
        }









    }

    public static void sqlQueries(){
        String highestSalary = "select max(salary) from Employee";
        String secHighestSalary = "select max(salary) from Employee where salary < (select max(salary) from Employee)";
        String thirdHighestSalary = "select max(salary) from Employee " +
                                                "where salary < (select max(salary) from Employee" +
                                                                    " where salary < (select max(salary) from Employee))";

        //another way to do. which is best.
        String highestSalary2 = "SELECT salary FROM Employee ORDER BY salary DESC LIMIT 0,1";
        String secHighestSalary2 = "SELECT salary FROM Employee ORDER BY salary DESC LIMIT 1,1";
        String thirdHighestSalary2 = "SELECT salary FROM Employee ORDER BY salary DESC LIMIT 2,1";
        // 0 is starting index, and 1 is no. of rows to be fetched.
    }

    public static void stringTest(){
        String originalString = "decode";
        String tobeChecked = "codede";
        System.out.println(checkForRotation(originalString, tobeChecked));
        int rotationCharacter = 2;
        System.out.println(leftRotate(originalString, rotationCharacter));
        System.out.println(rightRotate(originalString, rotationCharacter));
    }

    private static String rightRotate(String originalString, int r) {
        //decode - //dedeco
        int partition = originalString.length() - r;
        String rotatedString = originalString.substring(partition) + originalString.substring(0,partition);
        return rotatedString;
    }

    private static String leftRotate(String originalString,  int r) {
        // decode - //codede
        String rotatedString = originalString.substring(r) + originalString.substring(0,r);
        return rotatedString;
    }

    private static boolean checkForRotation(String originalString, String tobeChecked) {
        String concatenatedString = originalString + originalString;
        return concatenatedString.contains(tobeChecked);
    }

    public static void runtest()  {
        Parent a=new Child();
        try {
            a.foo();
        } catch (Exception e){

        }
    }
}


class Parent {
    void foo() throws RuntimeException {
        System.out.println("foo with exception");
//        throw new Exception();
    }

}
class Child extends Parent {
        void foo() throws ArithmeticException{
            int x=0;
            System.out.println("child "+x++);
        }
}

class MainTestt{

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1,3};
        int[] nums2 = {2,2,3,2};
//        int[] out = [2,3] (intersection)

        Set<Integer> set = new HashSet<>();
        for(int num : nums2){
            set.add(num);
        }
        int[] arr = Arrays.stream(nums1).filter(set::contains).distinct().toArray();
        System.out.println(Arrays.toString(arr));

        String lines[] = new String[] {
                "10.0.0.1 - log entry 1 11",
                "10.0.0.3 - log entry 1 11",
                "10.0.0.3 - log entry 1 11",
                "10.0.0.2 - log entry 2 213",
                "10.0.0.2 - log entry 2 213",
                "10.0.0.2 - log entry 133132" };

        String[] res=new String[lines.length];
        int i=0;
        for(String str: lines){
            res[i]=str.substring(0,8);
            i++;

        }

        String result=Arrays.stream(res)
                .collect(Collectors.groupingBy(a->a,Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()!=1)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(result);

        Optional<Map.Entry<String, Long>> value = Arrays.stream(lines).map(s -> s.split("[-]")).map(e -> e[0])
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        

        System.out.println(value.get().getKey());

        Stream<Map.Entry<String, Long>> stream = Arrays.stream(lines).map(s -> s.split("[-]")).map(e -> e[0])
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream();
    }
}



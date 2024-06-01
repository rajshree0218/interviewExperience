package org.example.interview;

import java.util.Comparator;

public class EmployeeData implements Comparable<EmployeeData>{
    int id;
    String name;
    public EmployeeData(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name;
    }

    public boolean equals(Object o){
        if(o==this) return true;

        if(o==null || getClass() != o.getClass()) return false;

        EmployeeData emp = (EmployeeData) o;
        return (this.getId() == emp.getId());

    }

    public int hashCode(){
        return getId();
    }

    @Override
    public int compareTo(EmployeeData o) {
        return this.id - o.id;
    }

    //this is annonymous class
    public static Comparator<EmployeeData> NameComparator = new Comparator<EmployeeData>() {
        @Override
        public int compare(EmployeeData o1, EmployeeData o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}

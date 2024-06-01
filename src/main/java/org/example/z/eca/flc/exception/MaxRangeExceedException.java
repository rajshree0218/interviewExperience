package org.example.z.eca.flc.exception;

public class MaxRangeExceedException extends Exception{
    private int details;
    public MaxRangeExceedException(int details){
        this.details = details;
    }

    @Override
    public String toString(){
        return "MaxRangeExceed["+details+"]";
    }

}

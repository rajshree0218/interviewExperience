package org.example.z.eca.flc.exception;

public class MinRangeExceedException extends Exception{
    private int details;
    public MinRangeExceedException(int details){
        this.details = details;
    }

    @Override
    public String toString(){
        return "MinRangeExceed["+details+"]";
    }

}

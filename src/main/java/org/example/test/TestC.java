package org.example.test;

import java.util.concurrent.CompletableFuture;

public class TestC {
    public static void main(String[] args){
        cross(17);
    }

    public static void cross(int number){

        for(int i=0; i<number;i++){
            for(int j=0; j<number;j++){
                if(i==j || i+j== number-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class A {
    public static void main(String[] args) {
        try {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() ->
            {
                System.out.println("future1");
                //throw new RuntimeException("Future 1");
            }).exceptionally((e) -> {
                System.out.println("Excetion occured" + e.getMessage());
                throw new RuntimeException("Future 1");
            }).thenAccept((result) -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("future2");
                throw new RuntimeException("Future 2");
            }).exceptionally((e) -> {
                e.printStackTrace();
                throw new RuntimeException("Future 2");
            });
            future.join();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void main(){
        try {
            CompletableFuture<Object> future=CompletableFuture.runAsync(()->
            {
                System.out.println("future1");
                //throw new RuntimeException("Future 1");
            }).exceptionally((e)->{
                System.out.println("Excetion occured"+e.getMessage());
                throw new RuntimeException("Future 1");
            }).thenApply((result)->{
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("future2");
                throw new RuntimeException("Future 2");

            }).exceptionally((e) -> {
                e.printStackTrace();
                throw new RuntimeException("Future 2");
            });
            future.get();
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
        //CompletableFuture<Void> result=CompletableFuture.allOf(future1,future2).thenAccept((e)->System.out.println("Finished Success"));

		/*while(!result.isDone()) {
			System.out.print("Finish Future");
			result.get();
		}*/
        //result.join();
        System.out.print("Finish in Main");
    }
}


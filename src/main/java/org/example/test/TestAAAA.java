package org.example.test;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.Queue;

class LinkedListNode{

    int value;
    LinkedListNode next;

    LinkedListNode(int val){
        this.value = val;
        this.next = null;
    }
}

public class TestAAAA {

    public static boolean cycle(LinkedListNode node){
        boolean flag = true;
        if(node != null && node.next!= null){
            return false;
        }

        LinkedListNode a1 = node;
        LinkedListNode a2 = node;
        while(a1!= null && a1.next!=null){
            a1 = a1.next;
            a2 = a2.next.next;
        }
        return flag;
    }

    public static void main(String[] args){
        // Q . Check if loop exists in the Linkedlist.
        // 3-> 5-> 7 ->9 ->2
        //2 is attached to 5

//        int[] arr = {3, 7, 1, 9, 4, 2, 6};
        int[] arr = { 13, 4, -2, 10, 2, -3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        int max = maxSum(arr, k, n);
        System.out.println(max);
        max = maxSumTwoPointer(arr, k, n);
        System.out.println(max);

    }

    public static int maxSumTwoPointer(int[] arr, int k, int n){
        //int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;
        int right = k-1;

        for(int i =0; i<k; i++){
            sum+= arr[i];
        }
        max = sum;

        int start = 0;
        int end = k-1;
        if(k >= arr.length){
            return sum;
        }

        while(end<arr.length-1){
            sum -= arr[start];
            start++;
            end++;
            sum+= arr[end];
//            max = Math.max(max, sum);
            if(max<sum){
                max = sum;
                left = start;
                right = end;
            }
        }

        System.out.println(left+" : "+right);
        System.out.println(start+" : "+end);
        return max;
    }
    public static int maxSumTwoPointer1(int[] arr, int k, int n){
        //int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;
        int right = k-1;

        for(int i =0; i<k; i++){
            sum+= arr[i];
        }
        max = sum;

        int start = 0;
        int end = k-1;
        if(k >= arr.length){
            return sum;
        }

        while(end<arr.length-1){
            sum -= arr[start];
            start++;
            end++;
            sum+= arr[end];
//            max = Math.max(max, sum);
            if(max<sum){
                max = sum;
                left = start;
                right = end;
            }
        }

        System.out.println(left+" : "+right);
        System.out.println(start+" : "+end);
        return max;
    }

   public static int maxSum(int[] arr, int k, int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<k; i++){
            queue.add(arr[i]);
            sum+= arr[i];
        }
        for(int i=0; i<n; i++){
            sum -= queue.peek();
            queue.remove();

            queue.add(arr[i]);
            sum+= arr[i];

            max = Math.max(max, sum);
        }
        return max;
   }
}

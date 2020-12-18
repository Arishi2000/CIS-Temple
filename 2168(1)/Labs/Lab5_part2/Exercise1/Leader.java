import java.util.*;

import java.util.LinkedList;



public class Leader {
    private static Queue<Integer> queue = new LinkedList<>(); //Initializing Queue variable to hold data in queue.

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("java Leader ");
        int n = in.nextInt();
        int m = in.nextInt();


//Adding n element to queue
        for (int i=1;i<=n;i++) {
            queue.add(i);
        }

//Here we are removing m^th element in each iteration of while loop
//till one element left in queue and that will be Leader.

        while(queue.size() != 1) {
            for(int i=1;i<m;i++) { // Remove one elem from front end and add same elem to rear repeat this (m-1) times
                int elem = queue.remove(); //Remove one elem from front of queue.
                queue.add(elem); // add removed elem again to rear of queue.
            }
//After shifting m-1 element from front to rear remove m^th element from queue completely. and print it
            System.out.println(queue.remove());
        }


//After only one element left in Queue while loop no longer execute and that will be Leader.
        System.out.println("Leader: "+queue.peek()); //we are using the peek() to get first element from Queue.
    }

}

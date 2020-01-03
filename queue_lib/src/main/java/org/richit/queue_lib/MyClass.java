package org.richit.queue_lib;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyClass {

    public static String dot = "---------------";

    private static void heading(String programme_heading) {
        System.out.println();
        System.out.println( dot + programme_heading + dot );
        System.out.println();
    }

    public static void main(String[] args) {
        addAndRemoveElement();
    }

    private static void addAndRemoveElement() {
        heading( "Add Element" );
        Queue<Integer> queues = new ArrayBlockingQueue<Integer>(4);
        queues.add( 10 );
        queues.add( 20 );
        queues.add( 30 );
        queues.add( 60 );

        for (int value:queues){
            System.out.println("Element : " + value);
        }

        System.out.println();
        try {
            queues.add( 40 );
        } catch (Exception e) {
            System.out.println(e.toString() + "Tried to add too many times ");
        }
        heading( "Remove Element" );
        try {

            queues.remove();
            queues.remove();
            queues.remove();
            queues.remove();
            queues.remove();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("Try offte/poll/peek instead of add/remove/examine");
    }
}
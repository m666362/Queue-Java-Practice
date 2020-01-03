package org.richit.queue_lib;

public class MyClass {

    public static String dot = "---------------";

    private static void heading(String programme_heading) {
        System.out.println();
        System.out.println( dot + programme_heading + dot );
        System.out.println();
    }

    public static void main(String[] args) {
        heading( "Programme started" );

    }
}
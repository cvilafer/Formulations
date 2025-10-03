package org.example;

import org.example.controller.MainDispatcher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {




        //System.out.println( "Hello World!" );

        MainDispatcher.runner(myDataStore);


        System.out.println("Finished!");



    }
}

package com.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        Iterator<Robot> rs = serviceLoader.iterator();
        System.out.println(rs.hasNext());
        while(rs.hasNext()){
            Robot robot = rs.next();
            robot.sayHello();
        }

    }
}

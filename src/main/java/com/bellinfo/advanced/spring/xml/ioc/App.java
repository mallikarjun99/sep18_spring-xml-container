package com.bellinfo.advanced.spring.xml.ioc;

import com.bellinfo.advanced.spring.ioc.autowired.A;
import com.bellinfo.advanced.spring.ioc.autowired.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Laptop lap = context.getBean("hp", Laptop.class);
        System.out.println(lap);

        Movie movie = context.getBean("m1",Movie.class);
        System.out.println(movie);

        Customer customer = context.getBean("customer", Customer.class);
        System.out.println(customer);

        Car car = context.getBean("car", Car.class);

        DBConnection dbConnection = context.getBean("con", DBConnection.class);
        System.out.println(dbConnection);

        A aObj = context.getBean("a", A.class);
        System.out.println(aObj);

        Employee emp = context.getBean("emp",Employee.class);
        System.out.println(emp);


    }
}

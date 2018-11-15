package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

public class AnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
         Laptop laptop = context.getBean("laptop",Laptop.class);
        System.out.println(laptop);

        Customer c = context.getBean("customer",Customer.class);
        System.out.println(c);

        Employee emp = context.getBean("employee", Employee.class);
        System.out.println(emp);

        Account ac = context.getBean("account",Account.class);
        System.out.println(ac);
    }
}
@Configuration
@PropertySource(value="application.properties")
@ComponentScan(basePackages = "com.bellinfo.advanced.spring.annotation.ioc")
class MyConfiguration{

    @Bean
    Laptop laptop(){
        System.out.println("I am called");
        return new Laptop();
    }
    @Bean
    Address address(){
        return new Address();
    }
    @Bean
    Customer customer(){
        return new Customer(address());
    }
    @Bean
    Department department(){
        return new Department(10, "IT");
    }
    @Bean
    Department department1(){
        return new Department(12,"HR");
    }
    @Bean
    Employee employee(){
        return new Employee();
    }
}



package com.learning;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*xml file should be in resources*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MainInterface mainInterface = (MainInterface) context.getBean("first");
        System.out.print("Using xml config ");
        mainInterface.testBean();

        //Using Annotation of @component and scan the packages from XML file
        mainInterface = (MainInterface) context.getBean("firstBeanRun");
        System.out.print("Using Annotation ");
        mainInterface.testBean();
        //Dependency of brand var in class use property tag in xml
        Shoes shoes = (Shoes) context.getBean("shoe");
        System.out.println(shoes);

        Bags bags = (Bags) context.getBean("bag");
        System.out.println(bags);

        //From annotation type bean to xml bases bean
        FirstBeanRun firstBeanRun = (FirstBeanRun) context.getBean("firstBeanRun");
        firstBeanRun.callBagBean();
    }
}

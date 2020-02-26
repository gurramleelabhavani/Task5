import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public static void main(String args[])
    {
        final Logger log=LogManager.getLogger(Main.class);
        Scanner sc=new Scanner(System.in);
        log.info("Enter Principal");
        double principal=sc.nextDouble();
        log.info("Enter time");
        double time=sc.nextDouble();
        log.info("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        log.info("Is automated ?(true/false)");
        boolean automated=sc.nextBoolean();
        log.info("Enter material(standard/high_standard/above_standard)");
        String material=sc.next();
        log.info("Enter area");
        double area=sc.nextDouble();

        sim_in s =new sim_in(principal,time,rate_of_interest);
        double simple_interest=s.cal();
        log.info("Simple Interest : "+simple_interest);

        com_in c =new com_in(principal,time,rate_of_interest);
        double compound_interest=c.calc();
        log.info("Compound Interest : "+compound_interest);

        construction con =new construction(automated,material,area);
        double cost=con.construct();
        log.info("Total Cost : "+cost);
    }
}

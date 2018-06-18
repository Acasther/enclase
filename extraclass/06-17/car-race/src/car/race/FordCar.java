
package car.race;

import java.util.Random;


public class FordCar {
    Random random = new Random();
    int m = 0;
    int a = 0;
    int cabf1 = 150;
    public FordCar () {
        System.out.println("Ford brand");
        System.out.println("Manufactured in 1995");
        System.out.println("150 HP");
        System.out.println(" ");
        }
    public void startrace () {
        while (m < 500) {
            int rd = random.nextInt(2);
            m = rd*cabf1;
            a = m++;
            System.out.println(a);
    }
    }
}

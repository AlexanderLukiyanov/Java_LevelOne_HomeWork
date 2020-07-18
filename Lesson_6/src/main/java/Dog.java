import java.util.Random;

public class Dog extends Animal {
    //Random maxRestrictions = new Random(); //для задачи со звездочкой

    public int maxRunning = 500; // для задачи 3
    public double maxBounce =  0.5; // для задачи 3
    public int maxSwim = 10; // для задачи 3

    //public int maxRunning = maxRestrictions.nextInt(500); //для задачи со звездочкой
    //public int maxBounce = maxRestrictions.nextInt(400); //для задачи со звездочкой
    //public int maxSwim = maxRestrictions.nextInt(500); //для задачи со звездочкой

    @Override
    public void running(int obstacleLength) {
        if (obstacleLength > maxRunning) {
            System.out.println("run: " + false + "Dog");
        } else {
            System.out.println("run: " + true + "Dog");
        }
    }

    @Override
    public void swimming(int obstacleLength) {
        if (obstacleLength > maxSwim) {
            System.out.println("swim: " + false + " Dog");
        } else {
            System.out.println("swim: " + true + " Dog");
        }
    }

    @Override
    public void bounce(double height) {
        if (height > maxBounce) {
            System.out.println("bounce: " + false + " Dog");
        } else {
            System.out.println("bounce: " + true + " Dog");
        }
    }
}
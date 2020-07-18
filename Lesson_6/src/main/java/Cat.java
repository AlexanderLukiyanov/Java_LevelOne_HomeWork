import java.util.Random;

public class Cat extends Animal {

        //Random maxRestrictions = new Random(); //для задачи со звездочкой
        public int maxRunning = 200;
        public int maxBounce =  2;
        public int maxSwim = 0;

        //public int maxRunning = maxRestrictions.nextInt(500); //для задачи со звездочкой
        //public int maxBounce = maxRestrictions.nextInt(400); //для задачи со звездочкой
        //public int maxSwim = maxRestrictions.nextInt(500); //для задачи со звездочкой

        @Override
        public void running(int obstacleLength) {
                if (obstacleLength > maxRunning) {
                        System.out.println("run: " + false + " Cat");
                } else {
                        System.out.println("run: " + true + " Cat");
                }
        }

        @Override
        public void swimming(int obstacleLength) {
                if (obstacleLength > maxSwim) {
                        System.out.println("swim: " + false + " Cat");
                } else {
                        System.out.println("swim: " + true + " Cat");
                }
        }

        @Override
        public void bounce(double height) {
                if (height > maxBounce) {
                        System.out.println("bounce: " + false + " Cat");
                } else {
                        System.out.println("bounce: " + true + " Cat");
                }
        }
}
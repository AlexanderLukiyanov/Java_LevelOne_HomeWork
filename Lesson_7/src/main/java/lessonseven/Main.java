package lessonseven;


public class Main {

    public static void main(String[] args) {

        int foodCountPlateOne = 20;
        int foodCountPlateTwo = 5;
        int foodCountPlateTree = 40;
        //int foodCountPlateFour = 100;

        boolean catSatiety = false;
        boolean cat1Satiety = false;
        boolean cat2Satiety = false;

        Cat cat = new Cat("Barsik", 10);
        Cat cat1 = new Cat("Timur", 20);
        Cat cat2 = new Cat("Zuza", 30);
        
        //Cat [] catArr = new Cat[3];
        //catArr[0] = new Cat ("Barsik", 10);
        //catArr[1] = new Cat ("Murzik", 20);
        //catArr[2] = new Cat ("Petya", 30);
        //catArr[3] = new Cat ("Zuza", 40);

        Plate plate = new Plate(foodCountPlateOne);
        Plate plate1 = new Plate(foodCountPlateTwo);
        Plate plate2 = new Plate(foodCountPlateTree);
        
        //Plate plate3 = new Plate(foodCountPlateFour);

        plate.info();
        System.out.println(cat.getAppetite());
        cat.eat(plate);
        plate.info();
        if ((cat.getAppetite() - foodCountPlateOne) == 0) {
            cat.setAppetite(0);
            System.out.println(catSatiety = true);
        } else if ((cat.getAppetite() - foodCountPlateOne) > 0){
            System.out.println("Еды в миске недостаточно");
            System.out.println(catSatiety);
        } else if ((cat.getAppetite() - foodCountPlateOne) < 0) {
            cat.setAppetite(cat.getAppetite() - foodCountPlateOne);
            System.out.println(catSatiety);
        }
        System.out.println(cat.getAppetite());


        plate1.info();
        System.out.println(cat1.getAppetite());
        cat1.eat(plate1);
        plate1.info();
        if ((cat1.getAppetite() - foodCountPlateTwo) == 0) {
            cat1.setAppetite(0);
            System.out.println(cat1Satiety = true);
        } else if ((cat1.getAppetite() - foodCountPlateTwo) > 0){
            System.out.println("Еды в миске недостаточно");
            System.out.println(cat1Satiety);
        } else if ((cat1.getAppetite() - foodCountPlateTwo) < 0) {
            cat1.setAppetite(cat1.getAppetite() - foodCountPlateTwo);
            System.out.println(cat1Satiety);
        }
        System.out.println(cat1.getAppetite());

        plate2.info();
        System.out.println(cat2.getAppetite());
        cat2.eat(plate2);
        plate2.info();
        if ((cat2.getAppetite() - foodCountPlateTree) == 0) {
            cat2.setAppetite(0);
            System.out.println(cat2Satiety = true);
        } else if ((cat2.getAppetite() - foodCountPlateTree) > 0){
            System.out.println("Еды в миске недостаточно");
            System.out.println(cat2Satiety);
        } else if ((cat2.getAppetite() - foodCountPlateTree) < 0) {
            cat2.setAppetite(cat2.getAppetite() - foodCountPlateTree);
            System.out.println(cat2Satiety);
        }
        System.out.println(cat2.getAppetite());

        //plate3.info();
        //for (int i = 0; i < catArr.length; i++) {
        //    System.out.println(i);
        //}
        
    }
}
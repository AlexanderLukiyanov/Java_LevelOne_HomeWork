package lessonseven;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Plate {

    private int food;

    public Plate(int food) {

        this.food = food;
    }

    public void info() {

        System.out.println("On plate " + food  + " food in quantity");
    }

    public void decreaseFood(int appetite) {
        if (appetite > food) {
            System.out.println("Еды в миске недостаточно");
        } else if (appetite < food) {
            food -= appetite;
        } else if (appetite == food) {
            food = 0;
        }
    }

    public int getFood() {

        return food;
    }

    public void setFood(int food) {

        this.food = food;
    }
}
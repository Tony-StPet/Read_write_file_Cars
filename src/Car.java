import java.util.ArrayList;
import java.util.List;

public class Car {
    String mark;
    String color;
    String tipyOfback;

    public Car(String mark, String color, String tipyOfback) {
        this.mark = mark;
        this.color = color;
        this.tipyOfback = tipyOfback;
    }
    @Override
    public String toString() {
        return "Car{" +"mark=' "+mark + '\'' + ", color=' " +color +'\'' + ", tipyOfback=' "+tipyOfback+'\''+"}";
    }

    protected void makeNoise(){
        System.out.println(this+" шумит и рычит:: "+ mark);
    }
}



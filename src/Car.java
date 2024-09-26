import java.util.ArrayList;
import java.util.List;
// создание класса машина, метода в строку и миетода машина издает звук
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

//    protected void makeNoise(){
//        System.out.println(this+" шумит и рычит:: "+ mark);
//    }

    //    @Override - почему? не работает - потому что это впервые и переопределение не требуется
    public String sound() {
        return "шумит и рычит::";
    }
}



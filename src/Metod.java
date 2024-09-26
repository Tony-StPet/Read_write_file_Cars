import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metod {
    public static List<Car> makeCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("БМВ", "Черный", "седан"));
        carList.add(new Car("Ауди", "Белый", "седан"));

        return carList;
    }


    public static void writeCarsFile(List<Car> cars, String filename){
        //в первой строке файла пусть будет количество треугольников
        //в каждой следующей строке файла пусть будут 3 числа, разделенные пробелами - строны очередного треугольбника

        try{
            FileWriter fileWriter = new FileWriter(filename);
//            fileWriter.write(String.valueOf(cars.size()));
            for (Car crr: cars){
                fileWriter.write(crr.mark+" "+ crr.color+" "+ crr.tipyOfback);
            }
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("что-то не так с записью в файл");
            System.out.println(e.getMessage());
        }
    }

    public static void printCars(List<Car> cars){
        for (Car crr: cars)
            System.out.println(crr);
    }


    public static List<Car> readCars(String fname){
        List<Car> carList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(fname));
            //int k = scanner.nextInt();
            while (scanner.hasNext()) {
                String a = scanner.next();
                String b = scanner.next();
                String c = scanner.next();
                Car crr = new Car(a, b, c);
                carList.add(crr);
            }
        } catch (FileNotFoundException e) {
            System.out.println("что-то не так с чтением из файла");
            System.out.println(e.getMessage());
        }
        return carList;
    }


}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// создание библиотеки методав работы с файлом записи и чтения
public class Metod {
    public static List<Car> makeCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("БМВ", "Черный", "седан"));
        carList.add(new Car("Ауди", "Белый", "седан"));

        return carList;
    }

// запись в файл
    public static void writeCarsFile(List<Car> cars, String filename){
        //в первой строке файла пусть будет количество машин
        //в каждой следующей строке файла пусть будут 3 слова, разделенные пробелами - характеристики машины

        try{
            FileWriter fileWriter = new FileWriter(filename);
            // первая строка - количество
            fileWriter.write(String.valueOf(cars.size()));
            //запись на каждую строку экземпляра класса
            for (Car crr: cars){
                fileWriter.write(crr.mark+" "+ crr.color+" "+ crr.tipyOfback);
            }
            // закрытие файла -
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("что-то не так с записью в файл");
            System.out.println(e.getMessage());
        }
    }

    // вывод в консоль
    public static void printCars(List<Car> cars){
        for (Car crr: cars)
            System.out.println(crr);
    }

// чтение файла и вывод в консоль
    public static List<Car> readCars(String fname){
        List<Car> carList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(fname));
            //int k = scanner.nextInt(); - убрал количество в первой строке файла
            while (scanner.hasNext()) { // изменил фор на вайл
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

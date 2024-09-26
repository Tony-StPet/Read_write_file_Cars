import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //    writeToFile();
        ReadFile();

    }

    private static void writeToFile() {
        List<Car> cars = Metod.makeCars();
        Metod.printTriangles(cars);
        Metod.writeCarsFile(cars, "output.txt");
    }

    private static void ReadFile() {
        List<Car> cars = Metod.readCars("output.txt");
        Metod.printTriangles(cars);}
    }
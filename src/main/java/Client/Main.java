package Client;

import Adapter.PoundToKgConverter;

public class Main {
    public static void main(String[] args) {

        PoundToKgConverter converter = new PoundToKgConverter();

        System.out.println("Weight in Kgs is "+ converter.convertPoundToKg());

    }
}
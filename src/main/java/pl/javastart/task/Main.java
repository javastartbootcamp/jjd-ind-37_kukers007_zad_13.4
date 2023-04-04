package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList<>();
        CustomList<Integer> customListOfIntegers = new CustomList<>();

        customListOfStrings.add("Kasia1");
        customListOfStrings.add("Kasia2");
        customListOfStrings.add("Kasia3");
        customListOfStrings.add("Kasia4");
        customListOfStrings.add("Kasia5");
        customListOfStrings.add("Kasia6");
        customListOfStrings.add("Kasia7");
        System.out.println(customListOfStrings.get(4));
        System.out.println(customListOfStrings);
        System.out.println(customListOfStrings);
        System.out.println(customListOfStrings.size());
        customListOfStrings.add(4, "Kasia101");
        System.out.println(customListOfStrings);
        System.out.println(customListOfStrings.size());
    }
}
package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 * -
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 * -
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(4);
        list.add(5);

        System.out.println(HoogsteGetalAbstract.hoogsteGetal(list));
    }

    public static String hoogsteGetal(ArrayList<Integer> integerList) {
        if (integerList.size() < 2) {
            return "Deze lijst bestaat uit minder dan twee getallen!";
        }
        int highestNumber = integerList.getFirst();
        for (int i = 1; i < integerList.size(); i++) {
            highestNumber = max(highestNumber, integerList.get(i));
        }
        return "Het hoogste getal van de gegeven getallen is: " + highestNumber;
    }
}

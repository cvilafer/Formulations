package org.example.managers;

import java.util.List;

import org.example.model.Unit;

public class UnitManager {

    public static void printUnitList(List<Unit> units) {

        System.out.println("Units from DB: ");
        System.out.println("-------------------------");
        System.out.println("Size DB: " + units.size());
        // print each car on a separate line with index
        int index = 1;
        for (Unit car : units) {
            System.out.println("\t" + index + ". " + car);
            index++;
        }

        System.out.println("\n");
    }

}

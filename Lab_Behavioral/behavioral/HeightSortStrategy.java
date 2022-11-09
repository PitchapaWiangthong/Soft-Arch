// package edu.parinya.softarchdesign.behavioral2;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
        Collections.sort(people, (a, b) -> {
            return a.getHeight() - b.getHeight();
        });
    }

}

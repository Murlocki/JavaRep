import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CollectionSortLambda a =new CollectionSortLambda();
        a.SortTypeCost();
        a.filterCost(10,20);
        a.SortDate();
        a.getFlowers("Ромашка","blue");
        System.out.println();


        CollectionSortInterface b = new CollectionSortInterface();
        b.sortByPrice();
        b.filterByPriceRange(10,20);
        b.sortByArrivalDate();
        b.filterByColor("blue","Ромашка");
    }
}
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionSortInterface {
        private ArrayList<Flower> flowers;

        public CollectionSortInterface(){
            this.flowers = new ArrayList<Flower>();
            this.flowers.add(new Flower(FlowerType.Daisy,20, LocalDate.of(2012,9,30),"blue"));
            this.flowers.add(new Flower(FlowerType.Daisy,26, LocalDate.of(2011,9,30),"blue"));
            this.flowers.add(new Flower(FlowerType.Daisy,2, LocalDate.of(2011,9,28),"blue"));
            this.flowers.add(new Flower(FlowerType.Lily,20, LocalDate.of(2011,8,30),"blue"));
            this.flowers.add(new Flower(FlowerType.Rose,2, LocalDate.of(2011,9,30),"blue"));
            this.flowers.add(new Flower(FlowerType.Lily,2, LocalDate.of(2011,9,30),"blue"));
            this.flowers.add(new Flower(FlowerType.Lily,2, LocalDate.of(2011,9,30),"red"));
            this.flowers.add(new Flower(FlowerType.Lily,2, LocalDate.of(2011,9,30),"yellow"));
            System.out.println(this.flowers);
        }

        public void filterByColor(String color,String typeFlower) {
            Predicate<Flower> colorPredicate = flower -> flower.getColor().equalsIgnoreCase(color) && Objects.equals(flower.getFlowerTypeName(), typeFlower);
            filterFlowers(colorPredicate);
        }

        public void filterByPriceRange(double minPrice, double maxPrice) {
            Predicate<Flower> pricePredicate = flower -> flower.getCost() >= minPrice && flower.getCost() <= maxPrice;
            filterFlowers(pricePredicate);
        }

        public void sortByPrice() {
            flowers.sort(Comparator.comparing(Flower::getFlowerTypeName).thenComparing(Comparator.comparing(Flower::getCost)));
            System.out.println(flowers);
        }

        public void sortByArrivalDate() {
            flowers.sort(Comparator.comparing(Flower::getReceiptDate));
            System.out.println(flowers);
        }

        private void filterFlowers(Predicate<Flower> predicate) {
            ArrayList<Flower> filtered = new ArrayList<>();
            for (Flower flower : flowers) {
                if (predicate.test(flower)) {
                    filtered.add(flower);
                }
            }
            System.out.println(filtered);
        }
    }


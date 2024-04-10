import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class CollectionSortLambda {
    private ArrayList<Flower> flowers;
    public CollectionSortLambda(){
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
    public void SortTypeCost(){
        flowers.sort((s1,s2)-> {
            if(Objects.equals(s1.getFlowerType().getTypeName(), s2.getFlowerType().getTypeName())){
                return Double.compare(s1.getCost(),s2.getCost());
            }
            else{
                return s1.getFlowerType().getTypeName().compareTo(s2.getFlowerType().getTypeName());
            }
        });
        System.out.println(flowers);
    }
    public void filterCost(double start,double end){
        System.out.println(flowers.stream().filter(c->{
            return c.getCost()>=start&&c.getCost()<=end;
        }).collect(Collectors.toList()));
    }
    public void SortDate(){
        flowers.sort((s1,s2)->s1.getReceiptDate().compareTo(s2.getReceiptDate()));
        System.out.println(flowers);
    }
    public void getFlowers(String Ftype,String flowerColor){
        System.out.println(flowers.stream().filter(c->{
            return Objects.equals(c.getFlowerType().getTypeName(), Ftype) && Objects.equals(c.getColor(), flowerColor);
        }).collect(Collectors.toList()));
    }
}

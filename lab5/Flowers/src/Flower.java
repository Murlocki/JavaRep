import java.time.LocalDate;

enum FlowerType{

    Rose("Роза"),
    Daisy("Ромашка"),
    Сhrysanthemum("Хризантем"),
    Tulip("Тюльпан"),

    Lily("Лилия"),
    Peony("Пион"),
    Gerbera("Гербер"),
    Sunflower("Подсолнух")
    ;

    private String typeName;
    FlowerType(String name){
        this.typeName = name;
    }

    public String getTypeName() {
        return typeName;
    }
}

public class Flower {
    private double cost;
    private FlowerType flowerType;
    private LocalDate receiptDate;
    private String color;

    public Flower(FlowerType flowerType,double cost,LocalDate receiptDate,String color){
        this.flowerType = flowerType;
        this.receiptDate = receiptDate;
        this.cost = cost;
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public String getColor() {
        return color;
    }
    public String getFlowerTypeName(){
        return getFlowerType().getTypeName();
    }
    @Override
    public String toString() {
        return this.flowerType.getTypeName()+" "+this.color+" "+this.cost+" "+this.receiptDate;
    }
}

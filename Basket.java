package test;
// code written by altaf ali
import java.util.stream.Stream;
class FruitBasket
{
    String fruitName;
    int weightInKg;
    int PricePerKg;
    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public int getWeightInKg() {
        return weightInKg;
    }
    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }
    public int getPricePerKg() {
        return PricePerKg;
    }
    public void setPricePerKgs(int pricePerKg) {
        PricePerKg = pricePerKg;
    }

    public FruitBasket() {  // non parametrised constructor
    }
}
class FruitbasketUtility{
    String fruitName;
    int weightInKg;
    int PricePerKg;
    private FruitBasket obj;
    public void addToBasket(FruitBasket obj){
        this.obj=obj;
    }
    public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
        return PricePerKg;
    }
    public FruitbasketUtility(String fruitName, int weightInKg, int PricePerKg) { // constructor
        this.fruitName = fruitName;
        this.weightInKg = weightInKg;
        this.PricePerKg = PricePerKg;
    }
}
public class Customer{
    public static void main(String[] args) {
        FruitBasket fb=new FruitBasket();
        fb.setFruitName("Pineapple");
        System.out.println("fruit name is :"+fb.getFruitName());

        fb.setWeightInKg(1);
        System.out.println("weight of fruit in kg is :"+fb.getWeightInKg());

        fb.setPricePerKgs(200);
        System.out.println("price of fruit per kg is:"+fb.getPricePerKg());

        FruitbasketUtility fbu = new FruitbasketUtility("mango",1,100);
        System.out.println(" the name of fruit " +fbu.fruitName);
        System.out.println("weight of mango is " +fbu.weightInKg + "Kg");
        System.out.println("price of 1 kg mango is " + fbu.PricePerKg);
    }
}



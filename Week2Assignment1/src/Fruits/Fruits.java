package Fruits;
public class Fruits {
  private String name;
  private String color;
  private int weight;
  private String isTasty;
  private int price;
  private int quantity;

  public Fruits() {
  }

  public Fruits(String name, String color, int weight, String isTasty, int price, int quantity) {
    this.name = name;
    this.color = color;
    this.weight = weight;
    this.isTasty = isTasty;
    this.price = price;
    this.quantity = quantity;
  }

  public void addQuantity (int weight, int price){
    this.weight = weight;
    this.price = price;
    this.quantity += 1 ;
  }

  public void removeQuantity (int weight, int price){
    this.weight = weight;
    this.price = price;
    this.quantity -= 1 ;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getIsTasty() {
    return isTasty;
  }

  public void setIsTasty(String isTasty) {
    this.isTasty = isTasty;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

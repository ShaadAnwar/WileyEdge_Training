package Day_4;
//Enum are the collection of static objects
public enum Coffee {
    Latte(8),Espresso(6),Americano(12),Brew(5);
    private int numberOfBeans;

    private Coffee(int numberOfBeans){
        this.numberOfBeans = numberOfBeans;
    }

    public void display(){
        System.out.println("Your coffee is getting Prepared");
    }

    public double getBill(){
        return this.numberOfBeans*10;
    }

}

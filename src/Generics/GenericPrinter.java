package Generics;

// T es por tipo de clase
public class GenericPrinter<T> {
    T thingToPrint;

    public GenericPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}

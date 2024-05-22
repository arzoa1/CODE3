public class Main{
    public static void main (String[]args){
      
Feeder f1 = new Feeder (200);
System.outprintln(f1.getCurrentFood());
f1.simulateOneDay(12);
System.outprintln(f1.getCurrentFood());
    }
}

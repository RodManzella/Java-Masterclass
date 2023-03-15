package abstraction1;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        
        if(speed.equals("slow")){
            System.out.print(type + " lazily swimming");
        }else{
            System.out.println(type + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        
        if(type == "Goldfish"){ 
            System.out.print("swish");
             // Here we can directly acess type, a field on the abstract class.
             // because we made the field "type" protected. We didn´t create any getters or setters on the Animal class.
             // And this protected modifier let´s subclasses use the field directly, as we show in this if condition.
        }else{
            System.out.print("splash");
        }
    }
    
    

}

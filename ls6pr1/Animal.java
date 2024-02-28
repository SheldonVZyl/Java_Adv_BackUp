package ls6pr1;

public abstract class Animal {
    
    protected int legs;
    
    public Animal(int legs) {
        this.legs = legs;
    }
    
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
    
    public abstract void eat();
    
}
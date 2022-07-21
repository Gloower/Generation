package interfaces;

public class Dog implements Animal {

    @Override
    public void somAnimal() {
        System.out.println("AU AU AU AU AU");
        
    }

    @Override
    public void dormir() {
        System.err.println("Tirando um descanso pós latido.");
    }
    
}

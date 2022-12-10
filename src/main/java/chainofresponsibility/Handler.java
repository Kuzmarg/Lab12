package chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {
    @Setter
    private Handler next;
    private final int quantity;

    public Handler(int quantity) {
        this.quantity = quantity;
    }
    public void process(int amount) {
        if(amount%quantity > 0 && next == null) {
            throw new IllegalArgumentException();
        }
        else if(next!= null){
            next.process(amount%quantity);
            System.out.println(amount/quantity + " + " + quantity);
        }
    }
}

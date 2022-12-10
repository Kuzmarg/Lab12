package chainofresponsibility;

public class ATM {
    Handler50 handler50 = new Handler50();
    Handler20 handler20 = new Handler20();
    Handler5 handler5 = new Handler5();
}

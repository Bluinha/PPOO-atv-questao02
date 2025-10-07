
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen();
        KeyPad keyPad = new KeyPad(model);

        model.addObserver(screen);

        keyPad.simulateKeyPresses(NUM_DIGITS);

    }
}

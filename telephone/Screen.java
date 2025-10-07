import java.util.List;
import java.util.stream.Collectors;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen implements Observer {

    @Override
    public void update(PhoneModel model) {
        int LastDigit = model.getLastDigit();

        System.out.println("Pressionando: "+ LastDigit);
    }

}

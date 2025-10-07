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
        List<Integer> allDigits = model.getDigits();

        String fullNumber = allDigits.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        if (fullNumber.length() < 12) {
            System.out.println("Pressionando: "+ LastDigit);
            System.out.println(LastDigit);
        }else if (fullNumber.length() == 12) {
            System.out.println("Agora discando: " + fullNumber);
        }
    }

}

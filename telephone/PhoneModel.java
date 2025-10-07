import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private final List<Integer> digits = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<Integer> getDigits() {
        return new ArrayList<>(digits);
    }

    public int getLastDigit() {
        if (digits.isEmpty()) {
            return -1;
        }
        return digits.get(digits.size()-1);
    }
}

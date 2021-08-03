import java.util.OptionalInt;
import java.util.Random;

public class MathUtils {
    public static int randomNumber() {
        return randomNumber(20, 90);
    }

    public static int randomNumber(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    public static OptionalInt isInt(String input) {
        try {
            return OptionalInt.of(Integer.parseInt(input));
        } catch (NumberFormatException ignored) {
            return OptionalInt.empty();
        }
    }
}

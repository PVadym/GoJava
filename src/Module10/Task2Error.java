package Module10;

/**
 * Created by Вадим on 03.01.2017.
 */
public class Task2Error extends Exception {

    private String message;

    public Task2Error(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

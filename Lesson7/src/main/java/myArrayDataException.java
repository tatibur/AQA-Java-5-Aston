import java.io.IOException;

public class myArrayDataException extends IOException {
    int i;
    int j;

    public myArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

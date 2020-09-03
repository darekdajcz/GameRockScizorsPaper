import java.util.Random;

public class GamerRandom implements IGamer{
    @Override
    public int play() {
        Random r = new Random();
        return r.nextInt((3-1)+1)+1;
    }

    @Override
    public String name() {
        return "Losownik";
    }
}

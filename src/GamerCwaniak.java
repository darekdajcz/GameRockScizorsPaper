public class GamerCwaniak implements IGamer{
    private int ostatniaZagrywka = 1;

    @Override
    public int play() {
        switch (ostatniaZagrywka){
            case (1): ostatniaZagrywka = 2;
                return 2;
            case (2): ostatniaZagrywka = 3;
                return 3;
            default: ostatniaZagrywka = 1;
                return 1;
        }
    }

    @Override
    public String name() {
        return "Cwaniak";
    }
}

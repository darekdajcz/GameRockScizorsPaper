import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<IGamer> gamerList = new ArrayList();

        gamerList.add(new GamerKamien());
        gamerList.add(new GamerNozyce());
        gamerList.add(new GamerPapier());
        gamerList.add(new GamerRandom());
        gamerList.add(new GamerCwaniak());

        int gracz1 = 1;
        int gracz2 = 4;


        Arena arena = new Arena(gamerList.get(gracz1), gamerList.get(gracz2));

        arena.fight(1000);


        System.out.println("Liczba rund: " + arena.getLiczbaRundd());

        System.out.println(arena.win());

        System.out.println(gamerList.get(gracz1).name() + " " + arena.getPunkty1());
        System.out.println(gamerList.get(gracz2).name() + " " + arena.getPunkty2());

        GamerCwaniak gg = new GamerCwaniak();
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());
        System.out.println(gg.play());

    }

}

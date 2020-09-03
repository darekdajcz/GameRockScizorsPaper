public class Arena  {
   private IGamer player1;
   private IGamer player2;

   private double punkty1;
   private double punkty2;

   private static int liczbaRundd = 0;

    public Arena(IGamer player1, IGamer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight(int liczbaRund){

        for (int i = 0; i < liczbaRund ; i++) {
            liczbaRundd++;

            switch (wynikWalki(player1.play(), player2.play())){
                case (1): punkty1++;
                    break;
                case(-1): punkty2++;
                    break;
                default: punkty1 += 0.5;
                         punkty2 += 0.5;
            }
        }
    }

        private int wynikWalki(int move1, int move2){

            if (move1 - move2 == 0 )
                return 0;
            else if ((move1 == 1 & move2 == 3 ) | (move1 == 2 & move2 == 1) | (move1 == 3 & move2 == 2))
                    return 1;
            else return -1;
        }

        public String win(){

        if (punkty1 > punkty2)
            return "Wygrywa " + player1.name();
        else if (punkty1 == punkty2)
            return "Mamy remis";
        else
            return "Wygrywa " + player2.name();
        }

    public  int getLiczbaRundd() {
        return liczbaRundd;
    }

    public double getPunkty1(){
            return punkty1;
        }

        public double getPunkty2(){
        return punkty2;
    }

}

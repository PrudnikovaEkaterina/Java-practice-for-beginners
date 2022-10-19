package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA=100;
    public static final int MIN_STAMINA=0;
    public static int countPlayers=0;

    public Player(int stamina){
        this.stamina=stamina;
        countPlayers++;
        if (countPlayers>6)
            countPlayers=6;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if (stamina>0)
        stamina--;
        else if (stamina==0)
            countPlayers--;
        else
            return;

    }

    public static void info(){
        if (countPlayers==6)
            System.out.println("На поле нет свободных мест");
        if (countPlayers<6){
            switch (countPlayers){
                case 0:
                    System.out.println("На поле все места свободны");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле пять свободных мест");
                    break;
                case 2:
                    System.out.println("Команды неполные. На поле четыре свободных места");
                    break;
                case 3:
                    System.out.println("Команды неполные. На поле три свободных места");
                    break;
                case 4:
                    System.out.println("Команды неполные. На поле два свободных места");
                    break;
                case 5:
                    System.out.println("Команды неполные. На поле одно свободное место");
                    break;
            }
        }
    }
}

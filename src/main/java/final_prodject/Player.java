package final_prodject;

import java.io.IOException;
import java.net.PortUnreachableException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private Board board1;
    private Board board2;
    private String name;

    public Player(Board board1, Board board2, String name) {
        this.board1 = board1;
        this.board2 = board2;
        this.name = name;
    }

    public Board getBoard1() {
        return board1;
    }

    public Board getBoard2() {
        return board2;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(getName() + " " + "Ваша доска");
        getBoard1().print();
        System.out.println(getName() + " " + "Доска противника");
        getBoard2().print();
    }

    public void map (){
        System.out.println("Доска противника");
        getBoard2().print();
    }
    public int[] moveCoord() {
        System.out.println(getName()+" "+"Ваш ход");
        boolean bol=true;
        int a=0;
        int b=0;
        do {
            Scanner scanner=new Scanner(System.in);
            Scanner scanner1=new Scanner(System.in);
            try {
                a = scanner.nextInt();
                b=scanner1.nextInt();
                if (a>9||a<0 || b>9||b<0)
                    throw new PortUnreachableException();
                Ship_[][] shipArrayE1=getBoard2().getShipArray();

                if (shipArrayE1[a][b]!=Ship_.EMPTY)
                    throw new IOException();
                bol=false;
            }
            catch (InputMismatchException e) {
                System.out.println("Введите целочисленное значение!");
            }
            catch (PortUnreachableException e) {
                System.out.println("Число должно быть от 0 до 9");
            }
            catch (IOException e) {
                System.out.println("Такой ход уже был, попробуйте снова");
            }
        }
        while (bol);
        int[] moveCoord={a,b};
        return moveCoord;
    }
    int count=0;
    int count1=0;
    int count2=0;


    public void move ( Player player) {
        int [] moveCoord=moveCoord();
        Ship_[][] shipArray1=getBoard2().getShipArray();
        Ship_[][] shipArray2 = player.getBoard1().getShipArray();

        int c=0;

        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_4p&&count<3){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Ранил");
            count++;}

        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_4p&&count==3){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Убил");
            }

        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_3p&&count1<2){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Ранил");
            count1++;}

        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_3p&&count1==2){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Убил");
            count1=0;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_2p&&count2<1){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Ранил");
            count2++;}
        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_2p&&count2==1){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Убил");
            count2=0;
        }
        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.SHIP_1p){
            shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.WOUNDED;
            shipArray2[moveCoord[0]][moveCoord[1]]=Ship_.SOS;
            System.out.println("Убил");
        }

        if (shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.EMPTY||shipArray2[moveCoord[0]][moveCoord[1]]==Ship_.OREOL)
        {   shipArray1[moveCoord[0]][moveCoord[1]]=Ship_.MOVE;
            System.out.println("Мимо!");
            map();
            player.move(this);
        }

        map();
        winner(player);
        move(player);

    }

        public static void random (Player player, Player player1){
            Random random = new Random();
            int min=1;
            int max=2;
            int diff=max-min;
            int x= random.nextInt(diff+1)+min;
            switch (x){
                case 1:player.move(player1);
                case 2:player1.move(player);
            }
        }

        public void winner (Player player) {
            Ship_[][] shipArray=player.getBoard1().getShipArray();
            int c=0;
            for (int i=0; i<shipArray.length;i++){
                for (int y=0; y<shipArray[i].length; y++){
                    if(shipArray[i][y]==Ship_.SOS)
                    c++;
                }
            }
            if (c==20)
            {System.out.println(getName()+" "+"Вы победили!");
            System.exit(1);}
    }
}







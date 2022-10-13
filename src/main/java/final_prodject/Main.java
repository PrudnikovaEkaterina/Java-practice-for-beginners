package final_prodject;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Ship_[][] shipArrayEmpty1 = shipArrayEmpty();
        Ship_[][] shipArrayEmpty2=shipArrayEmpty();
        Ship_[][] shipArrayEmpty3=shipArrayEmpty();
        Ship_[][] shipArrayEmpty4=shipArrayEmpty();

        Board board1 = new Board(shipArrayEmpty1);
        Board board2 = new Board(shipArrayEmpty2);

        Player player1 = new Player(board1, board2, "Игрок_1");

        Board board3 = new Board(shipArrayEmpty3);
        Board board4 = new Board(shipArrayEmpty4);

        Player player2 = new Player(board3, board4, "Игрок_2");


//      Запрашиваем координаты 4-палубного корабля
        int [] array=getCoordinate_4p(player1);
        addShip4p(array, shipArrayEmpty1);
        addOreol(array, shipArrayEmpty1);

//      Запрашиваем координаты для двух з-палубных кораблей
        for (int i=0; i<2; i++){
            int [] array1=getCoordinate_3p(player1);
            int [] array2=addShip3p(array1, shipArrayEmpty1, player1);
            addOreol(array2, shipArrayEmpty1);}

//      Запрашиваем координаты для трех 2-палубных кораблей
        for (int i=0; i<3; i++){
            int [] array1=getCoordinate_2p(player1);
            int [] array2=addShip_2p(array1, shipArrayEmpty1, player1);
            addOreol(array2, shipArrayEmpty1);}

//       Запрашиваем координаты для четырех 1-палубных кораблей
        for (int i=0; i<4; i++){
            int [] array1=getCoordinate_1p(player1);
            int [] array2=addShip_1p(array1, shipArrayEmpty1, player1);
            addOreol(array2, shipArrayEmpty1);}

        player1.print();

        //      Запрашиваем координаты 4-палубного корабля
        int [] arrayS=getCoordinate_4p(player2);
        addShip4p(arrayS, shipArrayEmpty3);
        addOreol(arrayS, shipArrayEmpty3);

//      Запрашиваем координаты для двух з-палубных кораблей
        for (int i=0; i<2; i++){
            int [] array1=getCoordinate_3p(player2);
            int [] array2=addShip3p(array1, shipArrayEmpty3, player2);
            addOreol(array2, shipArrayEmpty3);}

//      Запрашиваем координаты для трех 2-палубных кораблей
        for (int i=0; i<3; i++){
            int [] array1=getCoordinate_2p(player2);
            int [] array2=addShip_2p(array1, shipArrayEmpty3, player2);
            addOreol(array2, shipArrayEmpty3);}

//       Запрашиваем координаты для четырех 1-палубных кораблей

        for (int i=0; i<4; i++){
            int [] array1=getCoordinate_1p(player2);
            int [] array2=addShip_1p(array1, shipArrayEmpty3, player2);
            addOreol(array2, shipArrayEmpty3);}

        player2.print();

        Player.random(player1, player2);



    }


    public static Ship_[][] shipArrayEmpty () {
        Ship_[][] shipArrayEmpty = new Ship_[10][10];
        for (int i = 0; i < shipArrayEmpty.length; i++) {
            for (int y = 0; y < shipArrayEmpty[i].length; y++) {
                shipArrayEmpty[i][y] = Ship_.EMPTY;
            }
        }
        return shipArrayEmpty;}



    public static int[] getCoordinate_4p(Player player) {
        boolean bool=true;
        int[] array = new int[8];
        do {
            try {
            System.out.println(player.getName()+" введите координаты четырехпалубного коробля в формате x1,y1;x2,y2;x3,y3;x4,y4");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] mas = line.split(";");
        if (mas.length != 4)
            throw new RuntimeException();
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            String[] mas2 = mas[i].split(",");
            if (mas2.length != 2) throw new ExceptionValid1();
            for (int y = 0; y < mas2.length; y++)
                if (Integer.parseInt(mas2[y]) >= 0 && Integer.parseInt(mas2[y]) <= 9)
                    array[count++] = Integer.parseInt(mas2[y]);
                else throw new IOException();
        }
        int valid = 0;
        boolean vert;
        for (int i = 0; i < array.length; i++) {
            if (array[1] == array[3] && array[3] == array[5] && array[5] == array[7]) //если индекс 1 3 5 7 равны между собой, значит вертикальный
                vert = true;
            else vert = false;
            if (vert) {
                int a = array[0] + array[1];
                int b = array[6] + array[7];
                if (b - a == 3)
                    valid = 1;
                else valid = 2;
            }
        }
        boolean gor;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[2] && array[2] == array[4] && array[4] == array[6])
                gor = true;
            else gor = false;
            if (gor = true) {
                int a = array[0] + array[1];
                int b = array[6] + array[7];
                if ((b - a) == 3)
                    valid = 1;
                else valid = 2;
            }
        }
        if (valid == 2) {
            throw new ExeptionValid2();
        }
        bool=false;
        }
        catch (RuntimeException e) {
            System.out.println("Некорректный разделитель между парами координат или их количество");
        }
        catch (ExceptionValid1 e) {
            System.out.println("Некорректный разделитель между значениями координат или их количество");
            }
        catch (IOException e) {
            System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
        }
        catch (ExeptionValid2 e) {
            System.out.println("Некорректный корабль, координаты идут непоследовательно");
        }} while (bool);

        return array;
    }



    public static void addShip4p(int [] array, Ship_[][] shipArrayEmpty){
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int y = i + 1; y < i + 2; y++) {
                        shipArrayEmpty[array[i]][array[y]] = Ship_.SHIP_4p;}}

        }




    public static void addOreol(int [] array, Ship_[][] shipArrayEmpty){
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] - 1 >= 0 && array[i] - 1 < 10 && array[y] - 1 >= 0 && array[y] - 1 < 10 &&
                        shipArrayEmpty[array[i] - 1][array[y] - 1] == Ship_.EMPTY)
                    shipArrayEmpty[array[i] - 1][array[y] - 1] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] - 1 >= 0 && array[i] - 1 < 10 && array[y] >= 0 && array[y] < 10 &&
                        shipArrayEmpty[array[i] - 1][array[y]] == Ship_.EMPTY
                )
                    shipArrayEmpty[array[i] - 1][array[y]] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] - 1 >= 0 && array[i] - 1 < 10 && array[y] + 1 >= 0 && array[y] + 1 < 10 &&
                        shipArrayEmpty[array[i] - 1][array[y] + 1] == Ship_.EMPTY
                )
                    shipArrayEmpty[array[i] - 1][array[y] + 1] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] >= 0 && array[i] < 10 && array[y] + 1 >= 0 && array[y] + 1 < 10 &&
                        shipArrayEmpty[array[i]][array[y] + 1] == Ship_.EMPTY)
                    shipArrayEmpty[array[i]][array[y] + 1] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] >= 0 && array[i] < 10 && array[y] - 1 >= 0 && array[y] - 1 < 10 &&
                        shipArrayEmpty[array[i]][array[y] - 1] == Ship_.EMPTY
                )
                    shipArrayEmpty[array[i]][array[y] - 1] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] + 1 >= 0 && array[i] + 1 < 10 && array[y] >= 0 && array[y] < 10 &&
                        shipArrayEmpty[array[i] + 1][array[y]] == Ship_.EMPTY
                )
                    shipArrayEmpty[array[i] + 1][array[y]] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] + 1 >= 0 && array[i] + 1 < 10 && array[y] - 1 >= 0 && array[y] - 1 < 10 &&
                        shipArrayEmpty[array[i] + 1][array[y] - 1] == Ship_.EMPTY
                )
                    shipArrayEmpty[array[i] + 1][array[y] - 1] = Ship_.OREOL;
                else continue;
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            for (int y = i + 1; y < i + 2; y++) {
                if (array[i] + 1 >= 0 && array[i] + 1 < 10 && array[y] + 1 >= 0 && array[y] + 1 < 10 &&
                        shipArrayEmpty[array[i] + 1][array[y] + 1] == Ship_.EMPTY
                )
                    shipArrayEmpty[array[i] + 1][array[y] + 1] = Ship_.OREOL;
                else continue;
            }
        }
    }

    public static int[] getCoordinate_3p(Player player) {
        boolean bool=true;
        int[] array = new int[6];
        do {
            try {
        System.out.println(player.getName()+" введите координаты трех-го коробля в формате x1,y1;x2,y2;x3,y3");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] mas = line.split(";");
        if (mas.length != 3)
            throw new RuntimeException("");
        int c = 0;
        for (int i = 0; i < mas.length; i++) {
            String[] mas2 = mas[i].split(",");
            if (mas2.length != 2) throw new ExceptionValid1();
            for (int y = 0; y < mas2.length; y++)
                if (Integer.parseInt(mas2[y]) >= 0 && Integer.parseInt(mas2[y]) <= 9)
                    array[c++] = Integer.parseInt(mas2[y]);
                else throw new IOException();}
        int valid = 0;
        boolean vert;
        for (int i = 0; i < array.length; i++) {
            if (array[1] == array[3] && array[3] == array[5])
                vert = true;
            else vert = false;
            if (vert) {
                int a = array[0] + array[1];
                int b = array[4] + array[5];
                if (b - a == 2)
                    valid = 1;
                else valid = 2;
            }
        }
        boolean gor;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[2] && array[2] == array[4])
                gor = true;
            else gor = false;
            if (gor = true) {
                int a = array[0] + array[1];
                int b = array[4] + array[5];
                if ((b - a) == 2)
                    valid = 1;
                else valid = 2;
            }
        }
        if (valid == 2) {
            throw new ExeptionValid2();}
            bool=false;
        }
        catch (RuntimeException e) {
                    System.out.println("Некорректный разделитель между парами координат или их количество");
                }
        catch (ExceptionValid1 e) {
                    System.out.println("Некорректный разделитель между значениями координат или их количество");
                }
        catch (IOException e) {
                    System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
                }
        catch (ExeptionValid2 e) {
                    System.out.println("Некорректный корабль, координаты идут непоследовательно");
                }} while (bool);

            return array;
    }

    public static int[] addShip3p(int [] array, Ship_[][] shipArrayEmpty, Player player){
        boolean bool=true;
        do {

            try {
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int y = i + 1; y < i + 2; y++) {
                        if (shipArrayEmpty[array[i]][array[y]] == Ship_.EMPTY)
                            shipArrayEmpty[array[i]][array[y]] = Ship_.SHIP_3p;
                        else throw new RuntimeException();
                    }
                }
                bool=false;
            }
        catch (RuntimeException e) {
            System.out.println("Координаты заняты, попробуйте снова");
            array = getCoordinate_3p(player);
        }
        } while (bool);
        return array;

        }

    public static int[] getCoordinate_2p(Player player) {
        boolean bool=true;
        int[] array = new int[4];
        do {
            try {
                System.out.println(player.getName()+" введите координаты двух-го коробля в формате x1,y1;x2,y2");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String[] mas = line.split(";");
                if (mas.length != 2)
                    throw new RuntimeException("");
                int c = 0;
                for (int i = 0; i < mas.length; i++) {
                    String[] mas2 = mas[i].split(",");
                    if (mas2.length != 2) throw new ExceptionValid1();
                    for (int y = 0; y < mas2.length; y++)
                        if (Integer.parseInt(mas2[y]) >= 0 && Integer.parseInt(mas2[y]) <= 9)
                            array[c++] = Integer.parseInt(mas2[y]);
                        else throw new IOException();}
                int valid = 0;
                boolean vert;
                for (int i = 0; i < array.length; i++) {
                    if (array[1] == array[3])
                        vert = true;
                    else vert = false;
                    if (vert) {
                        int a = array[0] + array[1];
                        int b = array[2] + array[3];
                        if (b - a == 1)
                            valid = 1;
                        else valid = 2;
                    }
                }
                boolean gor;
                for (int i = 0; i < array.length; i++) {
                    if (array[0] == array[2])
                        gor = true;
                    else gor = false;
                    if (gor = true) {
                        int a = array[0] + array[1];
                        int b = array[2] + array[3];
                        if ((b - a) == 1)
                            valid = 1;
                        else valid = 2;
                    }
                }
                if (valid == 2) {
                    throw new ExeptionValid2();}
                bool=false;
            }
            catch (RuntimeException e) {
                System.out.println("Некорректный разделитель между парами координат или их количество");
            }
            catch (ExceptionValid1 e) {
                System.out.println("Некорректный разделитель между значениями координат или их количество");
            }
            catch (IOException e) {
                System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
            }
            catch (ExeptionValid2 e) {
                System.out.println("Некорректный корабль, координаты идут непоследовательно");
            }} while (bool);

        return array;
    }


    public static int[] addShip_2p(int [] array, Ship_[][] shipArrayEmpty, Player player){
        boolean bool=true;
        do {

            try {
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int y = i + 1; y < i + 2; y++) {
                        if (shipArrayEmpty[array[i]][array[y]] == Ship_.EMPTY)
                            shipArrayEmpty[array[i]][array[y]] = Ship_.SHIP_2p;
                        else throw new RuntimeException();
                    }
                }
                bool=false;
            }
            catch (RuntimeException e) {
                System.out.println("Координаты заняты, попробуйте снова");
                array = getCoordinate_2p(player);
            }
        } while (bool);
        return array;

    }


    public static int[] getCoordinate_1p(Player player) {
        boolean bool=true;
        int[] array = new int[2];
        do {
            try {
                System.out.println(player.getName()+" введите координаты одно-го коробля в формате x1,y1");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                String [] mas = line.split(",");
                if (mas.length != 2)
                    throw new RuntimeException("");
                int c = 0;
                for (int i = 0; i < mas.length; i++) {
                        if (Integer.parseInt(mas[i]) >= 0 && Integer.parseInt(mas[i]) <= 9)
                            array[c++] = Integer.parseInt(mas[i]);
                        else throw new IOException();
                    bool=false;}
            }
            catch (RuntimeException e) {
                System.out.println("Некорректный разделитель между координатами или их количество");
            }
                       catch (IOException e) {
                System.out.println("Некорректные значения координат (значения могут быть от 0 до 9)");
            }
            } while (bool);

        return array;
    }

    public static int[] addShip_1p(int [] array,Ship_[][] shipArrayEmpty , Player player){
        boolean bool=true;
        do {

            try {
                for (int i = 0; i < array.length - 1; i += 2) {
                    for (int y = i + 1; y < i + 2; y++) {
                        if (shipArrayEmpty[array[i]][array[y]] == Ship_.EMPTY)
                            shipArrayEmpty[array[i]][array[y]] = Ship_.SHIP_1p;
                        else throw new RuntimeException();
                    }
                }
                bool=false;
            }
            catch (RuntimeException e) {
                System.out.println("Координаты заняты, попробуйте снова");
                array = getCoordinate_1p(player);
            }
        } while (bool);
        return array;}

}







package day12.task4;
// *Выполнять в подпапке task4 в day12*
//Скопировать MusicBand из прошлого задания и доработать таким образом,
// чтобы в группу можно было добавлять и удалять участников списком (по несколько участников за раз,
// а не по одному). Под участником понимается строка (String) с именем и фамилией.
// Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
// Название метода: transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
// В классе MusicBand,реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(),
// возвращающий список участников.
//Проверить состав групп после слияния.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members=new ArrayList<>(Arrays.asList(new String("Mary"), new String("Nik")));
        MusicBand musicBand=new MusicBand("ABBA", 1989, members);


        MusicBand musicBand1=new MusicBand("ONO", 1999, new ArrayList<>(Arrays.asList(new String("Kate"), new String("Ivan"))));


        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand1.printMembers();


    }
}

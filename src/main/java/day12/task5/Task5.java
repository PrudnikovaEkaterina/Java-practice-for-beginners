package day12.task5;
//5. *Выполнять в подпапке task5 в day12*
//Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только
// имя, но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
// Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
// чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое,
// что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
// Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
// чтобы они работали с объектами класса MusicArtist.

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand=new MusicBand("ABBA", 1989, new ArrayList<>(Arrays.asList(new MusicArtist("Kate",33),new MusicArtist("Ivan", 20))));
        MusicBand musicBand1=new MusicBand("ONO", 1999, new ArrayList<>(Arrays.asList(new MusicArtist("Mary",30),new MusicArtist("Kris", 29))));
        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand1.printMembers();

    }
}

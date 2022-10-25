package day12.task3;
// *Выполнять в подпапке task3 в day12*
//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
// Создать 10 или более экземпляров класса MusicBand , добавить их в список
// (выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
// Перемешать список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список,
// состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands)
// в методе main() на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами,
// основанными после 2000 года).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> listMusicBand=new ArrayList<>(Arrays.asList(new MusicBand("Abba", 1989), new MusicBand("QQQ", 2000),
                new MusicBand("WWW", 2012), new MusicBand("EEE", 1992), new MusicBand("RRR", 1996),
                new MusicBand("TTT", 2018), new MusicBand("UUU", 2015), new MusicBand("III", 2002),
                new MusicBand("OOO", 2015), new MusicBand("PPP", 1997)));
        System.out.println(listMusicBand);
        System.out.println(groupsAfter2000(listMusicBand));

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000=new ArrayList<>();
        for (int i=0; i<bands.size(); i++){
            if (bands.get(i).getYear()>2000){
                groupsAfter2000.add(bands.get(i));
            }
        }
        return groupsAfter2000;
    }
}

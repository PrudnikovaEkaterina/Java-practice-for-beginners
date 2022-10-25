package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private List<String> members;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members=members;
    }

    public List<String> getMembers() {
        return members;
    }
    public void printMembers() {
        for (int i=0; i<members.size(); i++){
            System.out.println(members.get(i));
        }
    }

    public static void transferMembers(MusicBand musicBand, MusicBand musicBand1){
        musicBand1.getMembers().addAll(musicBand.getMembers());
    }

    public String toString(){
        return name+" "+year+" "+members;
    }
}

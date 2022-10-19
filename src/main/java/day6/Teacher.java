package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public String getObject() {
        return object;
    }
//    "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
    public void evaluate (Student student){
        Random random=new Random();
        int evaluate =random.nextInt((5-2)+1)+2;
        String ev=null;
        switch (evaluate){
            case 2:
                ev="неудовлетворительно";
                break;
            case 3:
                ev="удовлетворительно";
                break;
            case 4:
                ev="хорошо";
                break;
            case 5:
                ev="отлично";
                break;
        }
        System.out.println(getName()+" оценил студента с именем "+student.getName()+" по предмету "+getObject()+" на оценку "+ev);
    }
}

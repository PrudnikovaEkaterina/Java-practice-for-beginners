package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages=new ArrayList<>();
    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1,u2, text));
    }
    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (int i=0; i<messages.size(); i++){
            if (messages.get(i).getSender()==u1&&messages.get(i).getReceiver()==u2){
                System.out.println(messages.get(i).getSender().getUsername()+": "+ messages.get(i).getText()+"\n");
            }
            if (messages.get(i).getSender()==u2&&messages.get(i).getReceiver()==u1){
                System.out.println(messages.get(i).getSender().getUsername()+": "+ messages.get(i).getText()+"\n");
            }
        }
    }


//    public static void addNewMessage(User u1, User u2, String text) - этот метод “отправляет”
//    новое сообщение от пользователя u1 пользователю u2 с текстом text.
//    Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
//public static List<Message> getMessages() - возвращает список всех сообщений в “базе данных”.
//public static void showDialog(User u1, User u2) - этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
//
//user1: Привет!
//user2: Привет, user1!
//user1: Как у тебя дела?
//user2: Все ок, спасибо :)
}

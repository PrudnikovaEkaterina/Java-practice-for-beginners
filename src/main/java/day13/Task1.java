package day13;
//https://docs.google.com/document/d/1xkE_wQOGa_nQia8hToWQEXqAkpVSJrgdqZA0inX20E0/edit - ссылка на задание, если коротко -
//Нам необходимо создать свою небольшую социальную сеть на Java.
//
//        Для этого мы должны реализовать следующие классы:
//        User - сущность “Пользователь”
//        Message - сущность “Сообщение”
//        MessageDatabase - класс, который будет заниматься хранением сообщений
//        Task1 - класс, где в методе main() мы будем тестировать нашу соц. сеть


public class Task1 {
    public static void main(String[] args) {
        User user=new User("Kate");
        User user1=new User("Nastya");
        User user2=new User("Ivan");
        user.sendMessage(user1, "Привет!");
        user.sendMessage(user1, "Как дела!");
        user1.sendMessage(user, "Нормально");
        user1.sendMessage(user, "Я на работе");
        user1.sendMessage(user, "А ты?");
        user2.sendMessage(user, "Привет, ты дома?");
        user.sendMessage(user2, "А ты домой едешь?");
        user.sendMessage(user2, "Или еще нет?");
        user.sendMessage(user2, "Купи хлеба");
        user2.sendMessage(user, "Хорошо");
        MessageDatabase.showDialog(user, user2);




    }
}

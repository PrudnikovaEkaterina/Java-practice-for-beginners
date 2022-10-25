package day13;

import java.util.List;

public class User {
    private String username;
    private List<User>subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions=null;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public String toString() {
        return username;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        if (subscriptions.contains(user))
            return true;
        else return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

//    public void subscribe(User user) - подписывает пользователя на пользователя user
//
//    public boolean isSubscribed(User user) - возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
//
//    public boolean isFriend(User user) - возвращает True, если пользователь user является другом и False, если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
//
//    public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
//


}

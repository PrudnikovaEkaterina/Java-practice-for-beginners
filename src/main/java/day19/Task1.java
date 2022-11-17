package day19;
//1. В папке resources находится файл dushi.txt. Этот файл содержит в себе полный текст произведения
// “Мертвые души” Н. В. Гоголя. Вам необходимо прочитать этот файл и, используя структуру данных HashMap,
// подсчитать, сколько раз в этом произведении было использовано каждое слово. После того, как подсчет будет
// произведен, вам необходимо вывести в консоль 100 самых часто используемых слов. Изучите вывод и посмотрите,
// сколько раз в произведении было использовано слово “Чичиков” (фамилия главного героя).
// Это число выпишите в коде в виде комментария (например: // Чичиков - 120).

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/user/Рабочий стол/JavaMarathon2022/src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        HashMap <String, Integer> map = new HashMap<>();

        while (scanner.hasNext()){
            String line=scanner.next();
            int count=1;
            if (map.containsKey(line))
                map.put(line, (map.get(line)+1));
            else
                map.put(line, count);

        }
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((a, b) -> b - a)).limit(20)
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

//        Чичиков - 601


    }
}

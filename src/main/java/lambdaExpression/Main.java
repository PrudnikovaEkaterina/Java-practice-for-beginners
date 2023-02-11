package lambdaExpression;

import java.util.Arrays;
import java.util.function.Consumer;


//   создала функциональный интерфейс
   interface MyInterface{
        public void methInterface();
    }

//    создала свой класс, в котором есть 1 метод, который принимает в качестве аргумента
//    объект интерфейса и в теле на объекте интерфейса вызывает метод, который прописан в интерфейсе

    class MyClass {
        public void methClass(MyInterface myInterface) {
            myInterface.methInterface();
        }
    }


public class Main {
    public static void main(String[] args) {

//        cоздаем анонимный класс, в котором переопределяем метод run
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });

//  В 8 java появились лямбда выражения.  Лямда - анонимная функция//метод без названия;
//  Заменяет анонимный класс.
//  Подходит только для функциональных интерфейсов (интерфейс с 1 методом);
//  Runnable - это интерфейс, в нем есть только 1 метод run, значит это функциональный интерфейс; если посмотреть, у него даже есть аннотация @FunctionalInterface
//  Значит вместо созданиня анонимного класса можно написать лямбда выражение
//  ()->System.out.println("Hello")

        Thread thread1=new Thread(()->
                System.out.println("HELLO"));

        thread.start();
        thread1.start();



        MyClass myClass = new MyClass();

//        на обҹекте MyClass вызвала метод, в аргументах которого нужно создатғ обҹект интерфейса MyInterface
//        1-й вариант - анонимный класс, 2-й вариант - лямбда выражение

//        myClass.methClass(new MyInterface() {
//            @Override
//            public void methInterface() {
//                System.out.println("Hi");
//            }
//        });

        myClass.methClass(()-> System.out.println("Hi"));

//        ПРАВИЛА ЛЯММБДА ВЫРАЖЕНИЙ:
//        1. Если в теле метода одна запись, фигурные скобки можно не использовать, если несколько - использовать;
       myClass.methClass(()-> System.out.println("Hi"));
       myClass.methClass(()-> {
           System.out.println("Hi");
           System.out.println("By");
                               }
                          );
//        2. Если метод функционального интерфейса имеет тип возвращаемого значения public int methInterface() {return 10;}
//        то тип возвращаемого значения и слово return можно не писать
//        myClass.methClass(()-> 10);
//
//        3. Если метод функционального интерфейса принимает на вход аргументы  public int methInterface(int a, int b) {return a+b;}
//        то лямбда будет выглядеть так: myClass.methClass((a,b)-> a+b);
//
//        4. Если метод функционального интерфейса принимает на вход 1 аргумент,
//        то лямбда будет выглядеть так: myClass.methClass(a-> System.out.println(a));

        final String x="Lambda";
        myClass.methClass(()-> System.out.println(x));
//        в лямбда выражениях можно использовать другие переменные (х), но только если у них модификатор final (нельзя менять)

        String a="Lambda";

        myClass.methClass(new MyInterface() {
            @Override
            public void methInterface() {
                String a = "Lambda в методе";
            }
        });

//
//        myClass.methClass(()->{
//            String a="Lambda в лямбде";
//            System.out.println(a);
//        });
//       Еще одно отличие между методом и лямбда выражением, у последнего нет своей области видимости.
//       Так я создала пременную String a="Lambda". В методе я могу создать еще одну переменную String a;
//       А в лямбда выражении если я создам  String a, то среда разработки выдаст ошибку, так как у лямбда нет своего скопа;

}}

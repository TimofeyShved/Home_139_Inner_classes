package com.company;

/**
 * В этом главном классе, примере создадим вложенный класс и вызовем его
 */
public class Main {

    /**
     * Здесь создадим переменные, в том числе статические и приватные
     */
    static int a = 2;
    int b = 7;
    private static int c = 3;
    private int d = 1;

    /**
     * Можно создать экземпляр класса, внутри класса который создаст его
     */
    Innner innner = new Innner();

    /**
     * Так же и внутри метода
     */
    void method(){
        Innner innner = new Innner();
    }

    /**
     * Вложенный класс, причем он работает со всеми переменными, даже приватными (︶︹︺)
     * Запрещено использовать внутри него статические классы!  (＃＞＜)
     */
    class Innner{
        int aa = a;
        int bb = b;
        int cc = c;
        int dd = d;
        void method(){
            int sum = a+b+c+d;
            System.out.println(sum);
        }
    }

    /**
     * Создадим и вызовем метод у вложенного класса
     * @param args
     */
    public static void main(String[] args) {
        // 1 способ объявления вложенного класса
	    Main main = new Main();
	    Innner innner = main.new Innner();

	    innner.method();

	    OtherClass otherClass = new OtherClass();
	    otherClass.string();
    }
}

class OtherClass{
    // 2 способ объявления вложенного класса
    Main.Innner innnerOther = new Main().new Innner();

    void string(){
        innnerOther.method();
    }
}

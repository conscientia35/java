public class FirstClass {
    public static void main(String[] args) {

        // Первое задание
        int a = 3;
        int b = 4;
        int c = 12;
        int d = 6;
        System.out.println("Первое задание:");
        System.out.println(myMath(a, b, c, d));

        // Второе задание
        a = 5;
        b = 7;
        System.out.println("Второе задание:");
        if (myBoolean(a,b) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Третье задание
        a = 9;
        System.out.println("третье задание");
        if (myPosNeg(a) == true) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        // четвертое задание
        String n = "Ekaterina";
        System.out.println("четвертое задание");
        System.out.println(name(n));

        // пятое задание
        a = 2020;
        System.out.println("пятое задание");
        if (Visok(a) == true) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }


    //метод первого задания
    public static float myMath(int a, int b, int c, int d) {
        return a * (b + ((float)c / d));
    }

    // метод второго задания
    public static boolean myBoolean (int a, int b) {

        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // метод третьего задания
    public static boolean myPosNeg (int a){
        if ( a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // метод четвертого задания
    public static String name(String n){
        return "Hello "+n;
        }

    // метод пятого задания
    public static boolean  Visok(int a) {
        int b = a % 4;
        int c = a % 400;
        int d = a % 100;
        if (b == 0 || c == 0) {
            if (d != 0) {
                return true;
            }
        }
    return false;
    }


// конец класса FirstClass
}



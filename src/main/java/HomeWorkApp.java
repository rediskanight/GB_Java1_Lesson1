public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana,");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 3;
        int b = -11;
        a +=  b;
        System.out.println(a);
        if(a >=0){
            System.out.println("Сумма положительная");}
            else {
                System.out.println("Сумма отрицательная");
            }
        }
    public static void  printColor() {
        int value = 100;
        System.out.println(value);
        if (value <= 0){
            System.out.println("Красный");}
            else if(value > 100){
                System.out.println("Зеленый");}
                else{
                    System.out.println("Желтый");
                }

            }
    public static void  compareNumbers(){
        int a = -1;
        int b = 3;
        if(a >= b){
            System.out.println("a >= b");}
            else if (a < b){
                System.out.println("a < b");}
                else{
                    System.out.println("что-то непредвиденное");}
    }
}


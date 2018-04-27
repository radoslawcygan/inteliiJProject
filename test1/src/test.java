public class test {
    public static void main(String[] args){
        System.out.println("Hello World");

        int i = 0;
        System.out.println(Integer.toString(i));
        metoda1("Tu nic nie ma");
        int t = trzy();
        String s = String.valueOf(suma(2, t));
        metoda1(s);
    }

    public static void metoda1(String opis){
        System.out.println(opis);
    }

    public static int trzy(){
        return 3; // ta metoda zwraca liczbę 3
    }

    public static int suma(int a, int b){
        return a+b;  //ta metoda zwraca sumę dwóch parametrów
    }

}

package l17.time;

public class LocalTime {
    public static void main(String[] args) {
        java.time.LocalTime time = java.time.LocalTime.now();
        System.out.println("Зараз = " + time);
    }
}

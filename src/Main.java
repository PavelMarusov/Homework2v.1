public class Main {

    public static void main(String[] args) {
        generateRandomAge();
    }

    public static int generateRandomAge() {
        int a = (int) (Math.random() * 107);
        System.out.println(a);
        return (a);

    }




}

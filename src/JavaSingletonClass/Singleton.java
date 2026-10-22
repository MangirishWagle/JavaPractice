package JavaSingletonClass;

class Singleton {

    // 1. Create a private static object
    private static Singleton obj = new Singleton();

    // 2. Make constructor private
    private Singleton() {
    }

    // 3. Provide a public method to access the object
    public static Singleton getInstance() {
        return obj;
    }

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
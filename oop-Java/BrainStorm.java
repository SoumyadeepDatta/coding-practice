public class BrainStorm {
        public static class Inner extends BrainStorm{
            public static void main(String[] args) {
                System.out.println("World");
            }
        }
        public static void main(String[] args) {
            System.out.println("Do nothing");
        }
}
class Test extends BrainStorm{
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// Q. Which main method will be called by default ? Why ?
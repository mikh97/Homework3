public class Main {

    public static String[] filter(String[] a, Filter f){
        int increment = 0;
        for(String n : a) {
            if( f.accept(n)) increment++;
        }

        String[] strings = new String[increment];
        int index = 0;
        for(String n : a){
            if(f.accept(n)) strings[index++] = n;
        } return strings;
    }

    public static int[] filter(int[] a, Filter f){
        int increment = 0;
        for(Integer n : a){
            if(f.accept(n)) increment++;
        }

        int[] positive = new int[increment];
        int index = 0;
        for(Integer n : a){
            if(f.accept(n)) positive[index++] = n;
        } return positive;
    }

    public static void main(String[] args) {
        String[] strings = {"graph", "keeps", "disappearing", "microwave", "air", "college", "nope"};
        int[] numbers = {-2, -12, -1, 9, 3, 1, -7};

        String[] longStrings = filter(strings, X -> ((String)(X)).length()>=9);
        int[] positiveNumbers = filter(numbers, X -> ((Integer)(X))>=0);

        System.out.println("\nLong Strings:");
        for(String s : longStrings) System.out.println(s);
        System.out.println();

        System.out.println("\nPositive Numbers:");
        for(int pos : positiveNumbers) System.out.println(pos);

    }
}

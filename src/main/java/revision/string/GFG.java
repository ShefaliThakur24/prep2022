package revision.string;

public class GFG {
    private GFG(Object o) {
        System.out.println("Object");
    }
    private GFG(double[] d) {
        System.out.println("double array");
    }
    public static void main(String[] args) {
        new GFG(null);
    }
}


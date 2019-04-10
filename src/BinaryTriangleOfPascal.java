public class BinaryTriangleOfPascal {
    public static void main(String[] args) {
        int a = 42;
        int b = 54;
        int c;
        c = a ^ b;
        System.out.println(Integer.toBinaryString(c >> 2));
        a = b ^ c;
        System.out.println(Integer.toBinaryString(a >> 2));
        b = c ^ a;
        System.out.println(Integer.toBinaryString(b >> 2));
        c = a ^ b;
        System.out.println(Integer.toBinaryString(c << 2));
    }
}

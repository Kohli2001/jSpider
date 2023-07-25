class Program5{

    public static int printAscii(char a, char b) {
        a -= 48;
        b -= 48;
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(printAscii('1' ,'8'));

        char c1 = '1';
        char c2 = '8';
        int c = c1+ c2;

        System.out.println(c);
    
        
    }
}
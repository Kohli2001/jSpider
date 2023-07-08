class program8{
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 5;
        System.out.println(x>y && x>z);
        System.out.println(x>y || x>z);
        System.out.println(!(x>y) && x>z);
        System.out.println(x>y || x>z && x<y);
        System.out.println(x>y && x>z);
        System.out.println(x>y || (x>z&&y<z));
    }
}
class program3 {
    public static void main(String[] args) {
        int[] a1 = {12,45,67,89,90};

        System.out.println("Forward traverse");
        for(int i= 0; i<=4; i++){
            System.out.println(a1[i] +" ");

        }

        System.out.println("Reverse traverse");
        for(int j=4; j >=0; j--){
            System.out.println(a1[j]+" ");
        }
    }
}
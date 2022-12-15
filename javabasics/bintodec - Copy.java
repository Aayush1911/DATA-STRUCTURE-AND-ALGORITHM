public class bintodec {

    public static void dec(int bin) {
        int pow = 0;
        int d = 0;
        while(bin>0){
            int last = bin%10;
            d = d + (last * (int)Math.pow(2, pow));
            pow++;
            bin = bin / 10;
            

        }
        System.out.println(d);
    }

    public static void main(String[] args) {
        dec(1000);

    }

}

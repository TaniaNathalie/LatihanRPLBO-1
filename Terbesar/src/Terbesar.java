public class Terbesar {
    int bil1;
    int bil2;
    int bil3;

    public void setBilangan(int b1,int b2,int b3){
        bil1 = b1;
        bil2 = b2;
        bil3 = b3;
    }
    public int hitungTerbesar(){
        if (bil1 >= bil2 && bil1 >= bil3) return bil1;
        else if (bil2 >= bil1 && bil2 >= bil3) return bil2;
        else if(bil3 >= bil1 && bil3 >= bil2) return bil3;
        return -1;
    }
    public static void main(String[] args){
        Terbesar t = new Terbesar();
        int a,b,c;
        if (args.length != 3){
            System.out.println("Input salah!");
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            t.setBilangan(a,b,c);
            System.out.println("Bilangan terbesar ="+t.hitungTerbesar());
        }
    }
}

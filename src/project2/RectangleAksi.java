package project2;

public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        
        r1.panjang = 9;
        r1.lebar = 3;
        
        r1.cetakinfo();
        System.out.println("luas rectangle = "+r1.hitungLuas());
        r1.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakinfo();
        
        Rectangle r3 = new Rectangle(50,30);
        r3.cetakinfo();
    }
    
}

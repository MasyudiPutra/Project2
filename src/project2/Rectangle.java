package project2;
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakinfo(){
        
        System.out.println("====================");
        System.out.println("panjang = "+panjang);
        System.out.println("lebar = "+lebar);
        System.out.println("====================");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    void cetakLuas(){
        System.out.println("Luasnya adalah :"+hitungLuas());
    }
}

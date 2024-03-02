package Laporan;

public class Segitiga {
    public int alas;
    public int tinggi;
    public double miring;
    
 
    public Segitiga (int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungLuas() {
        double luas = alas * tinggi * 1/2;     
        return luas ;
    }

    public double hitungSisiMiring() {

        double alas2 = Math.pow(alas,2);
        double tinggi2 = Math.pow(tinggi, 2);
        miring = Math.sqrt(alas2 + tinggi2);
        return miring;
    }

    double hitungKeliling() {
    double keliling = alas + miring + tinggi;
        return keliling;
    }
        
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga " + (i+1) + ", Luas permukaan: " + sgArray[i].hitungLuas() + ", Keliling: "+ sgArray[i].hitungKeliling());
        }

    }
}



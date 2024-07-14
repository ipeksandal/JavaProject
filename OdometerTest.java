public class OdometerTest {
    public static void main(String[] args) {
        Odometer odometer = new Odometer();
        odometer.toplamMesafe(100);
        System.out.println("Aracın gittiği toplam kilometre : " + odometer.getMesafe());
        odometer.sayacSifirlama();
        System.out.println("Sayaç sıfırlandı : " + odometer.getMesafe());
        odometer.setVerimlilik(0.80);
        odometer.toplamMesafe(120);
        System.out.println("Son sıfırlamadan bu yana harcanan benzin miktarı : " +
                odometer.toplamBenzinMiktari());
        odometer.toplamMesafe(150);
        System.out.println("Aracın aldığı toplam mesafe : " +
                odometer.getMesafe() + " km" +"\n"+ "Yaktığı benzin miktarı : "+
                odometer.toplamBenzinMiktari() + " litre." +"\n" +
                "Aracın benzin verimliliği : " + odometer.getVerimlilik());


    }
}

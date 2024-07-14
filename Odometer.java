public class Odometer {
    private double mesafe = 0.0;
    private double verimlilik = 0.0;
    public double getMesafe() {
        return mesafe;
    }
    public double getVerimlilik() {
        return verimlilik;
    }
    public void setVerimlilik(double verimlilikDegeri) {
        verimlilik = verimlilikDegeri;
    }
    public double sayacSifirlama(){
        return mesafe = 0;
    }
    public void toplamMesafe(double yol){
        mesafe += yol;
    }
    public double toplamBenzinMiktari(){
        return ( verimlilik * 100 ) / mesafe;
    }
}

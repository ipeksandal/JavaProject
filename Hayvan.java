public class Hayvan {
    private String turAdi;
    private double populasyon;
    private double buyumeOrani;
    public Hayvan(String ad, double pop, double oran){
        turAdi = ad;
        populasyon = pop;
        buyumeOrani = oran / 100;
    }
    public String getTurAdi() {

        return turAdi;
    }
    public void setTurAdi(String yeniTurAdi) {

        turAdi = yeniTurAdi;
    }
    public double getPopulasyon() {

        return populasyon;
    }
    public void setPopulasyon(double yeniPopulasyon) {

        populasyon = yeniPopulasyon;
    }
    public double getBuyumeOrani() {
        return buyumeOrani;
    }
    public void setBuyumeOrani(double yeniBuyumeOrani) {
        buyumeOrani = yeniBuyumeOrani / 100;
    }
    public boolean turTehlikedeMi(){
        if (buyumeOrani<0){
            return true;
        }
        else {
            return false;
        }

    }
}
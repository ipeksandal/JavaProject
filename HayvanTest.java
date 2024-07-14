public class HayvanTest {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Geyik", 100.0, -10.0);
        System.out.println("Tür adı : " +hayvan.getTurAdi() + "\n" +
                "Popülasyon : " +hayvan.getPopulasyon() + "\n" +
                "Büyüme oranı : " + hayvan.getBuyumeOrani());
        System.out.println("Tür tehlike mi ---> " + hayvan.turTehlikedeMi());
        hayvan.setTurAdi("Aslan");
        hayvan.setPopulasyon(16.710);
        hayvan.setBuyumeOrani(45);
        System.out.println("Tür adı : " + hayvan.getTurAdi() + "\n"
        + "Popülasyon : " + hayvan.getPopulasyon() + "\n"
        + "Büyüme oranı : " + hayvan.getBuyumeOrani());
        System.out.println("Tür tehlikede mi ---> " + hayvan.turTehlikedeMi());
    }
}

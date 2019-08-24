package h适配器模式与外观模式.外观模式;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, light, popper);
        homeTheaterFacade.watchMovie("Raiders of the lost Ark");
        homeTheaterFacade.endMovie();
    }
}

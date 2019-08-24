package h适配器模式与外观模式.外观模式;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    Dvdplayer dvd;
    Cdplayer cd;
    Projector projector;
    TheaterLight light;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
            Tuner tuner,
            Dvdplayer dvd,
            Cdplayer cd,
            Projector projector,
            TheaterLight light,
            Screen screen,
            PopcornPopper popper,) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.light = light;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop;
        light.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on;
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolumn(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        light.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}

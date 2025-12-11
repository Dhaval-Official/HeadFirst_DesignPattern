package C7_Adapter_Patterns.P2_FacadePattern;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("HomeTheatre", amp);
        StreamingPlayer player = new StreamingPlayer("Sony Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Projector Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

        homeTheater.watchMovie("Avengers Doomsday");
        homeTheater.endMovie();
    }
}
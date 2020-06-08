package design.facade;

public class HomeTheaterFacade {
	
	//���������ϵͳ����
	private TheaterLight  theaterLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Screan screan;
	private Projector projector;
	private DVDPlayer dvd;
	//������
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.screan = Screan.getInstance();
		this.projector = Projector.getInstance();
		this.dvd = DVDPlayer.getInstance();
	}
	//������4��
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screan.down();
		projector.on();
		stereo.on();
		dvd.on();
		theaterLight.dim();
	}
	
	public void play() {
		dvd.play();
	}
	public void pause() {
		dvd.pause();
	}
	public void end() {
		popcorn.off();
		theaterLight.bright();
		screan.up();
		projector.off();
		stereo.off();
		dvd.off();
	}




}

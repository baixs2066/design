package design.facade;

public class HomeTheaterFacade {
	
	//定义各个子系统对象
	private TheaterLight  theaterLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Screan screan;
	private Projector projector;
	private DVDPlayer dvd;
	//构造器
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.screan = Screan.getInstance();
		this.projector = Projector.getInstance();
		this.dvd = DVDPlayer.getInstance();
	}
	//操作分4步
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

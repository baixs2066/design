package design.facade;

public class Client {
	
	public static void main(String[] args) {
		
		HomeTheaterFacade home = new HomeTheaterFacade();
		home.ready();
		home.play();
		
		home.pause();
		home.end();
		
	}

}

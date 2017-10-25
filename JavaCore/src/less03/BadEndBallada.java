package less03;

public class BadEndBallada implements Ballada {
	
	private final Ballada ballada;

	public BadEndBallada(Ballada ballada) {
		this.ballada = ballada;
	}

	@Override
	public void song() {
		ballada.song();
		System.out.println("People: Boo-boo-boo");
		
	}
	
	

}

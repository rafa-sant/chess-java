package boardgame;

public class Piece {
	
	protected Position position;
	/* posição protected pois ela é uma pos simples de matriz e não ainda do jogo, n pode ser 
	 * visível para o jogo*/
	private Board board;
	
	public Piece(Board board)
	{
		this.board = board;
		position = null;
	}
	
	protected Board getBoard()
	{
		return board;
	}
	// somente classes dos mesmo pacote e subclasses poderão acessar o tabuleiro de uma peça
	
	// posição de uma peça recem criada deve ser nulo!

}

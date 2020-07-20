package boardgame;

public class Piece {
	
	protected Position position;
	/* posi��o protected pois ela � uma pos simples de matriz e n�o ainda do jogo, n pode ser 
	 * vis�vel para o jogo*/
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
	// somente classes dos mesmo pacote e subclasses poder�o acessar o tabuleiro de uma pe�a
	
	// posi��o de uma pe�a recem criada deve ser nulo!

}

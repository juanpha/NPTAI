import connectK.CKPlayer;
import connectK.BoardModel;
import java.awt.Point;

public class NPTAI extends CKPlayer {

	public NPTAI(byte player, BoardModel state) {
		super(player, state);
		teamName = "NPTAI";
	}

	
	// This is were our code will go.
	@Override
	public Point getMove(BoardModel state) {
		// Need to rewrite this part for Sunday
		for(int i=0; i<state.getWidth(); ++i)
			for(int j=0; j<state.getHeight(); ++j)
				if(state.getSpace(i, j) == 0)
					return new Point(i,j);
		return null;
	}

	@Override
	public Point getMove(BoardModel state, int deadline) {
		return getMove(state);
	}
}
//laptop	
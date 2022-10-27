package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces=chessPieces;
    }

    public ChessPiece[][] getChessPieces() {
        return chessPieces;
    }

    public void print(){
        for (int i=0; i<chessPieces.length; i++){
            for (int y=0;  y<chessPieces[i].length; y++){
                System.out.print(chessPieces[i][y]);
            }
            System.out.println();
        }
    }
}

package day17;
// Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY.
// Эта “фигура” будет обозначать пустое пространство на шахматной доске.
// Ценность этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию ("_").
//Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в единственном аргументе конструктора
// должен принимать на вход двумерный массив шахматных фигур. Этот двумерный массив задает конфигурацию
// фигур на шахматной доске. Пустое пространство на шахматной доске задается с помощью значения EMPTY.
// Также, у класса ChessBoard должен быть реализован метод print(), который выводит шахматную доску в консоль.
//В методе main() класса Task2 создайте новый объект класса ChessBoard,
// передав ему в качестве аргумента двумерный массив с расположением фигур как на картинке ниже
// (матч Крамник - Каспаров 2000 года).

//Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения
// шахматных фигур.
//Вывод в консоль должен быть таким:
//
//♜____♜♚_
//_♖__♟♟_♟
//♟_♞___♟_
//♛__♗____
//___♝♙___
//____♗♙__
//♙__♕_♙_♙
//_____♖♔_

import java.util.concurrent.Callable;

public class Task2 {
    public static void main(String[] args) {
       ChessPiece [][] chessPieces=new ChessPiece[8][8];
       chessPieces[0][0]=ChessPiece.ROOK_BLACK;
       chessPieces[0][1]=ChessPiece.EMPTY;
       chessPieces[0][2]=ChessPiece.EMPTY;
       chessPieces[0][3]=ChessPiece.EMPTY;
       chessPieces[0][4]=ChessPiece.EMPTY;
       chessPieces[0][5]=ChessPiece.ROOK_BLACK;
       chessPieces[0][6]=ChessPiece.KING_BLACK;
       chessPieces[0][7]=ChessPiece.EMPTY;
       chessPieces[1][0]=ChessPiece.EMPTY;
       chessPieces [1][1]=ChessPiece.ROOK_WHITE;
       chessPieces [1][2]=ChessPiece.EMPTY;
       chessPieces [1][3]=ChessPiece.EMPTY;
       chessPieces [1][4]=ChessPiece.PAWN_BLACK;
       chessPieces [1][5]=ChessPiece.PAWN_BLACK;
       chessPieces [1][6]=ChessPiece.EMPTY;
       chessPieces [1][7]=ChessPiece.PAWN_BLACK;
       chessPieces [2][0]=ChessPiece.PAWN_BLACK;
       chessPieces [2][1]=ChessPiece.EMPTY;
       chessPieces [2][2]=ChessPiece.KNIGHT_BLACK;
       chessPieces [2][3]=ChessPiece.EMPTY;
       chessPieces [2][4]=ChessPiece.EMPTY;
       chessPieces [2][5]=ChessPiece.EMPTY;
       chessPieces [2][6]=ChessPiece.PAWN_BLACK;
       chessPieces [2][7]=ChessPiece.EMPTY;
       chessPieces [3][0]=ChessPiece.QUEEN_BLACK;
//       дальше лень.. но суть ясна



       ChessBoard chessBoard=new ChessBoard(chessPieces);
       chessBoard.print();
    }

}

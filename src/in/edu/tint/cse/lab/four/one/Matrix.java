package in.edu.tint.cse.lab.four.one;

public class Matrix {
    private int row;
    private int col;
    private int[][] matrix;
    Matrix(int row, int col){
        this.row = row;
        this.col = col;
        this.matrix = new int[row][col];
    }
    public void setElementAt(int rowNo, int colNo, int value) {
        matrix[rowNo][colNo] = value;
    }

    public int getElementAt(int rowNo, int colNo){
        return matrix[rowNo][colNo];
    }

    public static Matrix add(Matrix a, Matrix b) throws AdditionNotPossibleException{
        Matrix result;
        if(b.row == a.row && b.col == a.col) {
            result = new Matrix(a.row, a.col);
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < a.col; j++) {
                    result.setElementAt(i, j, (a.getElementAt(i, j) + b.getElementAt(i, j)));
                }
            }
        }
        else {
            throw new AdditionNotPossibleException();
        }
        return result;
    }

    @Override
    public String toString() {
        String mtx = "";
        for (int i = 0; i < matrix.length; i++) {
            mtx = mtx+"[ ";
            for (int j = 0; j < matrix[i].length; j++) {
                mtx = mtx + matrix[i][j] + " ";
            }
            mtx = mtx + "]\n";
        }
        return "\n" + mtx;
    }
}

package src;

public class Matrix {
    private static double matrix[][];
    private static int totalRow = 0;
    private static int totalColumn = 0;

    public Matrix(double[][] matrix){
        this.matrix = matrix;
        this.totalRow = matrix[0].length;
        this.totalColumn = matrix.length;
    }

    double[][] multiply(int value){
        for(int i=0; i<this.totalColumn; i++)
            for(int j=0; j<this.totalRow; j++){
                this.matrix[i][j] = this.matrix[i][j] * value;
            }
        return this.matrix;
    }

    double[][] multiplyMatrix(double[][] takenMatrix){
        for(int i=0; i<this.totalColumn; i++)
            for(int j=0; j<this.totalRow; j++){
                this.matrix[i][j] = this.matrix[i][j] * takenMatrix[i][j];
            }

        return this.matrix;
    }

    void print(){
        for(int i=0; i<this.totalColumn; i++)
            for(int j=0; j<this.totalRow; j++){
                System.out.println(this.matrix[i][j]);
            }
    }

    static void mulitplyMatrixSecond(double[][] takenMatrix){
        double result[][] = new double[totalColumn][totalRow];

        for(int i=0; i<totalColumn; i++)
            for(int j=0; j<totalRow; j++){
                result[i][j] = matrix[i][j]*takenMatrix[i][j];
                System.out.println(result[i][j]);
            }
    }
}

package com.corejava;

public class Matrix {
    private float sum(float[][] matrixInput) {
        float sum =0;
        for(int i=0;i<matrixInput.length;i++){
            for(int j=0;j<matrixInput[i].length;j++){
                sum = sum + matrixInput[i][j];
            }
        }
        return sum;
    }
    private void rotate(float[][] matrix) {

        for(int i=matrix.length-1;i>=0;i--){
            int length = matrix[i].length;
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[j][i]);
            }
        }
    }
boolean flag = false;
    private boolean searching(int n, int m, float[][] matrix, int x){
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix[0][0]<=x && matrix[n-1][m-1]>=x){
                    if(matrix[j][i]<x){
                        continue;
                    }
                    else if(matrix[j][i]==x){
                        flag = true;
                        return flag;
                    }
                    else {
                       // i = i-1;
                        //searching in row
                        rowSearching(matrix,i,m,x);
                    }
                }
            }
        }
        return flag;
    }

    private void rowSearching(float[][] matrix, int i,int m, int x) {
        for(int j=0;j<m;j++){
            if(matrix[i][j]==x)
                flag = true;
        }
    }

    public static void main(String[] args){
        float[][] matrixInput = {{1,2,3},
                                 {4,5,6},
                                 {7,8,9}};
        Matrix matrix = new Matrix();
        System.out.println(matrix.sum(matrixInput));

        matrix.rotate(matrixInput);

        System.out.println(matrix.searching(3,3,matrixInput,11));
    }
}

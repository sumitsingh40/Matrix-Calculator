//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.Scanner;

public class matcal {
    public matcal() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 -> Singular Matrix\n2 -> Double Matrix");
        int choice = sc.nextInt();
        int opchoice;
        int colA;
        int colB;
        int rowB;
        if (choice == 1) {
            System.out.println("Enter the Size (Row, Col) of A:");
            opchoice = sc.nextInt();
            colA = sc.nextInt();
            int[][] A = new int[opchoice][colA];

            for(colB = 0; colB < opchoice; ++colB) {
                for(rowB = 0; rowB < colA; ++rowB) {
                    System.out.println("[" + colB + "][" + rowB + "]:");
                    A[colB][rowB] = sc.nextInt();
                }
            }

            System.out.println("Inputted Matrix:");

            for(colB = 0; colB < opchoice; ++colB) {
                for(rowB = 0; rowB < colA; ++rowB) {
                    System.out.print(A[colB][rowB] + "\t");
                }

                System.out.println();
            }

            System.out.println("The only possible operation is Transpose:");

            for(colB = 0; colB < opchoice; ++colB) {
                for(rowB = 0; rowB < colA; ++rowB) {
                    System.out.print(A[rowB][colB] + "\t");
                }

                System.out.println();
            }
        } else if (choice == 2) {
            System.out.println("1 -> Addition\n2 -> Subtraction\n3 -> Multiplication");
            System.out.println("Enter the size of A (row, col):");
            int rowA = sc.nextInt();
            colA = sc.nextInt();
            int[][] A = new int[rowA][colA];

            
            for(int i = 0; i < rowA; ++i) {
                for(i = 0; i < colA; ++i) {
                    System.out.println("[" + i + "][" + i + "]:");
                    A[i][i] = sc.nextInt();
                }
            }

            System.out.println("Enter the size of B (row, col):");
            rowB = sc.nextInt();
            colB = sc.nextInt();
            int[][] B = new int[rowB][colB];

            int i;
            for(i = 0; i < rowB; ++i) {
                for(i = 0; i < colB; ++i) {
                    System.out.println("[" + i + "][" + i + "]:");
                    B[i][i] = sc.nextInt();
                }
            }

            while(true) {
                while(true) {
                    while(true) {
                        System.out.println("Operator Choice:");
                        opchoice = sc.nextInt();
                        if (opchoice == 1) {
                            if (rowA == rowB && colA == colB) {
                                for(i = 0; i < rowA; ++i) {
                                    for(i = 0; i < colA; ++i) {
                                        System.out.print(A[i][i] + B[i][i] + "\t");
                                    }

                                    System.out.println();
                                }
                            } else {
                                System.out.println("Matrix dimensions do not match for addition.");
                            }
                        } else if (opchoice == 2) {
                            if (rowA == rowB && colA == colB) {
                                for(i = 0; i < rowA; ++i) {
                                    for(i = 0; i < colA; ++i) {
                                        System.out.print(A[i][i] - B[i][i] + "\t");
                                    }

                                    System.out.println();
                                }
                            } else {
                                System.out.println("Matrix dimensions do not match for subtraction.");
                            }
                        } else if (opchoice == 3) {
                            if (colA != rowB) {
                                System.out.println("Matrix dimensions do not match for multiplication.");
                            } else {
                                int[][] C = new int[rowA][colB];

                                for(i = 0; i < rowA; ++i) {
                                    for(int j = 0; j < colB; ++j) {
                                        C[i][j] = 0;

                                        for(int k = 0; k < colA; ++k) {
                                            C[i][j] += A[i][k] * B[k][j];
                                        }

                                        System.out.print(C[i][j] + "\t");
                                    }

                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}

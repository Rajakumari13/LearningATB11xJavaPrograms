package ex_016_Array;

public class Lab_124_2D {
    public static void main(String[] args) {
        //1 2 3
        //4 5 6
        //7 8 9
        int array[][]={ {1,2,3},{4,5,6},{7,8,9}};

        int [][] pre_defined={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] array1;
        array1=new int [][]{{1,2},{5,3},{2,3}};

        int array_2d[][]=new int[3][3];
        array_2d[0][0]=0;
        array_2d[0][1]=21;
        array_2d[0][2]=15;

        array_2d[1][0]=87;
        array_2d[1][1]=15;
        array_2d[1][2]=96;

        array_2d[2][0]=45;
        array_2d[2][1]=74;
        array_2d[2][2]=18;
    }
}


package random_Solutions;

import java.util.Queue;
import java.util.LinkedList;
public class MaximalSquareWithBFS {
      
    Queue<Integer> dfs = new LinkedList<Integer>();

    public static void main(String[] args) {

        MaximalSquareWithBFS maximalSquareWithBFS = new MaximalSquareWithBFS();


        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

        int[][] edges = new int[matrix.length][matrix.length];


        for(int i=0; i<matrix.length;i++ ){

            for(int j=0; j< matrix.length; j++ ){

                if(matrix[i][j]=='1'){
                    System.out.println(" Found an edge :"+matrix[i][j]);
                    maximalSquareWithBFS.addEdge(edges,i,j);
                }
            }
        }
        System.out.println(" The size of the changes :" +edges.length);
        maximalSquareWithBFS.bfsHelper(edges, edges.length);

        System.out.println(" The size of queue :" +maximalSquareWithBFS.dfs.size());


        //return dfs.size();

    }


    public void addEdge(int[][] edges, int i, int j){

        edges[i][j]=1;
    }

    public void bfsHelper(int[][] edges, int v){

        if(v==0){
            return;
        }
        int[] visited = new int[v];
        for(int i=0; i< v; i++){
            visited[i] = 0;
            //if(visited[i] == 0){
                //printBFS(edges,v,i,visited);
            //}
        }

            for(int i=0; i< v; i++){
                //visited[i] = 0;
                if(visited[i] == 0){
                    printBFS(edges,v,i,visited);
                }
        }


    }
    public void printBFS(int[][] edges, int v, int start, int[] visited){

        if(v ==0){
            return;
        }

        //Queue<Integer> dfs = new LinkedList<Integer>();
        dfs.add(start);
        visited[start] =1;
        while(!dfs.isEmpty()){
            int data = dfs.poll();
            System.out.println(data + " YO "); 
            for(int i=0; i< v; i++){
                if(edges[data][i]==1){
                    if(visited[i]==0){
                        dfs.add(i);
                        visited[i]=1;
                    }
                }
            }
        }
    }
    
}

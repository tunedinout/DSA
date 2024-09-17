import java.util.Scanner;

import ds.UndirectedGraph;

public class App {

    private static UndirectedGraph ug;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // System.out.println(n + " " + m + "");
        ug = new UndirectedGraph(n);
        

        // add all the edges first 
         for(int i = 1; i <= ug.vertices; i++ ){
            for(int j = i + 1; j <= ug.vertices;j++)
            ug.addEdge(i, j);
        }

        
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            ug.removeEdge(u, v);
        }
        
        ug.printGraph();
       

        scanner.close();

    }
}

package algo.dfs;

public class Client {
   //https://gmlwjd9405.github.io/2018/08/14/algorithm-dfs.html
   public static void main(String[] args) {
      Graph g = new Graph(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
         
//                     0  
//                  1      2
//                       3                                     
      
      
      g.DFS(2); /* �־��� ��带 ���� ���� DFS Ž�� */
//      g.DFS(); /* �񿬰��� �׷����� ��� */
   }

}

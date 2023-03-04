package graph1;
import java.util.Scanner;
import java.util.LinkedList;
public class GraphImplemetation 
{
	private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked")
	public GraphImplemetation(int v)
	{
		adj = new LinkedList[v];
		for(int i=0; i<v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void insertedge(int s, int d)
	{
		adj[s].add(d);
		adj[d].add(s);
		System.out.print(adj[d]);
		System.out.print(adj[s]);
	}
	
  public static void main(String[] args)
  {
	 System.out.println("Enter no. of edge and vertices:"); 
	 @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 int v = sc.nextInt();
	 int e = sc.nextInt();
	 GraphImplemetation ob = new GraphImplemetation(v);
	 System.out.println("Enter edge:");
	 for(int i=0; i<e; i++)
	 {
		 int s = sc.nextInt();
		 int d = sc.nextInt();
		 ob.insertedge(s, d);
	 }
  }
}

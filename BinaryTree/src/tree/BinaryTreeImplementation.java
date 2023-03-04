
                /* Binary Tree using LinkedList */
package tree;
import java.util.Scanner;

// Creating another class for Constructing Node
class Node
{
	int data;
	Node left, right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTreeImplementation 
{
	// creation of tree
	static Node creation()
	{
	   @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	   Node root = null;
	   System.out.println("Enter data:");
	   int data = sc.nextInt();
	   if(data == -1)
	   {
		   return null;
	   }
	   
	   root = new Node(data);   // creating root node
	   System.out.println("Enter left child of "+root.data);
	   root.left = creation();  // recursion
	   System.out.println("Enter right child of "+root.data);
	   root.right = creation();
	   
	   return root;
	}
	
	// performing inOrder traversal using recursion 
	static void inorderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	}
	
	
//	//performing PreOrderTraversal using recursion
	static void preorderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	//performing PostOrderTraversl using recursion
	static void postorderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
  public static void main(String[] args)
  {
	  Node root = creation();  // here assign full tree in root and passing root as parameter.
	  inorderTraversal(root);
   	  preorderTraversal(root);
   	  postorderTraversal(root);
  }
}

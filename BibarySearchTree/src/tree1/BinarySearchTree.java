package tree1;

public class BinarySearchTree 
{
	static class Node
	{
		int data;
		Node left, right;
		Node(int data)
		{
			this.data= data;
			this.left =null;
			this.right = null;
		}
	}
	
	// method to insert data into BSt
	public static Node insert(Node root, int val)
	{
		if(root == null)
		{
			root = new Node(val);
			return root;
		}
		
		if(root.data >= val)
		{
			//left subtree
			root.left = insert(root.left,val);
		}
		else
		{
			root.right = insert(root.right,val);
		}
		return root;
	}
	
	//method for traverse data
	static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	
	// method for search data
	static boolean search(Node root, int key)
	{
		if(root == null)
		{
			return false;
		}
	  if(root.data > key)
	  {
		  return search(root.left, key);
	  }
	  else if(root.data == key)
	  {
		  return true;
	  }
	  else
	  {
		  return search(root.right, key);
	  }
	}
	
	static Node delete(Node root, int val)
	{
	  if(root.data > val)
	  {
		  root.left = delete(root.left, val);
	  }
	  else if(root.data < val)
	  {
		  root.right = delete(root.right, val);
	  }
	  else
	  {
		//root.data == val
		  //case 1
		  if(root.left == null && root.right ==null)
		  {
			  return null;
		  }
		  
		  // case 2
		   if(root.left == null)
		  {
			  return root.right;
		  }
		   else if(root.right == null)
		   {
			   return root.left;
		   }
		   
		   // case3
		   Node IS = inorderSuccessor(root.right);
		   root.data = IS.data;
		   root.right = delete(root.right, IS.data);
	  }
	  return root;
	}
	
	static Node inorderSuccessor(Node root)
	{
		while(root.left != null)
		{
			root = root.left; 
		}
		return root;
	}
	public static void main(String[] args) 
	
  {
	 int values[] = {5 , 1, 3, 4, 2, 7};
	 Node root = null;
	 for(int i=0; i<values.length; i++)
	 {
		 root = insert(root, values[i]);
	 }
	 inorder(root);
	 System.out.println();
	 
//	 if(search(root,3))
//	 {
//		 System.out.println("found");
//	 }
//	 else {
//		 System.out.println("not found");
//	 }
	 delete(root,4);
	 inorder(root);
  }
}




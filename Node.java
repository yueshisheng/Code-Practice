package datastructure;

public class Node {
   int key;
   int value;
   Node leftNode;
   Node rightNode;
   
   int count;//节点个数
   public Node(int key1,int value1) {
	   this.key=key1;
	   this.value=value1;
	   
   }
   public int size() {
	   return count;
   }
   public static Node insertNode(Node root,int key1,int value1) {
	   if(root==null) {
		   
		   return new Node(key1, value1);
		   
	   }else {
		   if(key1==root.key) {
			   root.value=value1;
		   }else if(key1<root.key) {
			   root.leftNode=insertNode(root.leftNode,key1,value1);
		   }else if(key1>root.key) {
			   root.rightNode=insertNode(root.rightNode,key1,value1);
		   }   
	   }
	   return root;
   }
   public static void preOrder(Node root) {
	   if(root!=null) {
	   System.out.println(root.key);
	   preOrder(root.leftNode);
	   preOrder(root.rightNode);
	   }	
	   	
   }
   public  static void main(String [] args) {
	   Node root1=null;
	   Node node1 = null;
	   Node node2 = null;
	   insertNode(root1,2,111);
	   insertNode(node1,3,112);
	   insertNode(node2,2,111);
	   
	   preOrder(root1);
   }
   
}

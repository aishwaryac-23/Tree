package Tree;

import java.util.Scanner;

class Node{
	Node left;
	int data;
	Node right;
	Node(int data){
		this.left=null;
		this.data=data;
		this.right=null;
	}
}
class BinarySearchTree{
	Node root;
	void insert_node_tree(int data)
	{
		Node newnode=new Node(data);
		if(root==null)
			this.root=newnode;
		else
		{
			Node tptr;
			tptr=root;
			while(true) {
				if(newnode.data<tptr.data) {
					if(tptr.left==null) {
						tptr.left=newnode;
						break;
					}
					else {
						tptr=tptr.left;
					}
				}
				else {
					if(tptr.right==null) {
						tptr.right=newnode;
						break;
					}
					else {
						tptr=tptr.right;
					}
				}
			}
		}
	}
}
public class Tree1 {
	public static void main(String[] args) {
		int num;
		Scanner obj=new Scanner(System.in);
		BinarySearchTree bt =new BinarySearchTree();
		while(true) {
			num=obj.nextInt();
			if(num==-1)
				break;
		bt.insert_node_tree(num);
		}
		System.out.println(bt.root.data);
		System.out.println(bt.root.left.data);
	}
}


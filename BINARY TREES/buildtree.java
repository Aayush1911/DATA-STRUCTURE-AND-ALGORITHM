import java.util.*;

public class buildtree{
    static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
static class binarytree{
    static int idx=-1;
public static Node buildtree(int nodes[]){
    idx++;
    if(nodes[idx]==-1){
        return null;
    }
    Node newnode = new Node(nodes[idx]);
    newnode.left= buildtree(nodes);
    newnode.right=buildtree(nodes);
    return newnode;

}
public static void  preorder(Node root){
    if(root==null){
        return;
    }
    
    System.out.print(root.data + " ");
    preorder(root.left);

    preorder(root.right);

} 
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static void postorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    inorder(root.right);
    System.out.print(root.data+" ");
}
public static void levelorder(Node root){
    if(root==null){
        return;
    }
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currnode=q.remove();
        if(currnode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(currnode.data+" ");
            if(currnode.left!=null){
                q.add(currnode.left);
            }
            if(currnode.right!=null){
                q.add(currnode.right);
            }
        }
    }

}
public static int height(Node root){
    if(root==null){
        return 0;
    }
    int lh=height(root.left);
    int rh=height(root.right);
    int height = Math.max(lh, rh) + 1;
    return height;
}
public static int count(Node root){
    if(root==null){
        return 0;
    }
    int leftcount=count(root.left);
    int rightcount=count(root.right);
    return leftcount + rightcount +1;
}
public static int nodesum(Node root){
    if(root==null){
        return 0;
    }
    int leftsum=nodesum(root.left);
    int rightsum=nodesum(root.right);
    return leftsum + rightsum + root.data;
} 
public static int diameter1(Node root){
    if(root==null){
        return 0;
    }
    int leftdiam=diameter1(root.left);
    int lh=height(root.left);
    int rightdiam=diameter1(root.right);
    int rh=height(root.right);
    int selfdiam=lh+rh+1;
    return Math.max(selfdiam,Math.max(rightdiam, leftdiam));
}
 static  class info{
    int diam,h;
    public info(int diam,int h){
        this.diam=diam;
        this.h=h;
    }
}
public static info diameter2(Node root) {
    if(root==null){
        return new info(0, 0);
    }
    info leftinfo=diameter2(root.left);
    info rightinfo=diameter2(root.right);
    int diam = Math.max(Math.max(leftinfo.diam, rightinfo.diam), leftinfo.h +rightinfo.h)+1;
    int h = Math.max(leftinfo.h, rightinfo.h)+1;
    return new info(diam, h);
}
//to check for identical
public static boolean isidentical(Node node,Node subroot){
    if(node==null && subroot == null){
        return true;
    }
    else if (node == null || subroot == null || node.data != subroot.data){
        return false;
    }
    if(!isidentical(node.left, subroot.left)){
        return false;
    }
    if(!isidentical(node.right, subroot.right)){
        return false;
    }
    return true;
}


//where subrot lies in main tree
public static boolean issubtree(Node root,Node subroot){
     if(root == null){
        return false;
     }
     if(root.data == subroot.data){
        if(isidentical(root,subroot)){
            return true;
        }
     }
     return issubtree(root.left, subroot) || issubtree(root.right, subroot) ;


}










}
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            /*           1
                        / \
                       2   3 
                      / \   \
                     4   5   6   */           
        binarytree tree = new binarytree();
        Node root=tree.buildtree(nodes);
        //System.out.println("root is " + root.data);
       // tree.preorder(root);
       //tree.inorder(root);
        //tree.postorder(root);
        //tree.levelorder(root);
        //System.out.println("height = " + tree.height(root));
       // System.out.println("count =" + tree.count(root));
       //System.out.println("sum of nodes =" + tree.nodesum(root));
        //System.out.println(tree.diameter1(root));
        //System.out.println(tree.diameter2(root).diam); 

/*
                     2
                    /  \
                   4    5
                   
                   */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right=new Node(5);
        System.out.println(tree.issubtree(root, subroot));




    }
}
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

static class info1{
    int hd;
    Node node;

    public info1(Node node ,int hd){
        this.node=node;
        this.hd=hd;
        
    }
}
public static void topview(Node root){
    Queue<info1>q1 = new LinkedList<>();
    HashMap<Integer , Node>map = new HashMap<>();
    int min=0,max=0;
    q1.add(new info1(root,0));
    q1.add(null);
    while(!q1.isEmpty()){
        info1 curr = q1.remove();
        if(curr==null){
            if(q1.isEmpty()){
                break;
            }
            else{
                q1.add(null);
            }
        } 
        else{
            if(!map.containsKey(curr.hd)){//first time hd is occuring
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null){
                q1.add(new info1( curr.node.left,curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }

            if(curr.node.right!= null){
                q1.add(new info1(curr.node.right,curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
        }
        

    }
for(int i=min;i<=max;i++){
    System.out.print(map.get(i).data +" ");
}
}
public static void klevel(Node root,int level,int k){
    if(root==null){
        return;
    }
    if(level==k){
        System.out.print(root.data + " ");
        return;
    }
    klevel(root.left, level+1, k);
    klevel(root.right, level+1, k);
}
public static boolean getpath(Node root,int n,ArrayList<Integer>path) {
    if(root==null){
        return false;
    }
    path.add(root.data);
    
    if(root.data==n){
        return true;
    }
    boolean foundleft = getpath(root.left, n, path);
    boolean foundright = getpath(root.right, n, path);

    if(foundleft || foundright){
        return true;
    }
    path.remove(path.size()-1);
    return false;


}
public static void lca(Node root,int n1,int n2) {  //0(n) it use space more by 2 arraylist
    ArrayList<Integer>path1 = new ArrayList<>();
    ArrayList<Integer>path2 = new ArrayList<>();

    getpath(root,n1,path1);
    getpath(root,n2,path2);
     //last common ancestor
    int i;
    for( i=0;i<path1.size() && i<path2.size()-1;i++){
        if(path1.get(i)!=path2.get(i)){
            break;
        }
    }
   //last equal node 
    int lca = path1.get(i-1);
    System.out.println(lca);
}

public static Node lca2(Node root , int n1,int n2) {
    if(root==null || root.data == n1 || root.data ==n2){
        return root;
    }

    Node leftlca = lca2(root.left, n1, n2);
    Node rightlca = lca2(root.right, n1, n2);
// left returns null so n1 & n2 are not there in left so it is in right
    if(leftlca==null){
        return rightlca;
    }
// right returns null so n1 & n2 are not there in right so it is in right
    if(rightlca==null){
        return leftlca;
    }
return root;
    
}
public static int lcadist(Node root,int n){
    if(root == null){
        return -1;
    }
    if(root.data==n){
        return 0;
    }
    int leftdist = lcadist(root.left, n);
    int rightdist = lcadist(root.right, n);

    if(leftdist == -1 && rightdist == -1){
        return -1;
    }
    else if(leftdist==-1){
        return rightdist+1;
    }
    else{
        return leftdist+1;
    }
}
public static int mindist(Node root,int n1,int n2){
    Node lca = lca2(root, n1, n2);
    int dist1 = lcadist(lca,n1);
    int dist2 = lcadist(lca,n2);
    return dist1+dist2;
}
public static int kthancestor(Node root,int n,int k) {
    if(root==null){
        return -1;
    }
    if(root.data==n){
        return 0;
    }
    int leftdist = kthancestor(root.left, n, k);
    int rightdist = kthancestor(root.right, n, k);

    if(leftdist == -1 && rightdist == -1){
        return -1;
    }
    int max = Math.max(leftdist, rightdist);
    if((max+1)==k){
       System.out.println(root.data);
    }
    return max+1;
}
public static int transform(Node root){
    if(root==null){
        return 0;
    }
    int leftchild=transform(root.left);
    int rightchild = transform(root.right);
    int data = root.data;
    int newleft = root.left == null ? 0 : root.left.data;
    int newright = root.right == null ? 0 : root.right.data;

    root.data =  newleft + leftchild+ newright + rightchild;
    return data;
}
public static boolean univalued(Node root) {
    if(root==null){
        return true;
    }
    if(root.left != null && root.data != root.left.data){
        return false;
    }
    if(root.right != null && root.data != root.right.data){
        return false;
    }
  return univalued(root.left) && univalued(root.right);
}

static Node deleteLeaves(Node root, int x){
    if (root == null)
    return null;
    root.left = deleteLeaves(root.left, x);
    root.right = deleteLeaves(root.right, x);
    if (root.data == x && root.left == null && root.right == null) {
    return null;
    }
    return root;
    }
    



}
    public static void main(String args[]){
        //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            /*           1
                        / \
                       2   3 
                      / \   \
                     4   5   6   */        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7)
        ;
        binarytree tree = new binarytree();
        /*            1
                     / \
                    2   3
                   / \ / \
                  4  5 6  7           
        */
        //Node root=tree.buildtree(nodes);
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
       /*  Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right=new Node(5);
       // System.out.println(tree.issubtree(root, subroot));
*/
      // tree.topview(root);
       // int k=2;
        //tree.klevel(root, 1, k);

        //int n1=4 , n2= 5;
        //tree.lca(root, n1, n2);
       // System.out.println(tree.lca2(root, n1, n2).data);
        //int n1=4 ,n2=6;
        //System.out.println(tree.mindist(root, n1, n2));
       // int n=5 , k=2;
        //tree.kthancestor(root, n, k);
        //tree.transform(root);
       // tree.preorder(root);


       //hw
       /* 
       if(tree.univalued(root)){
        System.out.println("yes");
       }
       else{
        System.out.println("no");
       }
      
       }*/
       tree.inorder(root);
       System.out.println();
       tree.deleteLeaves(root, 5);
       tree.inorder(root);
    }
}

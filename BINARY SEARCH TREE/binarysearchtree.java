import java.util.*;
public class binarysearchtree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

public static Node insert (Node root,int val) {
    if(root==null){
        root = new Node(val);
        return root;
    }
    if(root.data>val){
        //left subtree
        root.left = insert(root.left, val);
    }
    else{
        //right subtree
        root.right = insert(root.right, val);
    }
    return root;
}
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(root.data>key){
        return search(root.left, key);
    }
    else{
        return search(root.right, key);
    }
}
public static Node delete(Node root , int val) {
    if(root.data<val){
        root.right = delete(root.right, val);
    }
    else if(root.data>val){
        root.left = delete(root.left, val);
    }
    else{ //root.data == val
        //case 1 leaf node
        if(root.left == null && root.right == null){
            return null;
        }
        //case 2 single child
        if(root.left == null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        //case 3 both children
        Node is = findinordersucessor(root.right);
        root.data=is.data;
        root.right = delete(root.right, is.data);
    }
    return root;
}
public static Node findinordersucessor(Node root) {
    while(root.left != null){
        root = root.left;
    }
    return root;
}
public static void printinrange(Node root,int k1,int k2) {
    if(root==null){
        return;
    }
    if(root.data>=k1 && root.data<=k2 ){
        printinrange(root.left, k1, k2);
        System.out.print(root.data + " ");
        printinrange(root.right, k1, k2);
    }
    else if(root.data<k1){
        printinrange(root.left, k1, k2);
    }
    else{
        printinrange(root.right, k1, k2);
    }
}
public static void printpath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i) + "->");
    }
    System.out.println("Null");
}
public static void printeaf2node(Node root ,ArrayList<Integer>path){
    if(root==null){
        return;
    }
    path.add(root.data);
    if(root.left == null && root.right == null){
        printpath(path);
    }
    printeaf2node(root.left, path);
    printeaf2node(root.right, path);
    path.remove(path.size()-1);
}
public static boolean isvalidBST(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min!=null && root.data<=min.data){
        return false;
    }
    else if(max!=null && root.data>=max.data){
        return false;
    }
    return isvalidBST(root.left,min, root) && isvalidBST(root.right, root, max);
}
public static Node createmirror(Node root){
    if(root==null){
        return null;
    }
    Node leftsubtree = createmirror(root.left);
    Node rightsubtree=createmirror(root.right);
    root.left = rightsubtree;
    root.right = leftsubtree;
return root;
}
    public static void main(String args[]) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        //inorder(root);
        /*if(search(root, 4)){
            System.out.println("Key found");
        }else{
            System.out.println("Key not found");
        }*/
        /*inorder(root);
        delete(root, 3);
        System.out.println();
        inorder(root);
    */
    /*inorder(root);
    System.out.println();
    printinrange(root, 5, 12);*/
    
   // printeaf2node(root, new ArrayList<>());
   /*inorder(root);
    if(isvalidBST(root, null, null)){
        System.out.println();
        System.out.println("valid");
    }
    else{
        System.out.println("not valid");
    }*/
    inorder(root);
    System.out.println();
    root = createmirror(root);
    inorder(root);
    }
}

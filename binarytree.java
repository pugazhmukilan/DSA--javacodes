public class binarytree{
    public static void main(String[] args) {
        
        binarytreestructure bt = new binarytreestructure();
      bt.ins(10);
      bt.ins(20);
      bt.ins(240);
      bt.ins(4);
      bt.ins(5);
      bt.ins(7);
      bt.ins(9);
      bt.ins(34);
      bt.search(34);

      bt.inorder();

    }
}


class node{
    int key;
    node right,left;
    public node(int number){
        this.key=number;
        right=null;
        left=null;
    }

}
class binarytreestructure {
    node root;

    public binarytreestructure(){
        this.root=null;
    }
    void ins(int num){
        root=insertion(root,num);
    }

    node insertion(node root,int number){
        node temp=new node(number);
        
        if (root==null){
            root=temp;
            return root;
        }

        if ((Math.random())<0.5){
            root.left = insertion(root.left,number);

        }
        else{
            root.right = insertion(root.right,number);
        }
        return root;
    }
    void inorder(){
        inorder_display(root);
    }
    void postorder(){
        postorder_display(root);
    }
    void preorder(){
        preorder_display(root);
    }

    void inorder_display(node root){
        if (root !=null){
            inorder_display(root.left);
            System.out.println(root.key+ " ");
            inorder_display(root.right);

        }
    }

    void preorder_display(node root){
        if (root!=null){
            
            System.out.println(root.key+" ");
            preorder_display(root.left);
            preorder_display(root.right);

        }
  
    }
    void postorder_display(node root){
        if (root !=null){
            postorder_display(root.left);
            postorder_display(root.right);
            System.out.println(root.key+" ");

        }
        }
        
        
    void search(int num){
        searchrec(root,num);
    }
    
   boolean searchrec(node root, int num) {
    if (root == null) {
        return false;
    }

    if (root.key == num) {
        return true;
    }

    // Use logical OR (||) to combine the results from left and right subtrees
    return searchrec(root.left, num) || searchrec(root.right, num);
}


    }
    


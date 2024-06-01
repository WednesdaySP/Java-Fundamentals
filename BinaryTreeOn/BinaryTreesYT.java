
package BinaryTreeOn;
import com.sun.source.tree.Tree;

import java.util.*;



public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int indx=-1;
        public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return  null;
            }
            Node newNode=new Node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return  newNode;
        }
    }



    //complexity O(n)
    //root, left, right
    public static  void preorder(Node root){
        if(root==null) {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder traversal
    //left, root, right
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    //iteration
    //O(n), BSF, Queue
    //tree ka BFS traversal kya hota h? ans: Level order traversal
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove(); //current node ko q se nikal lo

            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if (currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }


    }

    //O(n)
    public static  int countOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);

        return  leftNodes+rightNodes+1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+ root.data;
    }

    public static int heightOfTree(Node root){
        if (root==null){
            return 0;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        int maxHeight=Math.max(leftHeight ,rightHeight)+1;
        return maxHeight;
    }

    //time complexity: O(N^2)
    public static int diameterOfTree(Node root){
        if (root==null){
            return 0;
        }
        int diam1=diameterOfTree(root.left);
        int diam2=diameterOfTree(root.right);
        int diam3=heightOfTree(root.left)+heightOfTree(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }


    //diameter with time complexity: O(n)
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static  TreeInfo diameter(Node root){
        if (root==null){
            return  new TreeInfo(0,0);
        }
        TreeInfo left=diameter(root.left);
        TreeInfo right=diameter(root.right);

        int myHight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2= right.diam;
        int diam3= left.ht+right.ht+1;

        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo=new TreeInfo(myHight,mydiam);
        return myInfo;
    }




    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(nodes);

//         System.out.println(root.data);
//         System.out.println(root.left.data);
//         System.out.println(root.right.data);

         System.out.print("Preorder:");
         preorder(root);

         System.out.println();

         System.out.print("Inorder:");
         inorder(root);

         System.out.println();

         System.out.print("Postorder:");
         postorder(root);

         System.out.println();

         System.out.println("Levelorder:");
         levelOrder(root);

         System.out.print("CountOfNodes:"+countOfNodes(root));
         System.out.println();

         System.out.print("SumOfNodes:"+sumOfNodes(root));

         System.out.println();

         System.out.print("MaxHeight:"+heightOfTree(root));

         System.out.println();
         System.out.print("Diameter:"+diameterOfTree(root));

         System.out.println();
         System.out.print("Diameter:"+diameter(root).diam);



     }
}

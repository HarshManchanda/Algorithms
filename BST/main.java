package BST;

public class main {
    public static void main(String[] args){
        binarySearchTree myBST = new binarySearchTree();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        //print the bst
//        System.out.println("Root: "+myBST.getRoot().value);
//        System.out.println("Left child: "+myBST.getRoot().left.value);
//        System.out.println("Right child: "+myBST.getRoot().right.value);

        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));

    }
}

package com.mj;

import com.mj.printer.BinaryTrees;
import com.mj.tree.AVLTree;
import com.mj.tree.BST;
import com.mj.tree.BinaryTree;

public class Main {


    public static void main(String[] args) {
        Integer data[] = new Integer[]{
                55, 187, 56, 74, /*96, 22, 62, 20, 70, 68, 90, 50*/
        };

        AVLTree<Integer> tree = new AVLTree<Integer>();
        for (int i = 0; i < data.length; i++) {
            tree.add(data[i]);

        }

//        BinaryTrees.println(tree, BinaryTrees.PrintStyle.INORDER);
        BinaryTrees.println(tree, BinaryTrees.PrintStyle.LEVEL_ORDER);


    }

}

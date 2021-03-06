package com.baeldung.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeNotEmpty() {

        BinaryTree bt = createBinaryTree();

        assertTrue(!bt.isEmpty());
    }

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {

        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {

        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(9));
        bt.delete(9);
        assertFalse(bt.containsNode(9));
    }

    @Test
    public void givenABinaryTree_WhenTraversingInOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traverseInOrder(bt.root);
    }

    @Test
    public void givenABinaryTree_WhenTraversingPreOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traversePreOrder(bt.root);
    }

    @Test
    public void givenABinaryTree_WhenTraversingPostOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traversePostOrder(bt.root);
    }

    @Test
    public void givenABinaryTree_WhenTraversingLevelOrder_ThenPrintValues() {

        BinaryTree bt = createBinaryTree();

        bt.traverseLevelOrder();
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}

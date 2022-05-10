package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    protected Node root;
    public void add(int newValue)
    {
        root = addRecursion(root, newValue);
    }
    private Node addRecursion(Node currentNode, int newValue) {
        if (currentNode == null)
        {
            return new Node(newValue);
        }
        if (newValue < currentNode.value)
        {
            currentNode.left = addRecursion(currentNode.left, newValue);
        }
        else if (newValue > currentNode.value)
        {
            currentNode.right = addRecursion(currentNode.right, newValue);
        }
        return  currentNode;
    }
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }
    private int findSmallestValue(Node root) {
        if (root.left == null)
            return root.value;
        else
            return findSmallestValue(root.left);
    }

    public void traversingTheTree() {
        if (root == null) {
            return;
        }

        LinkedList<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        System.out.print("\n");
    }
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        if (value < current.value)
        {
            return containsNodeRecursive(current.left, value);
        }
        else {
            return containsNodeRecursive(current.right, value);
        }
    }
    public void isContainAndAddIfNeed(int value)
    {
        boolean isExist = containsNode(value);
        if (isExist)
        {
            System.out.println( "\nВершина з записом " + value + " належить дереву");
        }
        else
        {
            add(value);
            System.out.println("\nВершину з записом " + value + " не знайдено. Вершину додано");
        }
    }

}
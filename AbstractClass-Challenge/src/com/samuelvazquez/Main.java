package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		SearchTree tree = new SearchTree(null);
		tree.traverse(tree.getRoot());
		//Create a string data array to avoid typing loads of addoItem instructions:
		String stringData = "5 7 3 9 8 2 1 0 4 6";

		String[] data = stringData.split(" ");
		for(String s : data) {
			tree.addItem(new Node(s));
		}
		tree.traverse(tree.getRoot());
	}
}

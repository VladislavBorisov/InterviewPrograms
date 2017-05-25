package com.sherybedrock.examples;

import java.io.File;
import java.util.Stack;

public class IterativeFileDisplay {

	public static void main(String[] args) {
		File currentDir = new File("."); // current directory
		printFiles(currentDir);
	}

	private static void printFiles(File dir) {
		Stack<File> stack = new Stack<File>();
		stack.push(dir);
		while (!stack.isEmpty()) {
			File child = stack.pop();
			if (child.isDirectory()) {
				for (File f : child.listFiles())
					stack.push(f);
			} else if (child.isFile()) {
				System.out.println(child.getPath());
			}
		}
	}
}
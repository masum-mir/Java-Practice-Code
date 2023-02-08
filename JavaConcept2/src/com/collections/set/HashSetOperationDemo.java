package com.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetOperationDemo {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();

		set1.addAll(Arrays.asList(new Integer[] { 1, 2, 4, 5, 6, 7, 8, 9 }));

		Set<Integer> set2 = new HashSet<>();

		set2.addAll(Arrays.asList(new Integer[] { 2, 3, 5, 7, 8, 11, 34 }));

		// union
		Set<Integer> union = new HashSet<>(set1);

		union.addAll(set2);

		System.out.println("Union of the two set: ");
		System.out.print(union + " ");

		// difference
		Set<Integer> difference = new HashSet<>(set1);

		difference.removeAll(set2);

		System.out.print("\nDifference of the two set: " + difference);

		// insertion
		Set<Integer> insertion = new HashSet<>(set1);

		insertion.retainAll(set2);

		System.out.print("\ninsertion of the two set: " + insertion);

		// subSet
		Set<Integer> subSet = new HashSet<>(set1);

		subSet.containsAll(set2);

		System.out.print("\nsubSet of the two set: " + subSet);

	}

}

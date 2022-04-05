public class Main {

	public static void main(String[] args) {
		System.out.println("Sets!");

		IntSet intSetA = new IntSet(3);
		intSetA.add(2);
		intSetA.add(2);
		intSetA.add(4);
		intSetA.print();

		IntSet intSetB = new IntSet(3);
		intSetB.add(1);
		intSetB.add(2);
		intSetB.add(3);
		intSetB.print();
			
		// setA is subset of SetB
		System.out.println("A is subset of B: " + intSetA.isSubsetOf(intSetB));
		System.out.println("A is equal to B: " + intSetA.isEqualTo(intSetB));

		// merging two sets together
		IntSet intSetUnion = intSetA.unionWith(intSetB);
		intSetUnion.print();



		// intSet.print();
		// // System.out.println("Is empty? " + intSet.isEmpty());
		// // System.out.println("Has Element? " + intSet.hasElement(5));

		// intSet.add(1);
		// // intSet.print();
		// intSet.add(2);
		// // intSet.print();
		// intSet.add(3);
		// // intSet.print();
		// intSet.add(4);
		// // intSet.print();
		// intSet.add(5);
		// // intSet.print();
		// intSet.add(6);
		// // intSet.print();
		// intSet.add(7);
		// // intSet.print();
		// intSet.add(8);
		// intSet.add(9);
		// System.out.println("Is empty? " + intSet.isEmpty());
		// System.out.println("Has Element? " + intSet.hasElement(5));
		// intSet.print();
		// intSet.remove(4);
		// intSet.print();
	}

}
import java.util.Arrays;

public class IntSet {
    int[] intArray;
    int next = 0;

    // Initiliazing newSet
    public IntSet(int size) {
        intArray = new int[size];
    }

    // Check if set is empty
    public boolean isEmpty() {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                return false;
            }
        }
        return true;

    }

    // check if set has element
    public boolean hasElement(int x) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == x) {
                return true;
            }

        }
        return false;

    }

    // add element to set and create new set
    public void add(int x) {
        if (hasElement(x)) {
            return;
        }
        if (x < 1) {
            return;
        }
        // set is full
        if (next > intArray.length - 1) {
            int[] tmpArray = new int[intArray.length + 1];
            for (int i = 0; i < intArray.length; i++) {
                tmpArray[i] = intArray[i];
            }
            intArray = tmpArray;
        }
        intArray[next] = x;
        next++;
    }

    // remove element
    public void remove(int x) {
        if (!hasElement(x)) {
            return;
        }
        if (x < 1) {
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == x) {
                for (int j = i; j + 1 < intArray.length; j++) {
                    intArray[j] = intArray[j + 1];
                }
            }
        }
        int[] tmpArray = new int[intArray.length - 1];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = intArray[i];
        }
        intArray = tmpArray;
        next--;

    }

    // Print the sets
    public void print() {
        System.out.println(Arrays.toString(intArray));
    }

    // setA is subset of setB
    public boolean isSubsetOf(IntSet intSetB) {
        if (isEmpty()) {
            return true;
        }
        for (int i = 0; i < intArray.length; i++) {
            if (!intSetB.hasElement(intArray[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqualTo(IntSet intSetB) {
        if (this.isEmpty() && intSetB.isEmpty()) {
            return true;
        }
        if (this.isSubsetOf(intSetB) && intSetB.isSubsetOf(this)) {
            return true;
        }
        return false;
    }

    public IntSet unionWith(IntSet intSetB) {
        if (this.isEmpty() && intSetB.isEmpty()) {
            return new IntSet(3);
        } else if (this.isEmpty()) {
            return intSetB;
        } else if (intSetB.isEmpty()) {
            return this;
        } else {
            IntSet intSetUnion = intSetB;
            for (int i = 0; i < intArray.length; i++) {
                intSetUnion.add(intArray[i]);
            }
            return intSetUnion;
        }

    }
}

/**
 * 
 * Q1. Array of elements which contains duplicates, whats the fastest way to
 * remove duplicates in order to create a set?
 * A.
 * Set newSet to empty set
 * FOR each item in array
 * IF NOT hasElemet item NOT in newSet
 * add item to newSet
 * ENDIF
 * END FOR
 * 
 * boolean not_in (element)
 * FOR each item in set
 * IF element == item
 * return false
 * ENDIF
 * ENDFOR
 return true
 * 
 * Q 2. Given an array of strings called "words",group the anagrams togerther as
 * sets you can return the answer in anu order
 * A. words = [cat, but, bat, tab, tub]
 * c = 99
 * a = 97
 * t = 116
 * sun = 312
 * 
 * Q What is the fastest way to ensure two sets are equivalent
 * A.
 * // Set A C Set B
 * A = [1, 2, 4]
 * B = [1, 2, 4
 * A is subset of B && B is subset of A
 * FOR each item in array
 * is_subset{setA, setB)
 * if setA.length != setB.length
 * return FALSE
 * for each item in A:
 * for each item in B:
 * 
 * #class
 * isSubset (setB)
 * IF isEmpty():
 * return TRUE
 * FOR each element:
 * if(!setB.contain(element)):
 * return FALSE
 * ENDIF
 * ENDFOR
 * return TRUE
 */
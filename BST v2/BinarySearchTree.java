public class BinarySearchTree {

		// Set the head node
		private Node head;

		// Constructor
		public BinarySearchTree(){
			head = null;
		}

		// Methods

		/**
		 * insert
		 * 
		 * */
		public void insert(String x){
				// call insertR method
				head = insertR(x);
		}

		/**
		 * insertR
		 * Recursive insert
		 * */
		public Node insertR(Node head ,String x){
			// create newNode push into current head
			if(head == null){
				Node newNode = new Node(x);
				head = newNode;	

						}
		// Move down left 
		else if(x < head.value){
			head.insertR(head, x);
		} else if (x > head.value) {
			head.insertR(head.newNode, x);

		}
		return head;


}
}
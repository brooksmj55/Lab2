package brooksmj;
import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "brooksmj", "1173115158882");

	    /* Set an assignment title */
	    bridges.setTitle("Matthias Brooks");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    int a = 0;
	    int b = 0;
	    for (int i = 0; i<10;i++) {
	    	
	    	int c = a*a;
	    	arr.getElement(b).setValue (c);
	    	arr.getElement(b).setLabel(String.valueOf(c));
	    	b++;
	    	a ++;
	    }
	    
	    /* set the value as a Label */
	    
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
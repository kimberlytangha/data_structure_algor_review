public class Test {

	public Test() {;}

	// 1.1 
	public boolean isUniqueChars( String str ) {
		if ( str.length() > 128 ) 
			return false;

		boolean[] master = new boolean[128];
		for( int i = 0; i < str.length() ; i++ ) {
			// stores ASCII value
			int val = str.charAt(i);
			// System.out.println(val);
			if ( master[val] )
				return false;
			master[val] = true; 
		}
		return true; 	
	}

	// 1.2
	// public String sort( String s ) {

	// }

	// public boolean permutation( ) {
		
	// }

	public static void main( String[] args ) {
		Test t = new Test();
		System.out.println(t.isUniqueChars("hi"));
		System.out.println(t.isUniqueChars("shouldreturnfalse"));
		System.out.println(t.isUniqueChars(" d "));
		System.out.println(t.isUniqueChars(" %-"));
	
	}
}
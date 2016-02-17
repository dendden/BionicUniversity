
public class CLExceptions {

	public static void main(String[] args) {
		try {
			int len = args.length;
			int sum = 0;
			for ( int i = 0; i < len; i++ ) {
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("The sum is: " + sum);
		}
		catch (NumberFormatException nf) {
			System.out.println("All arguments must be integer values");
			return;
		}

	}

}

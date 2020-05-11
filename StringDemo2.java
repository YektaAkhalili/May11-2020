class StringDemo2 {
	public static void main(String[] args) {
		String str = new String("Golf is a good walk Spoiled!");
		String sub_str = str.substring(8);
		String example = new String("example");

		System.out.println(sub_str);
		System.out.println(example.toUpperCase());
		System.out.println(example.trim());
	}
	
}
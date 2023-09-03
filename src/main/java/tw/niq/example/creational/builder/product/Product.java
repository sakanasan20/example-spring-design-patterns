package tw.niq.example.creational.builder.product;

public class Product {
	
	private Part1 part1;
	
	private Part2 part2;
	
	private Part3 part3;
	
	public Product() {
		
	}
	
	public Part1 getPart1() {
		return part1;
	}

	public void setPart1(Part1 part1) {
		this.part1 = part1;
	}

	public Part2 getPart2() {
		return part2;
	}

	public void setPart2(Part2 part2) {
		this.part2 = part2;
	}

	public Part3 getPart3() {
		return part3;
	}

	public void setPart3(Part3 part3) {
		this.part3 = part3;
	}

	@Override
	public String toString() {
		return "Product [part1=" + part1 + ", part2=" + part2 + ", part3=" + part3 + "]";
	}

	public static class Part1 {
		
		String desc;
		
		public Part1(String desc) {
			this.desc = desc;
		}
		
		@Override
		public String toString() {
			return desc;
		}
		
	}
	
	public static class Part2 {
		
		String desc;
		
		public Part2(String desc) {
			this.desc = desc;
		}
		
		@Override
		public String toString() {
			return desc;
		}
		
	}
	
	public static class Part3 {
		
		String desc;
		
		public Part3(String desc) {
			this.desc = desc;
		}
		
		@Override
		public String toString() {
			return desc;
		}
		
	}
	
}

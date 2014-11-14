package isTriangle;

public class Triangle {
	public int a, b, c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isTriangle() {
		if ((a < b + c) && (b < a + c) && (c < a + b))
			return true;
		return false;
	}
	
	public String triangleType() {
		if (this.isTriangle())
			if(a==b && b==c)
				return "Equilateral";
			else if (a==b || b==c || c==a)
				return "Isosceles";
			else 
				return "Scalene";
		else
			return "NotATriangle";
	}
}

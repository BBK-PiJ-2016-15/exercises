class Point {
	double x;
	double y;
	
}

double distanceTo(x,y,x1,y1) {
		double solution = Math.sqrt( (Math.pow((x1-x), 2) + (Math.pow((y1 - y), 2)
		return solution
	}

double one = 9
double two = 7


double three = 3
double four = 2

// first point
Point MyPoint = new Point()
MyPoint.x = one
MyPoint.y = two


// second point 
Point MyPoint2 = new Point()
MyPoint2.x = three
MyPoint2.y = four

println MyPoint.x + ' ' +  MyPoint.y
println MyPoint2.x + ' ' +  MyPoint2.y

println distanceTo(MyPoint.x, MyPoint.y, MyPoint2.x, MyPoint2.y)
// the class defines a point using two coordinates
// and a method called that calculates the distance between two points. 

class Point {
	double x;
	double y;
	double distanceTo(Point a) {
		return Math.pow(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2), 0.5)
	}	
	double distanceToOrigin() {
		Point origin = new Point()
        origin.x = 0.0
        origin.y = 0.0
        return distanceTo(origin)
	}
    void moveTo(double a, double b) {
        this.x = a
        this.y = b
    }
    // same name / different arguments. Method overloading. 
    void moveTo(Point newPoint) {
    	this.x = newPoint.x
    	this.y = newPoint.y
    }
    Point clone() {
    	Point cloned = new Point()
    	cloned.x = x
    	cloned.y = y
    	return cloned
    }
    Point opposite() {
    	Point oppoint = new Point()
    	oppoint.x = -x 
    	oppoint.y = -y 
    	return oppoint
    }
}


double one = 12.4
double two = 7.07
double three = 3.6
double four = 2.0

// first point
Point MyPoint = new Point()
MyPoint.x = one
MyPoint.y = two


// second point 
Point MyPoint2 = new Point()
MyPoint2.x = three
MyPoint2.y = four

println ''
// it prints the coordinates for the two points
println 'The first point has the following coordiantes: ' + MyPoint.x + ', ' +  MyPoint.y
println 'The second point has the following coordiantes: ' + MyPoint2.x + ', ' +  MyPoint2.y + '\n'


// it supposedly returns the distance between the two points but it doesn't
println 'The distance between the first and the second point is: ' + MyPoint.distanceTo(MyPoint2)
println 'The distance between the first and the origin point is: ' + MyPoint.distanceToOrigin()

println 'Now let\'s move the first point.'
println 'choose the coordinate x for your new point: '
String new1 = System.console().readLine()
double new_x = Double.parseDouble(new1)
println 'and now choose the coordinate y for your new point'
String new2 = System.console().readLine()
double new_y = Double.parseDouble(new1)

MyPoint.moveTo(new_x, new_y)

Point third_Point = new Point()
third_Point.x = 6.91
third_Point.y = -1.09

println 'Now move to a new point called third_point with x = 6.91 and y = -1.09'
MyPoint.moveTo(third_Point)

println MyPoint.x

cloned_pt = MyPoint.clone()
println 'The cloned point has the following coordinates: ' + cloned_pt.x + ', ' + cloned_pt.y
the_opposite = MyPoint.opposite()
println 'I also created the opposite of your first point. Those are the coordinates: ' + the_opposite.x + ' ' + the_opposite.y

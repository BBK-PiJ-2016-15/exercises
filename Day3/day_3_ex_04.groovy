
println 'Type the X coordinates of the first point'  // FIRST POINT
String q = System.console()readLine()
Double x1 = Double.parseDouble(q)

println 'Type the Y coordinates of the first point'
String w = System.console()readLine()
Double y1 = Double.parseDouble(w)

println 'Type the X coordinates of the second point' // SECOND POINT 
String e = System.console()readLine()
Double x2 = Double.parseDouble(e)

println 'Type the Y coordinates of the second point'
String r = System.console()readLine()
Double y2 = Double.parseDouble(r)

println 'Type the X coordinates of the third point' // THIRD POINT 
String t = System.console()readLine()
Double x3 = Double.parseDouble(t)

println 'Type the Y coordinates of the third point'
String u = System.console()readLine()
Double y3 = Double.parseDouble(u)

distance1 = Math.sqrt((((x1 - x2) ** 2) + ((y1 - y2) ** 2)))

distance2 = Math.sqrt((((x1 - x3) ** 2) + ((y1 - y3) ** 2)))


if (distance1 > distance2){
	println 'The third point is closer to the first one.'
}
else {
	println 'The second point is closer to the firtst one.'
}



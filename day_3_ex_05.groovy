
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

Double x3 = x1 * -1
Double y3 = y1 * -1 
Double x4 = x2 * -1
Double y4 = y2 * -1 


Double distanceAB = Math.sqrt((((x1 - x3) ** 2) + ((y1 - y3) ** 2)))
Double distanceBC = Math.sqrt((((x2 - x4) ** 2) + ((y2 - y4) ** 2)))

println 'One side is measures: ' + distanceBC
println 'The second side measures ' + distanceAB

Double area = distanceAB * distanceBC
println 'The area of the rectangle built using your input is: ' + area 

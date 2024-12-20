def list = [1, 2, 3, 4, 5]

println list[4] // Accesses the last element (index 4) 
println list.size() // Check the number of elements before accessing

if (list.size() > 0) { 
  println list[0] // Accessing the first element (index 0) safely 
}

// safer way to get the last element without worrying about empty lists
println list.lastOrNull() 
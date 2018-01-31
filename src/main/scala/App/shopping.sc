class Product(val name: String, val category: String, val price: Int) {
  override def toString(): String = {
    s"$name - $category ($price)"
  }
}

val bread = new Product("Bread", "Food", 80)
val milk = new Product("Milk", "Food", 60)
val washingUpLiquid = new Product("Washing up liquid", "Household", 100)
val bleach = new Product("Bleach", "Household", 70)

val basket = List(bread, milk, milk, washingUpLiquid, bleach)


/** 1. What is the total price? **/

basket.foldRight(0)(_.price + _)

basket.foldRight(0)((prod, acc) => acc + prod.price)

// The difference between fold right and left shown above and below. //

basket.foldLeft(0)(_ + _.price)

basket.foldLeft(0)((acc,prod) => prod.price + acc)


/** 2. How much has been spent on food? **/

basket.filter(p => p.category == "Food").foldRight(0)(_.price + _)



/** 3. What is the total if there’s a 10% off sale?**/

basket.foldRight(0)(_.price + _) * 0.9


/* below does the same calculation as above however using map functions allows you to
 select each element in the list and give you value to each individual item. */

basket.map(_.price * 0.9).foldRight(0d)(_+_)


/** What is the total if you have a voucher for 50% off washing up liquid?**/

val washingUpTotal = basket.filter(p => p.name == "Washing up liquid").map(_.price * 0.5).foldRight(0d)(_ + _)
val everythingElseTotal = basket.filter(p => p.name != "Washing up liquid").map(_.price).foldRight(0d)(_ + _)
washingUpTotal + everythingElseTotal


/* below is the DRY code and does the exact same job as above */

basket.map ( p => {
  if (p.name == "Washing up liquid")
    p.price * 0.5 else p.price
}).foldRight(0d)(_+_)
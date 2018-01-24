package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    //takes x and y and returns x+y
    val sum = { x: Int, y: Int -> x + y }
    val sum2 : (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val a = 2
    val aa : Int = 2
    val aaa : (Int) = 2

    //takes x int return int
    val square: (Int) -> Int = { x -> x * x }

    //function as a variable

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas:
        return true if the collection contains an even number.
        You can find the appropriate function to call on 'Collection' by using code completion.
        Don't use the class 'Iterables'.
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>): Boolean = collection.any { element -> element % 2 == 0 }
import lib.Callback
import lib.Lib
//import lib.foo

fun main(args: Array<String>) {

    // foo is a Java function in Lib class
    Lib().foo(
        "",
        { println("something") },
        1, 2, 3
    )

    //This will not compile at first, requires import of the function:
//    Lib().foo(
//        "",
//        1, 2, 3
//        { println("something") },
//    )

}
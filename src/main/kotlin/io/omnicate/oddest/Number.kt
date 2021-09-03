package io.omnicate.oddest

/**
 * Class containing functions to determine whether a given number is odd.
 */
class Oddest {
   companion object {
       /**
        * Returns true if num is odd, false if otherwise.
        */
       fun isOdd(num: Int): Boolean {
           return num.rem(2) == 1
       }
   }
}
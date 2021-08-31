package io.omnicate.oddest

class Oddest {
   companion object {
       fun isOdd(num: Int): Boolean {
           return num.mod(2) == 1
       }
   }
}
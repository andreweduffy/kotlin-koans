package i_introduction._9_Extension_Functions

fun String.lastChar() = this.get(this.length - 1)

fun use() {
    // try Ctrl+Space "default completion" after the dot: lastChar() is visible
    "abc".lastChar()
}

// 'lastChar' is compiled to a static function in the class ExtensionFunctionsKt (see JavaCode9.useExtension)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)


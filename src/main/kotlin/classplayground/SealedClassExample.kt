package classplayground

sealed class SealedClassExample(open val name: String) {
    data class Kotlin(override val name: String) : SealedClassExample(name)
    data class Java(override val name: String) : SealedClassExample(name)
    data class JavaScript(override val name: String) : SealedClassExample(name)
}
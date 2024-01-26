package `in`.rcard.validaktor

object NumbersRules {
    interface Positive<T : Number> {
        fun T.positive(): Boolean
    }

    interface NonZero<T : Number> {
        fun T.nonZero(): Boolean
    }

    interface InRange<T : Number> {
        fun T.inRange(
            min: T,
            max: T,
        ): Boolean
    }

    data class NegativeFieldError(override val field: String) : InvalidFieldError {
        override fun toString(): String = "Field '$field' must be positive"
    }

    data class ZeroFieldError(override val field: String) : InvalidFieldError {
        override fun toString(): String = "Field '$field' must be non zero"
    }

    val positiveDouble =
        object : Positive<Double> {
            override fun Double.positive(): Boolean = this > 0.0
        }

    val positiveInteger =
        object : Positive<Int> {
            override fun Int.positive(): Boolean = this > 0
        }

    val nonZeroInteger =
        object : NonZero<Int> {
            override fun Int.nonZero(): Boolean = this != 0
        }

    val rangeInteger =
        object : InRange<Int> {
            override fun Int.inRange(
                min: Int,
                max: Int,
            ): Boolean = this in min..max
        }

    context(ValidationScope, Positive<T>)
    fun <T : Number> positive(
        toValidate: T,
        fieldName: String,
    ) {
        if (!toValidate.positive()) {
            raise(NegativeFieldError(fieldName))
        }
    }

    context(ValidationScope, NonZero<T>)
    fun <T : Number> nonZero(
        toValidate: T,
        fieldName: String,
    ) {
        if (!toValidate.nonZero()) {
            raise(ZeroFieldError(fieldName))
        }
    }
}

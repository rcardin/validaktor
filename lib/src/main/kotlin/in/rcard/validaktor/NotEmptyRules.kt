package `in`.rcard.validaktor

object NotEmptyRules {
    interface NotEmpty<T> {
        fun T.notEmpty(): Boolean
    }

    data class EmptyFieldError(override val field: String) : InvalidFieldError {
        override fun toString(): String = "Field '$field' is empty"
    }

    val notEmptyString =
        object : NotEmpty<String> {
            override fun String.notEmpty(): Boolean = this.isNotBlank()
        }

    context(ValidationScope, NotEmpty<T>)
    fun <T> notEmpty(
        toValidate: T,
        fieldName: String,
    ) {
        if (!toValidate.notEmpty()) {
            raise(EmptyFieldError(fieldName))
        }
    }
}

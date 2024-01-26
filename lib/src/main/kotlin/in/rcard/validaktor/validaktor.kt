package `in`.rcard.validaktor

import arrow.core.EitherNel
import arrow.core.NonEmptyList
import arrow.core.raise.either
import arrow.core.raise.ensure

interface InvalidFieldError {
    val field: String
}

interface ValidatorScope<T> {
    fun T.validate(): EitherNel<InvalidFieldError, T>
}

class ValidationScope {
    private val errors: MutableList<InvalidFieldError> = mutableListOf()

    fun raise(error: InvalidFieldError) {
        errors.add(error)
    }

    @Suppress("DEPRECATION")
    internal fun <T> T.orEitherNel(): EitherNel<InvalidFieldError, T> =
        either {
            ensure(errors.isEmpty()) { NonEmptyList.fromListUnsafe(errors) }
            this@orEitherNel
        }
}

fun <T> T.validation(validationBlock: ValidationScope.() -> Unit) =
    with(ValidationScope()) {
        validationBlock()
        this@validation.orEitherNel()
    }

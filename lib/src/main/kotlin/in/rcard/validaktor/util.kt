package `in`.rcard.validaktor

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/*
 * This file contains a bunch of versions of the `with` function from the Kotlin standard library that receive more
 * than one context.
 *
 *  See https://discuss.kotlinlang.org/t/using-with-function-with-multiple-receivers/2062/7 for further details.
 */

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, R> with(
    a: A,
    b: B,
    block: context(A, B)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, R> with(
    a: A,
    b: B,
    c: C,
    block: context(A, B, C)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    block: context(A, B, C, D)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, E, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    block: context(A, B, C, D, E)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d, e)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, E, F, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    block: context(A, B, C, D, E, F)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d, e, f)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, E, F, G, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    block: context(A, B, C, D, E, F, G)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d, e, f, g)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, E, F, G, H, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    block: context(A, B, C, D, E, F, G, H)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d, e, f, g, h)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, E, F, G, H, I, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    block: context(A, B, C, D, E, F, G, H, I)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d, e, f, g, h, i)
}

@OptIn(ExperimentalContracts::class)
@Suppress("SUBTYPING_BETWEEN_CONTEXT_RECEIVERS")
inline fun <A, B, C, D, E, F, G, H, I, J, R> with(
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    block: context(A, B, C, D, E, F, G, H, I, J)
    () -> R,
): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block(a, b, c, d, e, f, g, h, i, j)
}

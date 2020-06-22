// !DIAGNOSTICS: -UNUSED_PARAMETER

fun launch(block: () -> Unit) {}
fun <T> run(block: () -> T): T = block()

fun test() {
    launch {
        run<Nothing> { TODO("") }
    }
    launch {
        run { TODO("") }
    }
    launch {
        run<String> { "" }
    }
    launch {
        run<Nothing?> { null }
    }
    launch {
        run { null }
    }
}
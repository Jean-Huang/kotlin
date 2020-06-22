// FIR_IDENTICAL
// !LANGUAGE: +NewInference

// FILE: C.java

public interface C { void on(String s); }

// FILE: A.java

public class A { void add(C c) {} }

// FILE: test.kt

class B : A() {
    fun test(f: (String) -> Unit) {
        add(foo { f })
    }

    fun <T> foo(f: () -> T): T = f()
}
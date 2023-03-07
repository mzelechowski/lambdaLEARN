package Basics;

@FunctionalInterface
public interface MathOpertion<T> {
    T operate(T a, T b);
}

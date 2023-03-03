package ch16Ex_08;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}

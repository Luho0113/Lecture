package ch16Ex_09;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}

package ch10Ex_07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() { }

	public WrongPasswordException(String message) {
		super(message);
	}
}

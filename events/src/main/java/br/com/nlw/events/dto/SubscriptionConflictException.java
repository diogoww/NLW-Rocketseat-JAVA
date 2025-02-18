package br.com.nlw.events.dto;

public class SubscriptionConflictException extends RuntimeException{
	public SubscriptionConflictException(String msg) {
		super(msg);
	}
}

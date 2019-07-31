package com.solvd.ITCompany.it.company;

import java.io.IOException;

public class NotExistedEmailException extends IOException {
	public NotExistedEmailException(String message) {
		super(message);
	}
}

package com.solvd.ITCompany.it.company;

import java.io.IOException;

public class NotExistedNameException extends IOException {
	public NotExistedNameException(String message) {
		super(message);
	}
}

package edu.aydin.insurance.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "There is no cases list!")
public class CasesListNotFoundException extends RuntimeException {
}

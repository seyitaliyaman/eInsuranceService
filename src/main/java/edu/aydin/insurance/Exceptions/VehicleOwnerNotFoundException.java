package edu.aydin.insurance.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Vehicle Owner not found!")
public class VehicleOwnerNotFoundException extends RuntimeException {
}

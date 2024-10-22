package org.youcode.exception;

import java.util.UUID;

public class MembreNotFoundException extends RuntimeException {
    public MembreNotFoundException(UUID id) {
        super("Membre not found with ID: " + id);
    }
}

// InvalidBirdDataException.java
// Darien Bathalter
// 2026-11-16
// Exception thrown when a bird is created with invalid data

package edu.fscj.cop2800c.penguin;

// Checked exception for bad Bird or Penguin constructor values
public class InvalidBirdDataException extends Exception {
    // Constructor passes the error message up to Exception
    public InvalidBirdDataException(String message) {
        super(message);
    }
}

package org.example;

public class StringProcessing {

    /**
     * Checks if the provided password is strong.
     * A strong password must contain at least one uppercase letter,
     * one lowercase letter, one digit, and one special symbol.
     *
     * @param password The password to check.
     * @return true if the password is strong; false otherwise.
     */
    public boolean isStrongPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()-+=<>?";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.indexOf(ch) >= 0) {
                hasSpecialChar = true;
            }

            if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
                return true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    /**
     * Counts the number of digits in the given sentence.
     *
     * @param sentence The sentence to analyze.
     * @return The count of digits in the sentence.
     */
    public int calculateDigits(String sentence) {
        if (sentence == null) {
            return 0;
        }

        int digitCount = 0;
        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount;
    }



    /**
     * Calculates the number of words in the given sentence.
     * Words are considered to be separated by spaces.
     *
     * @param sentence The sentence to analyze.
     * @return The count of words in the sentence.
     */
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }


    /**
     * Evaluates a mathematical expression contained in the given string.
     *
     * @param expression The mathematical expression to evaluate.
     * @return The result of the evaluated expression.
     * @throws IllegalArgumentException If the expression is invalid.
     */
    public double calculateExpression(String expression) {
        try {
            javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
            javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
            return Double.parseDouble(engine.eval(expression).toString());
        } catch (Exception e) {
            System.out.println("Error evaluating expression: " + expression);
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }

}

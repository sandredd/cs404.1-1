package edu.berkeley.cs.app;

import edu.berkeley.cs.util.Stack;

public class Calculator {
  static class Token {
    enum Type {
      NUMBER,
      OPERATOR,
    }

    private Type type;
    private double value;
    private char operator;
    private int precedence;

    /**
     * Create a new token based on string input. This is the constructor used when tokenizing the
     * input elements. The constructor figures out what type of token we are dealing with (e.g.
     * operarator or a number). If a number is incorrectly formatted, throw a RuntimeException.
     */
    Token(String value) {
      switch (value) {
        case "+":
        case "-":
          type = Type.OPERATOR;
          operator = value.charAt(0);
          precedence = 1;
          break;
        case "*":
        case "/":
          type = Type.OPERATOR;
          operator = value.charAt(0);
          precedence = 2;
          break;
        case "^":
          type = Type.OPERATOR;
          operator = value.charAt(0);
          precedence = 3;
          break;
        default:
          type = Type.NUMBER;
          try {
            this.value = Double.parseDouble(value);
          } catch (NumberFormatException exception) {
            throw new RuntimeException("Malformed double: " + value);
          }
      }
    }

    /** Create a token that is known to be a number. This is used only by the operate method. */
    private Token(double x) {
      type = Type.NUMBER;
      value = x;
    }

    Type type() {
      return type;
    }

    double value() {
      return value;
    }

    int precedence() {
      return precedence;
    }

    /**
     * Run the current token's operation on two known numbers and return the result. This method is
     * really only useful for a token that is known to be an operator (e.g. when poppped from the
     * operator stack).
     */
    public Token operate(double a, double b) {
      double result = 0;

      switch (operator) {
        case '+':
          result = a + b;
          break;
        case '-':
          result = a - b;
          break;
        case '*':
          result = a * b;
          break;
        case '/':
          result = a / b;
          break;
        case '^':
          result = Math.pow(a, b);
          break;
      }

      return new Token(result);
    }
  }

  /**
   * Evaluate an expression. If there is an error in evaluating the expression, throw a
   * RuntimeException.
   */
  public static double evaluate(String expression) {
    Stack<Token> values = new Stack<>();
    Stack<Token> operators = new Stack<>();

    String[] elements = expression.split(" ");
    for (String element : elements) {
      Token token = new Token(element);

      // TODO: your code goes here
    }

    return 0;
  }
}

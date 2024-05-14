package edu.Stefany.Desafio;

public class ParametrosInvalidosException extends Exception {
    public String erro;

    {
        this.erro = "O segundo parâmetro deve ser maior que o primeiro";
    }
}

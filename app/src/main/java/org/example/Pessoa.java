package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa extends Funcionario {
  private String nome;
  private LocalDate dataNascimento;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public Pessoa(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
    super(salario, funcao);
    this.nome = nome;
    this.dataNascimento = dataNascimento;
  }

}

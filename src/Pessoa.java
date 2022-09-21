public class Pessoa {
    
  public String nome;
  public double peso;
  public double altura;
  public String dataNascimento;

    public Pessoa(
      String nome,
      double peso,
      double altura,
      String dataNascimento
    ) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento; 
        
    }
    public double imc() {
        return this.peso / (this.altura * this.altura);
    }

    public String imcTexto() {
        Double imc = this.imc();
        if (imc < 18.5) {
            return "Abaixo do Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso Ideal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade Grau II";
        } else if (imc >= 40) {    
            return "Obesidade Grau III (mórbida)";
        }

        return "Referência incorreta";
    }
    
}

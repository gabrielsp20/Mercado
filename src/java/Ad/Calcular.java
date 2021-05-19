package Ad;

public class Calcular {

    private double valor;
    private String operacao;
    private String mensagem = "";

    public void setValor(String v) {
        try {
            this.valor = Double.parseDouble(v);
        } catch (NumberFormatException e) {
            this.mensagem += "<br>O valor  não é um número válido";
        }

    }


    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public boolean validar() {
        return !mensagem.equals("");
    }

    public double calcular() {
       
        double resultado = 0.0;

        switch (operacao) {
            case "op1":
                resultado = (valor-(valor * 10 / 100));
                break;
            case "op2":
                resultado = (valor -(valor * 5 / 100));
                break;
            case "op3":
                resultado = (valor);
                break;

        }
        return resultado;
    }
}

<%@page import="Ad.Calcular"%>
<%
    Calcular c = new Calcular();

    c.setValor1(request.getParameter("valor"));
    c.setOperacao(request.getParameter("operacao"));

    if (c.validar()) {
        out.print(c.getMensagem());
    }else {
        out.print("O valor da sua compra foi " + c.calcular());
    }
%>

<br><br><a href="index.html">Voltar</a>
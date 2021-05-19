<%@page import="Ad.Opcao" %>


<!DOCTYPE html>
<html>
    <head>
        <title>Hortifruti</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="text-align:center ;display: flex; align-items: center; justify-content: center;">
        <div style=" width: 400px ; border-radius: 25px; border: 5px solid black; display: flex; align-items: center; justify-content: center; ">
            <form action="saida.jsp" method="POST">
                <h1 style="color:#49bf9d; font-size: 25px">Hortifruti</h1>
                <div style=" background-image: linear-gradient(70deg,#E3CF57, #726794, #ffa500, #fd1906,#e3e015 ); width: 300px; height: 140px; border-radius: 25px; ">
                    <%out.print(new Opcao().fruta());%>

                </div>

                    <br><input type="text" name="valor" value="" placeholder="Preço das Compras"  style=" text-align: center;font-size: 20px; border-radius:25px; outline: none; border: 1px solid black; "><br>



                <%=new Opcao().getEscolha()%> <br>
                <select name="operacao" style="font-size: 20px; border-radius: 25px; outline: none; border: 3px solid black;" >
                    <option value="op1">Opção 1</option>
                    <option value="op2">Opção 2</option>
                    <option value="op3">Opção 3</option>
                </select><br><br>

                <input style="font-size: 20px; border-radius: 25px; background-color: #49bf9d; "  type="submit" name="bt" value="Calcular"><br><br>
                <div style="background-color: #4169e1; width: 300px; border-radius: 25px; margin-bottom:10px ; ">
                    <% out.println("CONTATOS<br><br>");
                    String contato[][] = {
                        {"LOJA:","Hortifruti ", "<br>"},
                        {"TELEFONE:", "7777-9999 ", "<br>"},
                        {"ENDEREÇO:", "Rua Francisco Bezerra", "<br>"},

                    };
                    for (int lin = 0; lin < contato.length; lin++) {
                        for (int col = 0; col < contato[lin].length; col++) {
                            out.print(contato[lin][col]);
                        }
                        out.print("<br>");
                    }
                    %>
                </div>
            </form>
        </div>   
        
    </body>
</html>

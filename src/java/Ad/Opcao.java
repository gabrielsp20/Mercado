
package Ad;


public class Opcao {
    String html = "";
    
        private void Escolha(){
        html += "<style> p{font-size:15px; text-transform: uppercase;}</style><br><p><b>Escolha uma forma de pagamento</b></p>";
        html += "<div align=\"center\">";
        html += " <table> <style> table th{background: #ccc; border-radius:5px; } table{margin:0 0 2em 0; width: 100%; text-align: center} table tbody tr td{ border-radius:5px; border-top:1px solid #ccc; border-bottom: 1px solid #ccc; border-right:1px solid #ccc; border-left:1px solid #ccc;}</style>";
        html += "       <tr><th><b>Opção</b></td>        <th><b>Pagamento</b></td></tr>";
        html += "       <tr><td>[1]</td>                 <td>à vista dinheiro <br> (10% desconto)</td></tr>";
        html += "       <tr><td>[2]</td>                 <td>à vista cartão <br> (5% desconto) </td> </tr>";
        html += "       <tr><td>[3]</td>                 <td>2x no cartão <br> (Preço Normal)</td></tr>";
        html += "     </table>";
        html += "</div>";
        
    }
        public String getEscolha(){
            Escolha();
            return html;
    }
    public String fruta(){
        String escolha = "<b>Hortifruti</b> <br>";
        
        String nomeFrutas[] = {"<label><input type=\"checkbox\" name=\"Banana\" value=\"1\">Banana - R$10,00</label>", 
            "<label><input type=\"checkbox\" name=\"Uva\" value=\"1\">Uva - R$10,00</label>",
            "<label><input type=\"checkbox\" name=\"Laranja\" value=\"1\">Laranja - R$10,00</label>",
            "<label><input type=\"checkbox\" name=\"Melancia\" value=\"1\">Melancia - R$10,00</label>",
            "<label><input type=\"checkbox\" name=\"Pera\" value=\"1\">Pera - R$10,00</label>"};
        
        int i, f = nomeFrutas.length;
        
        for (i=0; i < f; i++){
        escolha += nomeFrutas[i] + "<br>" ;
        }
        escolha +="<br><br>";
        return escolha;
    }

}


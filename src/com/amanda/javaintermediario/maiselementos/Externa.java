package com.amanda.javaintermediario.maiselementos;

public class Externa {

    private String texto = "texto externo";

    public class Interna{
        private String texto = "texto interno";

        public void imprimeTexto(){
            System.out.println(texto);

            //consegue ver os membros da classe externa tb (mesmo sendo private)
            System.out.println(Externa.this.texto);
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna(); //se a classe interna fosse estática, não seria necessario instanciar a classe externa

        interna.imprimeTexto();
        /*
        texto interno
        texto externo
        */
    }
}

package com.amanda.javaintermediario.maiselementos;

public @interface InformacaoAula {
    String autor() default "Amanda Lima Santos";
    int aulaNumero();
    String site() default "https://www.github.com/amandaveredas";

}

/*
- Recurso que permite embutir informações complementares no código-fonte
    - Informações para o compilador
    - Runtime (tempo de execução)
    - Compile ou Deploy-time (tempo de compilação ou deploy-web)
- Precedida de @
 */

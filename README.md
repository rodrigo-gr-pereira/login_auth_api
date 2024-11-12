# API REST  com Spring Boot
Spring Boot API. REST API. JAVA

## Diagrama de Classes.
```mermaid
classDiagram
    class Autor{
    -int:id
    -String:nome
    -String:descricao
}
    class Postagem{
        -int:id
        -String:titulo
        -String:texto}
    class Comentario{
        -int:id
        -String:texto
}
`Postagem`"0...*" --> "1 -autor" `Autor`
 `Comentario`"0...*" --> "1 -autor"`Autor`
    `Postagem`"1" -->"0...* -comentarios" `Comentario`
   



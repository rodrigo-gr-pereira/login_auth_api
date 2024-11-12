# API REST  com Spring Boot
Spring Boot API. REST API. JAVA

## Diagrama de Classes.
```mermaid
classDiagram
    class `Autor`
    class `Postagem`
    class `Comentario`
`Postagem`"0...*" --> "1 -autor" `Autor`
 `Comentario`"0...*" --> "1 -autor"`Autor`
    `Postagem`"1" -->"0...* -comentarios" `Comentario`
   



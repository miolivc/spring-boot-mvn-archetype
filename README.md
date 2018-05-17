#   spring-boot-mvn-archetype

###   Instruções de Uso do Archetype:

1. Faça clone deste repositório:
    `git clone https://github.com/miolivc/spring-boot-mvn-archetype`

2. Entre dentro da pasta clonada e execute:
    `mvn clean install`

3. Vá para o diretório que deseja criar seu projeto e execute:
    `mvn archetype:generate -DarchetypeGroupId=br.edu.ifpb.praticas \
        -DarchetypeArtifactId=person-rest-app-archetype \
        -DarchetypeVersion=0.0.1-SNAPSHOT \
        -DgroupId=<seu-group-id> \
        -DartifactId=<nome-do-seu-projeto> \
        -Dversion=<versao-do-seu-projeto> \
        -Dpackage=<nome-do-seu-pacote-projeto>
    `

4. Enjoy! 
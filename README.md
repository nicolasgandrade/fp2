# Trabalho de Fábrica de Projetos II - Hotel Management

## Git Workflow

### Desenvolvimento assíncrono
A ideia aqui é que cada um desenvolva independentemente, sem depender da tarefa do amiguinho. Por isso, sigam o fluxo descrito a seguir para o desenvolvimento.

1. Crie uma branch nova para fazer a sua alteração na base de código. Cada branch precisa ter um prefixo (os mesmos dos commits, mas em minusculo), seguido de uma barra e uma pequena descrição da sua branch separada por traços (-). Segue o exemplo: `feat/interface-registro-de-quartos`.
2. Use os padrões de commits para seus commits (descritos mais abaixo).
3. Suba a branch para esse repositório (git push).
4. Abra um pull request para a master e espere ser aprovado.

### Padrão de Commits
Cada commit e branch precisa ter um prefixo que mostre o escopo do commit, vou deixar os prefixos que usaremos abaixo. (TODOS EM MAIUSCULO)
- `STP` - Setup do projeto.
- `FEAT` - Nova funcionalidade.
- `REFACTOR` - Refatoração de código (melhorias que não alteram funcionalidades).
- `FIX` - Correção de algum bug.
- `DB` - Arquivos relacionados ao banco de dados.
- `DOCS` - Criação de documentação (não sei se precisaremos nesse projeto).

Sendo assim, quando for criar o seu commit siga o padrão:
`PREFIXO - O que o seu commit faz (usando modo IMPERATIVO)`.

Exemplo prático: `FEAT - Cria funcionalidade de registro de usuários`.


## Links Úteis
https://ssaurel.medium.com/learn-to-make-a-mvc-application-with-swing-and-java-8-3cd24cf7cb10

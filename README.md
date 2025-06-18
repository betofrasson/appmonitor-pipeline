# AppMonitor Pipeline

Este repositório simula a automação de pipelines de monitoramento de aplicações web, com foco em práticas modernas de integração e entrega contínuas usando GitHub Actions.

## Objetivo

Consolidar conhecimentos sobre pipelines CI/CD, utilizando Git e GitHub Actions para:

- Organizar o repositório de forma estratégica
- Criar workflows de automação
- Realizar diagnósticos e monitoramentos simulados
- Garantir rastreabilidade por meio de versionamento

## Importância do Git na Entrega Contínua

O Git é uma ferramenta essencial para CI/CD, pois:

- Permite versionar o código e os scripts de automação
- Facilita o trabalho colaborativo com controle de branches
- Garante que cada mudança seja registrada e revisável
- Integra-se diretamente com ferramentas como GitHub Actions

## Branches

As branches ajudam a isolar etapas ou funcionalidades do projeto. Por exemplo:

- `main`: branch principal (base de produção)
- `ci/setup`: preparação inicial do projeto e dos scripts

##  Tags e Releases

As **tags** marcam versões estáveis e importantes do projeto. Com elas, é possível:

- Criar releases claros para cada fase
- Rastrear mudanças e funcionalidades entregues
- Automatizar ações com base em versões

Exemplo de versão:
- `v0.1.0`: versão inicial contendo o script de verificação e documentação.


---

### Variáveis e segredos no GitHub Actions

Neste projeto usamos três formas de configurar dados nos workflows:

Variáveis de ambiente (env): definidas diretamente no workflow, úteis para valores simples e temporários. `APP_ENV=dev`.

Variáveis do repositório (vars): configuradas nas configurações do GitHub, ideais para informações constantes reutilizáveis, como `SUPPORT_EMAIL`.

Segredos (secrets): usados para dados sensíveis, como chaves e senhas. São criptografados e não aparecem nos logs. `API_KEY`.


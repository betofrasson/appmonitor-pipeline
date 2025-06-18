## Etapas

### Etapa 01: Controle de versão com Git e organização do repositório

- Criei o repositório no Github
- Criei a branch ci/setup e realizado 2 commits; Um para o script e outro para o arquivo README
- Criei uma tag v0.1.0, e acessei o Github na parte de tags. https://github.com/betofrasson/appmonitor-pipeline/tags. Cliquei na tag e criei um release.

### Etapa 2: Pipeline de integração contínua

- Criei o workflow ci.yml na pasta .github/workflows
- Implementei 3 jobs sequenciais: validate/test/package
- Fiz o commit e push pra main

### Etapa 3: Uso de variáveis, secrets e contextos
- Criei o workflow run-monitor.yml na pasta .github/workflows
- Adicionei no repositório as variáveis `APP_ENV=dev` e `SUPPORT_EMAIL=suporte@appmonitor.io`
- Adicionei no repositório o segredo `API_KEY`
- Utilizei no workflow as variáves e segredo demonstrando o uso dos mesmos
- Fiz o commit e push pra main

### Etapa 4: Monitoramento, logs e resumos automatizados
- Criei o workflow ci.yml na pasta .github/workflows
- Adicionei ACTIONS_STEP_DEBUG:true para habilitar os logs detalhados
- Adicionei mensagens estruturadas ::error::, ::warning:: e ::notice::
- Adicionei no README o badge com o status do workflow
- Fiz o commit e push pra main

### Etapa 5: Permissões e deploy com aprovação manual
- Criei o workflow deploy.yml na pasta .github/workflows
- Criei ambiente production no GitHub
- Adicionei a variável `PROD_DOMAIN=appmonitor.com`
- Habilitei a opção de aprovador obrigatório manual
- Fiz o commit e push pra main

### Etapa 6: Diagnóstico automatizado de falhas
- Criei o workflow diagnostic.yml na pasta .github/workflows
- Adicionei verificação de variáveis `APP_ENV` e `API_KEY`
- Demonstrei erros específicos para cada variável
- Produzi um relatório com as variáveis ausentes e instruções de resolução
- Fiz o commit e push pra main
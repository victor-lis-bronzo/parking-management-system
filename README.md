# 🅿️ Sistema de Gerenciamento de Estacionamento

Um aplicativo Java interativo para gerenciar um estacionamento, permitindo cadastrar veículos, registrar saídas, listar veículos e calcular fretamento.

## 📋 Funcionalidades

- **Cadastrar Veículo**: Registre novos veículos com placa, modelo e valor por hora
- **Sair Veículo**: Remova um veículo do estacionamento pela placa
- **Listar Veículos**: Visualize todos os veículos cadastrados
- **Calcular Fretamento**: Calcule o valor estimado baseado no número de horas
- **Menu Interativo**: Interface simples e intuitiva via terminal

## 📁 Estrutura de Pastas

```
parking-lot-system-management/
├── src/                    # Código-fonte Java
│   ├── App.java           # Classe principal com menu interativo
│   ├── Estacionamento.java # Gerenciador do estacionamento
│   └── Veiculo.java       # Classe que representa um veículo
├── bin/                   # Arquivos compilados (.class)
├── lib/                   # Dependências externas
└── README.md             # Este arquivo
```

## 🚀 Como Compilar e Executar

### Compilação
```bash
javac -d bin src/*.java
```

### Execução
```bash
java -cp bin App
```

## 📦 Classes Principais

### `Veiculo.java`
Representa um veículo com os seguintes atributos:
- `placa` (String): Identificador único do veículo
- `modelo` (String): Modelo do veículo
- `valorHora` (float): Valor cobrado por hora de permanência

### `Estacionamento.java`
Gerencia a coleção de veículos com métodos para:
- Adicionar novo veículo
- Remover veículo pela placa
- Listar todos os veículos
- Calcular faturamento estimado

### `App.java`
Aplicação principal que oferece um menu interativo com 5 opções:
1. Cadastrar Veículo
2. Sair Veículo
3. Listar Veículos
4. Calcular Fretamento
5. Sair do programa

## ⚙️ Requisitos

- Java 11 ou superior
- VS Code com extensão Language Support for Java (Red Hat)

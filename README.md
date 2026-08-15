# 📚 Sistema de Gerenciamento de Biblioteca

Sistema em Java, via terminal, para gerenciamento do acervo de uma biblioteca — cadastro de livros físicos e digitais, listagem e consulta de disponibilidade.

Projeto desenvolvido para praticar e aplicar conceitos fundamentais de **Programação Orientada a Objetos**.

## ✨ Funcionalidades

- Cadastro de livros físicos (com controle de exemplares disponíveis)
- Cadastro de livros digitais (com link de acesso)
- Listagem de todos os livros cadastrados
- Consulta de disponibilidade por título
- Contagem automática do total de livros no sistema

s** | `ArrayList<Livro>` para armazenar o acervo, aproveitando o polimorfismo para guardar tipos diferentes na mesma lista |

## 🗂️ Estrutura do projeto

```
Biblioteca/
├── modelo/
│   ├── Livro.java         
│   ├── LivroFisico.java
│   ├── LivroDigital.java
│   ├── Genero.java       
│   └── Emprestavel.java   
├── Sistema/
│   └── Biblioteca.java     
└── Main.java                
```

## ▶️ Como executar

```bash
javac Biblioteca/modelo/*.java Biblioteca/Sistema/*.java Biblioteca/Main.java
java Biblioteca.Main
```



## 🛠️ Tecnologias

- Java (sem frameworks — POO pura)

## 🚀 Próximos passos

- Persistência de dados em arquivo ou banco de dados
- Empréstimo com data de devolução e cálculo de multa por atraso
- Testes unitários

---

Projeto desenvolvido como parte dos estudos de Java e Programação Orientada a Objetos.

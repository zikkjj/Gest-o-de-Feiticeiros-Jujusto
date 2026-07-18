# <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="35" height="35" align="center" /> Sistema de Cadastro Jujutsu

Um sistema organizado para gerenciar e catalogar Feiticeiros Jujutsu, suas linhagens e suas capacidades místicas. Desenvolvido em **Java**, este projeto modela o rico universo de *Jujutsu Kaisen*, agrupando feiticeiros por seus respectivos clãs e capturando restrições celestiais únicas ou modificações especiais.

---

## <img src="https://cdn.jsdelivr.net/npm/simple-icons@v11/icons/aboutdotme.svg" width="22" height="22" align="center" /> Sobre o Projeto

Esta é uma aplicação backend desenvolvida em Java com o objetivo de praticar conceitos fundamentais de Programação Orientada a Objetos (POO), tais como **Herança, Polimorfismo e Encapsulamento**. O sistema permite registrar feiticeiros Jujutsu, atribuindo dinamicamente status e técnicas amaldiçoadas específicas com base no Clã escolhido, além de suportar personagens específicos que quebram as regras tradicionais do mundo da feitiçaria.

## <img src="https://cdn.jsdelivr.net/npm/simple-icons@v11/icons/probot.svg" width="22" height="22" align="center" /> Arquitetura do Sistema e Regras de Negócio

O sistema é estruturado em torno de três pilares principais:

### 1. Dados Básicos do Feiticeiro (`Feiticeiro`)
Todo registro contém as métricas humanas fundamentais do personagem:
*   **Nome** (`String`)
*   **Idade** (`int`)
*   **Clã** (`String` / `Enum`)

### 2. Atributos e Poderes de Clã (`Clã`)
Ao atribuir um clã a um feiticeiro, ele herda automaticamente os traços tradicionais e as técnicas amaldiçoadas de sua linhagem:
*   **Clã Gojo:** Herda alto intelecto tático e o potencial para desbloquear técnicas de distorção espacial como o *Ilimitado* ($Mukagen$).
*   **Clã Zen'in:** Herda alta eficiência de combate militar, proeza física ou as artes de manipulação de sombras.

### 3. Atributos Únicos e Personagens Especiais
O sistema manipula perfis fora da curva que ignoram as estruturas normais de um clã através de atributos condicionais:
*   **Restrição Celestial ($Ten'ei Juuki$):** Perfis como *Toji* ou *Maki* são modelados com zero absoluto de energia amaldiçoada, convertendo seu escalonamento de poder para força bruta física, sentidos hiper-aguçados e maestria em armas.
*   **Os Seis Olhos ($Rikugan$):** Um traço genético raro que minimiza o consumo de energia amaldiçoada para praticamente zero, permitindo o uso contínuo de técnicas sem fadiga.

---

## <img src="https://cdn.jsdelivr.net/npm/simple-icons@v11/icons/dependencycheck.svg" width="22" height="22" align="center" /> Tecnologias Utilizadas

*   **Java** (Versão 17 ou superior recomendada)
*   **Arquitetura Orientada a Objetos** (Modelagem de domínio)

---

## <img src="https://cdn.jsdelivr.net/npm/simple-icons@v11/icons/git.svg" width="22" height="22" align="center" /> Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter o **JDK (Java Development Kit) 17+** e o **Git** instalados em sua máquina.

### Instalação e Execução
1. Clone este repositório para a sua máquina local:
   ```bash
   git clone [https://github.com/SEU_USUARIO/sistema-cadastro-jujutsu.git](https://github.com/SEU_USUARIO/sistema-cadastro-jujutsu.git)

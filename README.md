# ⛩️ Jujutsu Registry System

An organized system to manage and catalog Jujutsu Sorcerers, their lineages, and their mystical capabilities. Built with **Java**, this project models the rich universe of *Jujutsu Kaisen*, grouping sorcerers by their respective clans and capturing unique celestial restrictions or unique modifications.

---

## 🚀 About the Project

This is a backend application developed in Java designed to practice object-oriented programming (OOP) concepts like **Inheritance, Polymorphism, and Encapsulation**. The system allows registering Jujutsu sorcerers, dynamically assigning attributes and specific cursed techniques based on their chosen Clan, while also supporting unique specific characters who break traditional rules.

## 🧠 System Architecture & Rules

The system is structured around three core pillars:

### 1. Base Sorcerer Data (`Feiticeiro`)
Every registered entity contains fundamental human metrics:
*   **Name** (`String`)
*   **Age** (`int`)
*   **Clan** (`String` / `Enum`)

### 2. Clan Attributes & Powers (`Clã`)
When assigning a clan to a sorcerer, they automatically inherit the traditional traits and signature cursed techniques of that lineage:
*   **Gojo Clan:** Inherits high tactical intellect and the potential to unlock spatial distortion techniques like *Limitless* ($Mukagen$).
*   **Zen'in Clan:** Inherits high military combat efficiency, physical prowess, or shadow manipulation arts.

### 3. Unique Traits & Special Characters
The system handles outlier profiles that bypass normal clan structures through conditional attributes:
*   **Heavenly Restriction ($Ten'ei Juuki$):** Profiles like *Toji* or *Maki* are modeled with absolute zero cursed energy, automatically shifting their power scaling into physical brute force, hyper-acute senses, and tool mastery.
*   **The Six Eyes ($Rikugan$):** A rare genetic trait that minimizes cursed energy consumption metrics to practically zero, allowing endless technique uptime.

---

## 🛠️ Technologies Used

*   **Java** (Version 17 or higher recommended)
*   **Object-Oriented Architecture** (Domain-driven modeling)
*   *Optional future additions: Spring Boot / PostgreSQL / JUnit*

---



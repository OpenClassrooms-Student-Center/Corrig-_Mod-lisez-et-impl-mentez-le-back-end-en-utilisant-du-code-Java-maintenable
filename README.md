# Correction du projet 3: Modelisez et implementez le backend en utilisant du code Java maintenable

## Context

Ce projet est la création d'un backend Spring Boot pour une application frontend Angular définie dans le projet OpenClassrooms : [Modélisez et implémentez le back-end en utilisant du code Java maintenable](https://github.com/OpenClassrooms-Student-Center/Mod-lisez-et-impl-mentez-le-back-end-en-utilisant-du-code-Java-maintenable).

Il s'agit d'une API REST minimale avec authentification JWT et gestion des utilisateurs uniquement.

## Technologies

- Spring Boot 3.x
- Spring Security avec JWT
- MySQL
- Spring Data JPA
- Maven

## Installation

### Prérequis

- Java 17 ou supérieur
- Maven 3.6+
- MySQL 8.0+

### Étapes d'installation

1. Cloner le repository en local

2. **Configurer la base de données**
   - Créer une base de données MySQL nommée `springangularp3`
   - Mettre à jour les paramètres de connexion dans `src/main/resources/application.properties` si nécessaire

3. **Installer les dépendances et compiler**
   ```bash
   mvn clean install
   ```

4. **Lancer l'application**
   ```bash
   mvn spring-boot:run
   ```

L'application sera accessible sur http://localhost:3001

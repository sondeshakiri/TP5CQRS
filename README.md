# TP5CQRS

# Implémentation de CQRS et Axon dans un Microservice avec MySQL

Ce projet implémente un microservice de gestion des produits en utilisant le framework **Axon** avec le modèle **CQRS** (Command Query Responsibility Segregation) et **MySQL** comme base de données.

## Objectifs
- Comprendre et appliquer le modèle CQRS.
- Mettre en place un microservice avec Axon Framework.
- Utiliser MySQL pour stocker les événements et les entités.
- Développer un microservice simple de gestion de produits.

## Étapes de l'implémentation

1. **Ajout des Dépendances** :  
   Le fichier `pom.xml` a été modifié pour inclure les dépendances nécessaires pour **Axon**, **Spring Boot** et **MySQL**.

2. **Configuration** :  
   - Configuration de la base de données MySQL dans `application.properties` avec l'URL, le nom d'utilisateur et le mot de passe.
   - Configuration d'Axon pour utiliser un *Event Store* basé sur JPA.

3. **Création des Commandes et des Événements** :  
   Des commandes pour créer un produit (`CreateProductCommand`) et des événements associés (`ProductCreatedEvent`) ont été définis.

4. **Création de l'Aggregate** :  
   L'**aggregate** `ProductAggregate` a été créé pour gérer les commandes et appliquer les événements à l'état des produits.

5. **Création d'un Projecteur pour les Requêtes** :  
   Un projecteur `ProductProjection` a été mis en place pour traiter les requêtes et récupérer les informations des produits depuis la base de données.

6. **Exposition via API REST** :  
   Des points d'entrée REST ont été ajoutés pour permettre la création de produits via des commandes **POST** et la récupération de produits via des requêtes **GET**.

7. **Tests et Vérifications** :  
   Des tests ont été effectués pour s'assurer que les commandes créent correctement les produits et que les requêtes retournent les informations attendues.

## Technologies utilisées
- **Axon Framework** pour implémenter le modèle CQRS.
- **Spring Boot** pour la gestion du microservice.
- **MySQL** comme base de données.
- **Docker** pour l'exécution d'Axon Server dans un conteneur.

## Lancer le projet
1. Assurez-vous que MySQL est installé et configuré sur votre machine.
2. Configurez les informations de connexion à la base de données dans `application.properties`.
3. Lancez l'application Spring Boot.
4. Utilisez les points d'API REST pour interagir avec le microservice.

---

Vous pouvez adapter et ajouter des détails supplémentaires si nécessaire, mais ce résumé résume les étapes clés de l'implémentation.

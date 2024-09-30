# Projet test pour un entretien d'école

### Description
Ce projet est une application en Java qui a pour but de donner des informations à l'utilisateur après qu'il ait entré des données.
J'ai souhaité faire une application ésotérique afin de montrer que ce projet était purement original et de ma composition.

## Fonctionnalité 
* Demande l'année de naissance et calcule l'âge de l'utilisateur, puis renvoie son signe astrologique chinois.
* Demande le mois et le jour de naissance, puis renvoie son signe astrologique occidental.
* Récapitule les informations saisies

## Informations supplémentaires
J'ai tenté de gérer les exceptions en proposant des réponses lorsque les entrées de l'utilisateur ne correspondent pas au champ d'application prévu (par exemple, des années trop anciennes ou futures). 
Cependant, je dois également gérer les exceptions liées aux entrées dont le format est incorrect, comme lorsqu'un utilisateur saisit "mille neuf cent" au lieu de "1900".
Cela implique de vérifier si l'entrée est bien un entier et de fournir un message d'erreur approprié en cas de saisie non valide.

## Exemple 
![Voici un exemple](./Readme-exemple-sortie.png)

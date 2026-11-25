# TP5 - Intents explicites et implicites

## Présentation

Cette application Android calcule l'IMC d'un utilisateur à partir de son prénom, son poids et sa taille. Elle permet de passer de l'activité principale à l'activité de résultat avec un Intent explicite, puis d'ouvrir le composeur téléphonique avec un Intent implicite.

## Objectifs du TP

- Saisir les informations de l'utilisateur : prénom, poids, taille et sexe.
- Calculer l'IMC avec la formule : poids / (taille × taille).
- Afficher le résultat et son interprétation dans une deuxième activité.
- Utiliser un Intent explicite pour ouvrir l'écran de résultat.
- Utiliser un Intent implicite pour ouvrir le composeur avec le numéro 123.

## Captures du code

### Interface principale - `activity_main.xml`

![Code de activity_main.xml](1.png)
![Code de activity_main.xml](2.png)
![Code de activity_main.xml](3.png)

### Interface résultat - `activity_resultat.xml`

![Code de activity_resultat.xml](4.png)

### Activité principale - `MainActivity.java`

![Code de MainActivity.java](5.png)
![Code de MainActivity.java](6.png)
![Code de MainActivity.java](7.png)
![Code de MainActivity.java](8.png)

### Activité résultat - `ResultatActivity.java`

![Code de ResultatActivity.java](9.png)
![Code de ResultatActivity.java](10.png)
![Code de ResultatActivity.java](11.png)

## Résultat final de l'application

### Écran de saisie de l'IMC

![Résultat final - écran de saisie](12.png)

### Écran du résultat et interprétation

![Résultat final - écran IMC](13.png)

### Intent implicite - composeur téléphonique

![Résultat final - composeur téléphonique](14.png)

## Organisation des captures

Créer un dossier `captures` à la racine du projet et y placer les captures avec les noms ci-dessus. Les images doivent montrer le code dans Android Studio ou l'application en cours d'exécution.

```text
captures/
├── code-activity-main.png
├── code-activity-resultat.png
├── code-main-activity.png
├── code-resultat-activity.png
├── resultat-saisie.png
├── resultat-imc.png
└── resultat-appel.png
```

## Exécution

1. Ouvrir le projet dans Android Studio.
2. Lancer l'application sur un émulateur ou un appareil Android.
3. Saisir les informations et appuyer sur **CALCULER**.
4. Vérifier l'affichage du résultat et de son interprétation.
5. Appuyer sur **Appeler 123** pour ouvrir le composeur téléphonique.

## Auteur

- Nom et prénom : à compléter
- Filière / groupe : LSI3
- Année universitaire : 2026-2027

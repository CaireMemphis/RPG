# RPG

  Exercice de création d'un RPG que j'ai devié pour faire un exercice "bac-à-sable" ( ajout de fonctionnalités non demandé dans
l'exercice pour pouvoir m'améliorer et tester de nouvelles choses).

  j'y est intégré : 

-Une methode de création de personnage.

- Une méthode de création aléatoire de monstre(le nom est généré en deux parties et chaque partie determine 
la quantité de point de vie et point d'attaque à incrementé au monstre).

-Une methode de sélection d'objet de départ (choix entre trois objets).

- un objet généré aléatoirement que le perso récupère à la mort du monstre.

-Une methode d'initialisation de combat (l'échange de coups se fait pour l'heure automatiquement jusqu'a la mort d'un des combattants).

-Une methode de "repos" (retour au PV max initial)

-lorsque qu'un objet est sélectionné ou récupéré après combat, ses stats incremente les stats du joueur.

-lors des combats, chaque "action" d'un combattant (Attaque ou defense) est soumis à un "Taux de critique" qui représente un coeficcient
de multiplication de la stat du joueur en jeu (une attaque de 200 points à 2% de chances de faire 180% de dégats, donc 360 points 
de dégats et la defense de l'opposition aura la meme affectation de coefficient)

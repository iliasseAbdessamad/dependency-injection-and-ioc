<h2>L'injection de dépendences et de l'inversion de contrôle</h2>
<i>
	L'objectif de ce projet est d'implementer les principes de l'injection de dépendence et de l'inversion de contrôle, et les problèmes
	qui permettent de résoudre
</i>
<br />
<p><b>Soit le diagramme de class suivant</b></p>
<img src="./imgs/1.png" alt="diagramme de class">

<br />
<p><b>1 - Création de l'interface IDao</b></p>
<img src="./imgs/2.png" alt="L'interface IDao">

<br />
<p><b>2 - Implémentation de l'interface IDao</b></p>
<img src="./imgs/3.png" alt="Une implémentation de l'interface IDao">


<br />
<p><b>3 - Création de l'interface IMetier</b></p>
<img src="./imgs/4.png" alt="L'interface IMetier">


<br />
<p><b>4 - Implémentation de l'interface IMetier (en utilisant le couplage faible)</b></p>
<img src="./imgs/5.png" alt="Une implémentation de l'interface IMetier">

<br />
<p><b>5 - L'injection des dépendences</b></p>
<p>a - Par instanciation statique : </p>
<img src="./imgs/6.png" alt="Injection des dépendences par instanciation statique">

<br />
<p>b - Par instanciation dynamique : </p>
<img src="./imgs/7.png" alt="Injection des dépendences par instanciation dynamique">

<br />
<p>c - En utilsant Spring Framework : </p>
<p>c - 1 - Via un fichier xml de configuration : </p>
<p>c - 1 - 1 - Voici le fichier de configuration qui permet de configurer le conteneur d'injection des dépendences : </p>
<img src="./imgs/8.png" alt="fichier de configuration du conteneur d'injection des dépendences">
<p>c - 1 - 2 - Le corps de la méthode main() de la couche presentation </p>
<img src="./imgs/9.png" alt="Le corps de la méthode main">
<br/>
<p>c - 2 - Via l'utilisation des annotations : </p>
<p>c - 2 - 1 - Configuration du conteneur d'injection de dépendence en utilisant les annotations : </p>
<img src="./imgs/10.png" alt="la class DaoImpl">
<img src="./imgs/11.png" alt="la class MetierImpl">
<p>c - 2 - 2 - Le corps de la méthode main() de la couche presentation </p>
<img src="./imgs/12.png" alt="Le corps de la méthode main">
<br /><br />
<h3>Conclusion :</h3>
<p>
	<b>L'injection de dépendences : </b> est un principe de la programmation orientée objet, qui permet d'établir la dépendence entre 
	les objets via un couplage faible, ce qui permet de créer des applications ouvertes à l'extension et fermées à la modification 
	chose qui facilite l'élaboration des tests unitaires, la maintenance, et l'évolution de l'application.
</p>
<p>
	<b>L'inversion de contrôle : </b> est un principe de la programmation orientée objet, qui permet en générale à déléguer le flux de 
	l'execution d'un programme (l'aspect technique de l'application) à un framework en utilisant l'injection de dépendance et une 
	configuration de l'application. 
	L'avantage avec ce principe est d'avoir la possibilté d'écrire du code avec une manière déclarative au lieu de l'écrir avec la manière impérative, chose qui permet aux développeurs de ne se concentrer que sur
	l'implémentation des exigences métier de l'application.
</p>



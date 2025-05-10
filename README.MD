<h2>L'interêt du principe de l'injection de dépendences et de l'inversion de contrôle</h2>
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

### QRSF-Automaat

Eerst heb ik een interface gemaakt voor "State" en daarin 2 methodes voor het alfabet dus {a,b}.
Daarna heb ik de klassen gemaakt voor allestates en het State interface daarin geimplementeerd.
Volgend heb ik de methodes van State in de klassen veranderd zodat het met de toestand automaat
klopt en ook de toString daarvoor. Daarna heb ik de Automaat klasse gemaakt waarik daarin 
een default constructor heb 
gemaakt die begint op Q. Daarna twee methodes die de State methodes kunnen toepassen op de 
"Current state". Daarna een methode die dan later door de input kan beslissen welke van de 
andere 2 methodes het gaat gebruiken. Uiteindelijk een to string voor de automaat die gewoon 
laat zien op welke state het nu zit.

De test methode heb ik gemaakt door een input te maken die gelezen wordt door een for loop. 
Daarin zit ook een print statement voor het printen van de currentstate zodat ik kan kijken
waar het gaat na elke input om te zien of het goed werkt en uiteindelijk een endstate.
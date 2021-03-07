### Fsa van koffie automaat "_Koffie Machine_"

Het staat op de "Koffie Machine .png" en het idee er achter is dat het machine eerst aan is dus op stand "On".  
Er zijn 3 knoppen in deze geval Σ = {a,b,c}.

Als je vanaf "On" 'a' of 'b' kiest dan kiez je voor een klein of groot kopje en vandaar met a of b kiez je voor 1-2 kopjes.

In alle staaten kan je kiezen om weer naar "ON" te gaan door c te drukken dus als je de koffie wilt stoppen. Als de
machine al op "On" staat dan gaat het uit dus naar "OFF".

### NFA Automaat "_Ventilator_"

Het staat op de "Ventilator .png" en het idee bij deze is een ventilator die 3 snelheden bevat.  
Er zijn weer 3 knoppen zoals de koffie machine en ze zijn weer Σ = {a,b,c}, en V in de staaten staat voor velocity.  

'a' in deze geval zou bijv een pijl omhoog zijn omdat het de snelheid verhoogt en 'b' zou een pijl omlaag zijn omdat die 
de snel heid verlaagt. En 'c' is het uizet knop.

Het RegEx van deze automaat die ik uit Flaci.com heb gehaalt is:   
((a|b*a)((b|c)b*a)*(b|c|(b|c)b*)|(a|b*a)(a|b*|(b|c))*a((b|cb*a)[a-c]*a)*(c|cb*|(b|cb*a)(a|b*|(b|c))*(b|c|(b|c)b*))|(a|b
*a)(a|b*|(b|c))*a((b|cb*a)[a-c]*a)*a(a|(b|cb*a(a|b*|(b|c))*a)((b|cb*a)[a-c]*a)*a)*(c|cb*|(b|cb*a(a|b*|(b|c))*a)((b|cb*a)
[a-c]*a)*(c|cb*|(b|cb*a)(a|b*|(b|c))*(b|c|(b|c)b*))|cb*a((b|c)b*a)*(b|c|(b|c)b*))|b*)

### Java RegEx voor controlleren van hva-emailadressen
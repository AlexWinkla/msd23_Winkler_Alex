#### Umgang mit branches

### Erste Schritte


zuerst erstellen wir einen neun branch ``logging``
nun überprüfen wir das ergebnis mittels ``git stats``
![Exercise 5](/resources/images/ex5_1.png)

### Nun wird ein Logger Objekt erzeugt mittels ``Logger logger = LogManager.getLogger()``
#### Hier sind einige beispiel aufrufe, die mittels dem logger geschehen können:
````
logger.debug(); - A general debug event 
logger.info(); -  Event for Information purposes
logger.fatal(); - An fatal error, which can't be executed
logger.error(); - An error in Apllication
logger.warn(); - Event which might lead to an error
````
#### In der Main methode wurden jetzt zwei methoden hinzugefügt:
![logger Methods](/resources/images/ex5_2-1.png)
#### Jedoch führt der Output zu folgendem Ergebnis 
![logger Methods output](/resources/images/ex5_2.png)
#### Hier wird ersichtlich, dass bei ``logger.info(..)`` kein Output erfolgt

### durch Initialisieren der log4j2.xml datei und mehrfachen Ausführen der Main-Datei kam dieser Output zufolge, wobei man sieht, ob es ein Error, Fatal oder dergleichen ist
![Output Log Datei](/resources/images/ex5_3.png)

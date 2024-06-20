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

## Warum werden Logging-Bibliotheken verwendet
#### Fehlerverfolgung und Debugging: Logging hilft Entwicklern, den Ablauf und die Ereignisse innerhalb einer Anwendung zu verfolgen, Fehler zu identifizieren und die Ursache von Problemen zu finden.
#### Wartung und Support: Durch Protokollierung können Wartungsteams den Zustand der Anwendung überwachen, Probleme erkennen und beheben, ohne den Quellcode analysieren zu müssen.
#### Analyse und Überwachung: Logs bieten Einblicke in die Nutzung und Leistung einer Anwendung, was für die Überwachung und Optimierung wichtig ist.
#### Audit und Sicherheit: Logs können als Nachweis für bestimmte Aktionen dienen, was für Sicherheitsüberprüfungen und Compliance-Anforderungen wichtig ist.
#### Diagnose in der Produktion: In einer Produktionsumgebung ermöglicht Logging, Probleme zu diagnostizieren, ohne die Anwendung herunterzufahren oder zu debuggen.

## Welche Loglevel gibt es in Log4J
#### TRACE: Sehr feingranulare Informationsereignisse, die hauptsächlich zur Diagnose von Problemen verwendet werden.
#### DEBUG: Detaillierte Informationsereignisse, die für die Entwicklung und Debugging-Phase nützlich sind.
#### INFO: Allgemeine Informationsnachrichten, die den normalen Betrieb der Anwendung beschreiben.
#### WARN: Warnmeldungen, die auf potenzielle Probleme hinweisen, aber den normalen Betrieb nicht unmittelbar beeinträchtigen.
#### ERROR: Fehlermeldungen, die aufgrund von Fehlern im Code oder anderen Problemen auftreten, die den Betrieb beeinträchtigen können.
#### FATAL: Sehr schwerwiegende Fehlermeldungen, die wahrscheinlich zum Absturz der Anwendung führen.
#### OFF: Diese Stufe deaktiviert das Logging.

## Was fütr Konfigurationsmöglichkeiten bietet ihne log4J
#### XML-Konfigurationsdatei: Eine detaillierte und strukturierte Art der Konfiguration.
#### Properties-Datei: Eine einfachere und lesbare Methode zur Konfiguration.
#### JSON/YAML: Moderne Alternativen für die Konfiguration.


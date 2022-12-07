# 07-12-2022
WS 22 - Sichtbarkeit/Klassen und Objekte 3 


Übungsaufgabe vom 07.12.2022 für die Studierenden des Java I Seminars der Universität zu Köln

### 📝 Aufgabe:


In dieser Aufabge werden wir wieder an unserem Mail-Programm weiterarbeiten


```EMail```
- Erweitert die ```EMail``` Klasse um ein neues Attribut ```String subjekt``` und fügt dieses zum Konstruktor hinzu
- Erstellt ein paar ```EMail``` Objekte in der Main Methode
- fügt sie per ```addMail``` Methode in das ```EMail``` Array einer ```Outbox``` hinzu

----------------------------------

```Outbox```
- Erweitert die ```Outbox``` Klasse um eine neu Methode ```public void printAllMails()```
  - Die Methode soll alle ```EMail``` Objekte aus dem ```EMail[] mails``` Array in der Console ausgeben
  - Die Ausgabe soll den Index der ```EMail``` im Array,  Betreff (also ```String subject```) und den Empänger (```String recipient```) ausgeben
  - Wenn keine Mail vorhanden ist soll ein ```-``` ausgegen werden
  - Bsp.: ```0, Das ist ein Test, Dennis.Demmer@uni-koeln.de```
  
  -----------------------------
- Erstellt eine neue Methode ```public boolean deleteEMail(int index)``` in der  ```Outbox``` Klasse
- Die Methode soll eine ```EMail``` im  ```EMail[] mails``` Array anhand eines ```int index``` mit ```null``` überschreiben



  ### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [ 🎥 GitHub Projekte in Eclipse importieren](https://drive.google.com/file/d/1IpwHADmwViEGQ7Pf4BgybUYpz7WBoMe5/view?usp=sharing)

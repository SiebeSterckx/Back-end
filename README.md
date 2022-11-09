# Backend service

This is the backend-service of our webshop. This service provides an API for our frontend, rendering JSON-objects, and interacts with our MySQL-database.
Dit is de backend-service van onze webshop. Deze service voorziet een API voor onze frontend, gebruik makend van JSON om te communiceren, en slaat alle data op in een MySQL-databankt

## Provided

* Een codebase in Java 11, gemaakt met het SpringBoot Framework
* Een Dockerfile om onze applicatie in een container te verpakken
* Enkele Docker environment variabelen om de connectie met onze database te regelen. Je kan deze gebruiken bij het opstarten van de container of in docker-compose files (zoals we in [voorgaande labo's](https://tiebevn.notion.site/Labo-2-Container-orchestration-bf91cc27c7e4433182fb2e96e92f65b4) hebben gedaan)
    * MYSQL_HOST: de hostname van onze database
    * MYSQL_USER: de gebruiker waarmee we met onze database verbinden
    * MYSQL_PASSWORD: het wachtwoord waarme we met onze database verbinden
    * MYSQL_DATABASE: de database waarmee we verbinden
    * MYSQL_PORT: de poort waarmee we verbinden

## Todo

* Creëer je eigen repository, door de files te clonen en zelf te pushen of door een fork te nemen.
* Zet een CI/CD systeem op, zoals gezien in de lessen.

## Acceptance criteria
* Zorg dat je een werkende container automatisch kan builden met Github Actions

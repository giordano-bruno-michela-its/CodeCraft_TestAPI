## Installare WSL

Per installare WSL (Windows Subsystem for Linux) seguire la guida ufficiale di Microsoft:

   [Installare WSL](https://docs.microsoft.com/it-it/windows/wsl/install)

Di default installare la distro Ubuntu.

## Installazione Docker su WSL

Per installare Docker su WSL seguire la guida ufficiale di Docker:

   [Installare Docker su WSL](https://docs.docker.com/engine/install/ubuntu/)

## Docker Compose

Aprire un terminale WSL nella cartella root del progetto (dove c'è il file `docker-compose.yml`) e lanciare il comando:

   ```
   docker-compose up
   ```

Avviare il progetto Spring Boot.
A questo punto il database è pronto per essere utilizzato, ma non ha ancora i dati di default.


## Inizializzazione database con dati di default

Aprire il file application.properties (path: src/main/resources/ ) e decommentare la riga:

   ```
   spring.sql.init.mode=always
   ```

Riavviare il progetto Spring Boot.
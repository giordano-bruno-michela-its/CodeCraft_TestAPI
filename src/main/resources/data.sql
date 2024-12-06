-- src/main/resources/data.sql

-- Insert fixed records for fascia_eta
INSERT INTO fascia_eta (id, denominazione, descrizione) VALUES (1, '6-10 anni', 'Da 6 a 10 anni')
ON DUPLICATE KEY UPDATE denominazione = VALUES(denominazione), descrizione = VALUES(descrizione);
INSERT INTO fascia_eta (id, denominazione, descrizione) VALUES (2, '11-15 anni', 'Da 11 a 15 anni')
ON DUPLICATE KEY UPDATE denominazione = VALUES(denominazione), descrizione = VALUES(descrizione);
INSERT INTO fascia_eta (id, denominazione, descrizione) VALUES (3, '16-20 anni', 'Da 16 a 20 anni')
ON DUPLICATE KEY UPDATE denominazione = VALUES(denominazione), descrizione = VALUES(descrizione);

-- Insert fixed records for tipo_attivita
INSERT INTO tipo_attivita (id, denominazione, fascia_eta_id) VALUES (1, 'Salto nel buio', 1)
ON DUPLICATE KEY UPDATE denominazione = VALUES(denominazione), fascia_eta_id = VALUES(fascia_eta_id);
INSERT INTO tipo_attivita (id, denominazione, fascia_eta_id) VALUES (2, 'Tiro della cinghia', 2)
ON DUPLICATE KEY UPDATE denominazione = VALUES(denominazione), fascia_eta_id = VALUES(fascia_eta_id);
INSERT INTO tipo_attivita (id, denominazione, fascia_eta_id) VALUES (3, 'Arrampicata sui vetri', 3)
ON DUPLICATE KEY UPDATE denominazione = VALUES(denominazione), fascia_eta_id = VALUES(fascia_eta_id);

-- Insert sample data for form_richiesta
INSERT INTO form_richiesta (id, email, nome, cognome, telefono, data_contatto, descrizione, tipo_richiesta, fascia_eta_id, tipo_attivita_id)
VALUES (1, 'sample1@example.com', 'John', 'Doe', '1234567890', '2023-01-01', 'Sample description 1', 'RICHIESTA_INFORMAZIONI', 1, 1)
ON DUPLICATE KEY UPDATE email = VALUES(email), nome = VALUES(nome), cognome = VALUES(cognome), telefono = VALUES(telefono), data_contatto = VALUES(data_contatto), descrizione = VALUES(descrizione), tipo_richiesta = VALUES(tipo_richiesta), fascia_eta_id = VALUES(fascia_eta_id), tipo_attivita_id = VALUES(tipo_attivita_id);

INSERT INTO form_richiesta (id, email, nome, cognome, telefono, data_contatto, descrizione, tipo_richiesta, fascia_eta_id, tipo_attivita_id)
VALUES (2, 'sample2@example.com', 'Jane', 'Smith', '0987654321', '2023-02-01', 'Sample description 2', 'RICHIESTA_PRENOTAZIONE', 2, 2)
ON DUPLICATE KEY UPDATE email = VALUES(email), nome = VALUES(nome), cognome = VALUES(cognome), telefono = VALUES(telefono), data_contatto = VALUES(data_contatto), descrizione = VALUES(descrizione), tipo_richiesta = VALUES(tipo_richiesta), fascia_eta_id = VALUES(fascia_eta_id), tipo_attivita_id = VALUES(tipo_attivita_id);

INSERT INTO form_richiesta (id, email, nome, cognome, telefono, data_contatto, descrizione, tipo_richiesta, fascia_eta_id, tipo_attivita_id)
VALUES (3, 'sample3@example.com', 'Alice', 'Johnson', '1122334455', '2023-03-01', 'Sample description 3', 'RICHIESTA_INFORMAZIONI', 3, 3)
ON DUPLICATE KEY UPDATE email = VALUES(email), nome = VALUES(nome), cognome = VALUES(cognome), telefono = VALUES(telefono), data_contatto = VALUES(data_contatto), descrizione = VALUES(descrizione), tipo_richiesta = VALUES(tipo_richiesta), fascia_eta_id = VALUES(fascia_eta_id), tipo_attivita_id = VALUES(tipo_attivita_id);
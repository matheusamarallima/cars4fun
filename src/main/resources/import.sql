-- Adicionar fabricantes
INSERT INTO fabricante (nome) VALUES ('Toyota'), ('Ford');


SET @toyota_id := (SELECT id FROM fabricante WHERE nome = 'Toyota');
SET @ford_id := (SELECT id FROM fabricante WHERE nome = 'Ford');

-- Adicionar carros da Toyota
INSERT INTO car (fabricante_id, modelo, ano, preco, usado) VALUES (@toyota_id, 'Corolla', '2022-01-01', '30000.00', FALSE);
INSERT INTO car (fabricante_id, modelo, ano, preco, usado) VALUES (@toyota_id, 'Camry', '2022-01-01', '35000.00', TRUE);

-- Adicionar carro da Ford
INSERT INTO car (fabricante_id, modelo, ano, preco, usado) VALUES (@ford_id, 'Focus', '2022-01-01', '25000.00', FALSE);

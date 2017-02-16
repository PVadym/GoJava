# 4. Добавить поле (cost - стоимость) в таблицу Projects .

ALTER TABLE projects ADD COLUMN  cost INT;

UPDATE projects SET cost = 152000 WHERE id=1;
UPDATE projects SET cost = 54510 WHERE id=2;
UPDATE projects SET cost = 128610 WHERE id=3;
UPDATE projects SET cost = 89500 WHERE id=4;
UPDATE projects SET cost = 102000 WHERE id=5;

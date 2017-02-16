#2. Найти самый дорогой проект (исходя из ЗП разработчиков).

SELECT projects.*, sum(developers.salary) AS price_project
FROM projects
INNER JOIN projects_developers ON projects.id = projects_developers.project_id
INNER JOIN developers ON projects_developers.developer_id=developers.id
GROUP BY projects.id ORDER BY price_project DESC LIMIT 1;
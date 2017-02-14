# 6. Вычислить, среднюю ЗП программистов в проекте, который приносит наименьшую прибыль.

SELECT projects.*, avg(developers.salary) AS avg_salary
FROM developers
  INNER JOIN projects_developers ON developers.id = projects_developers.developer_id
  INNER  JOIN projects ON projects_developers.project_id=projects.id
GROUP BY projects.id ORDER BY cost LIMIT 1;

# 5. Найти клиента (customer), который приносит меньше
# всего прибыли компании (company) для каждой из компаний .

CREATE VIEW tmp_table AS
  SELECT   companies.name, customers.*, sum(projects.cost) AS summ_cost
  FROM customers
    INNER JOIN customers_projects on customers.id = customers_projects.customer_id
    INNER JOIN projects on customers_projects.project_id = projects.id
    INNER JOIN companies_projecta on projects.id = companies_projecta.project_id
    INNER JOIN companies on companies_projecta.company_id = companies.id
  GROUP BY  companies.id,customers.id;


SELECT  tmp_table.* FROM companies,tmp_table,customers WHERE summ_cost = (
  SELECT min(summ_cost) FROM tmp_table WHERE companies.name=tmp_table.name)
GROUP BY tmp_table.name;

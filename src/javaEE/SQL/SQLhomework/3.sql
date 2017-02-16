# 3. Вычислить общую ЗП всех Java разработчиков.

SELECT  sum(developers.salary) AS total_amount
FROM developers;
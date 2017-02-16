INSERT INTO developers VALUES (NULL ,"Vasya","Petrov","Kyiv","vasya@ukr.net","2015-10-25"),
  (NULL ,"Petya","Kruglov","Brovary","petya@ukr.net","2016-02-10"),
  (NULL,"Olya","Novikova","Kyiv","olya@ukr.net","2014-02-08"),
  (NULL,"Vadim","Pylypchenko","Lviv","vadim@ukr.net","2013-8-15"),
  (NULL,"Natasha","Kovalenko","Vinnytsa","natasha@ukr.net","2016-5-1"),
  (NULL,"Slava","Druz","Kyiv","slava@ukr.net","2010-10-25"),
  (NULL,"Kolya","Homenko","Sumy","kolya@google.com","2011-01-01"),
  (NULL,"Vadim","Tumchuk","Cherkassy","aik@mail.net","2016-01-8"),
  (NULL,"Tanya","Kovalenko","Pryluky","tanya@ukr.net","2017-02-01"),
  (NULL,"Petya","Petrov","Kyiv","petro@ukr.net","2013-5-25");


INSERT INTO skills VALUES (NULL,"Java"),
  (NULL,"C++"),
  (NULL,"SQL"),
  (NULL,"Php"),
  (NULL,"C#"),
  (NULL,"Pyton");


INSERT INTO projects VALUES (NULL, "Future"),
  (NULL, "Bussines"),
  (NULL, "New Life"),
  (NULL, "Big.net"),
  (NULL, "Tree of Happiness");

INSERT INTO companies VALUES (NULL,"Google","USA"),
  (NULL,"Yandex","USA"),
  (NULL,"Metro","Ukraine"),
  (NULL,"Play","China"),
  (NULL,"Prophi","France");

INSERT INTO customers VALUES (NULL, "David", "Berg", "david@mail.com"),
  (NULL, "Pavel", "Ryabkov", "pavlo@mail.com"),
  (NULL, "Allen", "Box", "ali@mail.com"),
  (NULL, "Kate", "Moss", "katerina@mail.com"),
  (NULL, "Donna", "Monna", "domo@mail.com");


INSERT INTO developers_skills VALUES (1,1);
INSERT INTO developers_skills VALUES (1,6);
INSERT INTO developers_skills VALUES (2,5);
INSERT INTO developers_skills VALUES (2,2);
INSERT INTO developers_skills VALUES (8,1);
INSERT INTO developers_skills VALUES (10,4);
INSERT INTO developers_skills VALUES (9,3);
INSERT INTO developers_skills VALUES (5,2);
INSERT INTO developers_skills VALUES (5,4);
INSERT INTO developers_skills VALUES (6,6);
INSERT INTO developers_skills VALUES (6,1);
INSERT INTO developers_skills VALUES (3,2);
INSERT INTO developers_skills VALUES (4,3);
INSERT INTO developers_skills VALUES (3,1);
INSERT INTO developers_skills VALUES (7,1);
INSERT INTO developers_skills VALUES (8,6);


INSERT INTO projects_developers VALUES (1,1);
INSERT INTO projects_developers VALUES (1,2);
INSERT INTO projects_developers VALUES (1,3);
INSERT INTO projects_developers VALUES (1,5);
INSERT INTO projects_developers VALUES (2,8);
INSERT INTO projects_developers VALUES (2,1);
INSERT INTO projects_developers VALUES (4,10);
INSERT INTO projects_developers VALUES (4,5);
INSERT INTO projects_developers VALUES (4,4);
INSERT INTO projects_developers VALUES (3,7);
INSERT INTO projects_developers VALUES (3,9);
INSERT INTO projects_developers VALUES (5,2);
INSERT INTO projects_developers VALUES (5,8);
INSERT INTO projects_developers VALUES (5,6);
INSERT INTO projects_developers VALUES (5,3);


INSERT INTO companies_projects VALUES (1,1);
INSERT INTO companies_projects VALUES (1,5);
INSERT INTO companies_projects VALUES (1,2);
INSERT INTO companies_projects VALUES (2,3);
INSERT INTO companies_projects VALUES (2,4);
INSERT INTO companies_projects VALUES (2,1);
INSERT INTO companies_projects VALUES (3,2);
INSERT INTO companies_projects VALUES (3,4);
INSERT INTO companies_projects VALUES (3,3);
INSERT INTO companies_projects VALUES (3,5);
INSERT INTO companies_projects VALUES (4,1);
INSERT INTO companies_projects VALUES (4,2);
INSERT INTO companies_projects VALUES (5,4);
INSERT INTO companies_projects VALUES (5,5);


INSERT INTO customers_projects VALUES (1,1);
INSERT INTO customers_projects VALUES (1,5);
INSERT INTO customers_projects VALUES (1,3);
INSERT INTO customers_projects VALUES (2,2);
INSERT INTO customers_projects VALUES (2,1);
INSERT INTO customers_projects VALUES (3,4);
INSERT INTO customers_projects VALUES (3,2);
INSERT INTO customers_projects VALUES (3,5);
INSERT INTO customers_projects VALUES (4,4);
INSERT INTO customers_projects VALUES (4,1);
INSERT INTO customers_projects VALUES (4,3);
INSERT INTO customers_projects VALUES (5,3);
INSERT INTO customers_projects VALUES (5,2);
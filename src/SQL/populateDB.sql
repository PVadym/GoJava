INSERT INTO developers VALUES (1,"Vasya","Petrov","Kyiv","vasya@ukr.net","2015-10-25");
INSERT INTO developers VALUES (2,"Petya","Kruglov","Brovary","petya@ukr.net","2016-02-10");
INSERT INTO developers VALUES (3,"Olya","Novikova","Kyiv","olya@ukr.net","2014-02-08");
INSERT INTO developers VALUES (4,"Vadim","Pylypchenko","Lviv","vadim@ukr.net","2013-8-15");
INSERT INTO developers VALUES (5,"Natasha","Kovalenko","Vinnytsa","natasha@ukr.net","2016-5-1");
INSERT INTO developers VALUES (6,"Slava","Druz","Kyiv","slava@ukr.net","2010-10-25");
INSERT INTO developers VALUES (7,"Kolya","Homenko","Sumy","kolya@google.com","2011-01-01");
INSERT INTO developers VALUES (8,"Vadim","Tumchuk","Cherkassy","aik@mail.net","2016-01-8");
INSERT INTO developers VALUES (9,"Tanya","Kovalenko","Pryluky","tanya@ukr.net","2017-02-01");
INSERT INTO developers VALUES (10,"Petya","Petrov","Kyiv","petro@ukr.net","2013-5-25");


INSERT INTO skills VALUES (101,"Java");
INSERT INTO skills VALUES (102,"C++");
INSERT INTO skills VALUES (103,"SQL");
INSERT INTO skills VALUES (104,"Php");
INSERT INTO skills VALUES (105,"C#");
INSERT INTO skills VALUES (106,"Pyton");


INSERT INTO projects VALUES (201, "Future");
INSERT INTO projects VALUES (202, "Bussines");
INSERT INTO projects VALUES (203, "New Life");
INSERT INTO projects VALUES (204, "Big.net");
INSERT INTO projects VALUES (205, "Tree of Happiness");

INSERT INTO companies VALUES (1,"Google","USA");
INSERT INTO companies VALUES (2,"Yandex","USA");
INSERT INTO companies VALUES (3,"Metro","Ukraine");
INSERT INTO companies VALUES (4,"Play","China");
INSERT INTO companies VALUES (5,"Prophi","France");

INSERT INTO customers VALUES (1, "David", "Berg", "david@mail.com");
INSERT INTO customers VALUES (2, "Pavel", "Ryabkov", "pavlo@mail.com");
INSERT INTO customers VALUES (3, "Allen", "Box", "ali@mail.com");
INSERT INTO customers VALUES (4, "Kate", "Moss", "katerina@mail.com");
INSERT INTO customers VALUES (5, "Donna", "Monna", "domo@mail.com");


INSERT INTO developers_skills VALUES (1,101);
INSERT INTO developers_skills VALUES (1,106);
INSERT INTO developers_skills VALUES (2,105);
INSERT INTO developers_skills VALUES (2,102);
INSERT INTO developers_skills VALUES (8,101);
INSERT INTO developers_skills VALUES (10,104);
INSERT INTO developers_skills VALUES (9,103);
INSERT INTO developers_skills VALUES (5,102);
INSERT INTO developers_skills VALUES (5,104);
INSERT INTO developers_skills VALUES (6,106);
INSERT INTO developers_skills VALUES (6,101);
INSERT INTO developers_skills VALUES (3,102);
INSERT INTO developers_skills VALUES (4,103);
INSERT INTO developers_skills VALUES (3,101);
INSERT INTO developers_skills VALUES (7,101);
INSERT INTO developers_skills VALUES (8,106);


INSERT INTO projects_developers VALUES (201,1);
INSERT INTO projects_developers VALUES (201,2);
INSERT INTO projects_developers VALUES (201,3);
INSERT INTO projects_developers VALUES (202,5);
INSERT INTO projects_developers VALUES (202,8);
INSERT INTO projects_developers VALUES (202,1);
INSERT INTO projects_developers VALUES (204,10);
INSERT INTO projects_developers VALUES (204,5);
INSERT INTO projects_developers VALUES (204,4);
INSERT INTO projects_developers VALUES (203,7);
INSERT INTO projects_developers VALUES (203,9);
INSERT INTO projects_developers VALUES (205,2);
INSERT INTO projects_developers VALUES (205,8);
INSERT INTO projects_developers VALUES (205,6);
INSERT INTO projects_developers VALUES (205,3);


INSERT INTO companies_projecta VALUES (1,201);
INSERT INTO companies_projecta VALUES (1,205);
INSERT INTO companies_projecta VALUES (1,202);
INSERT INTO companies_projecta VALUES (2,203);
INSERT INTO companies_projecta VALUES (2,204);
INSERT INTO companies_projecta VALUES (2,201);
INSERT INTO companies_projecta VALUES (3,202);
INSERT INTO companies_projecta VALUES (3,204);
INSERT INTO companies_projecta VALUES (3,203);
INSERT INTO companies_projecta VALUES (3,205);
INSERT INTO companies_projecta VALUES (4,201);
INSERT INTO companies_projecta VALUES (4,202);
INSERT INTO companies_projecta VALUES (5,204);
INSERT INTO companies_projecta VALUES (5,205);


INSERT INTO customers_projects VALUES (1,201);
INSERT INTO customers_projects VALUES (1,205);
INSERT INTO customers_projects VALUES (1,203);
INSERT INTO customers_projects VALUES (2,202);
INSERT INTO customers_projects VALUES (2,201);
INSERT INTO customers_projects VALUES (3,204);
INSERT INTO customers_projects VALUES (3,202);
INSERT INTO customers_projects VALUES (3,205);
INSERT INTO customers_projects VALUES (4,204);
INSERT INTO customers_projects VALUES (4,201);
INSERT INTO customers_projects VALUES (4,203);
INSERT INTO customers_projects VALUES (5,203);
INSERT INTO customers_projects VALUES (5,202);
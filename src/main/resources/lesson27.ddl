--DDL Data Definition Language
create table main.users(
                           id serial4 primary key,
                           email varchar(100) not null unique,
                           name varchar(100),
                           birth_date date
)

alter table users add column gender varchar(10)

alter table users drop column genger

alter table users add check (gender in ('male','female','other'));

alter table users drop constraint users_gender_check

--DML Data Manipulation Language
--CRUD
--CREATE - INSERT
--date ISO 'yyyy-mm-dd'

insert into main.users (email, name, birth_date, gender) values
                                                             ('leonid@gmail.com', 'Leonid K', '1999-07-27', 'male'),
                                                             ('leonid2@gmail.com', 'Leonid K', '1999-07-27', 'male')

insert into main.users values (default, 'leonid8@gmail.com', 'Leonid K', '2026-05-01', 'male')

insert into main.users (email, name, birth_date, gender) values
    ('leonid5@gmail.com', 'Leonid K', '1999-07-27', 'male')
returning *

    INSERT INTO users (email, name, birth_date, gender) VALUES
('ivan.petrenko@gmail.com', 'Іван Петренко', '1995-03-12', 'male'),
('olena.koval@gmail.com', 'Олена Коваль', '1998-07-25', 'female'),
('andrii.shevchenko@gmail.com', 'Андрій Шевченко', '1992-11-03', 'male'),
('maria.bondar@gmail.com', 'Марія Бондар', '2000-01-15', 'female'),
('oleh.tkachenko@gmail.com', 'Олег Ткаченко', '1989-06-20', 'male'),
('iryna.kravets@gmail.com', 'Ірина Кравець', '1997-09-10', 'female'),
('vitalii.melnyk@gmail.com', 'Віталій Мельник', '1993-12-05', 'male'),
('natalia.kozak@gmail.com', 'Наталія Козак', '1996-04-18', 'female'),
('serhii.litvin@gmail.com', 'Сергій Литвин', '1991-08-30', 'male'),
('tetiana.marchenko@gmail.com', 'Тетяна Марченко', '1999-02-22', 'female'),
('yurii.ostapchuk@gmail.com', 'Юрій Остапчук', '1988-10-14', 'male'),
('oksana.hnatiuk@gmail.com', 'Оксана Гнатюк', '1994-05-09', 'female'),
('roman.levchenko@gmail.com', 'Роман Левченко', '1990-07-01', 'male'),
('halyna.stepanenko@gmail.com', 'Галина Степаненко', '1987-03-27', 'female'),
('dmytro.savchenko@gmail.com', 'Дмитро Савченко', '1996-11-11', 'male'),
('liudmyla.polishchuk@gmail.com', 'Людмила Поліщук', '1992-06-06', 'female'),
('volodymyr.klymenko@gmail.com', 'Володимир Клименко', '1985-09-19', 'male'),
('anna.danyliuk@gmail.com', 'Анна Данилюк', '2001-12-24', 'female'),
('maksym.romaniuk@gmail.com', 'Максим Романюк', '1993-01-08', 'male'),
('svitlana.mazur@gmail.com', 'Світлана Мазур', '1997-07-17', 'female')
returning *;

--READ - SELECT
select * from main.users
select * from main.users
limit 1 offset 5

select * from main.users
order by birth_date asc
limit 1 offset 1

select * from main.users
order by birth_date desc
limit 1 offset 1


select count(*) from main.users

select * from main.users
where gender = 'female'
  and birth_date in ('2000-01-15', '2001-12-24')

select * from main.users
where birth_date = current_date

--UPDATE - UPDATE
update main.users
set name = 'Тетяна Терещенко'
where id = 17

--DELETE - DELETE
delete from main.users
where id = 29



create table team (
    id integer PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name varchar(50) not null,
    city_team varchar(50) not null,
    is_active boolean not null
)

create table tournament (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name varchar(50) not null,
    start_date date not null,
    end_date date not null,
    tournament_type int not null, --1-Domestic League | 2-Teams International | 3-National Teams
    is_active boolean not null,
    created_at timestamp not null,
    updated_at timestamp not null
);

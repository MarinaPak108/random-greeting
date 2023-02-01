drop table phrase;

create table phrase (
                        phrase_id bigint not null PRIMARY KEY AUTO_INCREMENT,
                        phrase varchar(500),
                        author_phrase bigint,
                        path varchar(500),
                        category_phrase bigint,
                        CONSTRAINT phrase_category FOREIGN KEY (category_phrase) REFERENCES category(CategoryID),
                        CONSTRAINT phrase_author FOREIGN KEY (author_phrase) REFERENCES Author (AuthorID)
);
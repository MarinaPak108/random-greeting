create table Phrase (
                        PhraseID bigint not null PRIMARY KEY AUTO_INCREMENT,
                        Phrase varchar(500),
                        AuthorPhrase bigint,
                        Path varchar(500),
                        CategoryPhrase bigint,
                        CONSTRAINT PhraseCategory FOREIGN KEY (CategoryPhrase) REFERENCES Category(CategoryID),
                        CONSTRAINT PhraseAuthor FOREIGN KEY (AuthorPhrase) REFERENCES Author (AuthorID)
);

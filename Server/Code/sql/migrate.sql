CREATE TABLE member (
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY (email),

    password VARCHAR(20) NOT NULL
);


CREATE TABLE note (
    id INTEGER AUTO_INCREMENT NOT NULL,
    PRIMARY KEY (id),

    title VARCHAR(100),
    text TEXT,

    writer VARCHAR(50) NOT NULL,
    FOREIGN KEY (writer) REFERENCES member (email)
);

INSERT INTO tblead values
	(NULL, "Paulo", "email@email.com", "61-1111-1111","111.111.111-11"),
    (NULL, "José", "email1@email.com", "62-2222-2222","222.222.222-22"),
    (NULL, "Dora", "email2@email.com", "63-3333-3333","333.333.333-33"),
    (NULL, "Joaquina", "email3@email.com", "64-4444-4444","444.444.444-44"),
    (NULL, "José Maria", "email4@email.com", "65-5555-5555","555.555.555-55"),
    (NULL, "Ana", "email5@email.com", "66-6666-6666","666.666.666-66"),
    (NULL, "Júlia", "email6@email.com", "67-7777-7777","777.777.777-77"),
    (NULL, "Ana Paula", "email7@email.com", "68-88888888","888.888.888-88"),
    (NULL, "Cleiciante", "email8@email.com", "69-9999-9999","999.999.999-99"),
    (NULL, "Aparecida", "email9@email.com", "70-0000-0000","000.000.000-00"),
    (NULL, "Jocélia", "email10@email.com", "71-1111-1111","111.111.111-11"),
    (NULL, "Ricardo", "email11@email.com", "72-2222-2222","222.222.222-22"),
    (NULL, "André", "email12@email.com", "73-3333-3333","333.333.333-33"),
    (NULL, "Leandro", "email13@email.com", "74-4444-4444","444.444.444-44"),
    (NULL, "Maurício", "email14@email.com", "75-5555-5555","555.555.555-55"),
    (NULL, "Josefina", "email15@email.com", "76-6666-6666","666.666.666-66"),
    (NULL, "Antonieta", "email16@email.com", "77-7777-7777","777.777.777-77"),
    (NULL, "Adeliano", "email17@email.com", "78-8888-8888","888.888.888-88"),
    (NULL, "Rachel", "email18@email.com", "79-9999-9999","999.999.999-99"),
    (NULL, "Rodrigo", "email19@email.com", "80-0000-0000","000.000.000-00"),
    (NULL, "Jordana", "email20@email.com", "81-1111-1111","111.111.111-11");
    
    UPDATE tblead SET nome = "Severo" WHERE id = 2;
    UPDATE tblead SET nome = "Anacleto" WHERE id = 8;
    UPDATE tblead SET nome = "Jurema" WHERE id = 12;
    
    DELETE FROM tblead WHERE id = 7;
    DELETE FROM tblead WHERE id = 17;
    DELETE FROM tblead WHERE id = 11;
    DELETE FROM tblead WHERE id = 19;
    
    SELECT * FROM tblead where id = 1;
    
    SELECT * FROM tblead;
    